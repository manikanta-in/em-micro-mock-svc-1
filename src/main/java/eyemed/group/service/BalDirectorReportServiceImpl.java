package eyemed.group.service;

import eyemed.group.entity.BalDirectorReport;
import eyemed.group.entity.BalPendingReturnQtyTest;
import eyemed.group.repo.BalDirectorReportRepository;
import eyemed.group.repo.BalPendingReturnQtyTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalDirectorReportServiceImpl implements BalDirectorReportService {

  @Autowired
  BalDirectorReportRepository balDirectorReportRepository;

  @Autowired
  BalPendingReturnQtyTestRepository balPendingReturnQtyTestRepository;

  @Override
  public void saveBalDirectory(BalDirectorReport balDirectorReport) {
    balDirectorReportRepository.save(balDirectorReport);
  }

  @Override
  public void saveBalPendingReturnQtyTest(BalPendingReturnQtyTest balPendingReturnQtyTest) {
    balPendingReturnQtyTest.setFinancialEnabled("1");
    balPendingReturnQtyTestRepository.save(balPendingReturnQtyTest);
  }
}
