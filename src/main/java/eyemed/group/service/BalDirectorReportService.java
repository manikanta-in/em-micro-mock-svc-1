package eyemed.group.service;

import eyemed.group.entity.BalDirectorReport;
import eyemed.group.entity.BalPendingReturnQtyTest;

public interface BalDirectorReportService {

  public void saveBalDirectory(BalDirectorReport balDirectorReport);

  public void saveBalPendingReturnQtyTest(BalPendingReturnQtyTest balDirectorReport);

}
