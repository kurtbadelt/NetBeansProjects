/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataBaseLayer;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import pos_pbs.DataLayer.AddressBook;
import pos_pbs.DataLayer.Customer;
import pos_pbs.DataLayer.DataLayer;
import pos_pbs.DataLayer.Opex;
import pos_pbs.DataLayer.Product;
import pos_pbs.DataLayer.User;
import pos_pbs.Util.Util;

/**
 *
 * @author kurtbadelt
 */
public class LocalDBDriver {

    String driverName = "com.mysql.jdbc.Driver";
    String serverName = "";
    String mydatabase = "";
    String url = "";
    String username = "";
    String password = "";
    Util util = new Util();
    Statement statement;
    Connection connection;

    /**
     * 
     */
    public void createConnection() {

        try {
            this.readValuesFromConfig();

            connection = DriverManager.getConnection(url.trim(), username.trim(), password.trim());


        } catch (Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_CreateConnection");

        }
    }

    public void readValuesFromConfig() {



        String filename = "LDBCnf";


        String data = util.readFromConfigFile(filename);
        String[] separatedData = util.separateByToken(data, ";");

        this.serverName = separatedData[0];
        this.mydatabase = separatedData[1];
        this.username = separatedData[2];
        this.password = separatedData[3];
        url = "jdbc:mysql://" + serverName + ":3306/" + mydatabase;

    }

    ////////////////////////////////-Inserts-////////////////////////////////////
    public void insertADataLayerObject(final DataLayer datalayer, String table) {
        try {

            statement = (Statement) this.connection.createStatement();
            this.statement.execute("insert into " + table + " values(" + datalayer.toDB() + ")");


        } catch (final Exception ex) {

            util.writeErrorToLog(ex, "LocalDBDriver_insertADataLayerObject->" + table);

        }
    }

    public void insertMultiValued(int id, String data, String table) {

        try {

            statement = (Statement) this.connection.createStatement();
            this.statement.execute("insert into " + table + " values(" + id + ",'" + data + "')");


        } catch (final Exception ex) {

            util.writeErrorToLog(ex, "LocalDBDriver_insertMultiValued->" + table);

        }

    }

    public void insertProductModel(int id, String data, int idBrand) {

        try {

            statement = (Statement) this.connection.createStatement();
            this.statement.execute("insert into  ProductModel values(" + id + ",'" + data + "'," + idBrand + ")");


        } catch (final Exception ex) {

            util.writeErrorToLog(ex, "LocalDBDriver_insertProductModel");

        }

    }

    public void insertUserType(int id, String data) {
        this.insertMultiValued(id, data, "UserType");
    }

    public void insertProductColor(int id, String data) {
        this.insertMultiValued(id, data, "ProductColor");
    }

    public void insertProductBrand(int id, String data) {
        this.insertMultiValued(id, data, "ProductBrand");
    }

    public void insertProductCategory(int id, String data) {
        this.insertMultiValued(id, data, "ProductCategory");
    }

    public void insertSystemStatus(int id, String data) {
        this.insertMultiValued(id, data, "SystemStatus");
    }

    public void insertProductVendor(int id, String data) {
        this.insertMultiValued(id, data, "ProductVendor");
    }

    public void insertProductCountryof(int id, String data) {
        this.insertMultiValued(id, data, "ProductCountryof");
    }

    public void insertProductUnitofMeasure(int id, String data) {
        this.insertMultiValued(id, data, "ProductUnitofMeasure");
    }

    public void insertOutboundCarrier(int id, String data) {
        this.insertMultiValued(id, data, "OutboundCarrier");
    }

    public void insertPayType(int id, String data) {
        this.insertMultiValued(id, data, "PayType");
    }

    public void insertShipmentStatus(int id, String data) {
        this.insertMultiValued(id, data, "ShipmentStatus");
    }

    public void insertInboundCarrier(int id, String data) {
        this.insertMultiValued(id, data, "InboundCarrier");
    }

    public void insertOpexTarget(int id, String data) {
        this.insertMultiValued(id, data, "OpexTarget");
    }

    public void insertOpexVendor(int id, String data) {
        this.insertMultiValued(id, data, "OpexVendor");
    }

    public void insertOpexCategory(int id, String data) {
        this.insertMultiValued(id, data, "OpexCategory");
    }

    public void insertOpexFunds(int id, String data) {
        this.insertMultiValued(id, data, "OpexFunds");
    }

    public void insertCustomer(Customer customer) {

        this.insertADataLayerObject(customer, "Customer");
    }

    public void insertAddressBook(AddressBook ab) {

        this.insertADataLayerObject(ab, "AddressBook");
    }

    public void insertOpex(Opex op) {
        this.insertADataLayerObject(op, "Opex");
    }

    public void insertProduct(Product pr) {
        this.insertADataLayerObject(pr, "Product");
    }

