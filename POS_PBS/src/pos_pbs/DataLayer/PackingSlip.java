/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

import pos_pbs.DataLayer.Product;

/**
 *
 * @author kurtbadelt
 */
public class PackingSlip extends DataLayer {
    
    int packingSlipID;
    String date;
    String time;
    String taxID;
    String fiscalAddress;
    Customer customer;
    int productQTY;
    Product [] products;
    int payTypeID;
   
    
    
    public PackingSlip(Invoice invoice){
        this.setDate(invoice.getDate());
        this.setTime(invoice.getTime());
        this.setTaxID(invoice.getTaxID());
        this.setFiscalAddress(invoice.getFiscalAddress());
        this.setCustomer(invoice.getCustomer());
        this.setProductQTY(invoice.getProductQTY());
        this.setProducts(invoice.getProducts());
        this.setIdPayType(invoice.getIdPayType());
        
    }

    public PackingSlip(int packingSlipID, String date, String time, String taxID, String fiscalAddress, Customer customer, int productQTY, Product[] products, int payTypeID) {
        this.packingSlipID = packingSlipID;
        this.date = date;
        this.time = time;
        this.taxID = taxID;
        this.fiscalAddress = fiscalAddress;
        this.customer = customer;
        this.productQTY = productQTY;
        this.products = products;
        this.payTypeID = payTypeID;
    }
    
    
    
       /*
     * this method will define a printout of the packing Slip to pdf o a physical printer
     */
    public void toPrinter(){
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFiscalAddress() {
        return fiscalAddress;
    }

    public void setFiscalAddress(String fiscalAddress) {
        this.fiscalAddress = fiscalAddress;
    }

    public int getIdPayType() {
        return payTypeID;
    }

    public void setIdPayType(int idPayType) {
        this.payTypeID = idPayType;
    }

    public int getPackingSlipID() {
        return packingSlipID;
    }

    public void setPackingSlipID(int invoiceID) {
        this.packingSlipID = invoiceID;
    }

    public int getProductQTY() {
        return productQTY;
    }

    public void setProductQTY(int productQTY) {
        this.productQTY = productQTY;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }



    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    
}
