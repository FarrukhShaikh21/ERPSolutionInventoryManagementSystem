package erpsolims.erpsolimsmodel.erpsolimseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jan 22 16:39:22 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InItemTransferNoteImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Sendingstoreid,
        Stnno,
        DateOfTransfer,
        Receivingstoreid,
        TransferReference,
        SourceDocRef,
        Remarks,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Posted,
        PostedBy,
        Companyid,
        Deptid,
        Locationid,
        Transfertype,
        Gatepassrefno,
        Gatepassdate,
        Transportno,
        Bankrefno,
        TransporterName,
        BiltyNo,
        BiltyDate,
        IgpNo,
        AssociateLocationid,
        BillOfEntry,
        IsMigrated,
        MigratedDate,
        Stnnoseq,
        txtStoreName,
        InItemTransferNoteLines,
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


    public static final int SENDINGSTOREID = AttributesEnum.Sendingstoreid.index();
    public static final int STNNO = AttributesEnum.Stnno.index();
    public static final int DATEOFTRANSFER = AttributesEnum.DateOfTransfer.index();
    public static final int RECEIVINGSTOREID = AttributesEnum.Receivingstoreid.index();
    public static final int TRANSFERREFERENCE = AttributesEnum.TransferReference.index();
    public static final int SOURCEDOCREF = AttributesEnum.SourceDocRef.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.PostedBy.index();
    public static final int COMPANYID = AttributesEnum.Companyid.index();
    public static final int DEPTID = AttributesEnum.Deptid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int TRANSFERTYPE = AttributesEnum.Transfertype.index();
    public static final int GATEPASSREFNO = AttributesEnum.Gatepassrefno.index();
    public static final int GATEPASSDATE = AttributesEnum.Gatepassdate.index();
    public static final int TRANSPORTNO = AttributesEnum.Transportno.index();
    public static final int BANKREFNO = AttributesEnum.Bankrefno.index();
    public static final int TRANSPORTERNAME = AttributesEnum.TransporterName.index();
    public static final int BILTYNO = AttributesEnum.BiltyNo.index();
    public static final int BILTYDATE = AttributesEnum.BiltyDate.index();
    public static final int IGPNO = AttributesEnum.IgpNo.index();
    public static final int ASSOCIATELOCATIONID = AttributesEnum.AssociateLocationid.index();
    public static final int BILLOFENTRY = AttributesEnum.BillOfEntry.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int STNNOSEQ = AttributesEnum.Stnnoseq.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int INITEMTRANSFERNOTELINES = AttributesEnum.InItemTransferNoteLines.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InItemTransferNoteImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolims.erpsolimsmodel.erpsolimseo.InItemTransferNote");
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
     * Gets the attribute value for DateOfTransfer, using the alias name DateOfTransfer.
     * @return the value of DateOfTransfer
     */
    public Date getDateOfTransfer() {
        return (Date) getAttributeInternal(DATEOFTRANSFER);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateOfTransfer.
     * @param value value to set the DateOfTransfer
     */
    public void setDateOfTransfer(Date value) {
        setAttributeInternal(DATEOFTRANSFER, value);
    }

    /**
     * Gets the attribute value for Receivingstoreid, using the alias name Receivingstoreid.
     * @return the value of Receivingstoreid
     */
    public String getReceivingstoreid() {
        return (String) getAttributeInternal(RECEIVINGSTOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Receivingstoreid.
     * @param value value to set the Receivingstoreid
     */
    public void setReceivingstoreid(String value) {
        setAttributeInternal(RECEIVINGSTOREID, value);
    }

    /**
     * Gets the attribute value for TransferReference, using the alias name TransferReference.
     * @return the value of TransferReference
     */
    public String getTransferReference() {
        return (String) getAttributeInternal(TRANSFERREFERENCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransferReference.
     * @param value value to set the TransferReference
     */
    public void setTransferReference(String value) {
        setAttributeInternal(TRANSFERREFERENCE, value);
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
     * Gets the attribute value for Transfertype, using the alias name Transfertype.
     * @return the value of Transfertype
     */
    public String getTransfertype() {
        return (String) getAttributeInternal(TRANSFERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transfertype.
     * @param value value to set the Transfertype
     */
    public void setTransfertype(String value) {
        setAttributeInternal(TRANSFERTYPE, value);
    }

    /**
     * Gets the attribute value for Gatepassrefno, using the alias name Gatepassrefno.
     * @return the value of Gatepassrefno
     */
    public String getGatepassrefno() {
        return (String) getAttributeInternal(GATEPASSREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Gatepassrefno.
     * @param value value to set the Gatepassrefno
     */
    public void setGatepassrefno(String value) {
        setAttributeInternal(GATEPASSREFNO, value);
    }

    /**
     * Gets the attribute value for Gatepassdate, using the alias name Gatepassdate.
     * @return the value of Gatepassdate
     */
    public Date getGatepassdate() {
        return (Date) getAttributeInternal(GATEPASSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Gatepassdate.
     * @param value value to set the Gatepassdate
     */
    public void setGatepassdate(Date value) {
        setAttributeInternal(GATEPASSDATE, value);
    }

    /**
     * Gets the attribute value for Transportno, using the alias name Transportno.
     * @return the value of Transportno
     */
    public String getTransportno() {
        return (String) getAttributeInternal(TRANSPORTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Transportno.
     * @param value value to set the Transportno
     */
    public void setTransportno(String value) {
        setAttributeInternal(TRANSPORTNO, value);
    }

    /**
     * Gets the attribute value for Bankrefno, using the alias name Bankrefno.
     * @return the value of Bankrefno
     */
    public String getBankrefno() {
        return (String) getAttributeInternal(BANKREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bankrefno.
     * @param value value to set the Bankrefno
     */
    public void setBankrefno(String value) {
        setAttributeInternal(BANKREFNO, value);
    }

    /**
     * Gets the attribute value for TransporterName, using the alias name TransporterName.
     * @return the value of TransporterName
     */
    public String getTransporterName() {
        return (String) getAttributeInternal(TRANSPORTERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransporterName.
     * @param value value to set the TransporterName
     */
    public void setTransporterName(String value) {
        setAttributeInternal(TRANSPORTERNAME, value);
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
     * Gets the attribute value for BiltyDate, using the alias name BiltyDate.
     * @return the value of BiltyDate
     */
    public Date getBiltyDate() {
        return (Date) getAttributeInternal(BILTYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BiltyDate.
     * @param value value to set the BiltyDate
     */
    public void setBiltyDate(Date value) {
        setAttributeInternal(BILTYDATE, value);
    }

    /**
     * Gets the attribute value for IgpNo, using the alias name IgpNo.
     * @return the value of IgpNo
     */
    public String getIgpNo() {
        return (String) getAttributeInternal(IGPNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for IgpNo.
     * @param value value to set the IgpNo
     */
    public void setIgpNo(String value) {
        setAttributeInternal(IGPNO, value);
    }

    /**
     * Gets the attribute value for AssociateLocationid, using the alias name AssociateLocationid.
     * @return the value of AssociateLocationid
     */
    public String getAssociateLocationid() {
        return (String) getAttributeInternal(ASSOCIATELOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AssociateLocationid.
     * @param value value to set the AssociateLocationid
     */
    public void setAssociateLocationid(String value) {
        setAttributeInternal(ASSOCIATELOCATIONID, value);
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
    public RowIterator getInItemTransferNoteLines() {
        return (RowIterator) getAttributeInternal(INITEMTRANSFERNOTELINES);
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
     * @param stnnoseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer stnnoseq) {
        return new Key(new Object[] { stnnoseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        setERPSolPKColumnName("Stnnoseq");
        setERPSolPKSeqName("IN_ITEM_TRANSFER_NOTE_SEQ");
        setCompanyid(ERPSolGlobClassModel.doGetUserCompanyCode());
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setSendingstoreid(ERPSolGlobClassModel.doGetUserStoreCode());
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
           String pkValue=" initm_transfernote_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"','B','"+getSendingstoreid()+"',TO_DATE('"+getDateOfTransfer()+"','YYYY-MM-DD'))";
           System.out.println(pkValue + "RNOTENO pk value");
           String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
           populateAttributeAsChanged(STNNO, result);

        }          
        super.doDML(operation, e);
    }
}

