/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

/**
 *
 * @author kurtbadelt
 */
public class Opex extends DataLayer {
    int opexID;
    int opexCategoryID;
    int opexVendorID;
    int opexTargetID;
    int opexFundsID;
    double subTotal;
    double VAT;
    double total;

    public Opex(int opexID, int opexCategoryID, int opexVendorID, int opexTargetID, int opexFundsID, double subTotal, double VAT, double total) {
        this.opexID = opexID;
        this.opexCategoryID = opexCategoryID;
        this.opexVendorID = opexVendorID;
        this.opexTargetID = opexTargetID;
        this.opexFundsID = opexFundsID;
        this.subTotal = subTotal;
        this.VAT = VAT;
        this.total = total;
    }
    
    public Opex(){
    
    }

    public String toDB(){
        String output ="";
        output+= this.getOpexID()+","+this.getOpexCategoryID()+","+this.getOpexVendorID()+","+this.getOpexTargetID()+","+this.getOpexFundsID()+","+this.getSubTotal()+","+this.getVAT()+","+this.getTotal();
        return output;
    }
    
        public String toString(){
        String output ="";
        output+= this.getOpexID()+";"+this.getOpexCategoryID()+";"+this.getOpexVendorID()+";"+this.getOpexTargetID()+";"+this.getOpexFundsID()+";"+this.getSubTotal()+";"+this.getVAT()+";"+this.getTotal();
        return output;
    }
    
    
    
    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public int getOpexCategoryID() {
        return opexCategoryID;
    }

    public void setOpexCategoryID(int opexCategoryID) {
        this.opexCategoryID = opexCategoryID;
    }

    public int getOpexFundsID() {
        return opexFundsID;
    }

    public void setOpexFundsID(int opexFundsID) {
        this.opexFundsID = opexFundsID;
    }

    public int getOpexID() {
        return opexID;
    }

    public void setOpexID(int opexID) {
        this.opexID = opexID;
    }

    public int getOpexTargetID() {
        return opexTargetID;
    }

    public void setOpexTargetID(int opexTargetID) {
        this.opexTargetID = opexTargetID;
    }

    public int getOpexVendorID() {
        return opexVendorID;
    }

    public void setOpexVendorID(int opexVendorID) {
        this.opexVendorID = opexVendorID;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
