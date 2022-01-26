package erpsolims.erpsolimsmodel.erpsolimseo;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 25 17:50:29 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InItemTransferNoteImeiImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TransferNoteImeiSno,
        Stnnoseq,
        LineNo,
        ItemId,
        ItemRefId,
        ImeiNo,
        BoxNo,
        TempBoxNo,
        CompanyCode,
        Stnlineseq,
        InItemTransferNoteLines;
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


    public static final int TRANSFERNOTEIMEISNO = AttributesEnum.TransferNoteImeiSno.index();
    public static final int STNNOSEQ = AttributesEnum.Stnnoseq.index();
    public static final int LINENO = AttributesEnum.LineNo.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int ITEMREFID = AttributesEnum.ItemRefId.index();
    public static final int IMEINO = AttributesEnum.ImeiNo.index();
    public static final int BOXNO = AttributesEnum.BoxNo.index();
    public static final int TEMPBOXNO = AttributesEnum.TempBoxNo.index();
    public static final int COMPANYCODE = AttributesEnum.CompanyCode.index();
    public static final int STNLINESEQ = AttributesEnum.Stnlineseq.index();
    public static final int INITEMTRANSFERNOTELINES = AttributesEnum.InItemTransferNoteLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InItemTransferNoteImeiImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolims.erpsolimsmodel.erpsolimseo.InItemTransferNoteImei");
    }


    /**
     * Gets the attribute value for TransferNoteImeiSno, using the alias name TransferNoteImeiSno.
     * @return the value of TransferNoteImeiSno
     */
    public Long getTransferNoteImeiSno() {
        return (Long) getAttributeInternal(TRANSFERNOTEIMEISNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransferNoteImeiSno.
     * @param value value to set the TransferNoteImeiSno
     */
    public void setTransferNoteImeiSno(Long value) {
        setAttributeInternal(TRANSFERNOTEIMEISNO, value);
    }

    /**
     * Gets the attribute value for Stnnoseq, using the alias name Stnnoseq.
     * @return the value of Stnnoseq
     */
    public BigDecimal getStnnoseq() {
        return (BigDecimal) getAttributeInternal(STNNOSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Stnnoseq.
     * @param value value to set the Stnnoseq
     */
    public void setStnnoseq(BigDecimal value) {
        setAttributeInternal(STNNOSEQ, value);
    }

    /**
     * Gets the attribute value for LineNo, using the alias name LineNo.
     * @return the value of LineNo
     */
    public Integer getLineNo() {
        return (Integer) getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineNo.
     * @param value value to set the LineNo
     */
    public void setLineNo(Integer value) {
        setAttributeInternal(LINENO, value);
    }

    /**
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the value of ItemId
     */
    public String getItemId() {
        return (String) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(String value) {
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
     * Gets the attribute value for ImeiNo, using the alias name ImeiNo.
     * @return the value of ImeiNo
     */
    public String getImeiNo() {
        return (String) getAttributeInternal(IMEINO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ImeiNo.
     * @param value value to set the ImeiNo
     */
    public void setImeiNo(String value) {
        setAttributeInternal(IMEINO, value);
    }

    /**
     * Gets the attribute value for BoxNo, using the alias name BoxNo.
     * @return the value of BoxNo
     */
    public String getBoxNo() {
        return (String) getAttributeInternal(BOXNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BoxNo.
     * @param value value to set the BoxNo
     */
    public void setBoxNo(String value) {
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
     * Gets the attribute value for Stnlineseq, using the alias name Stnlineseq.
     * @return the value of Stnlineseq
     */
    public BigDecimal getStnlineseq() {
        return (BigDecimal) getAttributeInternal(STNLINESEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Stnlineseq.
     * @param value value to set the Stnlineseq
     */
    public void setStnlineseq(BigDecimal value) {
        setAttributeInternal(STNLINESEQ, value);
    }

    /**
     * @return the associated entity InItemTransferNoteLinesImpl.
     */
    public InItemTransferNoteLinesImpl getInItemTransferNoteLines() {
        return (InItemTransferNoteLinesImpl) getAttributeInternal(INITEMTRANSFERNOTELINES);
    }

    /**
     * Sets <code>value</code> as the associated entity InItemTransferNoteLinesImpl.
     */
    public void setInItemTransferNoteLines(InItemTransferNoteLinesImpl value) {
        setAttributeInternal(INITEMTRANSFERNOTELINES, value);
    }


    /**
     * @param transferNoteImeiSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long transferNoteImeiSno) {
        return new Key(new Object[] { transferNoteImeiSno });
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
        if (operation==DML_DELETE) {
            CallableStatement cs=null;
            String ERPsolPLSQL="begin update item_imei_info set is_available='Y' ";
            ERPsolPLSQL+=" where IMEI="+getImeiNo()+"; end;";
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

