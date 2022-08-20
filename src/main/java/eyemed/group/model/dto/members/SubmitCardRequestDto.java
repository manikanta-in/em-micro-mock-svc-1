package eyemed.group.model.dto.members;

import org.joda.time.DateTime;
import org.springframework.util.StringUtils;

import java.io.Serializable;

public class SubmitCardRequestDto implements Serializable {

    private String subscriberCk,memberCk,groupCk,subGroupCk,systemName,classPlanId,classId;
    private DateTime serviceDate;

    public String getSubscriberCk() {
        return subscriberCk;
    }

    public void setSubscriberCk(String subscriberCk) {
        this.subscriberCk = subscriberCk;
    }

    public String getMemberCk() {
        return memberCk;
    }

    public void setMemberCk(String memberCk) {
        this.memberCk = memberCk;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getClassPlanId() {
        return classPlanId;
    }

    public void setClassPlanId(String classPlanId) {
        this.classPlanId = classPlanId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public boolean isEmpty(){
        return (StringUtils.isEmpty(this.subGroupCk) );
    }

    public DateTime getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(DateTime serviceDate) {
        this.serviceDate = serviceDate;
    }
}
