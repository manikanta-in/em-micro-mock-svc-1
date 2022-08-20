package eyemed.group.dao;

import eyemed.group.controllers.api.exceptions.DaoException;
import eyemed.group.model.dto.invoice.PaymentDto;
import eyemed.group.model.dto.invoice.PaymentTransactionDto;
import eyemed.group.util.DBUtils;
import oracle.jdbc.OracleTypes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 02/21/2019
 */

@Repository
public class PaymentDaoImpl implements PaymentDao {
    private static final Log LOGGER = LogFactory.getLog(PaymentDaoImpl.class);
    private static final String GET_GRP_PAY_TEMP_STORED_FUNCTION = "LUXSF_GRP_GET_PAYMENT_TEMP (?,?,?,?)";
    private static final String CREATE_GRP_PAY_TEMP_STORED_FUNCTION = "LUXSF_GRP_CREATE_PAYMENT_TEMP (?,?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_GRP_PAY_TEMP_STORED_FUNCTION = "LUXSF_GRP_DELETE_PAYMENT_TEMP (?,?,?)";

    private JdbcTemplate jdbcTemplate;

    public PaymentDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public PaymentTransactionDto getDraftPayment(String referenceNumber) throws DaoException {
        PaymentTransactionDto paymentTransaction = new PaymentTransactionDto();
        Connection connection = null;
        CallableStatement function = null;
        ResultSet getPaymentResultSet = null;
        try {
            if (jdbcTemplate.getDataSource() != null) {
                connection = jdbcTemplate.getDataSource().getConnection();
                function = connection.prepareCall("begin ? := " + GET_GRP_PAY_TEMP_STORED_FUNCTION + "; end;");
                function.registerOutParameter(1, OracleTypes.NUMBER);
                function.registerOutParameter(2, OracleTypes.CURSOR);
                function.registerOutParameter(3, OracleTypes.NUMBER);
                function.registerOutParameter(4, OracleTypes.VARCHAR);
                function.setString(5, referenceNumber);

                if (LOGGER.isTraceEnabled()) {
                    LOGGER.trace("Executing stored function: " + GET_GRP_PAY_TEMP_STORED_FUNCTION
                            + "  with reference Number : " + referenceNumber
                    );
                }
                getPaymentResultSet = DBUtils.executeSFForResultSet(function);
                if (getPaymentResultSet != null) {
                    Set<PaymentDto> paymentDtoSet = new HashSet<>();
                    while (getPaymentResultSet.next()) {
                        paymentTransaction.setTransactionId(getPaymentResultSet.getString("REFERENCE_NO"));
                        paymentTransaction.setTotalAmount(getPaymentResultSet.getString("TOTAL_AMT"));
                        PaymentDto paymentDto = new PaymentDto();
                        paymentDto.setGroupCk(getPaymentResultSet.getString("GRGR_CK"));
                        paymentDto.setSubGroupCk(getPaymentResultSet.getString("SGSG_CK"));
                        paymentDto.setInvoiceNumber(getPaymentResultSet.getString("INV_NO"));
                        paymentDto.setPaidAmount(getPaymentResultSet.getBigDecimal("PAID_AMT"));
                        paymentDto.setTransactionId(getPaymentResultSet.getString("REFERENCE_NO"));
                        paymentDtoSet.add(paymentDto);
                    }
                    paymentTransaction.setPayment(paymentDtoSet);
                }
            }
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error getDraftPayment.", e);
            }
            throw new DaoException(e.getMessage(), e.getCause());
        } finally {
            DBUtils.close(getPaymentResultSet, function, connection);
        }
        return paymentTransaction;

    }
    public boolean deleteDraftPayment(String referenceNumber) throws DaoException {
        boolean result = false;
        Connection connection = null;
        CallableStatement function = null;
        try {
            if (jdbcTemplate.getDataSource() != null) {
                connection = jdbcTemplate.getDataSource().getConnection();
                function = connection.prepareCall("begin ? := " + DELETE_GRP_PAY_TEMP_STORED_FUNCTION + "; end;");
                function.registerOutParameter(1, OracleTypes.NUMBER);
                function.registerOutParameter(2, OracleTypes.NUMBER);
                function.registerOutParameter(3, OracleTypes.VARCHAR);
                function.setString(4, referenceNumber);

                if (LOGGER.isTraceEnabled()) {
                    LOGGER.trace("Executing stored function: " + DELETE_GRP_PAY_TEMP_STORED_FUNCTION);
                }
                result = DBUtils.executeStoredFunction(function);
            }
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error deleteDraftPayment.", e);
            }
            throw new DaoException(e.getMessage(), e.getCause());
        } finally {
            DBUtils.close(function, connection);
        }
        return result;

    }
    public boolean createDraftPayment(PaymentDto paymentDto, String totalAmount, String userName) throws DaoException {
        boolean result = false;
        Connection connection = null;
        CallableStatement function = null;
        try {
            if (jdbcTemplate.getDataSource() != null) {
                connection = jdbcTemplate.getDataSource().getConnection();
                function = connection.prepareCall("begin ? := " + CREATE_GRP_PAY_TEMP_STORED_FUNCTION + "; end;");
                function.registerOutParameter(1, OracleTypes.NUMBER);
                function.registerOutParameter(2, OracleTypes.NUMBER);
                function.registerOutParameter(3, OracleTypes.VARCHAR);
                function.setString(4, paymentDto.getTransactionId());
                function.setString(5, paymentDto.getInvoiceNumber());
                function.setLong(6, Long.valueOf(paymentDto.getGroupCk()));
                function.setLong(7, Long.valueOf(paymentDto.getSubGroupCk()));
                function.setTimestamp(8, DBUtils.toOracleDate(new DateTime())); //Paid date
                function.setBigDecimal(9, paymentDto.getPaidAmount());
                function.setBigDecimal(10, BigDecimal.valueOf(Double.valueOf(totalAmount)));
                function.setString(11,!StringUtils.isEmpty(userName)?userName.toUpperCase().trim():null);

                if (LOGGER.isTraceEnabled()) {
                    LOGGER.trace("Executing stored function: " + CREATE_GRP_PAY_TEMP_STORED_FUNCTION);
                }
                result = DBUtils.executeStoredFunction(function);
            }
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error createDraftPayment.", e);
            }
            throw new DaoException(e.getMessage(), e.getCause());
        } finally {
            DBUtils.close(function, connection);
        }
        return result;
    }


}
