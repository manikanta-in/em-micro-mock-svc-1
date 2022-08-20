package eyemed.group.entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author intel
 */
@Entity
@Table(name = "BAL_DIRECTOR_REPORT")
@NamedQueries({
    @NamedQuery(name = "BalDirectorReport.findAll", query = "SELECT b FROM BalDirectorReport b"),
    @NamedQuery(name = "BalDirectorReport.findByCostCode", query = "SELECT b FROM BalDirectorReport b WHERE b.costCode = :costCode"),
    @NamedQuery(name = "BalDirectorReport.findByAlc", query = "SELECT b FROM BalDirectorReport b WHERE b.alc = :alc"),
    @NamedQuery(name = "BalDirectorReport.findByLocation", query = "SELECT b FROM BalDirectorReport b WHERE b.location = :location"),
    @NamedQuery(name = "BalDirectorReport.findByLocationId", query = "SELECT b FROM BalDirectorReport b WHERE b.locationId = :locationId"),
    @NamedQuery(name = "BalDirectorReport.findByShipped", query = "SELECT b FROM BalDirectorReport b WHERE b.shipped = :shipped"),
    @NamedQuery(name = "BalDirectorReport.findByShip2move", query = "SELECT b FROM BalDirectorReport b WHERE b.ship2move = :ship2move"),
    @NamedQuery(name = "BalDirectorReport.findByReceiptMoves", query = "SELECT b FROM BalDirectorReport b WHERE b.receiptMoves = :receiptMoves"),
    @NamedQuery(name = "BalDirectorReport.findByInserviceStage", query = "SELECT b FROM BalDirectorReport b WHERE b.inserviceStage = :inserviceStage"),
    @NamedQuery(name = "BalDirectorReport.findByInserviceSpare", query = "SELECT b FROM BalDirectorReport b WHERE b.inserviceSpare = :inserviceSpare"),
    @NamedQuery(name = "BalDirectorReport.findByInserviceMoves", query = "SELECT b FROM BalDirectorReport b WHERE b.inserviceMoves = :inserviceMoves"),
    @NamedQuery(name = "BalDirectorReport.findByReceiptStage", query = "SELECT b FROM BalDirectorReport b WHERE b.receiptStage = :receiptStage"),
    @NamedQuery(name = "BalDirectorReport.findByReceiptSpare", query = "SELECT b FROM BalDirectorReport b WHERE b.receiptSpare = :receiptSpare"),
    @NamedQuery(name = "BalDirectorReport.findByTotalNontargetOther", query = "SELECT b FROM BalDirectorReport b WHERE b.totalNontargetOther = :totalNontargetOther"),
    @NamedQuery(name = "BalDirectorReport.findByTotalTarget", query = "SELECT b FROM BalDirectorReport b WHERE b.totalTarget = :totalTarget"),
    @NamedQuery(name = "BalDirectorReport.findByBackorders", query = "SELECT b FROM BalDirectorReport b WHERE b.backorders = :backorders"),
    @NamedQuery(name = "BalDirectorReport.findByMaxSpareQty", query = "SELECT b FROM BalDirectorReport b WHERE b.maxSpareQty = :maxSpareQty"),
    @NamedQuery(name = "BalDirectorReport.findByTotalNontargetOtherBo", query = "SELECT b FROM BalDirectorReport b WHERE b.totalNontargetOtherBo = :totalNontargetOtherBo"),
    @NamedQuery(name = "BalDirectorReport.findByTotalTargetBo", query = "SELECT b FROM BalDirectorReport b WHERE b.totalTargetBo = :totalTargetBo"),
    @NamedQuery(name = "BalDirectorReport.findByAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.attuid = :attuid"),
    @NamedQuery(name = "BalDirectorReport.findByFirstName", query = "SELECT b FROM BalDirectorReport b WHERE b.firstName = :firstName"),
    @NamedQuery(name = "BalDirectorReport.findByLastName", query = "SELECT b FROM BalDirectorReport b WHERE b.lastName = :lastName"),
    @NamedQuery(name = "BalDirectorReport.findByCurrentOnhandS", query = "SELECT b FROM BalDirectorReport b WHERE b.currentOnhandS = :currentOnhandS"),
    @NamedQuery(name = "BalDirectorReport.findByCurrentOnhandG", query = "SELECT b FROM BalDirectorReport b WHERE b.currentOnhandG = :currentOnhandG"),
    @NamedQuery(name = "BalDirectorReport.findByCurrentOnhandM", query = "SELECT b FROM BalDirectorReport b WHERE b.currentOnhandM = :currentOnhandM"),
    @NamedQuery(name = "BalDirectorReport.findByTotalOnhand", query = "SELECT b FROM BalDirectorReport b WHERE b.totalOnhand = :totalOnhand"),
    @NamedQuery(name = "BalDirectorReport.findByLocationType", query = "SELECT b FROM BalDirectorReport b WHERE b.locationType = :locationType"),
    @NamedQuery(name = "BalDirectorReport.findByHrDescription", query = "SELECT b FROM BalDirectorReport b WHERE b.hrDescription = :hrDescription"),
    @NamedQuery(name = "BalDirectorReport.findByEmpAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.empAttuid = :empAttuid"),
    @NamedQuery(name = "BalDirectorReport.findByEmpLevel", query = "SELECT b FROM BalDirectorReport b WHERE b.empLevel = :empLevel"),
    @NamedQuery(name = "BalDirectorReport.findByEmpCostcenter", query = "SELECT b FROM BalDirectorReport b WHERE b.empCostcenter = :empCostcenter"),
    @NamedQuery(name = "BalDirectorReport.findByFirstlevel", query = "SELECT b FROM BalDirectorReport b WHERE b.firstlevel = :firstlevel"),
    @NamedQuery(name = "BalDirectorReport.findBySecondlevel", query = "SELECT b FROM BalDirectorReport b WHERE b.secondlevel = :secondlevel"),
    @NamedQuery(name = "BalDirectorReport.findByThirdlevel", query = "SELECT b FROM BalDirectorReport b WHERE b.thirdlevel = :thirdlevel"),
    @NamedQuery(name = "BalDirectorReport.findByFourthlevel", query = "SELECT b FROM BalDirectorReport b WHERE b.fourthlevel = :fourthlevel"),
    @NamedQuery(name = "BalDirectorReport.findByFifthlevel", query = "SELECT b FROM BalDirectorReport b WHERE b.fifthlevel = :fifthlevel"),
    @NamedQuery(name = "BalDirectorReport.findByFifthlevelAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.fifthlevelAttuid = :fifthlevelAttuid"),
    @NamedQuery(name = "BalDirectorReport.findByShortDept", query = "SELECT b FROM BalDirectorReport b WHERE b.shortDept = :shortDept"),
    @NamedQuery(name = "BalDirectorReport.findByFifthlevelDeptName", query = "SELECT b FROM BalDirectorReport b WHERE b.fifthlevelDeptName = :fifthlevelDeptName"),
    @NamedQuery(name = "BalDirectorReport.findByRecSpot", query = "SELECT b FROM BalDirectorReport b WHERE b.recSpot = :recSpot"),
    @NamedQuery(name = "BalDirectorReport.findByRecVips", query = "SELECT b FROM BalDirectorReport b WHERE b.recVips = :recVips"),
    @NamedQuery(name = "BalDirectorReport.findByRecOnline", query = "SELECT b FROM BalDirectorReport b WHERE b.recOnline = :recOnline"),
    @NamedQuery(name = "BalDirectorReport.findByRecTirks", query = "SELECT b FROM BalDirectorReport b WHERE b.recTirks = :recTirks"),
    @NamedQuery(name = "BalDirectorReport.findByRecReplenishment", query = "SELECT b FROM BalDirectorReport b WHERE b.recReplenishment = :recReplenishment"),
    @NamedQuery(name = "BalDirectorReport.findByRecIdis", query = "SELECT b FROM BalDirectorReport b WHERE b.recIdis = :recIdis"),
    @NamedQuery(name = "BalDirectorReport.findByRecJamTeo", query = "SELECT b FROM BalDirectorReport b WHERE b.recJamTeo = :recJamTeo"),
    @NamedQuery(name = "BalDirectorReport.findByRecOspcm", query = "SELECT b FROM BalDirectorReport b WHERE b.recOspcm = :recOspcm"),
    @NamedQuery(name = "BalDirectorReport.findByRecAproms", query = "SELECT b FROM BalDirectorReport b WHERE b.recAproms = :recAproms"),
    @NamedQuery(name = "BalDirectorReport.findByRecJamOsp", query = "SELECT b FROM BalDirectorReport b WHERE b.recJamOsp = :recJamOsp"),
    @NamedQuery(name = "BalDirectorReport.findByMinMaxExcessQty", query = "SELECT b FROM BalDirectorReport b WHERE b.minMaxExcessQty = :minMaxExcessQty"),
    @NamedQuery(name = "BalDirectorReport.findByMmExcessQtyTarget", query = "SELECT b FROM BalDirectorReport b WHERE b.mmExcessQtyTarget = :mmExcessQtyTarget"),
    @NamedQuery(name = "BalDirectorReport.findByMmExcessQtyNonTarget", query = "SELECT b FROM BalDirectorReport b WHERE b.mmExcessQtyNonTarget = :mmExcessQtyNonTarget"),
    @NamedQuery(name = "BalDirectorReport.findByMmExcessQtyTransit", query = "SELECT b FROM BalDirectorReport b WHERE b.mmExcessQtyTransit = :mmExcessQtyTransit"),
    @NamedQuery(name = "BalDirectorReport.findByPrimeFlag", query = "SELECT b FROM BalDirectorReport b WHERE b.primeFlag = :primeFlag"),
    @NamedQuery(name = "BalDirectorReport.findBySiteStatus", query = "SELECT b FROM BalDirectorReport b WHERE b.siteStatus = :siteStatus"),
    @NamedQuery(name = "BalDirectorReport.findByState", query = "SELECT b FROM BalDirectorReport b WHERE b.state = :state"),
    @NamedQuery(name = "BalDirectorReport.findByAddress", query = "SELECT b FROM BalDirectorReport b WHERE b.address = :address"),
    @NamedQuery(name = "BalDirectorReport.findByCity", query = "SELECT b FROM BalDirectorReport b WHERE b.city = :city"),
    @NamedQuery(name = "BalDirectorReport.findByClli", query = "SELECT b FROM BalDirectorReport b WHERE b.clli = :clli"),
    @NamedQuery(name = "BalDirectorReport.findByIDollar", query = "SELECT b FROM BalDirectorReport b WHERE b.iDollar = :iDollar"),
    @NamedQuery(name = "BalDirectorReport.findByGDollar", query = "SELECT b FROM BalDirectorReport b WHERE b.gDollar = :gDollar"),
    @NamedQuery(name = "BalDirectorReport.findByMDollar", query = "SELECT b FROM BalDirectorReport b WHERE b.mDollar = :mDollar"),
    @NamedQuery(name = "BalDirectorReport.findBySDollar", query = "SELECT b FROM BalDirectorReport b WHERE b.sDollar = :sDollar"),
    @NamedQuery(name = "BalDirectorReport.findByEDollar", query = "SELECT b FROM BalDirectorReport b WHERE b.eDollar = :eDollar"),
    @NamedQuery(name = "BalDirectorReport.findByEPercent", query = "SELECT b FROM BalDirectorReport b WHERE b.ePercent = :ePercent"),
    @NamedQuery(name = "BalDirectorReport.findByTDollarAllOnhand", query = "SELECT b FROM BalDirectorReport b WHERE b.tDollarAllOnhand = :tDollarAllOnhand"),
    @NamedQuery(name = "BalDirectorReport.findByQtyDelete", query = "SELECT b FROM BalDirectorReport b WHERE b.qtyDelete = :qtyDelete"),
    @NamedQuery(name = "BalDirectorReport.findByLost", query = "SELECT b FROM BalDirectorReport b WHERE b.lost = :lost"),
    @NamedQuery(name = "BalDirectorReport.findByReturnsTodcgoodDef", query = "SELECT b FROM BalDirectorReport b WHERE b.returnsTodcgoodDef = :returnsTodcgoodDef"),
    @NamedQuery(name = "BalDirectorReport.findByFromLocationIdReturns", query = "SELECT b FROM BalDirectorReport b WHERE b.fromLocationIdReturns = :fromLocationIdReturns"),
    @NamedQuery(name = "BalDirectorReport.findByFromLocationIdReturnsgood", query = "SELECT b FROM BalDirectorReport b WHERE b.fromLocationIdReturnsgood = :fromLocationIdReturnsgood"),
    @NamedQuery(name = "BalDirectorReport.findByFromLocationIdReturnsdef", query = "SELECT b FROM BalDirectorReport b WHERE b.fromLocationIdReturnsdef = :fromLocationIdReturnsdef"),
    @NamedQuery(name = "BalDirectorReport.findByReturnsTodcgood", query = "SELECT b FROM BalDirectorReport b WHERE b.returnsTodcgood = :returnsTodcgood"),
    @NamedQuery(name = "BalDirectorReport.findByReturnsTodcDef", query = "SELECT b FROM BalDirectorReport b WHERE b.returnsTodcDef = :returnsTodcDef"),
    @NamedQuery(name = "BalDirectorReport.findByShipSpot", query = "SELECT b FROM BalDirectorReport b WHERE b.shipSpot = :shipSpot"),
    @NamedQuery(name = "BalDirectorReport.findByShipVips", query = "SELECT b FROM BalDirectorReport b WHERE b.shipVips = :shipVips"),
    @NamedQuery(name = "BalDirectorReport.findByShipOnline", query = "SELECT b FROM BalDirectorReport b WHERE b.shipOnline = :shipOnline"),
    @NamedQuery(name = "BalDirectorReport.findByShipTirks", query = "SELECT b FROM BalDirectorReport b WHERE b.shipTirks = :shipTirks"),
    @NamedQuery(name = "BalDirectorReport.findByShipReplenishment", query = "SELECT b FROM BalDirectorReport b WHERE b.shipReplenishment = :shipReplenishment"),
    @NamedQuery(name = "BalDirectorReport.findByShipIdis", query = "SELECT b FROM BalDirectorReport b WHERE b.shipIdis = :shipIdis"),
    @NamedQuery(name = "BalDirectorReport.findByShipJamTeo", query = "SELECT b FROM BalDirectorReport b WHERE b.shipJamTeo = :shipJamTeo"),
    @NamedQuery(name = "BalDirectorReport.findByShipCebits", query = "SELECT b FROM BalDirectorReport b WHERE b.shipCebits = :shipCebits"),
    @NamedQuery(name = "BalDirectorReport.findByHarvestPrime", query = "SELECT b FROM BalDirectorReport b WHERE b.harvestPrime = :harvestPrime"),
    @NamedQuery(name = "BalDirectorReport.findByDcKeep", query = "SELECT b FROM BalDirectorReport b WHERE b.dcKeep = :dcKeep"),
    @NamedQuery(name = "BalDirectorReport.findByDcFull", query = "SELECT b FROM BalDirectorReport b WHERE b.dcFull = :dcFull"),
    @NamedQuery(name = "BalDirectorReport.findByDcExempt", query = "SELECT b FROM BalDirectorReport b WHERE b.dcExempt = :dcExempt"),
    @NamedQuery(name = "BalDirectorReport.findByExcessValueP1", query = "SELECT b FROM BalDirectorReport b WHERE b.excessValueP1 = :excessValueP1"),
    @NamedQuery(name = "BalDirectorReport.findByExcessValueP2", query = "SELECT b FROM BalDirectorReport b WHERE b.excessValueP2 = :excessValueP2"),
    @NamedQuery(name = "BalDirectorReport.findByExcessValueP3", query = "SELECT b FROM BalDirectorReport b WHERE b.excessValueP3 = :excessValueP3"),
    @NamedQuery(name = "BalDirectorReport.findByExcessValueP4", query = "SELECT b FROM BalDirectorReport b WHERE b.excessValueP4 = :excessValueP4"),
    @NamedQuery(name = "BalDirectorReport.findByStagingP1", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingP1 = :stagingP1"),
    @NamedQuery(name = "BalDirectorReport.findByStagingP2", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingP2 = :stagingP2"),
    @NamedQuery(name = "BalDirectorReport.findByStagingP3", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingP3 = :stagingP3"),
    @NamedQuery(name = "BalDirectorReport.findByStagingP4", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingP4 = :stagingP4"),
    @NamedQuery(name = "BalDirectorReport.findByStagingValueP1", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingValueP1 = :stagingValueP1"),
    @NamedQuery(name = "BalDirectorReport.findByStagingValueP2", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingValueP2 = :stagingValueP2"),
    @NamedQuery(name = "BalDirectorReport.findByStagingValueP3", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingValueP3 = :stagingValueP3"),
    @NamedQuery(name = "BalDirectorReport.findByStagingValueP4", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingValueP4 = :stagingValueP4"),
    @NamedQuery(name = "BalDirectorReport.findByStagingTotal", query = "SELECT b FROM BalDirectorReport b WHERE b.stagingTotal = :stagingTotal"),
    @NamedQuery(name = "BalDirectorReport.findByStockP1", query = "SELECT b FROM BalDirectorReport b WHERE b.stockP1 = :stockP1"),
    @NamedQuery(name = "BalDirectorReport.findByStockP2", query = "SELECT b FROM BalDirectorReport b WHERE b.stockP2 = :stockP2"),
    @NamedQuery(name = "BalDirectorReport.findByStockP3", query = "SELECT b FROM BalDirectorReport b WHERE b.stockP3 = :stockP3"),
    @NamedQuery(name = "BalDirectorReport.findByStockP4", query = "SELECT b FROM BalDirectorReport b WHERE b.stockP4 = :stockP4"),
    @NamedQuery(name = "BalDirectorReport.findByStockValueP1", query = "SELECT b FROM BalDirectorReport b WHERE b.stockValueP1 = :stockValueP1"),
    @NamedQuery(name = "BalDirectorReport.findByStockValueP2", query = "SELECT b FROM BalDirectorReport b WHERE b.stockValueP2 = :stockValueP2"),
    @NamedQuery(name = "BalDirectorReport.findByStockValueP3", query = "SELECT b FROM BalDirectorReport b WHERE b.stockValueP3 = :stockValueP3"),
    @NamedQuery(name = "BalDirectorReport.findByStockValueP4", query = "SELECT b FROM BalDirectorReport b WHERE b.stockValueP4 = :stockValueP4"),
    @NamedQuery(name = "BalDirectorReport.findByStockTotal", query = "SELECT b FROM BalDirectorReport b WHERE b.stockTotal = :stockTotal"),
    @NamedQuery(name = "BalDirectorReport.findByLostP1", query = "SELECT b FROM BalDirectorReport b WHERE b.lostP1 = :lostP1"),
    @NamedQuery(name = "BalDirectorReport.findByLostP2", query = "SELECT b FROM BalDirectorReport b WHERE b.lostP2 = :lostP2"),
    @NamedQuery(name = "BalDirectorReport.findByLostP3", query = "SELECT b FROM BalDirectorReport b WHERE b.lostP3 = :lostP3"),
    @NamedQuery(name = "BalDirectorReport.findByLostP4", query = "SELECT b FROM BalDirectorReport b WHERE b.lostP4 = :lostP4"),
    @NamedQuery(name = "BalDirectorReport.findByLostValueP1", query = "SELECT b FROM BalDirectorReport b WHERE b.lostValueP1 = :lostValueP1"),
    @NamedQuery(name = "BalDirectorReport.findByLostValueP2", query = "SELECT b FROM BalDirectorReport b WHERE b.lostValueP2 = :lostValueP2"),
    @NamedQuery(name = "BalDirectorReport.findByLostValueP3", query = "SELECT b FROM BalDirectorReport b WHERE b.lostValueP3 = :lostValueP3"),
    @NamedQuery(name = "BalDirectorReport.findByLostValueP4", query = "SELECT b FROM BalDirectorReport b WHERE b.lostValueP4 = :lostValueP4"),
    @NamedQuery(name = "BalDirectorReport.findByLostTotal", query = "SELECT b FROM BalDirectorReport b WHERE b.lostTotal = :lostTotal"),
    @NamedQuery(name = "BalDirectorReport.findByDelivered", query = "SELECT b FROM BalDirectorReport b WHERE b.delivered = :delivered"),
    @NamedQuery(name = "BalDirectorReport.findByReceited", query = "SELECT b FROM BalDirectorReport b WHERE b.receited = :receited"),
    @NamedQuery(name = "BalDirectorReport.findByRecZeroSeven", query = "SELECT b FROM BalDirectorReport b WHERE b.recZeroSeven = :recZeroSeven"),
    @NamedQuery(name = "BalDirectorReport.findByRecEightFourteen", query = "SELECT b FROM BalDirectorReport b WHERE b.recEightFourteen = :recEightFourteen"),
    @NamedQuery(name = "BalDirectorReport.findByRecGtrFourteen", query = "SELECT b FROM BalDirectorReport b WHERE b.recGtrFourteen = :recGtrFourteen"),
    @NamedQuery(name = "BalDirectorReport.findByContact", query = "SELECT b FROM BalDirectorReport b WHERE b.contact = :contact"),
    @NamedQuery(name = "BalDirectorReport.findBySilo", query = "SELECT b FROM BalDirectorReport b WHERE b.silo = :silo"),
    @NamedQuery(name = "BalDirectorReport.findByLastOwner", query = "SELECT b FROM BalDirectorReport b WHERE b.lastOwner = :lastOwner"),
    @NamedQuery(name = "BalDirectorReport.findByUnkOwner", query = "SELECT b FROM BalDirectorReport b WHERE b.unkOwner = :unkOwner"),
    @NamedQuery(name = "BalDirectorReport.findByThirdlevelAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.thirdlevelAttuid = :thirdlevelAttuid"),
    @NamedQuery(name = "BalDirectorReport.findByFourthlevelAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.fourthlevelAttuid = :fourthlevelAttuid"),
    @NamedQuery(name = "BalDirectorReport.findBySecondlevelAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.secondlevelAttuid = :secondlevelAttuid"),
    @NamedQuery(name = "BalDirectorReport.findByFirstlevelAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.firstlevelAttuid = :firstlevelAttuid"),
    @NamedQuery(name = "BalDirectorReport.findBySixthlevel", query = "SELECT b FROM BalDirectorReport b WHERE b.sixthlevel = :sixthlevel"),
    @NamedQuery(name = "BalDirectorReport.findBySixthlevelAttuid", query = "SELECT b FROM BalDirectorReport b WHERE b.sixthlevelAttuid = :sixthlevelAttuid"),
    @NamedQuery(name = "BalDirectorReport.findByLqt", query = "SELECT b FROM BalDirectorReport b WHERE b.lqt = :lqt"),
    @NamedQuery(name = "BalDirectorReport.findByForce", query = "SELECT b FROM BalDirectorReport b WHERE b.force = :force"),
    @NamedQuery(name = "BalDirectorReport.findByStateSpoc", query = "SELECT b FROM BalDirectorReport b WHERE b.stateSpoc = :stateSpoc"),
    @NamedQuery(name = "BalDirectorReport.findByRegionalSpoc", query = "SELECT b FROM BalDirectorReport b WHERE b.regionalSpoc = :regionalSpoc"),
    @NamedQuery(name = "BalDirectorReport.findByCorpSpoc", query = "SELECT b FROM BalDirectorReport b WHERE b.corpSpoc = :corpSpoc"),
    @NamedQuery(name = "BalDirectorReport.findByCoLocated", query = "SELECT b FROM BalDirectorReport b WHERE b.coLocated = :coLocated"),
    @NamedQuery(name = "BalDirectorReport.findByLocApprover", query = "SELECT b FROM BalDirectorReport b WHERE b.locApprover = :locApprover"),
    @NamedQuery(name = "BalDirectorReport.findByCrossReference", query = "SELECT b FROM BalDirectorReport b WHERE b.crossReference = :crossReference"),
    @NamedQuery(name = "BalDirectorReport.findByClliLocationCode", query = "SELECT b FROM BalDirectorReport b WHERE b.clliLocationCode = :clliLocationCode"),
    @NamedQuery(name = "BalDirectorReport.findByExcessPriority", query = "SELECT b FROM BalDirectorReport b WHERE b.excessPriority = :excessPriority"),
    @NamedQuery(name = "BalDirectorReport.findByRecCebits", query = "SELECT b FROM BalDirectorReport b WHERE b.recCebits = :recCebits"),
    @NamedQuery(name = "BalDirectorReport.findByShipOther", query = "SELECT b FROM BalDirectorReport b WHERE b.shipOther = :shipOther"),
    @NamedQuery(name = "BalDirectorReport.findByRecOther", query = "SELECT b FROM BalDirectorReport b WHERE b.recOther = :recOther"),
    @NamedQuery(name = "BalDirectorReport.findByAuthStage", query = "SELECT b FROM BalDirectorReport b WHERE b.authStage = :authStage"),
    @NamedQuery(name = "BalDirectorReport.findByRetiredQty", query = "SELECT b FROM BalDirectorReport b WHERE b.retiredQty = :retiredQty"),
    @NamedQuery(name = "BalDirectorReport.findByRetiredValue", query = "SELECT b FROM BalDirectorReport b WHERE b.retiredValue = :retiredValue")})
public class BalDirectorReport implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "COST_CODE")
  private String costCode;
  @Column(name = "ALC")
  private String alc;
  @Column(name = "LOCATION")
  private String location;
  @Column(name = "LOCATION_ID")
  private BigInteger locationId;
  @Column(name = "SHIPPED")
  private BigInteger shipped;
  @Column(name = "SHIP2MOVE")
  private BigInteger ship2move;
  @Column(name = "RECEIPT_MOVES")
  private BigInteger receiptMoves;
  @Column(name = "INSERVICE_STAGE")
  private BigInteger inserviceStage;
  @Column(name = "INSERVICE_SPARE")
  private BigInteger inserviceSpare;
  @Column(name = "INSERVICE_MOVES")
  private BigInteger inserviceMoves;
  @Column(name = "RECEIPT_STAGE")
  private BigInteger receiptStage;
  @Column(name = "RECEIPT_SPARE")
  private BigInteger receiptSpare;
  @Column(name = "TOTAL_NONTARGET_OTHER")
  private BigInteger totalNontargetOther;
  @Column(name = "TOTAL_TARGET")
  private BigInteger totalTarget;
  @Column(name = "BACKORDERS")
  private BigInteger backorders;
  @Column(name = "MAX_SPARE_QTY")
  private BigInteger maxSpareQty;
  @Column(name = "TOTAL_NONTARGET_OTHER_BO")
  private BigInteger totalNontargetOtherBo;
  @Column(name = "TOTAL_TARGET_BO")
  private BigInteger totalTargetBo;
  @Column(name = "ATTUID")
  private String attuid;
  @Column(name = "FIRST_NAME")
  private String firstName;
  @Column(name = "LAST_NAME")
  private String lastName;
  @Column(name = "CURRENT_ONHAND_S")
  private BigInteger currentOnhandS;
  @Column(name = "CURRENT_ONHAND_G")
  private BigInteger currentOnhandG;
  @Column(name = "CURRENT_ONHAND_M")
  private BigInteger currentOnhandM;
  @Column(name = "TOTAL_ONHAND")
  private BigInteger totalOnhand;
  @Column(name = "LOCATION_TYPE")
  private String locationType;
  @Column(name = "HR_DESCRIPTION")
  private String hrDescription;
  @Column(name = "EMP_ATTUID")
  private String empAttuid;
  @Column(name = "EMP_LEVEL")
  private String empLevel;
  @Column(name = "EMP_COSTCENTER")
  private String empCostcenter;
  @Column(name = "FIRSTLEVEL")
  private String firstlevel;
  @Column(name = "SECONDLEVEL")
  private String secondlevel;
  @Column(name = "THIRDLEVEL")
  private String thirdlevel;
  @Column(name = "FOURTHLEVEL")
  private String fourthlevel;
  @Column(name = "FIFTHLEVEL")
  private String fifthlevel;
  @Column(name = "FIFTHLEVEL_ATTUID")
  private String fifthlevelAttuid;
  @Column(name = "SHORT_DEPT")
  private String shortDept;
  @Column(name = "FIFTHLEVEL_DEPT_NAME")
  private String fifthlevelDeptName;
  @Column(name = "REC_SPOT")
  private BigInteger recSpot;
  @Column(name = "REC_VIPS")
  private BigInteger recVips;
  @Column(name = "REC_ONLINE")
  private BigInteger recOnline;
  @Column(name = "REC_TIRKS")
  private BigInteger recTirks;
  @Column(name = "REC_REPLENISHMENT")
  private BigInteger recReplenishment;
  @Column(name = "REC_IDIS")
  private BigInteger recIdis;
  @Column(name = "REC_JAM_TEO")
  private BigInteger recJamTeo;
  @Column(name = "REC_OSPCM")
  private BigInteger recOspcm;
  @Column(name = "REC_APROMS")
  private BigInteger recAproms;
  @Column(name = "REC_JAM_OSP")
  private BigInteger recJamOsp;
  @Column(name = "MIN_MAX_EXCESS_QTY")
  private BigInteger minMaxExcessQty;
  @Column(name = "MM_EXCESS_QTY_TARGET")
  private BigInteger mmExcessQtyTarget;
  @Column(name = "MM_EXCESS_QTY_NON_TARGET")
  private BigInteger mmExcessQtyNonTarget;
  @Column(name = "MM_EXCESS_QTY_TRANSIT")
  private BigInteger mmExcessQtyTransit;
  @Column(name = "PRIME_FLAG")
  private String primeFlag;
  @Column(name = "SITE_STATUS")
  private String siteStatus;
  @Column(name = "STATE")
  private String state;
  @Column(name = "ADDRESS")
  private String address;
  @Column(name = "CITY")
  private String city;
  @Column(name = "CLLI")
  private String clli;
  @Column(name = "I_DOLLAR")
  private BigInteger iDollar;
  @Column(name = "G_DOLLAR")
  private BigInteger gDollar;
  @Column(name = "M_DOLLAR")
  private BigInteger mDollar;
  @Column(name = "S_DOLLAR")
  private BigInteger sDollar;
  @Column(name = "E_DOLLAR")
  private BigInteger eDollar;
  @Column(name = "E_PERCENT")
  private BigInteger ePercent;
  @Column(name = "T_DOLLAR_ALL_ONHAND")
  private BigInteger tDollarAllOnhand;
  @Column(name = "QTY_DELETE")
  private BigInteger qtyDelete;
  @Column(name = "LOST")
  private BigInteger lost;
  @Column(name = "RETURNS_TODCGOOD_DEF")
  private BigInteger returnsTodcgoodDef;
  @Column(name = "FROM_LOCATION_ID_RETURNS")
  private BigInteger fromLocationIdReturns;
  @Column(name = "FROM_LOCATION_ID_RETURNSGOOD")
  private BigInteger fromLocationIdReturnsgood;
  @Column(name = "FROM_LOCATION_ID_RETURNSDEF")
  private BigInteger fromLocationIdReturnsdef;
  @Column(name = "RETURNS_TODCGOOD")
  private BigInteger returnsTodcgood;
  @Column(name = "RETURNS_TODC_DEF")
  private BigInteger returnsTodcDef;
  @Column(name = "SHIP_SPOT")
  private BigInteger shipSpot;
  @Column(name = "SHIP_VIPS")
  private BigInteger shipVips;
  @Column(name = "SHIP_ONLINE")
  private BigInteger shipOnline;
  @Column(name = "SHIP_TIRKS")
  private BigInteger shipTirks;
  @Column(name = "SHIP_REPLENISHMENT")
  private BigInteger shipReplenishment;
  @Column(name = "SHIP_IDIS")
  private BigInteger shipIdis;
  @Column(name = "SHIP_JAM_TEO")
  private BigInteger shipJamTeo;
  @Column(name = "SHIP_CEBITS")
  private BigInteger shipCebits;
  @Column(name = "HARVEST_PRIME")
  private BigInteger harvestPrime;
  @Column(name = "DC_KEEP")
  private BigInteger dcKeep;
  @Column(name = "DC_FULL")
  private BigInteger dcFull;
  @Column(name = "DC_EXEMPT")
  private BigInteger dcExempt;
  @Column(name = "EXCESS_VALUE_P1")
  private BigInteger excessValueP1;
  @Column(name = "EXCESS_VALUE_P2")
  private BigInteger excessValueP2;
  @Column(name = "EXCESS_VALUE_P3")
  private BigInteger excessValueP3;
  @Column(name = "EXCESS_VALUE_P4")
  private BigInteger excessValueP4;
  @Column(name = "STAGING_P1")
  private BigInteger stagingP1;
  @Column(name = "STAGING_P2")
  private BigInteger stagingP2;
  @Column(name = "STAGING_P3")
  private BigInteger stagingP3;
  @Column(name = "STAGING_P4")
  private BigInteger stagingP4;
  @Column(name = "STAGING_VALUE_P1")
  private BigInteger stagingValueP1;
  @Column(name = "STAGING_VALUE_P2")
  private BigInteger stagingValueP2;
  @Column(name = "STAGING_VALUE_P3")
  private BigInteger stagingValueP3;
  @Column(name = "STAGING_VALUE_P4")
  private BigInteger stagingValueP4;
  @Column(name = "STAGING_TOTAL")
  private BigInteger stagingTotal;
  @Column(name = "STOCK_P1")
  private BigInteger stockP1;
  @Column(name = "STOCK_P2")
  private BigInteger stockP2;
  @Column(name = "STOCK_P3")
  private BigInteger stockP3;
  @Column(name = "STOCK_P4")
  private BigInteger stockP4;
  @Column(name = "STOCK_VALUE_P1")
  private BigInteger stockValueP1;
  @Column(name = "STOCK_VALUE_P2")
  private BigInteger stockValueP2;
  @Column(name = "STOCK_VALUE_P3")
  private BigInteger stockValueP3;
  @Column(name = "STOCK_VALUE_P4")
  private BigInteger stockValueP4;
  @Column(name = "STOCK_TOTAL")
  private BigInteger stockTotal;
  @Column(name = "LOST_P1")
  private BigInteger lostP1;
  @Column(name = "LOST_P2")
  private BigInteger lostP2;
  @Column(name = "LOST_P3")
  private BigInteger lostP3;
  @Column(name = "LOST_P4")
  private BigInteger lostP4;
  @Column(name = "LOST_VALUE_P1")
  private BigInteger lostValueP1;
  @Column(name = "LOST_VALUE_P2")
  private BigInteger lostValueP2;
  @Column(name = "LOST_VALUE_P3")
  private BigInteger lostValueP3;
  @Column(name = "LOST_VALUE_P4")
  private BigInteger lostValueP4;
  @Column(name = "LOST_TOTAL")
  private BigInteger lostTotal;
  @Column(name = "DELIVERED")
  private BigInteger delivered;
  @Column(name = "RECEITED")
  private BigInteger receited;
  @Column(name = "REC_ZERO_SEVEN")
  private BigInteger recZeroSeven;
  @Column(name = "REC_EIGHT_FOURTEEN")
  private BigInteger recEightFourteen;
  @Column(name = "REC_GTR_FOURTEEN")
  private BigInteger recGtrFourteen;
  @Column(name = "CONTACT")
  private BigInteger contact;
  @Column(name = "SILO")
  private BigInteger silo;
  @Column(name = "LAST_OWNER")
  private BigInteger lastOwner;
  @Column(name = "UNK_OWNER")
  private BigInteger unkOwner;
  @Column(name = "THIRDLEVEL_ATTUID")
  private String thirdlevelAttuid;
  @Column(name = "FOURTHLEVEL_ATTUID")
  private String fourthlevelAttuid;
  @Column(name = "SECONDLEVEL_ATTUID")
  private String secondlevelAttuid;
  @Column(name = "FIRSTLEVEL_ATTUID")
  private String firstlevelAttuid;
  @Column(name = "SIXTHLEVEL")
  private String sixthlevel;
  @Column(name = "SIXTHLEVEL_ATTUID")
  private String sixthlevelAttuid;
  @Column(name = "LQT")
  private BigInteger lqt;
  @Column(name = "FORCE")
  private BigInteger force;
  @Column(name = "STATE_SPOC")
  private String stateSpoc;
  @Column(name = "REGIONAL_SPOC")
  private String regionalSpoc;
  @Column(name = "CORP_SPOC")
  private String corpSpoc;
  @Column(name = "CO_LOCATED")
  private BigInteger coLocated;
  @Column(name = "LOC_APPROVER")
  private BigInteger locApprover;
  @Column(name = "CROSS_REFERENCE")
  private String crossReference;
  @Column(name = "CLLI_LOCATION_CODE")
  private String clliLocationCode;
  @Column(name = "EXCESS_PRIORITY")
  private BigInteger excessPriority;
  @Column(name = "REC_CEBITS")
  private BigInteger recCebits;
  @Column(name = "SHIP_OTHER")
  private BigInteger shipOther;
  @Column(name = "REC_OTHER")
  private BigInteger recOther;
  @Column(name = "AUTH_STAGE")
  private BigInteger authStage;
  @Column(name = "RETIRED_QTY")
  private BigInteger retiredQty;
  @Column(name = "RETIRED_VALUE")
  private BigInteger retiredValue;

  public BalDirectorReport() {
  }

  public BalDirectorReport(String costCode) {
    this.costCode = costCode;
  }

  public String getCostCode() {
    return costCode;
  }

  public void setCostCode(String costCode) {
    this.costCode = costCode;
  }

  public String getAlc() {
    return alc;
  }

  public void setAlc(String alc) {
    this.alc = alc;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public BigInteger getLocationId() {
    return locationId;
  }

  public void setLocationId(BigInteger locationId) {
    this.locationId = locationId;
  }

  public BigInteger getShipped() {
    return shipped;
  }

  public void setShipped(BigInteger shipped) {
    this.shipped = shipped;
  }

  public BigInteger getShip2move() {
    return ship2move;
  }

  public void setShip2move(BigInteger ship2move) {
    this.ship2move = ship2move;
  }

  public BigInteger getReceiptMoves() {
    return receiptMoves;
  }

  public void setReceiptMoves(BigInteger receiptMoves) {
    this.receiptMoves = receiptMoves;
  }

  public BigInteger getInserviceStage() {
    return inserviceStage;
  }

  public void setInserviceStage(BigInteger inserviceStage) {
    this.inserviceStage = inserviceStage;
  }

  public BigInteger getInserviceSpare() {
    return inserviceSpare;
  }

  public void setInserviceSpare(BigInteger inserviceSpare) {
    this.inserviceSpare = inserviceSpare;
  }

  public BigInteger getInserviceMoves() {
    return inserviceMoves;
  }

  public void setInserviceMoves(BigInteger inserviceMoves) {
    this.inserviceMoves = inserviceMoves;
  }

  public BigInteger getReceiptStage() {
    return receiptStage;
  }

  public void setReceiptStage(BigInteger receiptStage) {
    this.receiptStage = receiptStage;
  }

  public BigInteger getReceiptSpare() {
    return receiptSpare;
  }

  public void setReceiptSpare(BigInteger receiptSpare) {
    this.receiptSpare = receiptSpare;
  }

  public BigInteger getTotalNontargetOther() {
    return totalNontargetOther;
  }

  public void setTotalNontargetOther(BigInteger totalNontargetOther) {
    this.totalNontargetOther = totalNontargetOther;
  }

  public BigInteger getTotalTarget() {
    return totalTarget;
  }

  public void setTotalTarget(BigInteger totalTarget) {
    this.totalTarget = totalTarget;
  }

  public BigInteger getBackorders() {
    return backorders;
  }

  public void setBackorders(BigInteger backorders) {
    this.backorders = backorders;
  }

  public BigInteger getMaxSpareQty() {
    return maxSpareQty;
  }

  public void setMaxSpareQty(BigInteger maxSpareQty) {
    this.maxSpareQty = maxSpareQty;
  }

  public BigInteger getTotalNontargetOtherBo() {
    return totalNontargetOtherBo;
  }

  public void setTotalNontargetOtherBo(BigInteger totalNontargetOtherBo) {
    this.totalNontargetOtherBo = totalNontargetOtherBo;
  }

  public BigInteger getTotalTargetBo() {
    return totalTargetBo;
  }

  public void setTotalTargetBo(BigInteger totalTargetBo) {
    this.totalTargetBo = totalTargetBo;
  }

  public String getAttuid() {
    return attuid;
  }

  public void setAttuid(String attuid) {
    this.attuid = attuid;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BigInteger getCurrentOnhandS() {
    return currentOnhandS;
  }

  public void setCurrentOnhandS(BigInteger currentOnhandS) {
    this.currentOnhandS = currentOnhandS;
  }

  public BigInteger getCurrentOnhandG() {
    return currentOnhandG;
  }

  public void setCurrentOnhandG(BigInteger currentOnhandG) {
    this.currentOnhandG = currentOnhandG;
  }

  public BigInteger getCurrentOnhandM() {
    return currentOnhandM;
  }

  public void setCurrentOnhandM(BigInteger currentOnhandM) {
    this.currentOnhandM = currentOnhandM;
  }

  public BigInteger getTotalOnhand() {
    return totalOnhand;
  }

  public void setTotalOnhand(BigInteger totalOnhand) {
    this.totalOnhand = totalOnhand;
  }

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public String getHrDescription() {
    return hrDescription;
  }

  public void setHrDescription(String hrDescription) {
    this.hrDescription = hrDescription;
  }

  public String getEmpAttuid() {
    return empAttuid;
  }

  public void setEmpAttuid(String empAttuid) {
    this.empAttuid = empAttuid;
  }

  public String getEmpLevel() {
    return empLevel;
  }

  public void setEmpLevel(String empLevel) {
    this.empLevel = empLevel;
  }

  public String getEmpCostcenter() {
    return empCostcenter;
  }

  public void setEmpCostcenter(String empCostcenter) {
    this.empCostcenter = empCostcenter;
  }

  public String getFirstlevel() {
    return firstlevel;
  }

  public void setFirstlevel(String firstlevel) {
    this.firstlevel = firstlevel;
  }

  public String getSecondlevel() {
    return secondlevel;
  }

  public void setSecondlevel(String secondlevel) {
    this.secondlevel = secondlevel;
  }

  public String getThirdlevel() {
    return thirdlevel;
  }

  public void setThirdlevel(String thirdlevel) {
    this.thirdlevel = thirdlevel;
  }

  public String getFourthlevel() {
    return fourthlevel;
  }

  public void setFourthlevel(String fourthlevel) {
    this.fourthlevel = fourthlevel;
  }

  public String getFifthlevel() {
    return fifthlevel;
  }

  public void setFifthlevel(String fifthlevel) {
    this.fifthlevel = fifthlevel;
  }

  public String getFifthlevelAttuid() {
    return fifthlevelAttuid;
  }

  public void setFifthlevelAttuid(String fifthlevelAttuid) {
    this.fifthlevelAttuid = fifthlevelAttuid;
  }

  public String getShortDept() {
    return shortDept;
  }

  public void setShortDept(String shortDept) {
    this.shortDept = shortDept;
  }

  public String getFifthlevelDeptName() {
    return fifthlevelDeptName;
  }

  public void setFifthlevelDeptName(String fifthlevelDeptName) {
    this.fifthlevelDeptName = fifthlevelDeptName;
  }

  public BigInteger getRecSpot() {
    return recSpot;
  }

  public void setRecSpot(BigInteger recSpot) {
    this.recSpot = recSpot;
  }

  public BigInteger getRecVips() {
    return recVips;
  }

  public void setRecVips(BigInteger recVips) {
    this.recVips = recVips;
  }

  public BigInteger getRecOnline() {
    return recOnline;
  }

  public void setRecOnline(BigInteger recOnline) {
    this.recOnline = recOnline;
  }

  public BigInteger getRecTirks() {
    return recTirks;
  }

  public void setRecTirks(BigInteger recTirks) {
    this.recTirks = recTirks;
  }

  public BigInteger getRecReplenishment() {
    return recReplenishment;
  }

  public void setRecReplenishment(BigInteger recReplenishment) {
    this.recReplenishment = recReplenishment;
  }

  public BigInteger getRecIdis() {
    return recIdis;
  }

  public void setRecIdis(BigInteger recIdis) {
    this.recIdis = recIdis;
  }

  public BigInteger getRecJamTeo() {
    return recJamTeo;
  }

  public void setRecJamTeo(BigInteger recJamTeo) {
    this.recJamTeo = recJamTeo;
  }

  public BigInteger getRecOspcm() {
    return recOspcm;
  }

  public void setRecOspcm(BigInteger recOspcm) {
    this.recOspcm = recOspcm;
  }

  public BigInteger getRecAproms() {
    return recAproms;
  }

  public void setRecAproms(BigInteger recAproms) {
    this.recAproms = recAproms;
  }

  public BigInteger getRecJamOsp() {
    return recJamOsp;
  }

  public void setRecJamOsp(BigInteger recJamOsp) {
    this.recJamOsp = recJamOsp;
  }

  public BigInteger getMinMaxExcessQty() {
    return minMaxExcessQty;
  }

  public void setMinMaxExcessQty(BigInteger minMaxExcessQty) {
    this.minMaxExcessQty = minMaxExcessQty;
  }

  public BigInteger getMmExcessQtyTarget() {
    return mmExcessQtyTarget;
  }

  public void setMmExcessQtyTarget(BigInteger mmExcessQtyTarget) {
    this.mmExcessQtyTarget = mmExcessQtyTarget;
  }

  public BigInteger getMmExcessQtyNonTarget() {
    return mmExcessQtyNonTarget;
  }

  public void setMmExcessQtyNonTarget(BigInteger mmExcessQtyNonTarget) {
    this.mmExcessQtyNonTarget = mmExcessQtyNonTarget;
  }

  public BigInteger getMmExcessQtyTransit() {
    return mmExcessQtyTransit;
  }

  public void setMmExcessQtyTransit(BigInteger mmExcessQtyTransit) {
    this.mmExcessQtyTransit = mmExcessQtyTransit;
  }

  public String getPrimeFlag() {
    return primeFlag;
  }

  public void setPrimeFlag(String primeFlag) {
    this.primeFlag = primeFlag;
  }

  public String getSiteStatus() {
    return siteStatus;
  }

  public void setSiteStatus(String siteStatus) {
    this.siteStatus = siteStatus;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getClli() {
    return clli;
  }

  public void setClli(String clli) {
    this.clli = clli;
  }

  public BigInteger getIDollar() {
    return iDollar;
  }

  public void setIDollar(BigInteger iDollar) {
    this.iDollar = iDollar;
  }

  public BigInteger getGDollar() {
    return gDollar;
  }

  public void setGDollar(BigInteger gDollar) {
    this.gDollar = gDollar;
  }

  public BigInteger getMDollar() {
    return mDollar;
  }

  public void setMDollar(BigInteger mDollar) {
    this.mDollar = mDollar;
  }

  public BigInteger getSDollar() {
    return sDollar;
  }

  public void setSDollar(BigInteger sDollar) {
    this.sDollar = sDollar;
  }

  public BigInteger getEDollar() {
    return eDollar;
  }

  public void setEDollar(BigInteger eDollar) {
    this.eDollar = eDollar;
  }

  public BigInteger getEPercent() {
    return ePercent;
  }

  public void setEPercent(BigInteger ePercent) {
    this.ePercent = ePercent;
  }

  public BigInteger getTDollarAllOnhand() {
    return tDollarAllOnhand;
  }

  public void setTDollarAllOnhand(BigInteger tDollarAllOnhand) {
    this.tDollarAllOnhand = tDollarAllOnhand;
  }

  public BigInteger getQtyDelete() {
    return qtyDelete;
  }

  public void setQtyDelete(BigInteger qtyDelete) {
    this.qtyDelete = qtyDelete;
  }

  public BigInteger getLost() {
    return lost;
  }

  public void setLost(BigInteger lost) {
    this.lost = lost;
  }

  public BigInteger getReturnsTodcgoodDef() {
    return returnsTodcgoodDef;
  }

  public void setReturnsTodcgoodDef(BigInteger returnsTodcgoodDef) {
    this.returnsTodcgoodDef = returnsTodcgoodDef;
  }

  public BigInteger getFromLocationIdReturns() {
    return fromLocationIdReturns;
  }

  public void setFromLocationIdReturns(BigInteger fromLocationIdReturns) {
    this.fromLocationIdReturns = fromLocationIdReturns;
  }

  public BigInteger getFromLocationIdReturnsgood() {
    return fromLocationIdReturnsgood;
  }

  public void setFromLocationIdReturnsgood(BigInteger fromLocationIdReturnsgood) {
    this.fromLocationIdReturnsgood = fromLocationIdReturnsgood;
  }

  public BigInteger getFromLocationIdReturnsdef() {
    return fromLocationIdReturnsdef;
  }

  public void setFromLocationIdReturnsdef(BigInteger fromLocationIdReturnsdef) {
    this.fromLocationIdReturnsdef = fromLocationIdReturnsdef;
  }

  public BigInteger getReturnsTodcgood() {
    return returnsTodcgood;
  }

  public void setReturnsTodcgood(BigInteger returnsTodcgood) {
    this.returnsTodcgood = returnsTodcgood;
  }

  public BigInteger getReturnsTodcDef() {
    return returnsTodcDef;
  }

  public void setReturnsTodcDef(BigInteger returnsTodcDef) {
    this.returnsTodcDef = returnsTodcDef;
  }

  public BigInteger getShipSpot() {
    return shipSpot;
  }

  public void setShipSpot(BigInteger shipSpot) {
    this.shipSpot = shipSpot;
  }

  public BigInteger getShipVips() {
    return shipVips;
  }

  public void setShipVips(BigInteger shipVips) {
    this.shipVips = shipVips;
  }

  public BigInteger getShipOnline() {
    return shipOnline;
  }

  public void setShipOnline(BigInteger shipOnline) {
    this.shipOnline = shipOnline;
  }

  public BigInteger getShipTirks() {
    return shipTirks;
  }

  public void setShipTirks(BigInteger shipTirks) {
    this.shipTirks = shipTirks;
  }

  public BigInteger getShipReplenishment() {
    return shipReplenishment;
  }

  public void setShipReplenishment(BigInteger shipReplenishment) {
    this.shipReplenishment = shipReplenishment;
  }

  public BigInteger getShipIdis() {
    return shipIdis;
  }

  public void setShipIdis(BigInteger shipIdis) {
    this.shipIdis = shipIdis;
  }

  public BigInteger getShipJamTeo() {
    return shipJamTeo;
  }

  public void setShipJamTeo(BigInteger shipJamTeo) {
    this.shipJamTeo = shipJamTeo;
  }

  public BigInteger getShipCebits() {
    return shipCebits;
  }

  public void setShipCebits(BigInteger shipCebits) {
    this.shipCebits = shipCebits;
  }

  public BigInteger getHarvestPrime() {
    return harvestPrime;
  }

  public void setHarvestPrime(BigInteger harvestPrime) {
    this.harvestPrime = harvestPrime;
  }

  public BigInteger getDcKeep() {
    return dcKeep;
  }

  public void setDcKeep(BigInteger dcKeep) {
    this.dcKeep = dcKeep;
  }

  public BigInteger getDcFull() {
    return dcFull;
  }

  public void setDcFull(BigInteger dcFull) {
    this.dcFull = dcFull;
  }

  public BigInteger getDcExempt() {
    return dcExempt;
  }

  public void setDcExempt(BigInteger dcExempt) {
    this.dcExempt = dcExempt;
  }

  public BigInteger getExcessValueP1() {
    return excessValueP1;
  }

  public void setExcessValueP1(BigInteger excessValueP1) {
    this.excessValueP1 = excessValueP1;
  }

  public BigInteger getExcessValueP2() {
    return excessValueP2;
  }

  public void setExcessValueP2(BigInteger excessValueP2) {
    this.excessValueP2 = excessValueP2;
  }

  public BigInteger getExcessValueP3() {
    return excessValueP3;
  }

  public void setExcessValueP3(BigInteger excessValueP3) {
    this.excessValueP3 = excessValueP3;
  }

  public BigInteger getExcessValueP4() {
    return excessValueP4;
  }

  public void setExcessValueP4(BigInteger excessValueP4) {
    this.excessValueP4 = excessValueP4;
  }

  public BigInteger getStagingP1() {
    return stagingP1;
  }

  public void setStagingP1(BigInteger stagingP1) {
    this.stagingP1 = stagingP1;
  }

  public BigInteger getStagingP2() {
    return stagingP2;
  }

  public void setStagingP2(BigInteger stagingP2) {
    this.stagingP2 = stagingP2;
  }

  public BigInteger getStagingP3() {
    return stagingP3;
  }

  public void setStagingP3(BigInteger stagingP3) {
    this.stagingP3 = stagingP3;
  }

  public BigInteger getStagingP4() {
    return stagingP4;
  }

  public void setStagingP4(BigInteger stagingP4) {
    this.stagingP4 = stagingP4;
  }

  public BigInteger getStagingValueP1() {
    return stagingValueP1;
  }

  public void setStagingValueP1(BigInteger stagingValueP1) {
    this.stagingValueP1 = stagingValueP1;
  }

  public BigInteger getStagingValueP2() {
    return stagingValueP2;
  }

  public void setStagingValueP2(BigInteger stagingValueP2) {
    this.stagingValueP2 = stagingValueP2;
  }

  public BigInteger getStagingValueP3() {
    return stagingValueP3;
  }

  public void setStagingValueP3(BigInteger stagingValueP3) {
    this.stagingValueP3 = stagingValueP3;
  }

  public BigInteger getStagingValueP4() {
    return stagingValueP4;
  }

  public void setStagingValueP4(BigInteger stagingValueP4) {
    this.stagingValueP4 = stagingValueP4;
  }

  public BigInteger getStagingTotal() {
    return stagingTotal;
  }

  public void setStagingTotal(BigInteger stagingTotal) {
    this.stagingTotal = stagingTotal;
  }

  public BigInteger getStockP1() {
    return stockP1;
  }

  public void setStockP1(BigInteger stockP1) {
    this.stockP1 = stockP1;
  }

  public BigInteger getStockP2() {
    return stockP2;
  }

  public void setStockP2(BigInteger stockP2) {
    this.stockP2 = stockP2;
  }

  public BigInteger getStockP3() {
    return stockP3;
  }

  public void setStockP3(BigInteger stockP3) {
    this.stockP3 = stockP3;
  }

  public BigInteger getStockP4() {
    return stockP4;
  }

  public void setStockP4(BigInteger stockP4) {
    this.stockP4 = stockP4;
  }

  public BigInteger getStockValueP1() {
    return stockValueP1;
  }

  public void setStockValueP1(BigInteger stockValueP1) {
    this.stockValueP1 = stockValueP1;
  }

  public BigInteger getStockValueP2() {
    return stockValueP2;
  }

  public void setStockValueP2(BigInteger stockValueP2) {
    this.stockValueP2 = stockValueP2;
  }

  public BigInteger getStockValueP3() {
    return stockValueP3;
  }

  public void setStockValueP3(BigInteger stockValueP3) {
    this.stockValueP3 = stockValueP3;
  }

  public BigInteger getStockValueP4() {
    return stockValueP4;
  }

  public void setStockValueP4(BigInteger stockValueP4) {
    this.stockValueP4 = stockValueP4;
  }

  public BigInteger getStockTotal() {
    return stockTotal;
  }

  public void setStockTotal(BigInteger stockTotal) {
    this.stockTotal = stockTotal;
  }

  public BigInteger getLostP1() {
    return lostP1;
  }

  public void setLostP1(BigInteger lostP1) {
    this.lostP1 = lostP1;
  }

  public BigInteger getLostP2() {
    return lostP2;
  }

  public void setLostP2(BigInteger lostP2) {
    this.lostP2 = lostP2;
  }

  public BigInteger getLostP3() {
    return lostP3;
  }

  public void setLostP3(BigInteger lostP3) {
    this.lostP3 = lostP3;
  }

  public BigInteger getLostP4() {
    return lostP4;
  }

  public void setLostP4(BigInteger lostP4) {
    this.lostP4 = lostP4;
  }

  public BigInteger getLostValueP1() {
    return lostValueP1;
  }

  public void setLostValueP1(BigInteger lostValueP1) {
    this.lostValueP1 = lostValueP1;
  }

  public BigInteger getLostValueP2() {
    return lostValueP2;
  }

  public void setLostValueP2(BigInteger lostValueP2) {
    this.lostValueP2 = lostValueP2;
  }

  public BigInteger getLostValueP3() {
    return lostValueP3;
  }

  public void setLostValueP3(BigInteger lostValueP3) {
    this.lostValueP3 = lostValueP3;
  }

  public BigInteger getLostValueP4() {
    return lostValueP4;
  }

  public void setLostValueP4(BigInteger lostValueP4) {
    this.lostValueP4 = lostValueP4;
  }

  public BigInteger getLostTotal() {
    return lostTotal;
  }

  public void setLostTotal(BigInteger lostTotal) {
    this.lostTotal = lostTotal;
  }

  public BigInteger getDelivered() {
    return delivered;
  }

  public void setDelivered(BigInteger delivered) {
    this.delivered = delivered;
  }

  public BigInteger getReceited() {
    return receited;
  }

  public void setReceited(BigInteger receited) {
    this.receited = receited;
  }

  public BigInteger getRecZeroSeven() {
    return recZeroSeven;
  }

  public void setRecZeroSeven(BigInteger recZeroSeven) {
    this.recZeroSeven = recZeroSeven;
  }

  public BigInteger getRecEightFourteen() {
    return recEightFourteen;
  }

  public void setRecEightFourteen(BigInteger recEightFourteen) {
    this.recEightFourteen = recEightFourteen;
  }

  public BigInteger getRecGtrFourteen() {
    return recGtrFourteen;
  }

  public void setRecGtrFourteen(BigInteger recGtrFourteen) {
    this.recGtrFourteen = recGtrFourteen;
  }

  public BigInteger getContact() {
    return contact;
  }

  public void setContact(BigInteger contact) {
    this.contact = contact;
  }

  public BigInteger getSilo() {
    return silo;
  }

  public void setSilo(BigInteger silo) {
    this.silo = silo;
  }

  public BigInteger getLastOwner() {
    return lastOwner;
  }

  public void setLastOwner(BigInteger lastOwner) {
    this.lastOwner = lastOwner;
  }

  public BigInteger getUnkOwner() {
    return unkOwner;
  }

  public void setUnkOwner(BigInteger unkOwner) {
    this.unkOwner = unkOwner;
  }

  public String getThirdlevelAttuid() {
    return thirdlevelAttuid;
  }

  public void setThirdlevelAttuid(String thirdlevelAttuid) {
    this.thirdlevelAttuid = thirdlevelAttuid;
  }

  public String getFourthlevelAttuid() {
    return fourthlevelAttuid;
  }

  public void setFourthlevelAttuid(String fourthlevelAttuid) {
    this.fourthlevelAttuid = fourthlevelAttuid;
  }

  public String getSecondlevelAttuid() {
    return secondlevelAttuid;
  }

  public void setSecondlevelAttuid(String secondlevelAttuid) {
    this.secondlevelAttuid = secondlevelAttuid;
  }

  public String getFirstlevelAttuid() {
    return firstlevelAttuid;
  }

  public void setFirstlevelAttuid(String firstlevelAttuid) {
    this.firstlevelAttuid = firstlevelAttuid;
  }

  public String getSixthlevel() {
    return sixthlevel;
  }

  public void setSixthlevel(String sixthlevel) {
    this.sixthlevel = sixthlevel;
  }

  public String getSixthlevelAttuid() {
    return sixthlevelAttuid;
  }

  public void setSixthlevelAttuid(String sixthlevelAttuid) {
    this.sixthlevelAttuid = sixthlevelAttuid;
  }

  public BigInteger getLqt() {
    return lqt;
  }

  public void setLqt(BigInteger lqt) {
    this.lqt = lqt;
  }

  public BigInteger getForce() {
    return force;
  }

  public void setForce(BigInteger force) {
    this.force = force;
  }

  public String getStateSpoc() {
    return stateSpoc;
  }

  public void setStateSpoc(String stateSpoc) {
    this.stateSpoc = stateSpoc;
  }

  public String getRegionalSpoc() {
    return regionalSpoc;
  }

  public void setRegionalSpoc(String regionalSpoc) {
    this.regionalSpoc = regionalSpoc;
  }

  public String getCorpSpoc() {
    return corpSpoc;
  }

  public void setCorpSpoc(String corpSpoc) {
    this.corpSpoc = corpSpoc;
  }

  public BigInteger getCoLocated() {
    return coLocated;
  }

  public void setCoLocated(BigInteger coLocated) {
    this.coLocated = coLocated;
  }

  public BigInteger getLocApprover() {
    return locApprover;
  }

  public void setLocApprover(BigInteger locApprover) {
    this.locApprover = locApprover;
  }

  public String getCrossReference() {
    return crossReference;
  }

  public void setCrossReference(String crossReference) {
    this.crossReference = crossReference;
  }

  public String getClliLocationCode() {
    return clliLocationCode;
  }

  public void setClliLocationCode(String clliLocationCode) {
    this.clliLocationCode = clliLocationCode;
  }

  public BigInteger getExcessPriority() {
    return excessPriority;
  }

  public void setExcessPriority(BigInteger excessPriority) {
    this.excessPriority = excessPriority;
  }

  public BigInteger getRecCebits() {
    return recCebits;
  }

  public void setRecCebits(BigInteger recCebits) {
    this.recCebits = recCebits;
  }

  public BigInteger getShipOther() {
    return shipOther;
  }

  public void setShipOther(BigInteger shipOther) {
    this.shipOther = shipOther;
  }

  public BigInteger getRecOther() {
    return recOther;
  }

  public void setRecOther(BigInteger recOther) {
    this.recOther = recOther;
  }

  public BigInteger getAuthStage() {
    return authStage;
  }

  public void setAuthStage(BigInteger authStage) {
    this.authStage = authStage;
  }

  public BigInteger getRetiredQty() {
    return retiredQty;
  }

  public void setRetiredQty(BigInteger retiredQty) {
    this.retiredQty = retiredQty;
  }

  public BigInteger getRetiredValue() {
    return retiredValue;
  }

  public void setRetiredValue(BigInteger retiredValue) {
    this.retiredValue = retiredValue;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (costCode != null ? costCode.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof BalDirectorReport)) {
      return false;
    }
    BalDirectorReport other = (BalDirectorReport) object;
    if ((this.costCode == null && other.costCode != null) || (this.costCode != null && !this.costCode.equals(other.costCode))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.aexp.hyperdrive.entity.BalDirectorReport[ costCode=" + costCode + " ]";
  }

}

