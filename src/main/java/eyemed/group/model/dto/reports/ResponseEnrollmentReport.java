package eyemed.group.model.dto.reports;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 1/31/2019.
 */
public class ResponseEnrollmentReport {
    private int memberCount;
    private boolean requested;
    private boolean processed;
    private boolean reportInProcess;
    private List<EnrollMemberDto> enrollMemberList;

    public ResponseEnrollmentReport(){
        this.enrollMemberList = new ArrayList<>();
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }

    public boolean isRequested() {
        return requested;
    }

    public void setRequested(boolean requested) {
        this.requested = requested;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public boolean isReportInProcess() {
        return reportInProcess;
    }

    public void setReportInProcess(boolean reportInProcess) {
        this.reportInProcess = reportInProcess;
    }

    public List<EnrollMemberDto> getEnrollMemberList() {
        return enrollMemberList;
    }

    public void setEnrollMemberList(List<EnrollMemberDto> enrollMemberList) {
        this.enrollMemberList = enrollMemberList;
    }

}
