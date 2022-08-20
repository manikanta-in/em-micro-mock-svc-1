package eyemed.group.dao;

import eyemed.group.controllers.api.exceptions.DaoException;
import eyemed.group.model.dto.invoice.PaymentDto;
import eyemed.group.model.dto.invoice.PaymentTransactionDto;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 02/21/2019
 */

public interface PaymentDao {
    PaymentTransactionDto getDraftPayment(String referenceNumber) throws DaoException;
    boolean deleteDraftPayment(String referenceNumber) throws DaoException;
    boolean createDraftPayment(PaymentDto paymentDto, String totalAmount, String userName) throws DaoException;
}
