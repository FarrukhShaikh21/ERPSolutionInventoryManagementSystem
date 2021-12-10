package erpsolims.erpsolimsmodel.erpsolimseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 10 12:24:54 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InReceivedItemsLinesImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Storeid,
        Rnoteno,
        Lineno,
        RecvUomsid,
        Itemid,
        Siclassid,
        ItemRefId,
        Sigroupid,
        IssueUomid,
        QtyReceived,
        Remarks,
        ReceivedBy,
        InspectedBy,
        QtyAfterConversion,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Value,
        UnitCostAfterConversion,
        UnitCostBeforeConversion,
        ConversionFactor,
        ShortQty,
        DamageQty,
        Batchno,
        NetQtyConversion,
        SourceDocLineno,
        Issueno,
        Shelfqty,
        Recvalue,
        CurQty,
        CurUnitcost,
        Mposted,
        MpostedDate,
        IssuedQty,
        KitId,
        KitSeqno,
        ProductCost,
        Examineid,
        StoreQtyBfrTran,
        StoreUcostBfrTran,
        StoreQtyAftTran,
        StoreUcostAftTran,
        AllstrQtyBfrTran,
        AllstrUcostBfrTran,
        AllstrQtyAftTran,
        AllstrUcostAftTran,
        TransitRateDiff,
        TransitQty,
        UcB4Adjust,
        InvQty,
        Polineno,
        Dvalue,
        Drecvalue,
        DunitCostBeforeConversion,
        DunitCostAfterConversion,
        Rnotedetailseq,
        Rnoteseq,
        InReceivedItems;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int RNOTENO = AttributesEnum.Rnoteno.index();
    public static final int LINENO = AttributesEnum.Lineno.index();
    public static final int RECVUOMSID = AttributesEnum.RecvUomsid.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int SICLASSID = AttributesEnum.Siclassid.index();
    public static final int ITEMREFID = AttributesEnum.ItemRefId.index();
    public static final int SIGROUPID = AttributesEnum.Sigroupid.index();
    public static final int ISSUEUOMID = AttributesEnum.IssueUomid.index();
    public static final int QTYRECEIVED = AttributesEnum.QtyReceived.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int RECEIVEDBY = AttributesEnum.ReceivedBy.index();
    public static final int INSPECTEDBY = AttributesEnum.InspectedBy.index();
    public static final int QTYAFTERCONVERSION = AttributesEnum.QtyAfterConversion.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int VALUE = AttributesEnum.Value.index();
    public static final int UNITCOSTAFTERCONVERSION = AttributesEnum.UnitCostAfterConversion.index();
    public static final int UNITCOSTBEFORECONVERSION = AttributesEnum.UnitCostBeforeConversion.index();
    public static final int CONVERSIONFACTOR = AttributesEnum.ConversionFactor.index();
    public static final int SHORTQTY = AttributesEnum.ShortQty.index();
    public static final int DAMAGEQTY = AttributesEnum.DamageQty.index();
    public static final int BATCHNO = AttributesEnum.Batchno.index();
    public static final int NETQTYCONVERSION = AttributesEnum.NetQtyConversion.index();
    public static final int SOURCEDOCLINENO = AttributesEnum.SourceDocLineno.index();
    public static final int ISSUENO = AttributesEnum.Issueno.index();
    public static final int SHELFQTY = AttributesEnum.Shelfqty.index();
    public static final int RECVALUE = AttributesEnum.Recvalue.index();
    public static final int CURQTY = AttributesEnum.CurQty.index();
    public static final int CURUNITCOST = AttributesEnum.CurUnitcost.index();
    public static final int MPOSTED = AttributesEnum.Mposted.index();
    public static final int MPOSTEDDATE = AttributesEnum.MpostedDate.index();
    public static final int ISSUEDQTY = AttributesEnum.IssuedQty.index();
    public static final int KITID = AttributesEnum.KitId.index();
    public static final int KITSEQNO = AttributesEnum.KitSeqno.index();
    public static final int PRODUCTCOST = AttributesEnum.ProductCost.index();
    public static final int EXAMINEID = AttributesEnum.Examineid.index();
    public static final int STOREQTYBFRTRAN = AttributesEnum.StoreQtyBfrTran.index();
    public static final int STOREUCOSTBFRTRAN = AttributesEnum.StoreUcostBfrTran.index();
    public static final int STOREQTYAFTTRAN = AttributesEnum.StoreQtyAftTran.index();
    public static final int STOREUCOSTAFTTRAN = AttributesEnum.StoreUcostAftTran.index();
    public static final int ALLSTRQTYBFRTRAN = AttributesEnum.AllstrQtyBfrTran.index();
    public static final int ALLSTRUCOSTBFRTRAN = AttributesEnum.AllstrUcostBfrTran.index();
    public static final int ALLSTRQTYAFTTRAN = AttributesEnum.AllstrQtyAftTran.index();
    public static final int ALLSTRUCOSTAFTTRAN = AttributesEnum.AllstrUcostAftTran.index();
    public static final int TRANSITRATEDIFF = AttributesEnum.TransitRateDiff.index();
    public static final int TRANSITQTY = AttributesEnum.TransitQty.index();
    public static final int UCB4ADJUST = AttributesEnum.UcB4Adjust.index();
    public static final int INVQTY = AttributesEnum.InvQty.index();
    public static final int POLINENO = AttributesEnum.Polineno.index();
    public static final int DVALUE = AttributesEnum.Dvalue.index();
    public static final int DRECVALUE = AttributesEnum.Drecvalue.index();
    public static final int DUNITCOSTBEFORECONVERSION = AttributesEnum.DunitCostBeforeConversion.index();
    public static final int DUNITCOSTAFTERCONVERSION = AttributesEnum.DunitCostAfterConversion.index();
    public static final int RNOTEDETAILSEQ = AttributesEnum.Rnotedetailseq.index();
    public static final int RNOTESEQ = AttributesEnum.Rnoteseq.index();
    public static final int INRECEIVEDITEMS = AttributesEnum.InReceivedItems.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InReceivedItemsLinesImpl() {
    }

    /**
     * Gets the attribute value for Storeid, using the alias name Storeid.
     * @return the value of Storeid
     */
    public String getStoreid() {
        return (String) getAttributeInternal(STOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Storeid.
     * @param value value to set the Storeid
     */
    public void setStoreid(String value) {
        setAttributeInternal(STOREID, value);
    }

    /**
     * Gets the attribute value for Rnoteno, using the alias name Rnoteno.
     * @return the value of Rnoteno
     */
    public String getRnoteno() {
        return (String) getAttributeInternal(RNOTENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rnoteno.
     * @param value value to set the Rnoteno
     */
    public void setRnoteno(String value) {
        setAttributeInternal(RNOTENO, value);
    }

    /**
     * Gets the attribute value for Lineno, using the alias name Lineno.
     * @return the value of Lineno
     */
    public Integer getLineno() {
        return (Integer) getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Lineno.
     * @param value value to set the Lineno
     */
    public void setLineno(Integer value) {
        setAttributeInternal(LINENO, value);
    }

    /**
     * Gets the attribute value for RecvUomsid, using the alias name RecvUomsid.
     * @return the value of RecvUomsid
     */
    public String getRecvUomsid() {
        return (String) getAttributeInternal(RECVUOMSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecvUomsid.
     * @param value value to set the RecvUomsid
     */
    public void setRecvUomsid(String value) {
        setAttributeInternal(RECVUOMSID, value);
    }

    /**
     * Gets the attribute value for Itemid, using the alias name Itemid.
     * @return the value of Itemid
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Itemid.
     * @param value value to set the Itemid
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
    }

    /**
     * Gets the attribute value for Siclassid, using the alias name Siclassid.
     * @return the value of Siclassid
     */
    public String getSiclassid() {
        return (String) getAttributeInternal(SICLASSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Siclassid.
     * @param value value to set the Siclassid
     */
    public void setSiclassid(String value) {
        setAttributeInternal(SICLASSID, value);
    }

    /**
     * Gets the attribute value for ItemRefId, using the alias name ItemRefId.
     * @return the value of ItemRefId
     */
    public String getItemRefId() {
        return (String) getAttributeInternal(ITEMREFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemRefId.
     * @param value value to set the ItemRefId
     */
    public void setItemRefId(String value) {
        setAttributeInternal(ITEMREFID, value);
    }

    /**
     * Gets the attribute value for Sigroupid, using the alias name Sigroupid.
     * @return the value of Sigroupid
     */
    public String getSigroupid() {
        return (String) getAttributeInternal(SIGROUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Sigroupid.
     * @param value value to set the Sigroupid
     */
    public void setSigroupid(String value) {
        setAttributeInternal(SIGROUPID, value);
    }

    /**
     * Gets the attribute value for IssueUomid, using the alias name IssueUomid.
     * @return the value of IssueUomid
     */
    public String getIssueUomid() {
        return (String) getAttributeInternal(ISSUEUOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for IssueUomid.
     * @param value value to set the IssueUomid
     */
    public void setIssueUomid(String value) {
        setAttributeInternal(ISSUEUOMID, value);
    }

    /**
     * Gets the attribute value for QtyReceived, using the alias name QtyReceived.
     * @return the value of QtyReceived
     */
    public BigDecimal getQtyReceived() {
        return (BigDecimal) getAttributeInternal(QTYRECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for QtyReceived.
     * @param value value to set the QtyReceived
     */
    public void setQtyReceived(BigDecimal value) {
        setAttributeInternal(QTYRECEIVED, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for ReceivedBy, using the alias name ReceivedBy.
     * @return the value of ReceivedBy
     */
    public String getReceivedBy() {
        return (String) getAttributeInternal(RECEIVEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceivedBy.
     * @param value value to set the ReceivedBy
     */
    public void setReceivedBy(String value) {
        setAttributeInternal(RECEIVEDBY, value);
    }

    /**
     * Gets the attribute value for InspectedBy, using the alias name InspectedBy.
     * @return the value of InspectedBy
     */
    public String getInspectedBy() {
        return (String) getAttributeInternal(INSPECTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for InspectedBy.
     * @param value value to set the InspectedBy
     */
    public void setInspectedBy(String value) {
        setAttributeInternal(INSPECTEDBY, value);
    }

    /**
     * Gets the attribute value for QtyAfterConversion, using the alias name QtyAfterConversion.
     * @return the value of QtyAfterConversion
     */
    public BigDecimal getQtyAfterConversion() {
        return (BigDecimal) getAttributeInternal(QTYAFTERCONVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for QtyAfterConversion.
     * @param value value to set the QtyAfterConversion
     */
    public void setQtyAfterConversion(BigDecimal value) {
        setAttributeInternal(QTYAFTERCONVERSION, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Timestamp getModifiedDate() {
        return (Timestamp) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Timestamp value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for Value, using the alias name Value.
     * @return the value of Value
     */
    public BigInteger getValue() {
        return (BigInteger) getAttributeInternal(VALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Value.
     * @param value value to set the Value
     */
    public void setValue(BigInteger value) {
        setAttributeInternal(VALUE, value);
    }

    /**
     * Gets the attribute value for UnitCostAfterConversion, using the alias name UnitCostAfterConversion.
     * @return the value of UnitCostAfterConversion
     */
    public BigDecimal getUnitCostAfterConversion() {
        return (BigDecimal) getAttributeInternal(UNITCOSTAFTERCONVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitCostAfterConversion.
     * @param value value to set the UnitCostAfterConversion
     */
    public void setUnitCostAfterConversion(BigDecimal value) {
        setAttributeInternal(UNITCOSTAFTERCONVERSION, value);
    }

    /**
     * Gets the attribute value for UnitCostBeforeConversion, using the alias name UnitCostBeforeConversion.
     * @return the value of UnitCostBeforeConversion
     */
    public BigDecimal getUnitCostBeforeConversion() {
        return (BigDecimal) getAttributeInternal(UNITCOSTBEFORECONVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitCostBeforeConversion.
     * @param value value to set the UnitCostBeforeConversion
     */
    public void setUnitCostBeforeConversion(BigDecimal value) {
        setAttributeInternal(UNITCOSTBEFORECONVERSION, value);
    }

    /**
     * Gets the attribute value for ConversionFactor, using the alias name ConversionFactor.
     * @return the value of ConversionFactor
     */
    public Long getConversionFactor() {
        return (Long) getAttributeInternal(CONVERSIONFACTOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConversionFactor.
     * @param value value to set the ConversionFactor
     */
    public void setConversionFactor(Long value) {
        setAttributeInternal(CONVERSIONFACTOR, value);
    }

    /**
     * Gets the attribute value for ShortQty, using the alias name ShortQty.
     * @return the value of ShortQty
     */
    public BigDecimal getShortQty() {
        return (BigDecimal) getAttributeInternal(SHORTQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShortQty.
     * @param value value to set the ShortQty
     */
    public void setShortQty(BigDecimal value) {
        setAttributeInternal(SHORTQTY, value);
    }

    /**
     * Gets the attribute value for DamageQty, using the alias name DamageQty.
     * @return the value of DamageQty
     */
    public BigDecimal getDamageQty() {
        return (BigDecimal) getAttributeInternal(DAMAGEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for DamageQty.
     * @param value value to set the DamageQty
     */
    public void setDamageQty(BigDecimal value) {
        setAttributeInternal(DAMAGEQTY, value);
    }

    /**
     * Gets the attribute value for Batchno, using the alias name Batchno.
     * @return the value of Batchno
     */
    public String getBatchno() {
        return (String) getAttributeInternal(BATCHNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Batchno.
     * @param value value to set the Batchno
     */
    public void setBatchno(String value) {
        setAttributeInternal(BATCHNO, value);
    }

    /**
     * Gets the attribute value for NetQtyConversion, using the alias name NetQtyConversion.
     * @return the value of NetQtyConversion
     */
    public BigDecimal getNetQtyConversion() {
        return (BigDecimal) getAttributeInternal(NETQTYCONVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for NetQtyConversion.
     * @param value value to set the NetQtyConversion
     */
    public void setNetQtyConversion(BigDecimal value) {
        setAttributeInternal(NETQTYCONVERSION, value);
    }

    /**
     * Gets the attribute value for SourceDocLineno, using the alias name SourceDocLineno.
     * @return the value of SourceDocLineno
     */
    public Integer getSourceDocLineno() {
        return (Integer) getAttributeInternal(SOURCEDOCLINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceDocLineno.
     * @param value value to set the SourceDocLineno
     */
    public void setSourceDocLineno(Integer value) {
        setAttributeInternal(SOURCEDOCLINENO, value);
    }

    /**
     * Gets the attribute value for Issueno, using the alias name Issueno.
     * @return the value of Issueno
     */
    public String getIssueno() {
        return (String) getAttributeInternal(ISSUENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Issueno.
     * @param value value to set the Issueno
     */
    public void setIssueno(String value) {
        setAttributeInternal(ISSUENO, value);
    }

    /**
     * Gets the attribute value for Shelfqty, using the alias name Shelfqty.
     * @return the value of Shelfqty
     */
    public BigDecimal getShelfqty() {
        return (BigDecimal) getAttributeInternal(SHELFQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shelfqty.
     * @param value value to set the Shelfqty
     */
    public void setShelfqty(BigDecimal value) {
        setAttributeInternal(SHELFQTY, value);
    }

    /**
     * Gets the attribute value for Recvalue, using the alias name Recvalue.
     * @return the value of Recvalue
     */
    public BigDecimal getRecvalue() {
        return (BigDecimal) getAttributeInternal(RECVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Recvalue.
     * @param value value to set the Recvalue
     */
    public void setRecvalue(BigDecimal value) {
        setAttributeInternal(RECVALUE, value);
    }

    /**
     * Gets the attribute value for CurQty, using the alias name CurQty.
     * @return the value of CurQty
     */
    public BigDecimal getCurQty() {
        return (BigDecimal) getAttributeInternal(CURQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurQty.
     * @param value value to set the CurQty
     */
    public void setCurQty(BigDecimal value) {
        setAttributeInternal(CURQTY, value);
    }

    /**
     * Gets the attribute value for CurUnitcost, using the alias name CurUnitcost.
     * @return the value of CurUnitcost
     */
    public BigDecimal getCurUnitcost() {
        return (BigDecimal) getAttributeInternal(CURUNITCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurUnitcost.
     * @param value value to set the CurUnitcost
     */
    public void setCurUnitcost(BigDecimal value) {
        setAttributeInternal(CURUNITCOST, value);
    }

    /**
     * Gets the attribute value for Mposted, using the alias name Mposted.
     * @return the value of Mposted
     */
    public String getMposted() {
        return (String) getAttributeInternal(MPOSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mposted.
     * @param value value to set the Mposted
     */
    public void setMposted(String value) {
        setAttributeInternal(MPOSTED, value);
    }

    /**
     * Gets the attribute value for MpostedDate, using the alias name MpostedDate.
     * @return the value of MpostedDate
     */
    public Timestamp getMpostedDate() {
        return (Timestamp) getAttributeInternal(MPOSTEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MpostedDate.
     * @param value value to set the MpostedDate
     */
    public void setMpostedDate(Timestamp value) {
        setAttributeInternal(MPOSTEDDATE, value);
    }

    /**
     * Gets the attribute value for IssuedQty, using the alias name IssuedQty.
     * @return the value of IssuedQty
     */
    public BigDecimal getIssuedQty() {
        return (BigDecimal) getAttributeInternal(ISSUEDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for IssuedQty.
     * @param value value to set the IssuedQty
     */
    public void setIssuedQty(BigDecimal value) {
        setAttributeInternal(ISSUEDQTY, value);
    }

    /**
     * Gets the attribute value for KitId, using the alias name KitId.
     * @return the value of KitId
     */
    public String getKitId() {
        return (String) getAttributeInternal(KITID);
    }

    /**
     * Sets <code>value</code> as the attribute value for KitId.
     * @param value value to set the KitId
     */
    public void setKitId(String value) {
        setAttributeInternal(KITID, value);
    }

    /**
     * Gets the attribute value for KitSeqno, using the alias name KitSeqno.
     * @return the value of KitSeqno
     */
    public BigDecimal getKitSeqno() {
        return (BigDecimal) getAttributeInternal(KITSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for KitSeqno.
     * @param value value to set the KitSeqno
     */
    public void setKitSeqno(BigDecimal value) {
        setAttributeInternal(KITSEQNO, value);
    }

    /**
     * Gets the attribute value for ProductCost, using the alias name ProductCost.
     * @return the value of ProductCost
     */
    public BigDecimal getProductCost() {
        return (BigDecimal) getAttributeInternal(PRODUCTCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductCost.
     * @param value value to set the ProductCost
     */
    public void setProductCost(BigDecimal value) {
        setAttributeInternal(PRODUCTCOST, value);
    }

    /**
     * Gets the attribute value for Examineid, using the alias name Examineid.
     * @return the value of Examineid
     */
    public String getExamineid() {
        return (String) getAttributeInternal(EXAMINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Examineid.
     * @param value value to set the Examineid
     */
    public void setExamineid(String value) {
        setAttributeInternal(EXAMINEID, value);
    }

    /**
     * Gets the attribute value for StoreQtyBfrTran, using the alias name StoreQtyBfrTran.
     * @return the value of StoreQtyBfrTran
     */
    public BigDecimal getStoreQtyBfrTran() {
        return (BigDecimal) getAttributeInternal(STOREQTYBFRTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for StoreQtyBfrTran.
     * @param value value to set the StoreQtyBfrTran
     */
    public void setStoreQtyBfrTran(BigDecimal value) {
        setAttributeInternal(STOREQTYBFRTRAN, value);
    }

    /**
     * Gets the attribute value for StoreUcostBfrTran, using the alias name StoreUcostBfrTran.
     * @return the value of StoreUcostBfrTran
     */
    public BigDecimal getStoreUcostBfrTran() {
        return (BigDecimal) getAttributeInternal(STOREUCOSTBFRTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for StoreUcostBfrTran.
     * @param value value to set the StoreUcostBfrTran
     */
    public void setStoreUcostBfrTran(BigDecimal value) {
        setAttributeInternal(STOREUCOSTBFRTRAN, value);
    }

    /**
     * Gets the attribute value for StoreQtyAftTran, using the alias name StoreQtyAftTran.
     * @return the value of StoreQtyAftTran
     */
    public BigDecimal getStoreQtyAftTran() {
        return (BigDecimal) getAttributeInternal(STOREQTYAFTTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for StoreQtyAftTran.
     * @param value value to set the StoreQtyAftTran
     */
    public void setStoreQtyAftTran(BigDecimal value) {
        setAttributeInternal(STOREQTYAFTTRAN, value);
    }

    /**
     * Gets the attribute value for StoreUcostAftTran, using the alias name StoreUcostAftTran.
     * @return the value of StoreUcostAftTran
     */
    public BigDecimal getStoreUcostAftTran() {
        return (BigDecimal) getAttributeInternal(STOREUCOSTAFTTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for StoreUcostAftTran.
     * @param value value to set the StoreUcostAftTran
     */
    public void setStoreUcostAftTran(BigDecimal value) {
        setAttributeInternal(STOREUCOSTAFTTRAN, value);
    }

    /**
     * Gets the attribute value for AllstrQtyBfrTran, using the alias name AllstrQtyBfrTran.
     * @return the value of AllstrQtyBfrTran
     */
    public BigDecimal getAllstrQtyBfrTran() {
        return (BigDecimal) getAttributeInternal(ALLSTRQTYBFRTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllstrQtyBfrTran.
     * @param value value to set the AllstrQtyBfrTran
     */
    public void setAllstrQtyBfrTran(BigDecimal value) {
        setAttributeInternal(ALLSTRQTYBFRTRAN, value);
    }

    /**
     * Gets the attribute value for AllstrUcostBfrTran, using the alias name AllstrUcostBfrTran.
     * @return the value of AllstrUcostBfrTran
     */
    public BigDecimal getAllstrUcostBfrTran() {
        return (BigDecimal) getAttributeInternal(ALLSTRUCOSTBFRTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllstrUcostBfrTran.
     * @param value value to set the AllstrUcostBfrTran
     */
    public void setAllstrUcostBfrTran(BigDecimal value) {
        setAttributeInternal(ALLSTRUCOSTBFRTRAN, value);
    }

    /**
     * Gets the attribute value for AllstrQtyAftTran, using the alias name AllstrQtyAftTran.
     * @return the value of AllstrQtyAftTran
     */
    public BigDecimal getAllstrQtyAftTran() {
        return (BigDecimal) getAttributeInternal(ALLSTRQTYAFTTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllstrQtyAftTran.
     * @param value value to set the AllstrQtyAftTran
     */
    public void setAllstrQtyAftTran(BigDecimal value) {
        setAttributeInternal(ALLSTRQTYAFTTRAN, value);
    }

    /**
     * Gets the attribute value for AllstrUcostAftTran, using the alias name AllstrUcostAftTran.
     * @return the value of AllstrUcostAftTran
     */
    public BigDecimal getAllstrUcostAftTran() {
        return (BigDecimal) getAttributeInternal(ALLSTRUCOSTAFTTRAN);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllstrUcostAftTran.
     * @param value value to set the AllstrUcostAftTran
     */
    public void setAllstrUcostAftTran(BigDecimal value) {
        setAttributeInternal(ALLSTRUCOSTAFTTRAN, value);
    }

    /**
     * Gets the attribute value for TransitRateDiff, using the alias name TransitRateDiff.
     * @return the value of TransitRateDiff
     */
    public BigDecimal getTransitRateDiff() {
        return (BigDecimal) getAttributeInternal(TRANSITRATEDIFF);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransitRateDiff.
     * @param value value to set the TransitRateDiff
     */
    public void setTransitRateDiff(BigDecimal value) {
        setAttributeInternal(TRANSITRATEDIFF, value);
    }

    /**
     * Gets the attribute value for TransitQty, using the alias name TransitQty.
     * @return the value of TransitQty
     */
    public BigDecimal getTransitQty() {
        return (BigDecimal) getAttributeInternal(TRANSITQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransitQty.
     * @param value value to set the TransitQty
     */
    public void setTransitQty(BigDecimal value) {
        setAttributeInternal(TRANSITQTY, value);
    }

    /**
     * Gets the attribute value for UcB4Adjust, using the alias name UcB4Adjust.
     * @return the value of UcB4Adjust
     */
    public BigDecimal getUcB4Adjust() {
        return (BigDecimal) getAttributeInternal(UCB4ADJUST);
    }

    /**
     * Sets <code>value</code> as the attribute value for UcB4Adjust.
     * @param value value to set the UcB4Adjust
     */
    public void setUcB4Adjust(BigDecimal value) {
        setAttributeInternal(UCB4ADJUST, value);
    }

    /**
     * Gets the attribute value for InvQty, using the alias name InvQty.
     * @return the value of InvQty
     */
    public BigDecimal getInvQty() {
        return (BigDecimal) getAttributeInternal(INVQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvQty.
     * @param value value to set the InvQty
     */
    public void setInvQty(BigDecimal value) {
        setAttributeInternal(INVQTY, value);
    }

    /**
     * Gets the attribute value for Polineno, using the alias name Polineno.
     * @return the value of Polineno
     */
    public Integer getPolineno() {
        return (Integer) getAttributeInternal(POLINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Polineno.
     * @param value value to set the Polineno
     */
    public void setPolineno(Integer value) {
        setAttributeInternal(POLINENO, value);
    }

    /**
     * Gets the attribute value for Dvalue, using the alias name Dvalue.
     * @return the value of Dvalue
     */
    public BigDecimal getDvalue() {
        return (BigDecimal) getAttributeInternal(DVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dvalue.
     * @param value value to set the Dvalue
     */
    public void setDvalue(BigDecimal value) {
        setAttributeInternal(DVALUE, value);
    }

    /**
     * Gets the attribute value for Drecvalue, using the alias name Drecvalue.
     * @return the value of Drecvalue
     */
    public BigDecimal getDrecvalue() {
        return (BigDecimal) getAttributeInternal(DRECVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Drecvalue.
     * @param value value to set the Drecvalue
     */
    public void setDrecvalue(BigDecimal value) {
        setAttributeInternal(DRECVALUE, value);
    }

    /**
     * Gets the attribute value for DunitCostBeforeConversion, using the alias name DunitCostBeforeConversion.
     * @return the value of DunitCostBeforeConversion
     */
    public BigDecimal getDunitCostBeforeConversion() {
        return (BigDecimal) getAttributeInternal(DUNITCOSTBEFORECONVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DunitCostBeforeConversion.
     * @param value value to set the DunitCostBeforeConversion
     */
    public void setDunitCostBeforeConversion(BigDecimal value) {
        setAttributeInternal(DUNITCOSTBEFORECONVERSION, value);
    }

    /**
     * Gets the attribute value for DunitCostAfterConversion, using the alias name DunitCostAfterConversion.
     * @return the value of DunitCostAfterConversion
     */
    public BigDecimal getDunitCostAfterConversion() {
        return (BigDecimal) getAttributeInternal(DUNITCOSTAFTERCONVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for DunitCostAfterConversion.
     * @param value value to set the DunitCostAfterConversion
     */
    public void setDunitCostAfterConversion(BigDecimal value) {
        setAttributeInternal(DUNITCOSTAFTERCONVERSION, value);
    }

    /**
     * Gets the attribute value for Rnotedetailseq, using the alias name Rnotedetailseq.
     * @return the value of Rnotedetailseq
     */
    public BigDecimal getRnotedetailseq() {
        return (BigDecimal) getAttributeInternal(RNOTEDETAILSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rnotedetailseq.
     * @param value value to set the Rnotedetailseq
     */
    public void setRnotedetailseq(BigDecimal value) {
        setAttributeInternal(RNOTEDETAILSEQ, value);
    }

    /**
     * Gets the attribute value for Rnoteseq, using the alias name Rnoteseq.
     * @return the value of Rnoteseq
     */
    public BigDecimal getRnoteseq() {
        return (BigDecimal) getAttributeInternal(RNOTESEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rnoteseq.
     * @param value value to set the Rnoteseq
     */
    public void setRnoteseq(BigDecimal value) {
        setAttributeInternal(RNOTESEQ, value);
    }

    /**
     * @return the associated entity InReceivedItemsImpl.
     */
    public InReceivedItemsImpl getInReceivedItems() {
        return (InReceivedItemsImpl) getAttributeInternal(INRECEIVEDITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity InReceivedItemsImpl.
     */
    public void setInReceivedItems(InReceivedItemsImpl value) {
        setAttributeInternal(INRECEIVEDITEMS, value);
    }

    /**
     * @param storeid key constituent
     * @param rnoteno key constituent
     * @param lineno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String storeid, String rnoteno, Integer lineno) {
        return new Key(new Object[] { storeid, rnoteno, lineno });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolims.erpsolimsmodel.erpsolimseo.InReceivedItemsLines");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

