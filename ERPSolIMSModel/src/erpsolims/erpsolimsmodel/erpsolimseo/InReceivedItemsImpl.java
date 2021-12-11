package erpsolims.erpsolimsmodel.erpsolimseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 10 12:23:42 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InReceivedItemsImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Storeid,
        Rnoteno,
        Recvdoctypeid,
        ReceivingDate,
        SourceDocRef,
        ChallanNo,
        ChallanNoDate,
        ReceivedBy,
        ValuedBy,
        Posted,
        PostedBy,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        RefNo,
        Companyid,
        Deptid,
        Locationid,
        PostIntface,
        PostGl,
        GlvoucherNo,
        DocTypeId,
        CompntItem,
        PrdIsuUcost,
        BatchRefid,
        KitRefid,
        Planid,
        BiltyNo,
        Remarks,
        InTransit,
        RemarksNarr,
        LcRefno,
        BillOfEntry,
        IsMigrated,
        MigratedDate,
        LcType,
        Rnoteseq,
        txtStoreName,
        InReceivedItemsLines,
        AllStores;
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
    public static final int RECVDOCTYPEID = AttributesEnum.Recvdoctypeid.index();
    public static final int RECEIVINGDATE = AttributesEnum.ReceivingDate.index();
    public static final int SOURCEDOCREF = AttributesEnum.SourceDocRef.index();
    public static final int CHALLANNO = AttributesEnum.ChallanNo.index();
    public static final int CHALLANNODATE = AttributesEnum.ChallanNoDate.index();
    public static final int RECEIVEDBY = AttributesEnum.ReceivedBy.index();
    public static final int VALUEDBY = AttributesEnum.ValuedBy.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.PostedBy.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int REFNO = AttributesEnum.RefNo.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int DEPTID = AttributesEnum.Deptid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int POSTINTFACE = AttributesEnum.PostIntface.index();
    public static final int POSTGL = AttributesEnum.PostGl.index();
    public static final int GLVOUCHERNO = AttributesEnum.GlvoucherNo.index();
    public static final int DOCTYPEID = AttributesEnum.DocTypeId.index();
    public static final int COMPNTITEM = AttributesEnum.CompntItem.index();
    public static final int PRDISUUCOST = AttributesEnum.PrdIsuUcost.index();
    public static final int BATCHREFID = AttributesEnum.BatchRefid.index();
    public static final int KITREFID = AttributesEnum.KitRefid.index();
    public static final int PLANID = AttributesEnum.Planid.index();
    public static final int BILTYNO = AttributesEnum.BiltyNo.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int INTRANSIT = AttributesEnum.InTransit.index();
    public static final int REMARKSNARR = AttributesEnum.RemarksNarr.index();
    public static final int LCREFNO = AttributesEnum.LcRefno.index();
    public static final int BILLOFENTRY = AttributesEnum.BillOfEntry.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int LCTYPE = AttributesEnum.LcType.index();
    public static final int RNOTESEQ = AttributesEnum.Rnoteseq.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int INRECEIVEDITEMSLINES = AttributesEnum.InReceivedItemsLines.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InReceivedItemsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolims.erpsolimsmodel.erpsolimseo.InReceivedItems");
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
     * Gets the attribute value for Recvdoctypeid, using the alias name Recvdoctypeid.
     * @return the value of Recvdoctypeid
     */
    public String getRecvdoctypeid() {
        return (String) getAttributeInternal(RECVDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Recvdoctypeid.
     * @param value value to set the Recvdoctypeid
     */
    public void setRecvdoctypeid(String value) {
        setAttributeInternal(RECVDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for ReceivingDate, using the alias name ReceivingDate.
     * @return the value of ReceivingDate
     */
    public Date getReceivingDate() {
        return (Date) getAttributeInternal(RECEIVINGDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceivingDate.
     * @param value value to set the ReceivingDate
     */
    public void setReceivingDate(Date value) {
        setAttributeInternal(RECEIVINGDATE, value);
    }

    /**
     * Gets the attribute value for SourceDocRef, using the alias name SourceDocRef.
     * @return the value of SourceDocRef
     */
    public String getSourceDocRef() {
        return (String) getAttributeInternal(SOURCEDOCREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for SourceDocRef.
     * @param value value to set the SourceDocRef
     */
    public void setSourceDocRef(String value) {
        setAttributeInternal(SOURCEDOCREF, value);
    }

    /**
     * Gets the attribute value for ChallanNo, using the alias name ChallanNo.
     * @return the value of ChallanNo
     */
    public String getChallanNo() {
        return (String) getAttributeInternal(CHALLANNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChallanNo.
     * @param value value to set the ChallanNo
     */
    public void setChallanNo(String value) {
        setAttributeInternal(CHALLANNO, value);
    }

    /**
     * Gets the attribute value for ChallanNoDate, using the alias name ChallanNoDate.
     * @return the value of ChallanNoDate
     */
    public Date getChallanNoDate() {
        return (Date) getAttributeInternal(CHALLANNODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChallanNoDate.
     * @param value value to set the ChallanNoDate
     */
    public void setChallanNoDate(Date value) {
        setAttributeInternal(CHALLANNODATE, value);
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
     * Gets the attribute value for ValuedBy, using the alias name ValuedBy.
     * @return the value of ValuedBy
     */
    public String getValuedBy() {
        return (String) getAttributeInternal(VALUEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValuedBy.
     * @param value value to set the ValuedBy
     */
    public void setValuedBy(String value) {
        setAttributeInternal(VALUEDBY, value);
    }

    /**
     * Gets the attribute value for Posted, using the alias name Posted.
     * @return the value of Posted
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Posted.
     * @param value value to set the Posted
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for PostedBy, using the alias name PostedBy.
     * @return the value of PostedBy
     */
    public String getPostedBy() {
        return (String) getAttributeInternal(POSTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostedBy.
     * @param value value to set the PostedBy
     */
    public void setPostedBy(String value) {
        setAttributeInternal(POSTEDBY, value);
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
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
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
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for RefNo, using the alias name RefNo.
     * @return the value of RefNo
     */
    public String getRefNo() {
        return (String) getAttributeInternal(REFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefNo.
     * @param value value to set the RefNo
     */
    public void setRefNo(String value) {
        setAttributeInternal(REFNO, value);
    }

    /**
     * Gets the attribute value for Companyid, using the alias name Companyid.
     * @return the value of Companyid
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Companyid.
     * @param value value to set the Companyid
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for Deptid, using the alias name Deptid.
     * @return the value of Deptid
     */
    public String getDeptid() {
        return (String) getAttributeInternal(DEPTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Deptid.
     * @param value value to set the Deptid
     */
    public void setDeptid(String value) {
        setAttributeInternal(DEPTID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for PostIntface, using the alias name PostIntface.
     * @return the value of PostIntface
     */
    public String getPostIntface() {
        return (String) getAttributeInternal(POSTINTFACE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostIntface.
     * @param value value to set the PostIntface
     */
    public void setPostIntface(String value) {
        setAttributeInternal(POSTINTFACE, value);
    }

    /**
     * Gets the attribute value for PostGl, using the alias name PostGl.
     * @return the value of PostGl
     */
    public String getPostGl() {
        return (String) getAttributeInternal(POSTGL);
    }

    /**
     * Sets <code>value</code> as the attribute value for PostGl.
     * @param value value to set the PostGl
     */
    public void setPostGl(String value) {
        setAttributeInternal(POSTGL, value);
    }

    /**
     * Gets the attribute value for GlvoucherNo, using the alias name GlvoucherNo.
     * @return the value of GlvoucherNo
     */
    public String getGlvoucherNo() {
        return (String) getAttributeInternal(GLVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlvoucherNo.
     * @param value value to set the GlvoucherNo
     */
    public void setGlvoucherNo(String value) {
        setAttributeInternal(GLVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for DocTypeId, using the alias name DocTypeId.
     * @return the value of DocTypeId
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocTypeId.
     * @param value value to set the DocTypeId
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for CompntItem, using the alias name CompntItem.
     * @return the value of CompntItem
     */
    public String getCompntItem() {
        return (String) getAttributeInternal(COMPNTITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompntItem.
     * @param value value to set the CompntItem
     */
    public void setCompntItem(String value) {
        setAttributeInternal(COMPNTITEM, value);
    }

    /**
     * Gets the attribute value for PrdIsuUcost, using the alias name PrdIsuUcost.
     * @return the value of PrdIsuUcost
     */
    public BigDecimal getPrdIsuUcost() {
        return (BigDecimal) getAttributeInternal(PRDISUUCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrdIsuUcost.
     * @param value value to set the PrdIsuUcost
     */
    public void setPrdIsuUcost(BigDecimal value) {
        setAttributeInternal(PRDISUUCOST, value);
    }

    /**
     * Gets the attribute value for BatchRefid, using the alias name BatchRefid.
     * @return the value of BatchRefid
     */
    public String getBatchRefid() {
        return (String) getAttributeInternal(BATCHREFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BatchRefid.
     * @param value value to set the BatchRefid
     */
    public void setBatchRefid(String value) {
        setAttributeInternal(BATCHREFID, value);
    }

    /**
     * Gets the attribute value for KitRefid, using the alias name KitRefid.
     * @return the value of KitRefid
     */
    public String getKitRefid() {
        return (String) getAttributeInternal(KITREFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for KitRefid.
     * @param value value to set the KitRefid
     */
    public void setKitRefid(String value) {
        setAttributeInternal(KITREFID, value);
    }

    /**
     * Gets the attribute value for Planid, using the alias name Planid.
     * @return the value of Planid
     */
    public String getPlanid() {
        return (String) getAttributeInternal(PLANID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Planid.
     * @param value value to set the Planid
     */
    public void setPlanid(String value) {
        setAttributeInternal(PLANID, value);
    }

    /**
     * Gets the attribute value for BiltyNo, using the alias name BiltyNo.
     * @return the value of BiltyNo
     */
    public String getBiltyNo() {
        return (String) getAttributeInternal(BILTYNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BiltyNo.
     * @param value value to set the BiltyNo
     */
    public void setBiltyNo(String value) {
        setAttributeInternal(BILTYNO, value);
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
     * Gets the attribute value for InTransit, using the alias name InTransit.
     * @return the value of InTransit
     */
    public String getInTransit() {
        return (String) getAttributeInternal(INTRANSIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InTransit.
     * @param value value to set the InTransit
     */
    public void setInTransit(String value) {
        setAttributeInternal(INTRANSIT, value);
    }

    /**
     * Gets the attribute value for RemarksNarr, using the alias name RemarksNarr.
     * @return the value of RemarksNarr
     */
    public String getRemarksNarr() {
        return (String) getAttributeInternal(REMARKSNARR);
    }

    /**
     * Sets <code>value</code> as the attribute value for RemarksNarr.
     * @param value value to set the RemarksNarr
     */
    public void setRemarksNarr(String value) {
        setAttributeInternal(REMARKSNARR, value);
    }

    /**
     * Gets the attribute value for LcRefno, using the alias name LcRefno.
     * @return the value of LcRefno
     */
    public String getLcRefno() {
        return (String) getAttributeInternal(LCREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcRefno.
     * @param value value to set the LcRefno
     */
    public void setLcRefno(String value) {
        setAttributeInternal(LCREFNO, value);
    }

    /**
     * Gets the attribute value for BillOfEntry, using the alias name BillOfEntry.
     * @return the value of BillOfEntry
     */
    public String getBillOfEntry() {
        return (String) getAttributeInternal(BILLOFENTRY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillOfEntry.
     * @param value value to set the BillOfEntry
     */
    public void setBillOfEntry(String value) {
        setAttributeInternal(BILLOFENTRY, value);
    }

    /**
     * Gets the attribute value for IsMigrated, using the alias name IsMigrated.
     * @return the value of IsMigrated
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsMigrated.
     * @param value value to set the IsMigrated
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MigratedDate, using the alias name MigratedDate.
     * @return the value of MigratedDate
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MigratedDate.
     * @param value value to set the MigratedDate
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for LcType, using the alias name LcType.
     * @return the value of LcType
     */
    public String getLcType() {
        return (String) getAttributeInternal(LCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcType.
     * @param value value to set the LcType
     */
    public void setLcType(String value) {
        setAttributeInternal(LCTYPE, value);
    }

    /**
     * Gets the attribute value for Rnoteseq, using the alias name Rnoteseq.
     * @return the value of Rnoteseq
     */
    public Integer getRnoteseq() {
        return (Integer) getAttributeInternal(RNOTESEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rnoteseq.
     * @param value value to set the Rnoteseq
     */
    public void setRnoteseq(Integer value) {
        setAttributeInternal(RNOTESEQ, value);
    }

    /**
     * Gets the attribute value for txtStoreName, using the alias name txtStoreName.
     * @return the value of txtStoreName
     */
    public String gettxtStoreName() {
        return (String) getAttributeInternal(TXTSTORENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtStoreName.
     * @param value value to set the txtStoreName
     */
    public void settxtStoreName(String value) {
        setAttributeInternal(TXTSTORENAME, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getInReceivedItemsLines() {
        return (RowIterator) getAttributeInternal(INRECEIVEDITEMSLINES);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllStores() {
        return (EntityImpl) getAttributeInternal(ALLSTORES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllStores(EntityImpl value) {
        setAttributeInternal(ALLSTORES, value);
    }


    /**
     * @param rnoteseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer rnoteseq) {
        return new Key(new Object[] { rnoteseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setStoreid(ERPSolGlobClassModel.doGetUserStoreCode());
        setERPSolPKColumnName("Rnoteseq");
        setERPSolPKSeqName("IN_RECEIVED_ITEMS");
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
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
        if (operation==DML_INSERT) {
           String pkValue=" IN_RECEIVED_ITEMS_ID('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"','B',TO_DATE('"+getReceivingDate()+"','YYYY-MM-DD'))";
           System.out.println(pkValue + "pk value");
           String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
           populateAttributeAsChanged(RNOTENO, result);
//           populateAttributeAsChanged(DOCTYPEID, getReceiptMode().equals("C")?"SRCT":"SRBT");

        }        
        super.doDML(operation, e);
    }
}