    public void insertUser(User usr) {
        this.insertADataLayerObject(usr, "User");
    }

///////////////////////////////////-Selects-////////////////////////////////////
    /**
     * 
     * @param userName
     * @return 
     */
    public ArrayList selectUserByUserName(String userName) {
        final ArrayList tmp = new ArrayList();

        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("select * from User where userName ='" + userName.trim() + "'");

            while (results.next()) {


                tmp.add(new User(results.getInt(1), results.getString(2), results.getString(3), results.getString(4), results.getString(5), results.getString(6), util.decryptString(results.getString(7)), results.getInt(8), results.getInt(9)));


            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_selectUserByUserName");

        }

        return tmp;
    }

    public ArrayList ShowTables() {
        final ArrayList tmp = new ArrayList();

        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("show tables;");

            while (results.next()) {
                String tmpString = results.getString(1);

                tmp.add(tmpString);

            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_ShowTables");

        }

        return tmp;
    }

    public String DescribeTable(String table) {
        String output = "";

        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("describe " + table);

            while (results.next()) {
                output += results.getString(1) + ";";



            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_DescribeTable");

        }

        return output;
    }

    public int coutnTableColumns(String table) {
        int count = 0;
        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("describe " + table);

            while (results.next()) {
                count++;



            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_CountTableColumns");

        }
        return count;
    }

    public int coutnTableRows(String table) {
        int count = 0;
        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("SELECT COUNT(*) FROM " + table);

            while (results.next()) {
                count = results.getInt(1);



            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_CountTableColumns");

        }
        return count;
    }

    public String[] selectAllFromTable(String table) {
        int rowCount = this.coutnTableRows(table);
        String[] output = new String[rowCount];



        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("select * from " + table);
            int coulumCount = this.coutnTableColumns(table);


            for (int j = 0; j < rowCount; j++) {
                if(results.next()){
                for (int i = 1; i <= coulumCount; i++) {
                   
                    if(i==1){
                        int tmp = results.getInt(1);
                        output[j] =  tmp+ ";";
                        
                    
                    }else{
                        String tmp = results.getString(i);
                        output[j] +=  tmp+ ";";
                        
                    }
                  


                }
            }

            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_selectAllFromTable->" + table);


        }

        return output;
    }

    /**
     * returns the data in  a given table
     * concatenates the id + / + description
     * 
     * to be used with the multi valuated
     * @param DB
     * @return 
     */
    public ArrayList selectAllFrom(String table) {
        final ArrayList tmp = new ArrayList();

        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("select * from " + table);

            while (results.next()) {
                String tmpString = results.getInt(1) + "/" + results.getString(2);

                tmp.add(tmpString);

            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_selectAllFrom->" + table);

        }

        return tmp;
    }

    public ArrayList selectAllUserType() {
        ArrayList output = this.selectAllFrom("UserType");
        return output;
    }

    public ArrayList selectAllSystemStatus() {
        ArrayList output = this.selectAllFrom("SystemStatus");
        return output;
    }

    public ArrayList selectAllOutboundCarrier() {
        ArrayList output = this.selectAllFrom("OutboundCarrier");
        return output;
    }

    public ArrayList selectAllPayType() {
        ArrayList output = this.selectAllFrom("PayType");
        return output;
    }

    public ArrayList selectAllProductColor() {
        ArrayList output = this.selectAllFrom("ProductColor");
        return output;
    }

    public ArrayList selectAllProductCategory() {
        ArrayList output = this.selectAllFrom("ProductCategory");
        return output;
    }

    public ArrayList selectAllProductUnitofMeasure() {
        ArrayList output = this.selectAllFrom("ProductUnitofMeasure");
        return output;
    }

    public ArrayList selectAllShipmentStatus() {
        ArrayList output = this.selectAllFrom("ShipmentStatus");
        return output;
    }

    public ArrayList selectAllInboundCarrier() {
        ArrayList output = this.selectAllFrom("InboundCarrier");
        return output;
    }

    public ArrayList selectAllOpexTarget() {
        ArrayList output = this.selectAllFrom("OpexTarget");
        return output;
    }

    public ArrayList selectAllOpexVendor() {
        ArrayList output = this.selectAllFrom("OpexVendor");
        return output;
    }

    public ArrayList selectAllOpexCategory() {
        ArrayList output = this.selectAllFrom("OpexCategory");
        return output;
    }

    public ArrayList selectAllOpexFunds() {
        ArrayList output = this.selectAllFrom("OpexFunds");
        return output;
    }

    public ArrayList selectAllProductBrand() {
        ArrayList output = this.selectAllFrom("ProductBrand");
        return output;
    }

    public ArrayList selectAllProductVendor() {
        ArrayList output = this.selectAllFrom("ProductVendor");
        return output;
    }

    public ArrayList selectAllProductCountryOf() {
        ArrayList output = this.selectAllFrom("ProductCountryof");
        return output;
    }

    public ArrayList selectProductModelByProductBrand(int productBrandID) {
        final ArrayList tmp = new ArrayList();

        try {
            statement = (Statement) this.connection.createStatement();
            final ResultSet results = statement.executeQuery("select * from ProductModel where ProductModel.ProductBrandID = " + productBrandID);

            while (results.next()) {
                String tmpString = results.getInt(1) + "/" + results.getString(2);

                tmp.add(tmpString);

            }

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_selectProductModelByProductBrand");

        }

        return tmp;
    }
    ///////////////////////////////-Updates-////////////////////////////////////

