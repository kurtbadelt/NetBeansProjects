/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

/**
 *
 * @author kurtbadelt
 */
public class Invoice extends DataLayer {
    int invoiceID;
    String date;
    String time;
    String taxID;
    String fiscalAddress;
    Customer customer;
    double subTotal;
    double freightCost;
    double vat;
    double total;
    int productQTY;
    Product [] products;
    int payTypeID;
    String string;

    public Invoice(int invoiceID, String date, String time, String taxID, String fiscalAddress, Customer customer, double subTotal, double freightCost, double vat, double total, int productQTY, Product[] products, int payTypeID, String string) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.time = time;
        this.taxID = taxID;
        this.fiscalAddress = fiscalAddress;
        this.customer = customer;
        this.subTotal = subTotal;
        this.freightCost = freightCost;
        this.vat = vat;
        this.total = total;
        this.productQTY = productQTY;
        this.products = products;
        this.payTypeID = payTypeID;
        this.string = string;
    }
    
    
    
    
    
    /*
     * this method will define a printout of the invoice to pdf o a physical printer
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

    public double getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(double freightCost) {
        this.freightCost = freightCost;
    }

    public int getIdPayType() {
        return payTypeID;
    }

    public void setIdPayType(int idPayType) {
        this.payTypeID = idPayType;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
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

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }
    
    
            
}
