package eyemed.group.model.dto.reports;

import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Created by c09368 on 1/21/2019.
 */
public class EnrollReportDto implements Serializable{

    private String reportId,clientId,groupId,subGroupId,groupCk,subGroupCk,subGroupCks,groupName,subGroupName,fileName,requestUser;
    private DateTime requestDate;

    public String getReportId() {return reportId;}

    public void setReportId(String reportId) {this.reportId = reportId;}

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
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

    public String getSubGroupCks() {
        return subGroupCks;
    }

    public void setSubGroupCks(String subGroupCks) {
        this.subGroupCks = subGroupCks;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRequestUser() {
        return requestUser;
    }

    public void setRequestUser(String requestUser) {
        this.requestUser = requestUser;
    }

    public DateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(DateTime requestDate) {
        this.requestDate = requestDate;
    }
}
