/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

/**
 *
 * @author kurtbadelt
 */
public class Product extends DataLayer {

    int productID;
    String barcode;
    int brandID;
    int modelID;
    int colorID;
    String serialNumber;
    double cost;
    double weight;
    int categoryID;
    int measurementUnitID;
    String image;
    int countryOfID;
    int vendorID;
    int statusID;
    String Description;
    String Headers="Product ID; Barcode;Brand;Model;Color;Serial Number;Cost;Weight;Category;Measurement Unit;Image;Country of Origin;Vendor;Status;Description";//provides de headers to be used to write to tables and to excel (replacing vector)
    int numberOfPedimento;
    
    public Product(){
    
    }

    public Product(int productID, String barcode, int brandID, int modelID, int colorID, String serialNumber, double cost, double weight, int categoryID, int measurementUnitID, String image, int countryOfID, int vendorID, int statusID, String Description, int numberOfPedimento) {
        this.productID = productID;
        this.barcode = barcode;
        this.brandID = brandID;
        this.modelID = modelID;
        this.colorID = colorID;
        this.serialNumber = serialNumber;
        this.cost = cost;
        this.weight = weight;
        this.categoryID = categoryID;
        this.measurementUnitID = measurementUnitID;
        this.image = image;
        this.countryOfID = countryOfID;
        this.vendorID = vendorID;
        this.statusID = statusID;
        this.Description = Description;
        this.numberOfPedimento = numberOfPedimento;
    }


    
 
    
    @Override
    public String toString() {
        String output = "";
        output = this.getProductID() + ";" + this.getBarcode() + ";" + this.getBrandID() + ";" + this.getModelID() + ";" + this.getColorID() + ";" + this.getSerialNumber() + ";" + this.getCost() + ";" + this.getWeight() + ";" + this.getCategoryID() + ";" + this.getMeasurementUnitID()
                + ";" + this.getImage() + ";"
                + this.getCountryOfID() + ";" + this.getVendorID() + ";" + this.getStatusID()+";"+this.getNumberOfPedimento();
        return output;
    }

    @Override
    public String toDB() {
        String output = "";
        output = this.getProductID() + ",'" + this.getBarcode() + "'," + this.getBrandID() + "," + this.getModelID() + "," + this.getColorID() + ",'" + this.getSerialNumber() + "'," + this.getCost() + "," + this.getWeight() + "," + this.getCategoryID()
                + "," + this.getMeasurementUnitID() + ",'" + this.getImage() + "',"
                + this.getCountryOfID() + "," + this.getVendorID() + "," + this.getStatusID()+",'"+this.getDescription()+"',"+this.getNumberOfPedimento()+";";
        return output;
    }

    public int getNumberOfPedimento() {
        return numberOfPedimento;
    }

    public void setNumberOfPedimento(int numberOfPedimento) {
        this.numberOfPedimento = numberOfPedimento;
    }
    
    
    public String getDescription(){
        //replace the ids with the real data by doing a query to the db
        
       this.Description+= this.getBrandID()+";"+this.getModelID()+";"+this.getColorID()+";"+this.getCategoryID()+";"+this.getSerialNumber();
       
      
        return this.Description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int IDProduct) {
        this.productID = IDProduct;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCountryOfID() {
        return countryOfID;
    }

    public void setCountryOfID(int countryOfID) {
        this.countryOfID = countryOfID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMeasurementUnitID() {
        return measurementUnitID;
    }

    public void setMeasurementUnitID(int measurementUnitID) {
        this.measurementUnitID = measurementUnitID;
    }

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
