package erpsolims.erpsolimsmodel.erpsolimseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 23 10:14:53 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InItemTransferNoteLinesImpl extends ERPSolGlobalsEntityImpl {
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
        InItemTransferNote,
        InItems;
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
    public static final int INITEMTRANSFERNOTE = AttributesEnum.InItemTransferNote.index();
    public static final int INITEMS = AttributesEnum.InItems.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InItemTransferNoteLinesImpl() {
    }

    /**
     * Gets the attribute value for Sendingstoreid, using the alias name Sendingstoreid.
     * @return the value of Sendingstoreid
     */
    public String getSendingstoreid() {
        return (String) getAttributeInternal(SENDINGSTOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Sendingstoreid.
     * @param value value to set the Sendingstoreid
     */
    public void setSendingstoreid(String value) {
        setAttributeInternal(SENDINGSTOREID, value);
    }

    /**
     * Gets the attribute value for Stnno, using the alias name Stnno.
     * @return the value of Stnno
     */
    public String getStnno() {
        return (String) getAttributeInternal(STNNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Stnno.
     * @param value value to set the Stnno
     */
    public void setStnno(String value) {
        setAttributeInternal(STNNO, value);
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
     * Gets the attribute value for Transfertypeid, using the alias name Transfertypeid.
     * @return the value of Transfertypeid
     */
    public String getTransfertypeid() {
        return (String) getAttributeInternal(TRANSFERTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transfertypeid.
     * @param value value to set the Transfertypeid
     */
    public void setTransfertypeid(String value) {
        setAttributeInternal(TRANSFERTYPEID, value);
    }

    /**
     * Gets the attribute value for Uomsid, using the alias name Uomsid.
     * @return the value of Uomsid
     */
    public String getUomsid() {
        return (String) getAttributeInternal(UOMSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Uomsid.
     * @param value value to set the Uomsid
     */
    public void setUomsid(String value) {
        setAttributeInternal(UOMSID, value);
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
     * Gets the attribute value for TransferQty, using the alias name TransferQty.
     * @return the value of TransferQty
     */
    public BigDecimal getTransferQty() {
        return (BigDecimal) getAttributeInternal(TRANSFERQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransferQty.
     * @param value value to set the TransferQty
     */
    public void setTransferQty(BigDecimal value) {
        setAttributeInternal(TRANSFERQTY, value);
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
     * Gets the attribute value for ReceivedQty, using the alias name ReceivedQty.
     * @return the value of ReceivedQty
     */
    public BigDecimal getReceivedQty() {
        return (BigDecimal) getAttributeInternal(RECEIVEDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceivedQty.
     * @param value value to set the ReceivedQty
     */
    public void setReceivedQty(BigDecimal value) {
        setAttributeInternal(RECEIVEDQTY, value);
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
     * Gets the attribute value for Unitcost, using the alias name Unitcost.
     * @return the value of Unitcost
     */
    public BigDecimal getUnitcost() {
        return (BigDecimal) getAttributeInternal(UNITCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Unitcost.
     * @param value value to set the Unitcost
     */
    public void setUnitcost(BigDecimal value) {
        setAttributeInternal(UNITCOST, value);
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
     * Gets the attribute value for IssueQty, using the alias name IssueQty.
     * @return the value of IssueQty
     */
    public BigDecimal getIssueQty() {
        return (BigDecimal) getAttributeInternal(ISSUEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for IssueQty.
     * @param value value to set the IssueQty
     */
    public void setIssueQty(BigDecimal value) {
        setAttributeInternal(ISSUEQTY, value);
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
     * Gets the attribute value for Dcost, using the alias name Dcost.
     * @return the value of Dcost
     */
    public BigDecimal getDcost() {
        return (BigDecimal) getAttributeInternal(DCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dcost.
     * @param value value to set the Dcost
     */
    public void setDcost(BigDecimal value) {
        setAttributeInternal(DCOST, value);
    }

    /**
     * Gets the attribute value for OhQty, using the alias name OhQty.
     * @return the value of OhQty
     */
    public BigDecimal getOhQty() {
        return (BigDecimal) getAttributeInternal(OHQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OhQty.
     * @param value value to set the OhQty
     */
    public void setOhQty(BigDecimal value) {
        setAttributeInternal(OHQTY, value);
    }

    /**
     * Gets the attribute value for AvailQty, using the alias name AvailQty.
     * @return the value of AvailQty
     */
    public BigDecimal getAvailQty() {
        return (BigDecimal) getAttributeInternal(AVAILQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for AvailQty.
     * @param value value to set the AvailQty
     */
    public void setAvailQty(BigDecimal value) {
        setAttributeInternal(AVAILQTY, value);
    }

    /**
     * Gets the attribute value for Stnlineseq, using the alias name Stnlineseq.
     * @return the value of Stnlineseq
     */
    public Integer getStnlineseq() {
        return (Integer) getAttributeInternal(STNLINESEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Stnlineseq.
     * @param value value to set the Stnlineseq
     */
    public void setStnlineseq(Integer value) {
        setAttributeInternal(STNLINESEQ, value);
    }

    /**
     * Gets the attribute value for Stnnoseq, using the alias name Stnnoseq.
     * @return the value of Stnnoseq
     */
    public Integer getStnnoseq() {
        return (Integer) getAttributeInternal(STNNOSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Stnnoseq.
     * @param value value to set the Stnnoseq
     */
    public void setStnnoseq(Integer value) {
        setAttributeInternal(STNNOSEQ, value);
    }

    /**
     * @return the associated entity InItemTransferNoteImpl.
     */
    public InItemTransferNoteImpl getInItemTransferNote() {
        return (InItemTransferNoteImpl) getAttributeInternal(INITEMTRANSFERNOTE);
    }

    /**
     * Sets <code>value</code> as the associated entity InItemTransferNoteImpl.
     */
    public void setInItemTransferNote(InItemTransferNoteImpl value) {
        setAttributeInternal(INITEMTRANSFERNOTE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getInItems() {
        return (EntityImpl) getAttributeInternal(INITEMS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setInItems(EntityImpl value) {
        setAttributeInternal(INITEMS, value);
    }

    /**
     * @param stnlineseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer stnlineseq) {
        return new Key(new Object[] { stnlineseq });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolims.erpsolimsmodel.erpsolimseo.InItemTransferNoteLines");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
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
            populateAttributeAsChanged(STNNO, getInItemTransferNote().getAttribute("Stnno"));
            populateAttributeAsChanged(STOREID, getInItemTransferNote().getAttribute("Sendingstoreid"));
            
       }
        super.doDML(operation, e);
    }
}

