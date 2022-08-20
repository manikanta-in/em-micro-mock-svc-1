package eyemed.group.model.mapping;

import eyemed.group.model.dto.events.EventProductKeyDto;
import org.joda.time.DateTime;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EventProductKeyMapper implements RowMapper<EventProductKeyDto> {
    @Override
    public EventProductKeyDto mapRow(ResultSet resultSet, int i) throws SQLException {
        EventProductKeyDto benefit = new EventProductKeyDto();

        benefit.setEventRequestId(   resultSet.getInt("GRP_EVENT_REQUEST_ID"));
        benefit.setParentGroupCk(    resultSet.getInt("PAGR_CK"));
        benefit.setBsbsPrefix(       resultSet.getString("BSBS_PFX"));
        benefit.setEmbePrefix(       resultSet.getString("EMBE_PFX"));
        benefit.setCopkPrefix(       resultSet.getString("COPK_PFX"));
        benefit.setGroupCk(          resultSet.getInt("GRGR_CK"));
        benefit.setClassId(          resultSet.getString("CSCS_ID"));
        benefit.setClassPlanId(      resultSet.getString("CSPI_ID"));
        benefit.setPlanEffectiveDate(new DateTime(resultSet.getDate("CSPI_EFF_DT")));

        return benefit;

    }
}
