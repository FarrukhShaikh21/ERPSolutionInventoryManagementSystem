package erpsolims.erpsolimsmodel.erpsolimsqvo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import erpsolims.erpsolimsmodel.erpsolimsqvo.common.VwInInventoryReportQVO;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 25 14:07:00 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VwInInventoryReportQVOImpl extends ViewObjectImpl implements VwInInventoryReportQVO {
    /**
     * This is the default constructor (do not remove).
     */
    public VwInInventoryReportQVOImpl() {
    }
    public void doSetInventoryReportDefaults() {
        ViewObject vo=getApplicationModule().findViewObject("QvoLImsoc");
              if (vo!=null) {
                  vo.remove();
             }
              vo=getApplicationModule().createViewObjectFromQueryStmt("QvoLImsoc", "select locationid, location_description from all_locations where locationid='"+ERPSolGlobClassModel.doGetUserLocationCode()+"'");
              vo.executeQuery();
              this.first().setAttribute("Locationid", vo.first().getAttribute(0));
              this.first().setAttribute("txtLocationName", vo.first().getAttribute(1));
              this.first().setAttribute("Companyid", ERPSolGlobClassModel.doGetUserCompanyCode());
              this.first().setAttribute("txtFromDate", this.first().getAttribute("txtDefaultDate"));
              this.first().setAttribute("txtToDate", this.first().getAttribute("txtDefaultDate"));
              vo.remove();
    }
    
    public void doExecuteStockAgingProcedure() {
    //Locationid
//        System.out.println("begin ?:=PKG_GRN.FUNC_RUN_STOCK_AGING('"+this.getCurrentRow().getAttribute("txtFromDate")+"',0); END;");
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_GRN.FUNC_RUN_STOCK_AGING(TO_DATE('"+this.getCurrentRow().getAttribute("txtFromDate")+"','YYYY-MM-DD'),0); END;", 1);
        try {
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            
            if (!cs.getString(1).equals("ERPSOLSUCCESS")) {
        //               this.getCurrentRow().setAttribute("Submit", "N");
               this.getDBTransaction().commit();
                throw new JboException("Unable to supervise due to "+cs.getString(1));
           }
            this.getDBTransaction().commit();
        } catch (SQLException e) {
        //            this.getCurrentRow().setAttribute("Submit", "N");
            this.getDBTransaction().commit();
            System.out.println(e.getMessage()+ "this is message");
            throw new JboException("Unable to supervise ");
        }
        finally{
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }

    }

}