    public void updateString(final String table, final String field, final String value, final String key, final int id) {
        try {
            statement = (Statement) this.connection.createStatement();
            statement.execute("update " + table + " set " + field + " = '"
                    + value + "' where " + key + " = " + id);


        } catch (final Exception ex) {

            util.writeErrorToLog(ex, "LocalDBDriver_UpdateString_" + table + "-" + field + "-" + value + "-" + key);
        }
    }

    public void updateInt(final String table, final String field, final int value, final String key, final int id) {
        try {
            statement = (Statement) this.connection.createStatement();
            statement.execute("update " + table + " set " + field + " = "
                    + value + " where " + key + " = " + id);

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_UpdateInt_" + table + "-" + field + "-" + value + "-" + key);
        }
    }

    public void updateString(final String table, final String field, final String value, final String key, final String id) {
        try {
            statement = (Statement) this.connection.createStatement();
            statement.execute("update " + table + " set " + field + " = '"
                    + value + "' where " + key + " = '" + id + "'");

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_UpdateString_" + table + "-" + field + "-" + value + "-" + key);
        }
    }

    public void updateInt(final String table, final String field, final int value, final String key, final String id) {
        try {
            statement = (Statement) this.connection.createStatement();
            statement.execute("update " + table + " set " + field + " = "
                    + value + " where " + key + " = '" + id + "'");

        } catch (final Exception ex) {
            util.writeErrorToLog(ex, "LocalDBDriver_UpdateInt_" + table + "-" + field + "-" + value + "-" + key);
        }
    }

    /**
     * 	public void updateUser(int UserID,String UserName,String Profile,String Password,String SystemStatus){
    this.updateString("user", "UserName", UserName, "USerID", UserID);
    this.updateString("user", "Profile", Profile, "USerID", UserID);
    this.updateString("user", "Password", Password, "USerID", UserID);
    this.updateString("user", "SystemStatus", SystemStatus, "USerID", UserID);
    
    
    
    } 
    
     */
    public void updateUser(User user) {
        this.updateString("User", "firstName", user.getFirstName(), "UserID", user.getUserID());
        this.updateString("User", "lastName", user.getLastName(), "UserID", user.getUserID());
        this.updateString("User", "phone", user.getPhone(), "UserID", user.getUserID());
        this.updateString("User", "email", user.getEmail(), "UserID", user.getUserID());
        this.updateString("User", "userName", user.getUserName(), "UserID", user.getUserID());
        this.updateString("User", "password", user.getPassword(), "UserID", user.getUserID());
        this.updateInt("User", "userTypeID", user.getUserTypeID(), "UserID", user.getUserID());
        this.updateInt("User", "systemStatusID", user.getStatusID(), "UserID", user.getUserID());
    }

    public void updateProductColor(int id, String data) {
        this.updateString("ProductColor", "field", data, "key", id);

    }

    public void updateProductBrand(int id, String data) {
        this.updateString("ProductBrand", "field", data, "key", id);

    }

    public void updateProductCategory(int id, String data) {
        this.updateString("ProductCategory", "field", data, "key", id);

    }

    public void updateProductUnitofMeasure(int id, String data) {
        this.updateString("ProductUnitofMeasure", "productUnitofMeasuer", data, "productUnitofMeasuerID", id);

    }

    public void updateUserType(int id, String data) {
        this.updateString("ProductUserType", "userType", data, "userTypeID", id);

    }

    public void updateSystemStatus(int id, String data) {
        this.updateString("SystemStatus", "systemStatus", data, "systemStatusID", id);

    }

    public void updateProductVendor(int id, String data) {
        this.updateString("ProductVendor", "productVendor", data, "productVendorID", id);

    }

    public void updateProductCountryof(int id, String data) {
        this.updateString("ProductCountryof", "productCountryOf", data, "productCountryOfID", id);

    }

    public void updateOutboundCarrier(int id, String data) {
        this.updateString("OutboundCarrier", "outboundCarrier", data, "outboundCarrierID", id);

    }

    public void updateShipmentStatus(int id, String data) {
        this.updateString("ShipmentStatus", "shipmentStatus", data, "shipmentStatusID", id);

    }

    public void updateInboundCarrier(int id, String data) {
        this.updateString("InboundCarrier", "inboundCarrier", data, "inboundCarrierID", id);

    }

    public void updatePayType(int id, String data) {
        this.updateString("PayType", "payType", data, "payTypeID", id);

    }

    public void updateOpexTarget(int id, String data) {
        this.updateString("OpexTarget", "opexTarget", data, "opexTargetID", id);

    }

    public void updateOpexvendor(int id, String data) {
        this.updateString("OpexVendor", "opexVendor", data, "opexVendorID", id);

    }

    public void updateOpexCategory(int id, String data) {
        this.updateString("OpexCategory", "opexCategory", data, "opexCategoryID", id);

    }

    public void updateOpexFunds(int id, String data) {
        this.updateString("OpexFunds", "opexFunds", data, "opexFundsID", id);

    }
}
