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
public class InboundShipment extends DataLayer {
    int inboundShipmentID;
    int numberOfPedimento;
    int vendorID;
    int countryOfID;
    String waybill;
    int carrierID;
    int shipmentStatusID; //Complete or incomplete, in case that something got missing in the inbound process
    double importCost;
    double importTax;
    double freightCost;
    int productQTY;
    double costOfGoods;
    String proformaInvoiceNumber;
    int statusID;//Active or Inactive, inactive = deleted (there is no delete from database)
    int missingGoodsQTY;
    Product [] products;
    String Headers="Pedimento Number;Vendor;Country of Origin;Waybill;Carrier;Shipment Status;Import Cost;Import TAX;Freight Cost;Product QTY;Cost of Goods;Proforma Invoice;Status ID;QTY of Missing Goods;Product";//provides de headers to be used to write to tables and to excel (replacing vector)
    
   
    
    
    public InboundShipment(int productQYT){
        this.setProductQTY(productQTY);
        this.products = new Product [this.getProductQTY()];
                
    }

    public InboundShipment(int inboundShipmentID, int numberOfPedimento, int vendorID, int countryOfID, String waybill, int carrierID, int shipmentStatusID, double importCost, double importTax, double freightCost, int productQTY, double costOfGoods, String proformaInvoiceNumber, int statusID, int missingGoodsQTY, Product[] products) {
        this.inboundShipmentID = inboundShipmentID;
        this.numberOfPedimento = numberOfPedimento;
        this.vendorID = vendorID;
        this.countryOfID = countryOfID;
        this.waybill = waybill;
        this.carrierID = carrierID;
        this.shipmentStatusID = shipmentStatusID;
        this.importCost = importCost;
        this.importTax = importTax;
        this.freightCost = freightCost;
        this.productQTY = productQTY;
        this.costOfGoods = costOfGoods;
        this.proformaInvoiceNumber = proformaInvoiceNumber;
        this.statusID = statusID;
        this.missingGoodsQTY = missingGoodsQTY;
        this.products = products;
    }
    
    
    
    @Override
    public String toString(){
    String output="";
    output+=this.getNumberOfPedimento()+";"+this.getVendorID()+";"+this.getCountryOfID()+";"+this.getWaybill()+";"+this.getCarrierID()+";"+this.getShipmentStatusID()+";"+this.getImportCost()+";"+this.getImportTax()+
            ";"+this.getFreightCost()+";"+this.getProductQTY()+";"+this.getCostOfGoods()+";"+this.getProformaInvoiceNumber()+";"+this.getStatusID()+";"+this.getMissingGoodsQTY()+";";
    for(int i=0;i<this.getProductQTY();i++){
        output+=this.products[i].getProductID()+";";
    }
    return output;
    }
    /*
     * in order to insert to db, there must be some work done
     * there is going to be a line per each product, inserting the product id???
     */
    @Override
    public String toDB(){
    String output="";
    output+=this.getNumberOfPedimento()+","+this.getVendorID()+","+this.getCountryOfID()+",'"+this.getWaybill()+"',"+this.getCarrierID()+","+this.getShipmentStatusID()+","+this.getImportCost()+","+this.getImportTax()+
            ","+this.getFreightCost()+","+this.getProductQTY()+","+this.getCostOfGoods()+",'"+this.getProformaInvoiceNumber()+"',"+this.getStatusID()+","+this.getMissingGoodsQTY()+",";
    for(int i=0;i<this.getProductQTY();i++){
        output+=this.products[i].getProductID()+";";
    }
    return output;
    }

    public String getHeaders() {
        return Headers;
    }

    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    public int getInboundShipmentID() {
        return inboundShipmentID;
    }

    public void setInboundShipmentID(int inboundShipmentID) {
        this.inboundShipmentID = inboundShipmentID;
    }
    
    

    public int getCarrierID() {
        return carrierID;
    }

    public void setCarrierID(int carrierID) {
        this.carrierID = carrierID;
    }

    public double getCostOfGoods() {
        return costOfGoods;
    }

    public void setCostOfGoods(double costOfGoods) {
        this.costOfGoods = costOfGoods;
    }

    public int getCountryOfID() {
        return countryOfID;
    }

    public void setCountryOfID(int countryOfID) {
        this.countryOfID = countryOfID;
    }

    public double getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(double freightCost) {
        this.freightCost = freightCost;
    }

    public double getImportCost() {
        return importCost;
    }

    public void setImportCost(double importCost) {
        this.importCost = importCost;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    public int getMissingGoodsQTY() {
        return missingGoodsQTY;
    }

    public void setMissingGoodsQTY(int missingGoodsQTY) {
        this.missingGoodsQTY = missingGoodsQTY;
    }

    public int getNumberOfPedimento() {
        return numberOfPedimento;
    }

    public void setNumberOfPedimento(int numberOfPedimento) {
        this.numberOfPedimento = numberOfPedimento;
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

    public String getProformaInvoiceNumber() {
        return proformaInvoiceNumber;
    }

    public void setProformaInvoiceNumber(String proformaInvoiceNumber) {
        this.proformaInvoiceNumber = proformaInvoiceNumber;
    }

    public int getShipmentStatusID() {
        return shipmentStatusID;
    }

    public void setShipmentStatusID(int shipmentStatusID) {
        this.shipmentStatusID = shipmentStatusID;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public String getWaybill() {
        return waybill;
    }

    public void setWaybill(String waybill) {
        this.waybill = waybill;
    }

    
}
