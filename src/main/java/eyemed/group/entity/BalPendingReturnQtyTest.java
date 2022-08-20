package eyemed.group.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author intel
 */
@Entity
@Table(name = "BAL_PENDING_RETURN_QTY_TEST")
@NamedQueries({
    @NamedQuery(name = "BalPendingReturnQtyTest.findAll", query = "SELECT b FROM BalPendingReturnQtyTest b"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByLocationId", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.locationId = :locationId"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByLocationCode", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.locationCode = :locationCode"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByClliLocationCode", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.clliLocationCode = :clliLocationCode"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByItemHeci10", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.itemHeci10 = :itemHeci10"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByStatus", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.status = :status"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findBySerialNum", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.serialNum = :serialNum"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByQty", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.qty = :qty"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByProductFamily", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.productFamily = :productFamily"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByParentItem", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.parentItem = :parentItem"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByLocationType", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.locationType = :locationType"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByJobSource", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.jobSource = :jobSource"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByJobNum", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.jobNum = :jobNum"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByItemDesc", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.itemDesc = :itemDesc"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByFinancialEnabled", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.financialEnabled = :financialEnabled"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByAvgPrice", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.avgPrice = :avgPrice"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByCriticality", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.criticality = :criticality"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByCriticalityInd", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.criticalityInd = :criticalityInd"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByErpDescription", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.erpDescription = :erpDescription"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByExcessPriority", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.excessPriority = :excessPriority"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByExcessReturnAction", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.excessReturnAction = :excessReturnAction"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByExcessVendor", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.excessVendor = :excessVendor"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByHeci7", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.heci7 = :heci7"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByItemName", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.itemName = :itemName"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByMfg", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.mfg = :mfg"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByMfgPartDesc", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.mfgPartDesc = :mfgPartDesc"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByMfgPartNum", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.mfgPartNum = :mfgPartNum"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByPlatform", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.platform = :platform"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByPrmheci7", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.prmheci7 = :prmheci7"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByLoadDate", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.loadDate = :loadDate"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByTagNumber", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.tagNumber = :tagNumber"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByProject", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.project = :project"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByVintageYear", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.vintageYear = :vintageYear"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByIpaFlag", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.ipaFlag = :ipaFlag"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByFrc", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.frc = :frc"),
    @NamedQuery(name = "BalPendingReturnQtyTest.findByFrameId", query = "SELECT b FROM BalPendingReturnQtyTest b WHERE b.frameId = :frameId")})
public class BalPendingReturnQtyTest implements Serializable {

  private static final long serialVersionUID = 1L;
  // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
  @Id
  @Basic(optional = false)
  @Column(name = "LOCATION_ID")
  private BigDecimal locationId;
  @Column(name = "LOCATION_CODE")
  private String locationCode;
  @Column(name = "CLLI_LOCATION_CODE")
  private String clliLocationCode;
  @Column(name = "ITEM_HECI10")
  private String itemHeci10;
  @Basic(optional = false)
  @Column(name = "STATUS")
  private String status;
  @Column(name = "SERIAL_NUM")
  private String serialNum;
  @Column(name = "QTY")
  private BigInteger qty;
  @Column(name = "PRODUCT_FAMILY")
  private String productFamily;
  @Column(name = "PARENT_ITEM")
  private String parentItem;
  @Column(name = "LOCATION_TYPE")
  private String locationType;
  @Column(name = "JOB_SOURCE")
  private String jobSource;
  @Column(name = "JOB_NUM")
  private String jobNum;
  @Column(name = "ITEM_DESC")
  private String itemDesc;
  @Column(name = "FINANCIAL_ENABLED")
  private String financialEnabled;
  @Column(name = "AVG_PRICE")
  private BigInteger avgPrice;
  @Column(name = "CRITICALITY")
  private String criticality;
  @Column(name = "CRITICALITY_IND")
  private Character criticalityInd;
  @Column(name = "ERP_DESCRIPTION")
  private String erpDescription;
  @Column(name = "EXCESS_PRIORITY")
  private BigInteger excessPriority;
  @Column(name = "EXCESS_RETURN_ACTION")
  private String excessReturnAction;
  @Column(name = "EXCESS_VENDOR")
  private String excessVendor;
  @Column(name = "HECI7")
  private String heci7;
  @Column(name = "ITEM_NAME")
  private String itemName;
  @Column(name = "MFG")
  private String mfg;
  @Column(name = "MFG_PART_DESC")
  private String mfgPartDesc;
  @Column(name = "MFG_PART_NUM")
  private String mfgPartNum;
  @Column(name = "PLATFORM")
  private String platform;
  @Column(name = "PRMHECI7")
  private String prmheci7;
  @Column(name = "LOAD_DATE")
  @Temporal(TemporalType.TIMESTAMP)
  private Date loadDate;
  @Column(name = "TAG_NUMBER")
  private String tagNumber;
  @Column(name = "PROJECT")
  private String project;
  @Column(name = "VINTAGE_YEAR")
  private BigInteger vintageYear;
  @Column(name = "IPA_FLAG")
  private String ipaFlag;
  @Column(name = "FRC")
  private String frc;
  @Column(name = "FRAME_ID")
  private String frameId;

