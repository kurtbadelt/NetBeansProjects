/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

import pos_pbs.Util.Util;

/**
 *
 * @author kurtbadelt
 */
public class User extends DataLayer {

    private int userID;
    String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String userName;
    protected String password;
    private int userTypeID;
    private int statusID;
    String Headers = "User ID;First Name;Last Name;Telephone Number;email;User Name;PassWord;User Type;Status";//provides de headers to be used to write to tables and to excel (replacing vector)
    Util util = new Util();
    
    
    public User(){
    }
    
    public User(int userID, String firstName, String lastName, String phone, String email, String userName, String password, int userTypeID, int statusID) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.userTypeID = userTypeID;
        this.statusID = statusID;

    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String toString() {
        String output = "";
        output += this.getUserID() + ";" + this.getFirstName() + ";" + this.getLastName() + ";" + this.getPhone() + ";" + this.getEmail() + ";" + this.getUserName() + ";" + this.getPassword() + ";" + this.getUserTypeID() + ";" + this.getStatusID();
        return output;

    }

    public String toDB() {
        String output = "";
        output += this.getUserID() + ",'" + this.getFirstName() + "','" + this.getLastName() + "','" + this.getPhone() + "','" + this.getEmail() + "','" + this.getUserName() + "','" + this.getPassword() + "'," + this.getUserTypeID() + "," + this.getStatusID() + "";
        return output;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        String encryptedPass="";
        try{
         encryptedPass = util.encrypString(this.password);
        }catch(Exception ex){
            util.writeErrorToLog(ex, "User_getPassword");
        }
        return encryptedPass;
    }
   
    
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserTypeID() {
        return userTypeID;
    }

    public void setUserType(int userTypeID) {
        this.userTypeID = userTypeID;
    }
}
