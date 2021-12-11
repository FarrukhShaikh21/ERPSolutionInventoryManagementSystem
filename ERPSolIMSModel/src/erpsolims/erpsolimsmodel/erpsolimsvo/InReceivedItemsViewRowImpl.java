package erpsolims.erpsolimsmodel.erpsolimsvo;

import erpsolims.erpsolimsmodel.erpsolimseo.InReceivedItemsImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 11 18:43:16 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InReceivedItemsViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_INRECEIVEDITEMS = 0;

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
        InReceivedItemsLinesView,
        AllStoresView,
        AccAllStoresView,
        AccInReceivingDocTypesView;
        static AttributesEnum[] vals = null;
        ;
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
    public static final int INRECEIVEDITEMSLINESVIEW = AttributesEnum.InReceivedItemsLinesView.index();
    public static final int ALLSTORESVIEW = AttributesEnum.AllStoresView.index();
    public static final int ACCALLSTORESVIEW = AttributesEnum.AccAllStoresView.index();
    public static final int ACCINRECEIVINGDOCTYPESVIEW = AttributesEnum.AccInReceivingDocTypesView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InReceivedItemsViewRowImpl() {
    }

    /**
     * Gets InReceivedItems entity object.
     * @return the InReceivedItems
     */
    public InReceivedItemsImpl getInReceivedItems() {
        return (InReceivedItemsImpl) getEntity(ENTITY_INRECEIVEDITEMS);
    }

    /**
     * Gets the attribute value for STOREID using the alias name Storeid.
     * @return the STOREID
     */
    public String getStoreid() {
        return (String) getAttributeInternal(STOREID);
    }

    /**
     * Sets <code>value</code> as attribute value for STOREID using the alias name Storeid.
     * @param value value to set the STOREID
     */
    public void setStoreid(String value) {
        setAttributeInternal(STOREID, value);
    }

    /**
     * Gets the attribute value for RNOTENO using the alias name Rnoteno.
     * @return the RNOTENO
     */
    public String getRnoteno() {
        return (String) getAttributeInternal(RNOTENO);
    }

    /**
     * Sets <code>value</code> as attribute value for RNOTENO using the alias name Rnoteno.
     * @param value value to set the RNOTENO
     */
    public void setRnoteno(String value) {
        setAttributeInternal(RNOTENO, value);
    }

    /**
     * Gets the attribute value for RECVDOCTYPEID using the alias name Recvdoctypeid.
     * @return the RECVDOCTYPEID
     */
    public String getRecvdoctypeid() {
        return (String) getAttributeInternal(RECVDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for RECVDOCTYPEID using the alias name Recvdoctypeid.
     * @param value value to set the RECVDOCTYPEID
     */
    public void setRecvdoctypeid(String value) {
        setAttributeInternal(RECVDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for RECEIVING_DATE using the alias name ReceivingDate.
     * @return the RECEIVING_DATE
     */
    public Date getReceivingDate() {
        return (Date) getAttributeInternal(RECEIVINGDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIVING_DATE using the alias name ReceivingDate.
     * @param value value to set the RECEIVING_DATE
     */
    public void setReceivingDate(Date value) {
        setAttributeInternal(RECEIVINGDATE, value);
    }

    /**
     * Gets the attribute value for SOURCE_DOC_REF using the alias name SourceDocRef.
     * @return the SOURCE_DOC_REF
     */
    public String getSourceDocRef() {
        return (String) getAttributeInternal(SOURCEDOCREF);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE_DOC_REF using the alias name SourceDocRef.
     * @param value value to set the SOURCE_DOC_REF
     */
    public void setSourceDocRef(String value) {
        setAttributeInternal(SOURCEDOCREF, value);
    }

    /**
     * Gets the attribute value for CHALLAN_NO using the alias name ChallanNo.
     * @return the CHALLAN_NO
     */
    public String getChallanNo() {
        return (String) getAttributeInternal(CHALLANNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CHALLAN_NO using the alias name ChallanNo.
     * @param value value to set the CHALLAN_NO
     */
    public void setChallanNo(String value) {
        setAttributeInternal(CHALLANNO, value);
    }

    /**
     * Gets the attribute value for CHALLAN_NO_DATE using the alias name ChallanNoDate.
     * @return the CHALLAN_NO_DATE
     */
    public Date getChallanNoDate() {
        return (Date) getAttributeInternal(CHALLANNODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CHALLAN_NO_DATE using the alias name ChallanNoDate.
     * @param value value to set the CHALLAN_NO_DATE
     */
    public void setChallanNoDate(Date value) {
        setAttributeInternal(CHALLANNODATE, value);
    }

    /**
     * Gets the attribute value for RECEIVED_BY using the alias name ReceivedBy.
     * @return the RECEIVED_BY
     */
    public String getReceivedBy() {
        return (String) getAttributeInternal(RECEIVEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIVED_BY using the alias name ReceivedBy.
     * @param value value to set the RECEIVED_BY
     */
    public void setReceivedBy(String value) {
        setAttributeInternal(RECEIVEDBY, value);
    }

    /**
     * Gets the attribute value for VALUED_BY using the alias name ValuedBy.
     * @return the VALUED_BY
     */
    public String getValuedBy() {
        return (String) getAttributeInternal(VALUEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for VALUED_BY using the alias name ValuedBy.
     * @param value value to set the VALUED_BY
     */
    public void setValuedBy(String value) {
        setAttributeInternal(VALUEDBY, value);
    }

    /**
     * Gets the attribute value for POSTED using the alias name Posted.
     * @return the POSTED
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED using the alias name Posted.
     * @param value value to set the POSTED
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for POSTED_BY using the alias name PostedBy.
     * @return the POSTED_BY
     */
    public String getPostedBy() {
        return (String) getAttributeInternal(POSTEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for POSTED_BY using the alias name PostedBy.
     * @param value value to set the POSTED_BY
     */
    public void setPostedBy(String value) {
        setAttributeInternal(POSTEDBY, value);
    }

    /**
     * Gets the attribute value for CREATEDBY using the alias name Createdby.
     * @return the CREATEDBY
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATEDBY using the alias name Createdby.
     * @param value value to set the CREATEDBY
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @return the MODIFIEDBY
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @param value value to set the MODIFIEDBY
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for REF_NO using the alias name RefNo.
     * @return the REF_NO
     */
    public String getRefNo() {
        return (String) getAttributeInternal(REFNO);
    }

    /**
     * Sets <code>value</code> as attribute value for REF_NO using the alias name RefNo.
     * @param value value to set the REF_NO
     */
    public void setRefNo(String value) {
        setAttributeInternal(REFNO, value);
    }

    /**
     * Gets the attribute value for COMPANYID using the alias name Companyid.
     * @return the COMPANYID
     */
    public String getCompanyid() {
        return (String) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANYID using the alias name Companyid.
     * @param value value to set the COMPANYID
     */
    public void setCompanyid(String value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for DEPTID using the alias name Deptid.
     * @return the DEPTID
     */
    public String getDeptid() {
        return (String) getAttributeInternal(DEPTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPTID using the alias name Deptid.
     * @param value value to set the DEPTID
     */
    public void setDeptid(String value) {
        setAttributeInternal(DEPTID, value);
    }

    /**
     * Gets the attribute value for LOCATIONID using the alias name Locationid.
     * @return the LOCATIONID
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATIONID using the alias name Locationid.
     * @param value value to set the LOCATIONID
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for POST_INTFACE using the alias name PostIntface.
     * @return the POST_INTFACE
     */
    public String getPostIntface() {
        return (String) getAttributeInternal(POSTINTFACE);
    }

    /**
     * Sets <code>value</code> as attribute value for POST_INTFACE using the alias name PostIntface.
     * @param value value to set the POST_INTFACE
     */
    public void setPostIntface(String value) {
        setAttributeInternal(POSTINTFACE, value);
    }

    /**
     * Gets the attribute value for POST_GL using the alias name PostGl.
     * @return the POST_GL
     */
    public String getPostGl() {
        return (String) getAttributeInternal(POSTGL);
    }

    /**
     * Sets <code>value</code> as attribute value for POST_GL using the alias name PostGl.
     * @param value value to set the POST_GL
     */
    public void setPostGl(String value) {
        setAttributeInternal(POSTGL, value);
    }

    /**
     * Gets the attribute value for GLVOUCHER_NO using the alias name GlvoucherNo.
     * @return the GLVOUCHER_NO
     */
    public String getGlvoucherNo() {
        return (String) getAttributeInternal(GLVOUCHERNO);
    }

    /**
     * Sets <code>value</code> as attribute value for GLVOUCHER_NO using the alias name GlvoucherNo.
     * @param value value to set the GLVOUCHER_NO
     */
    public void setGlvoucherNo(String value) {
        setAttributeInternal(GLVOUCHERNO, value);
    }

    /**
     * Gets the attribute value for DOC_TYPE_ID using the alias name DocTypeId.
     * @return the DOC_TYPE_ID
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_TYPE_ID using the alias name DocTypeId.
     * @param value value to set the DOC_TYPE_ID
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for COMPNT_ITEM using the alias name CompntItem.
     * @return the COMPNT_ITEM
     */
    public String getCompntItem() {
        return (String) getAttributeInternal(COMPNTITEM);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPNT_ITEM using the alias name CompntItem.
     * @param value value to set the COMPNT_ITEM
     */
    public void setCompntItem(String value) {
        setAttributeInternal(COMPNTITEM, value);
    }

    /**
     * Gets the attribute value for PRD_ISU_UCOST using the alias name PrdIsuUcost.
     * @return the PRD_ISU_UCOST
     */
    public BigDecimal getPrdIsuUcost() {
        return (BigDecimal) getAttributeInternal(PRDISUUCOST);
    }

    /**
     * Sets <code>value</code> as attribute value for PRD_ISU_UCOST using the alias name PrdIsuUcost.
     * @param value value to set the PRD_ISU_UCOST
     */
    public void setPrdIsuUcost(BigDecimal value) {
        setAttributeInternal(PRDISUUCOST, value);
    }

    /**
     * Gets the attribute value for BATCH_REFID using the alias name BatchRefid.
     * @return the BATCH_REFID
     */
    public String getBatchRefid() {
        return (String) getAttributeInternal(BATCHREFID);
    }

    /**
     * Sets <code>value</code> as attribute value for BATCH_REFID using the alias name BatchRefid.
     * @param value value to set the BATCH_REFID
     */
    public void setBatchRefid(String value) {
        setAttributeInternal(BATCHREFID, value);
    }

    /**
     * Gets the attribute value for KIT_REFID using the alias name KitRefid.
     * @return the KIT_REFID
     */
    public String getKitRefid() {
        return (String) getAttributeInternal(KITREFID);
    }

    /**
     * Sets <code>value</code> as attribute value for KIT_REFID using the alias name KitRefid.
     * @param value value to set the KIT_REFID
     */
    public void setKitRefid(String value) {
        setAttributeInternal(KITREFID, value);
    }

    /**
     * Gets the attribute value for PLANID using the alias name Planid.
     * @return the PLANID
     */
    public String getPlanid() {
        return (String) getAttributeInternal(PLANID);
    }

    /**
     * Sets <code>value</code> as attribute value for PLANID using the alias name Planid.
     * @param value value to set the PLANID
     */
    public void setPlanid(String value) {
        setAttributeInternal(PLANID, value);
    }

    /**
     * Gets the attribute value for BILTY_NO using the alias name BiltyNo.
     * @return the BILTY_NO
     */
    public String getBiltyNo() {
        return (String) getAttributeInternal(BILTYNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BILTY_NO using the alias name BiltyNo.
     * @param value value to set the BILTY_NO
     */
    public void setBiltyNo(String value) {
        setAttributeInternal(BILTYNO, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for IN_TRANSIT using the alias name InTransit.
     * @return the IN_TRANSIT
     */
    public String getInTransit() {
        return (String) getAttributeInternal(INTRANSIT);
    }

    /**
     * Sets <code>value</code> as attribute value for IN_TRANSIT using the alias name InTransit.
     * @param value value to set the IN_TRANSIT
     */
    public void setInTransit(String value) {
        setAttributeInternal(INTRANSIT, value);
    }

    /**
     * Gets the attribute value for REMARKS_NARR using the alias name RemarksNarr.
     * @return the REMARKS_NARR
     */
    public String getRemarksNarr() {
        return (String) getAttributeInternal(REMARKSNARR);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS_NARR using the alias name RemarksNarr.
     * @param value value to set the REMARKS_NARR
     */
    public void setRemarksNarr(String value) {
        setAttributeInternal(REMARKSNARR, value);
    }

    /**
     * Gets the attribute value for LC_REFNO using the alias name LcRefno.
     * @return the LC_REFNO
     */
    public String getLcRefno() {
        return (String) getAttributeInternal(LCREFNO);
    }

    /**
     * Sets <code>value</code> as attribute value for LC_REFNO using the alias name LcRefno.
     * @param value value to set the LC_REFNO
     */
    public void setLcRefno(String value) {
        setAttributeInternal(LCREFNO, value);
    }

    /**
     * Gets the attribute value for BILL_OF_ENTRY using the alias name BillOfEntry.
     * @return the BILL_OF_ENTRY
     */
    public String getBillOfEntry() {
        return (String) getAttributeInternal(BILLOFENTRY);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_OF_ENTRY using the alias name BillOfEntry.
     * @param value value to set the BILL_OF_ENTRY
     */
    public void setBillOfEntry(String value) {
        setAttributeInternal(BILLOFENTRY, value);
    }

    /**
     * Gets the attribute value for IS_MIGRATED using the alias name IsMigrated.
     * @return the IS_MIGRATED
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_MIGRATED using the alias name IsMigrated.
     * @param value value to set the IS_MIGRATED
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MIGRATED_DATE using the alias name MigratedDate.
     * @return the MIGRATED_DATE
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MIGRATED_DATE using the alias name MigratedDate.
     * @param value value to set the MIGRATED_DATE
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for LC_TYPE using the alias name LcType.
     * @return the LC_TYPE
     */
    public String getLcType() {
        return (String) getAttributeInternal(LCTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for LC_TYPE using the alias name LcType.
     * @param value value to set the LC_TYPE
     */
    public void setLcType(String value) {
        setAttributeInternal(LCTYPE, value);
    }

    /**
     * Gets the attribute value for RNOTESEQ using the alias name Rnoteseq.
     * @return the RNOTESEQ
     */
    public Integer getRnoteseq() {
        return (Integer) getAttributeInternal(RNOTESEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for RNOTESEQ using the alias name Rnoteseq.
     * @param value value to set the RNOTESEQ
     */
    public void setRnoteseq(Integer value) {
        setAttributeInternal(RNOTESEQ, value);
    }

    /**
     * Gets the attribute value for TXT_STORE_NAME using the alias name txtStoreName.
     * @return the TXT_STORE_NAME
     */
    public String gettxtStoreName() {
        return (String) getAttributeInternal(TXTSTORENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_STORE_NAME using the alias name txtStoreName.
     * @param value value to set the TXT_STORE_NAME
     */
    public void settxtStoreName(String value) {
        setAttributeInternal(TXTSTORENAME, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InReceivedItemsLinesView.
     */
    public RowIterator getInReceivedItemsLinesView() {
        return (RowIterator) getAttributeInternal(INRECEIVEDITEMSLINESVIEW);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AllStoresView.
     */
    public Row getAllStoresView() {
        return (Row) getAttributeInternal(ALLSTORESVIEW);
    }

    /**
     * Sets the master-detail link AllStoresView between this object and <code>value</code>.
     */
    public void setAllStoresView(Row value) {
        setAttributeInternal(ALLSTORESVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAllStoresView.
     */
    public RowSet getAccAllStoresView() {
        return (RowSet) getAttributeInternal(ACCALLSTORESVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInReceivingDocTypesView.
     */
    public RowSet getAccInReceivingDocTypesView() {
        return (RowSet) getAttributeInternal(ACCINRECEIVINGDOCTYPESVIEW);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getPosted().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}