  public BalPendingReturnQtyTest() {
  }

  public BalPendingReturnQtyTest(BigDecimal locationId) {
    this.locationId = locationId;
  }

  public BalPendingReturnQtyTest(BigDecimal locationId, String status) {
    this.locationId = locationId;
    this.status = status;
  }

  public BigDecimal getLocationId() {
    return locationId;
  }

  public void setLocationId(BigDecimal locationId) {
    this.locationId = locationId;
  }

  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public String getClliLocationCode() {
    return clliLocationCode;
  }

  public void setClliLocationCode(String clliLocationCode) {
    this.clliLocationCode = clliLocationCode;
  }

  public String getItemHeci10() {
    return itemHeci10;
  }

  public void setItemHeci10(String itemHeci10) {
    this.itemHeci10 = itemHeci10;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSerialNum() {
    return serialNum;
  }

  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }

  public BigInteger getQty() {
    return qty;
  }

  public void setQty(BigInteger qty) {
    this.qty = qty;
  }

  public String getProductFamily() {
    return productFamily;
  }

  public void setProductFamily(String productFamily) {
    this.productFamily = productFamily;
  }

  public String getParentItem() {
    return parentItem;
  }

  public void setParentItem(String parentItem) {
    this.parentItem = parentItem;
  }

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public String getJobSource() {
    return jobSource;
  }

  public void setJobSource(String jobSource) {
    this.jobSource = jobSource;
  }

  public String getJobNum() {
    return jobNum;
  }

  public void setJobNum(String jobNum) {
    this.jobNum = jobNum;
  }

  public String getItemDesc() {
    return itemDesc;
  }

  public void setItemDesc(String itemDesc) {
    this.itemDesc = itemDesc;
  }

  public String getFinancialEnabled() {
    return financialEnabled;
  }

  public void setFinancialEnabled(String financialEnabled) {
    this.financialEnabled = financialEnabled;
  }

  public BigInteger getAvgPrice() {
    return avgPrice;
  }

  public void setAvgPrice(BigInteger avgPrice) {
    this.avgPrice = avgPrice;
  }

  public String getCriticality() {
    return criticality;
  }

  public void setCriticality(String criticality) {
    this.criticality = criticality;
  }

  public Character getCriticalityInd() {
    return criticalityInd;
  }

  public void setCriticalityInd(Character criticalityInd) {
    this.criticalityInd = criticalityInd;
  }

  public String getErpDescription() {
    return erpDescription;
  }

  public void setErpDescription(String erpDescription) {
    this.erpDescription = erpDescription;
  }

  public BigInteger getExcessPriority() {
    return excessPriority;
  }

  public void setExcessPriority(BigInteger excessPriority) {
    this.excessPriority = excessPriority;
  }

  public String getExcessReturnAction() {
    return excessReturnAction;
  }

  public void setExcessReturnAction(String excessReturnAction) {
    this.excessReturnAction = excessReturnAction;
  }

  public String getExcessVendor() {
    return excessVendor;
  }

  public void setExcessVendor(String excessVendor) {
    this.excessVendor = excessVendor;
  }

  public String getHeci7() {
    return heci7;
  }

  public void setHeci7(String heci7) {
    this.heci7 = heci7;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getMfg() {
    return mfg;
  }

  public void setMfg(String mfg) {
    this.mfg = mfg;
  }

  public String getMfgPartDesc() {
    return mfgPartDesc;
  }

  public void setMfgPartDesc(String mfgPartDesc) {
    this.mfgPartDesc = mfgPartDesc;
  }

  public String getMfgPartNum() {
    return mfgPartNum;
  }

  public void setMfgPartNum(String mfgPartNum) {
    this.mfgPartNum = mfgPartNum;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getPrmheci7() {
    return prmheci7;
  }

  public void setPrmheci7(String prmheci7) {
    this.prmheci7 = prmheci7;
  }

  public Date getLoadDate() {
    return loadDate;
  }

  public void setLoadDate(Date loadDate) {
    this.loadDate = loadDate;
  }

  public String getTagNumber() {
    return tagNumber;
  }

  public void setTagNumber(String tagNumber) {
    this.tagNumber = tagNumber;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public BigInteger getVintageYear() {
    return vintageYear;
  }

  public void setVintageYear(BigInteger vintageYear) {
    this.vintageYear = vintageYear;
  }

  public String getIpaFlag() {
    return ipaFlag;
  }

  public void setIpaFlag(String ipaFlag) {
    this.ipaFlag = ipaFlag;
  }

  public String getFrc() {
    return frc;
  }

  public void setFrc(String frc) {
    this.frc = frc;
  }

  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (locationId != null ? locationId.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof BalPendingReturnQtyTest)) {
      return false;
    }
    BalPendingReturnQtyTest other = (BalPendingReturnQtyTest) object;
    if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.aexp.hyperdrive.entity.BalPendingReturnQtyTest[ locationId=" + locationId + " ]";
  }

}

