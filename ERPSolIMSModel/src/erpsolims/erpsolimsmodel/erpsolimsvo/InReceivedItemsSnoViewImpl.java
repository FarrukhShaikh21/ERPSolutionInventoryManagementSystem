package erpsolims.erpsolimsmodel.erpsolimsvo;

import erpsolims.erpsolimsmodel.erpsolimsvo.common.InReceivedItemsSnoView;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 17 14:22:26 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InReceivedItemsSnoViewImpl extends ViewObjectImpl implements InReceivedItemsSnoView {
    /**
     * This is the default constructor (do not remove).
     */
    public InReceivedItemsSnoViewImpl() {
    }
    public void doERPSolRemoveGRNBox() {
        try {
            //if selected box is null then exception will be handled
            String ERPSolBox = this.getCurrentRow().getAttribute("TempBoxNo").toString();
            this.setRangeSize(-1);

            for (int i = 0; i < this.getViewObject().getEstimatedRowCount(); i++) {
                try {//if row box no is null then system will move to next record in loop
                    if (getRowAtRangeIndex(i).getAttribute("TempBoxNo").toString().equals(ERPSolBox)) {
                        getRowAtRangeIndex(i).remove();
                        i--;
                    }
                } catch (Exception e) {
                    // TODO: Add catch code
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            // TODO: Add catch code
    //            e.printStackTrace();
        }

    }
}
