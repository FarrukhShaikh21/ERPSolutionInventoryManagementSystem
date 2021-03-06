package erpsolims.erpsolimsmodel.erpsolimseo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 10 12:25:15 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InReceivedItemsSnoImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Storeid,
        Rnoteno,
        Lineno,
        Shelfid,
        SerialNo,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        StatusFlag,
        RecvItemSeqno,
        Itemid,
        ItemRefId,
        ValidateFlag,
        Boxno,
        TempBoxNo,
        CompanyCode,
        Rnotedetailseq,
        InReceivedItemsLines;
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
    public static final int SHELFID = AttributesEnum.Shelfid.index();
    public static final int SERIALNO = AttributesEnum.SerialNo.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int STATUSFLAG = AttributesEnum.StatusFlag.index();
    public static final int RECVITEMSEQNO = AttributesEnum.RecvItemSeqno.index();
    public static final int ITEMID = AttributesEnum.Itemid.index();
    public static final int ITEMREFID = AttributesEnum.ItemRefId.index();
    public static final int VALIDATEFLAG = AttributesEnum.ValidateFlag.index();
    public static final int BOXNO = AttributesEnum.Boxno.index();
    public static final int TEMPBOXNO = AttributesEnum.TempBoxNo.index();
    public static final int COMPANYCODE = AttributesEnum.CompanyCode.index();
    public static final int RNOTEDETAILSEQ = AttributesEnum.Rnotedetailseq.index();
    public static final int INRECEIVEDITEMSLINES = AttributesEnum.InReceivedItemsLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InReceivedItemsSnoImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolims.erpsolimsmodel.erpsolimseo.InReceivedItemsSno");
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
     * Gets the attribute value for Shelfid, using the alias name Shelfid.
     * @return the value of Shelfid
     */
    public String getShelfid() {
        return (String) getAttributeInternal(SHELFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shelfid.
     * @param value value to set the Shelfid
     */
    public void setShelfid(String value) {
        setAttributeInternal(SHELFID, value);
    }

    /**
     * Gets the attribute value for SerialNo, using the alias name SerialNo.
     * @return the value of SerialNo
     */
    public String getSerialNo() {
        return (String) getAttributeInternal(SERIALNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SerialNo.
     * @param value value to set the SerialNo
     */
    public void setSerialNo(String value) {
        setAttributeInternal(SERIALNO, value);
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
     * Gets the attribute value for StatusFlag, using the alias name StatusFlag.
     * @return the value of StatusFlag
     */
    public String getStatusFlag() {
        return (String) getAttributeInternal(STATUSFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for StatusFlag.
     * @param value value to set the StatusFlag
     */
    public void setStatusFlag(String value) {
        setAttributeInternal(STATUSFLAG, value);
    }

    /**
     * Gets the attribute value for RecvItemSeqno, using the alias name RecvItemSeqno.
     * @return the value of RecvItemSeqno
     */
    public Integer getRecvItemSeqno() {
        return (Integer) getAttributeInternal(RECVITEMSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecvItemSeqno.
     * @param value value to set the RecvItemSeqno
     */
    public void setRecvItemSeqno(Integer value) {
        setAttributeInternal(RECVITEMSEQNO, value);
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
     * Gets the attribute value for ValidateFlag, using the alias name ValidateFlag.
     * @return the value of ValidateFlag
     */
    public String getValidateFlag() {
        return (String) getAttributeInternal(VALIDATEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ValidateFlag.
     * @param value value to set the ValidateFlag
     */
    public void setValidateFlag(String value) {
        setAttributeInternal(VALIDATEFLAG, value);
    }

    /**
     * Gets the attribute value for Boxno, using the alias name Boxno.
     * @return the value of Boxno
     */
    public String getBoxno() {
        return (String) getAttributeInternal(BOXNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Boxno.
     * @param value value to set the Boxno
     */
    public void setBoxno(String value) {
        setAttributeInternal(BOXNO, value);
    }

    /**
     * Gets the attribute value for TempBoxNo, using the alias name TempBoxNo.
     * @return the value of TempBoxNo
     */
    public String getTempBoxNo() {
        return (String) getAttributeInternal(TEMPBOXNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TempBoxNo.
     * @param value value to set the TempBoxNo
     */
    public void setTempBoxNo(String value) {
        setAttributeInternal(TEMPBOXNO, value);
    }

    /**
     * Gets the attribute value for CompanyCode, using the alias name CompanyCode.
     * @return the value of CompanyCode
     */
    public String getCompanyCode() {
        return (String) getAttributeInternal(COMPANYCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyCode.
     * @param value value to set the CompanyCode
     */
    public void setCompanyCode(String value) {
        setAttributeInternal(COMPANYCODE, value);
    }

    /**
     * Gets the attribute value for Rnotedetailseq, using the alias name Rnotedetailseq.
     * @return the value of Rnotedetailseq
     */
    public Integer getRnotedetailseq() {
        return (Integer) getAttributeInternal(RNOTEDETAILSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rnotedetailseq.
     * @param value value to set the Rnotedetailseq
     */
    public void setRnotedetailseq(Integer value) {
        setAttributeInternal(RNOTEDETAILSEQ, value);
    }


    /**
     * @return the associated entity InReceivedItemsLinesImpl.
     */
    public InReceivedItemsLinesImpl getInReceivedItemsLines() {
        return (InReceivedItemsLinesImpl) getAttributeInternal(INRECEIVEDITEMSLINES);
    }

    /**
     * Sets <code>value</code> as the associated entity InReceivedItemsLinesImpl.
     */
    public void setInReceivedItemsLines(InReceivedItemsLinesImpl value) {
        setAttributeInternal(INRECEIVEDITEMSLINES, value);
    }


    /**
     * @param recvItemSeqno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer recvItemSeqno) {
        return new Key(new Object[] { recvItemSeqno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKSeqName("IN_RECEIVED_ITEMS_SNO_SEQ");
        setERPSolPKColumnName("RecvItemSeqno");
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
            populateAttributeAsChanged(STOREID, getInReceivedItemsLines().getAttribute("Storeid"));
            populateAttributeAsChanged(LINENO, getInReceivedItemsLines().getAttribute("Lineno"));
            populateAttributeAsChanged(ITEMID, getInReceivedItemsLines().getAttribute("Itemid"));
            populateAttributeAsChanged(ITEMREFID, getInReceivedItemsLines().getAttribute("ItemRefId"));
            populateAttributeAsChanged(SHELFID, "01");
            populateAttributeAsChanged(RNOTENO, getInReceivedItemsLines().getAttribute("Rnoteno"));
               
        }
        
        if (operation!=DML_DELETE) {
           CallableStatement cs=null;
           String ERPsolPLSQL="begin update item_imei_info set is_available='"+(operation==3?"N":"Y")+"', STOREID='"+getStoreid()+"'";
           ERPsolPLSQL+=" where IMEI="+getSerialNo()+"; end;";
           System.out.println(ERPsolPLSQL);
           cs=getDBTransaction().createCallableStatement(ERPsolPLSQL, getDBTransaction().DEFAULT);
           try {
               cs.executeUpdate();
           } catch (SQLException f) {
           }
           finally{
               try {
                   cs.close();
               } catch (SQLException f) {
               }
           } 
       }        

        super.doDML(operation, e);
    }
}

