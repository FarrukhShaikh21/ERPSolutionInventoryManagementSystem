package erpsolims.erpsolimsmodel.erpsolimsvo;

import erpsolims.erpsolimsmodel.erpsolimseo.InItemTransferNoteLinesImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 23 11:12:01 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InItemTransferNoteLinesViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_INITEMTRANSFERNOTELINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Sendingstoreid,
        Stnno,
        Lineno,
        Storeid,
        Itemid,
        Transfertypeid,
        Uomsid,
        ItemRefId,
        SourceDocRef,
        Remarks,
        TransferQty,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        SourceDocLineno,
        ReceivedQty,
        Batchno,
        Unitcost,
        ProductCost,
        IssueQty,
        KitId,
        Dcost,
        OhQty,
        AvailQty,
        Stnlineseq,
        Stnnoseq,
        txtModelNo,
        txtSumTransferQuantity,
        InItemTransferNoteView,
        InItemsView,
        InItemTransferNoteImeiView,
        AccVwFuncCheckQuantityQVO,
        AccVWItemOpeningQVO,
        AccInItemsView;
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


    public static final int SENDINGSTOREID = AttributesEnum.Sendingstoreid.index();
    public static final int STNNO = AttributesEnum.Stnno.index();
    public static final int LINENO = AttributesEnum.Lineno.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int TRANSFERTYPEID = AttributesEnum.Transfertypeid.index();
    public static final int UOMSID = AttributesEnum.Uomsid.index();
    public static final int ITEMREFID = AttributesEnum.ItemRefId.index();
    public static final int SOURCEDOCREF = AttributesEnum.SourceDocRef.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int TRANSFERQTY = AttributesEnum.TransferQty.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int SOURCEDOCLINENO = AttributesEnum.SourceDocLineno.index();
    public static final int RECEIVEDQTY = AttributesEnum.ReceivedQty.index();
    public static final int BATCHNO = AttributesEnum.Batchno.index();
    public static final int UNITCOST = AttributesEnum.Unitcost.index();
    public static final int PRODUCTCOST = AttributesEnum.ProductCost.index();
    public static final int ISSUEQTY = AttributesEnum.IssueQty.index();
    public static final int KITID = AttributesEnum.KitId.index();
    public static final int DCOST = AttributesEnum.Dcost.index();
    public static final int OHQTY = AttributesEnum.OhQty.index();
    public static final int AVAILQTY = AttributesEnum.AvailQty.index();
    public static final int STNLINESEQ = AttributesEnum.Stnlineseq.index();
    public static final int STNNOSEQ = AttributesEnum.Stnnoseq.index();
    public static final int TXTMODELNO = AttributesEnum.txtModelNo.index();
    public static final int TXTSUMTRANSFERQUANTITY = AttributesEnum.txtSumTransferQuantity.index();
    public static final int INITEMTRANSFERNOTEVIEW = AttributesEnum.InItemTransferNoteView.index();
    public static final int INITEMSVIEW = AttributesEnum.InItemsView.index();
    public static final int INITEMTRANSFERNOTEIMEIVIEW = AttributesEnum.InItemTransferNoteImeiView.index();
    public static final int ACCVWFUNCCHECKQUANTITYQVO = AttributesEnum.AccVwFuncCheckQuantityQVO.index();
    public static final int ACCVWITEMOPENINGQVO = AttributesEnum.AccVWItemOpeningQVO.index();
    public static final int ACCINITEMSVIEW = AttributesEnum.AccInItemsView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InItemTransferNoteLinesViewRowImpl() {
    }

    /**
     * Gets InItemTransferNoteLines entity object.
     * @return the InItemTransferNoteLines
     */
    public InItemTransferNoteLinesImpl getInItemTransferNoteLines() {
        return (InItemTransferNoteLinesImpl) getEntity(ENTITY_INITEMTRANSFERNOTELINES);
    }

    /**
     * Gets the attribute value for SENDINGSTOREID using the alias name Sendingstoreid.
     * @return the SENDINGSTOREID
     */
    public String getSendingstoreid() {
        return (String) getAttributeInternal(SENDINGSTOREID);
    }

    /**
     * Sets <code>value</code> as attribute value for SENDINGSTOREID using the alias name Sendingstoreid.
     * @param value value to set the SENDINGSTOREID
     */
    public void setSendingstoreid(String value) {
        setAttributeInternal(SENDINGSTOREID, value);
    }

    /**
     * Gets the attribute value for STNNO using the alias name Stnno.
     * @return the STNNO
     */
    public String getStnno() {
        return (String) getAttributeInternal(STNNO);
    }

    /**
     * Sets <code>value</code> as attribute value for STNNO using the alias name Stnno.
     * @param value value to set the STNNO
     */
    public void setStnno(String value) {
        setAttributeInternal(STNNO, value);
    }

    /**
     * Gets the attribute value for LINENO using the alias name Lineno.
     * @return the LINENO
     */
    public Integer getLineno() {
        return (Integer) getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as attribute value for LINENO using the alias name Lineno.
     * @param value value to set the LINENO
     */
    public void setLineno(Integer value) {
        setAttributeInternal(LINENO, value);
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
     * Gets the attribute value for ITEMID using the alias name Itemid.
     * @return the ITEMID
     */
    public String getItemid() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEMID using the alias name Itemid.
     * @param value value to set the ITEMID
     */
    public void setItemid(String value) {
        setAttributeInternal(ITEMID, value);
  
        try{
        getAccVwFuncCheckQuantityQVO().setNamedWhereClauseParam("P_ADF_CONFIRMDATE", getInItemTransferNoteView().getAttribute("DateOfTransfer"));
        System.out.println("a");
        getAccVwFuncCheckQuantityQVO().setNamedWhereClauseParam("P_ADF_ITEMID", value);
            System.out.println("b");
        getAccVwFuncCheckQuantityQVO().setNamedWhereClauseParam("P_ADF_LOCATIONID", getInItemTransferNoteView().getAttribute("Locationid"));
            System.out.println("c");
        getAccVwFuncCheckQuantityQVO().setNamedWhereClauseParam("P_ADF_DOCUMENT_ID", getInItemTransferNoteView().getAttribute("Stnno")==null?"":getInItemTransferNoteView().getAttribute("Stnno"));
            System.out.println("d");
        getAccVwFuncCheckQuantityQVO().setNamedWhereClauseParam("P_ADF_STOREID", getInItemTransferNoteView().getAttribute("Sendingstoreid"));
            System.out.println("e");
        getAccVwFuncCheckQuantityQVO().setNamedWhereClauseParam("P_ADF_TYPE", "STA");
            System.out.println("f");
        //            System.out.println(getAccVwFuncCheckQuantityQVO().getViewObject().getQuery());
        getAccVwFuncCheckQuantityQVO().executeQuery();
            System.out.println("g");
        //            setAvailQty(22);
        setAvailQty((BigDecimal)getAccVwFuncCheckQuantityQVO().first().getAttribute("Quantity"));
            System.out.println("h");
        }
        catch(Exception exc) {
            exc.printStackTrace();
            System.out.println("i");
            setAvailQty(new BigDecimal(0));
            System.out.println("j");
        }
        
        try{
        getAccVWItemOpeningQVO().setNamedWhereClauseParam("P_ADF_CONFIRMDATE", getInItemTransferNoteView().getAttribute("DateOfTransfer"));
        getAccVWItemOpeningQVO().setNamedWhereClauseParam("P_ADF_ITEMID", value);
        getAccVWItemOpeningQVO().setNamedWhereClauseParam("P_ADF_STOREID", getInItemTransferNoteView().getAttribute("Sendingstoreid"));
        getAccVWItemOpeningQVO().setNamedWhereClauseParam("P_ADF_TYPE", "Q");
        getAccVWItemOpeningQVO().executeQuery();
        setOhQty((BigDecimal)getAccVWItemOpeningQVO().first().getAttribute("Quantity"));
        }
        catch(Exception exc) {
        //            exc.printStackTrace();
            setOhQty(new BigDecimal(0));
        }      
    }

    /**
     * Gets the attribute value for TRANSFERTYPEID using the alias name Transfertypeid.
     * @return the TRANSFERTYPEID
     */
    public String getTransfertypeid() {
        return (String) getAttributeInternal(TRANSFERTYPEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSFERTYPEID using the alias name Transfertypeid.
     * @param value value to set the TRANSFERTYPEID
     */
    public void setTransfertypeid(String value) {
        setAttributeInternal(TRANSFERTYPEID, value);
    }

    /**
     * Gets the attribute value for UOMSID using the alias name Uomsid.
     * @return the UOMSID
     */
    public String getUomsid() {
        return (String) getAttributeInternal(UOMSID);
    }

    /**
     * Sets <code>value</code> as attribute value for UOMSID using the alias name Uomsid.
     * @param value value to set the UOMSID
     */
    public void setUomsid(String value) {
        setAttributeInternal(UOMSID, value);
    }

    /**
     * Gets the attribute value for ITEM_REF_ID using the alias name ItemRefId.
     * @return the ITEM_REF_ID
     */
    public String getItemRefId() {
        return (String) getAttributeInternal(ITEMREFID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_REF_ID using the alias name ItemRefId.
     * @param value value to set the ITEM_REF_ID
     */
    public void setItemRefId(String value) {
        setAttributeInternal(ITEMREFID, value);
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
     * Gets the attribute value for TRANSFER_QTY using the alias name TransferQty.
     * @return the TRANSFER_QTY
     */
    public BigDecimal getTransferQty() {
        return (BigDecimal) getAttributeInternal(TRANSFERQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSFER_QTY using the alias name TransferQty.
     * @param value value to set the TRANSFER_QTY
     */
    public void setTransferQty(BigDecimal value) {
        setAttributeInternal(TRANSFERQTY, value);
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
     * Gets the attribute value for SOURCE_DOC_LINENO using the alias name SourceDocLineno.
     * @return the SOURCE_DOC_LINENO
     */
    public Integer getSourceDocLineno() {
        return (Integer) getAttributeInternal(SOURCEDOCLINENO);
    }

    /**
     * Sets <code>value</code> as attribute value for SOURCE_DOC_LINENO using the alias name SourceDocLineno.
     * @param value value to set the SOURCE_DOC_LINENO
     */
    public void setSourceDocLineno(Integer value) {
        setAttributeInternal(SOURCEDOCLINENO, value);
    }

    /**
     * Gets the attribute value for RECEIVED_QTY using the alias name ReceivedQty.
     * @return the RECEIVED_QTY
     */
    public BigDecimal getReceivedQty() {
        return (BigDecimal) getAttributeInternal(RECEIVEDQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for RECEIVED_QTY using the alias name ReceivedQty.
     * @param value value to set the RECEIVED_QTY
     */
    public void setReceivedQty(BigDecimal value) {
        setAttributeInternal(RECEIVEDQTY, value);
    }

    /**
     * Gets the attribute value for BATCHNO using the alias name Batchno.
     * @return the BATCHNO
     */
    public String getBatchno() {
        return (String) getAttributeInternal(BATCHNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BATCHNO using the alias name Batchno.
     * @param value value to set the BATCHNO
     */
    public void setBatchno(String value) {
        setAttributeInternal(BATCHNO, value);
    }

    /**
     * Gets the attribute value for UNITCOST using the alias name Unitcost.
     * @return the UNITCOST
     */
    public BigDecimal getUnitcost() {
        return (BigDecimal) getAttributeInternal(UNITCOST);
    }

    /**
     * Sets <code>value</code> as attribute value for UNITCOST using the alias name Unitcost.
     * @param value value to set the UNITCOST
     */
    public void setUnitcost(BigDecimal value) {
        setAttributeInternal(UNITCOST, value);
    }

    /**
     * Gets the attribute value for PRODUCT_COST using the alias name ProductCost.
     * @return the PRODUCT_COST
     */
    public BigDecimal getProductCost() {
        return (BigDecimal) getAttributeInternal(PRODUCTCOST);
    }

    /**
     * Sets <code>value</code> as attribute value for PRODUCT_COST using the alias name ProductCost.
     * @param value value to set the PRODUCT_COST
     */
    public void setProductCost(BigDecimal value) {
        setAttributeInternal(PRODUCTCOST, value);
    }

    /**
     * Gets the attribute value for ISSUE_QTY using the alias name IssueQty.
     * @return the ISSUE_QTY
     */
    public BigDecimal getIssueQty() {
        return (BigDecimal) getAttributeInternal(ISSUEQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for ISSUE_QTY using the alias name IssueQty.
     * @param value value to set the ISSUE_QTY
     */
    public void setIssueQty(BigDecimal value) {
        setAttributeInternal(ISSUEQTY, value);
    }

    /**
     * Gets the attribute value for KIT_ID using the alias name KitId.
     * @return the KIT_ID
     */
    public String getKitId() {
        return (String) getAttributeInternal(KITID);
    }

    /**
     * Sets <code>value</code> as attribute value for KIT_ID using the alias name KitId.
     * @param value value to set the KIT_ID
     */
    public void setKitId(String value) {
        setAttributeInternal(KITID, value);
    }

    /**
     * Gets the attribute value for DCOST using the alias name Dcost.
     * @return the DCOST
     */
    public BigDecimal getDcost() {
        return (BigDecimal) getAttributeInternal(DCOST);
    }

    /**
     * Sets <code>value</code> as attribute value for DCOST using the alias name Dcost.
     * @param value value to set the DCOST
     */
    public void setDcost(BigDecimal value) {
        setAttributeInternal(DCOST, value);
    }

    /**
     * Gets the attribute value for OH_QTY using the alias name OhQty.
     * @return the OH_QTY
     */
    public BigDecimal getOhQty() {
        return (BigDecimal) getAttributeInternal(OHQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for OH_QTY using the alias name OhQty.
     * @param value value to set the OH_QTY
     */
    public void setOhQty(BigDecimal value) {
        setAttributeInternal(OHQTY, value);
    }

    /**
     * Gets the attribute value for AVAIL_QTY using the alias name AvailQty.
     * @return the AVAIL_QTY
     */
    public BigDecimal getAvailQty() {
        return (BigDecimal) getAttributeInternal(AVAILQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for AVAIL_QTY using the alias name AvailQty.
     * @param value value to set the AVAIL_QTY
     */
    public void setAvailQty(BigDecimal value) {
        setAttributeInternal(AVAILQTY, value);
    }

    /**
     * Gets the attribute value for STNLINESEQ using the alias name Stnlineseq.
     * @return the STNLINESEQ
     */
    public Integer getStnlineseq() {
        return (Integer) getAttributeInternal(STNLINESEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for STNLINESEQ using the alias name Stnlineseq.
     * @param value value to set the STNLINESEQ
     */
    public void setStnlineseq(Integer value) {
        setAttributeInternal(STNLINESEQ, value);
    }

    /**
     * Gets the attribute value for STNNOSEQ using the alias name Stnnoseq.
     * @return the STNNOSEQ
     */
    public Integer getStnnoseq() {
        return (Integer) getAttributeInternal(STNNOSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for STNNOSEQ using the alias name Stnnoseq.
     * @param value value to set the STNNOSEQ
     */
    public void setStnnoseq(Integer value) {
        setAttributeInternal(STNNOSEQ, value);
    }

    /**
     * Gets the attribute value for TXT_MODEL_NO using the alias name txtModelNo.
     * @return the TXT_MODEL_NO
     */
    public String gettxtModelNo() {
        return (String) getAttributeInternal(TXTMODELNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_MODEL_NO using the alias name txtModelNo.
     * @param value value to set the TXT_MODEL_NO
     */
    public void settxtModelNo(String value) {
        setAttributeInternal(TXTMODELNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSumTransferQuantity.
     * @return the txtSumTransferQuantity
     */
    public BigDecimal gettxtSumTransferQuantity() {
        return (BigDecimal) getAttributeInternal(TXTSUMTRANSFERQUANTITY);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InItemTransferNoteView.
     */
    public Row getInItemTransferNoteView() {
        return (Row) getAttributeInternal(INITEMTRANSFERNOTEVIEW);
    }

    /**
     * Sets the master-detail link InItemTransferNoteView between this object and <code>value</code>.
     */
    public void setInItemTransferNoteView(Row value) {
        setAttributeInternal(INITEMTRANSFERNOTEVIEW, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InItemsView.
     */
    public Row getInItemsView() {
        return (Row) getAttributeInternal(INITEMSVIEW);
    }

    /**
     * Sets the master-detail link InItemsView between this object and <code>value</code>.
     */
    public void setInItemsView(Row value) {
        setAttributeInternal(INITEMSVIEW, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InItemTransferNoteImeiView.
     */
    public RowIterator getInItemTransferNoteImeiView() {
        return (RowIterator) getAttributeInternal(INITEMTRANSFERNOTEIMEIVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVwFuncCheckQuantityQVO.
     */
    public RowSet getAccVwFuncCheckQuantityQVO() {
        return (RowSet) getAttributeInternal(ACCVWFUNCCHECKQUANTITYQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWItemOpeningQVO.
     */
    public RowSet getAccVWItemOpeningQVO() {
        return (RowSet) getAttributeInternal(ACCVWITEMOPENINGQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInItemsView.
     */
    public RowSet getAccInItemsView() {
        return (RowSet) getAttributeInternal(ACCINITEMSVIEW);
    }
    
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getInItemTransferNoteView().getAttribute("Posted").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

