/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;



/**
 *
 * @author kurtbadelt
 */
public class Customer extends DataLayer {
    int customerID;
    String gender;
    String firstName;
    String lastName;
    String email;
    String nick;
    int addresssID;
    String phone;
    String Headers="Customer ID;Gender;Firs Name;Last Name;email;Nick Name;Address ID;Telephone Number";//provides de headers to be used to write to tables and to excel (replacing vector)

    public Customer(int customerID, String gender, String firstName, String lastName, String email, String nick, int addresssID, String phone) {
        this.customerID = customerID;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.nick = nick;
        this.addresssID = addresssID;
        this.phone = phone;
    }
    
    
    
    @Override
    public String toString(){
    String output="";
    output+= this.getCustomerID()+";"+this.getGender()+";"+this.getFirstName()+";"+this.getLastName()+";"+this.getEmail()+";"+this.getNick()+";"+this.getAddresssID()+";"+this.getPhone();
    return output;
    }
    
    public String toDB(){
    String output="";
    output+= this.getCustomerID()+",'"+this.getGender()+"','"+this.getFirstName()+"','"+this.getLastName()+"','"+this.getEmail()+"','"+this.getNick()+"',"+this.getAddresssID()+",'"+this.getPhone()+"'";
    return output;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public int getAddresssID() {
        return addresssID;
    }

    public void setAddresssID(int addresssID) {
        this.addresssID = addresssID;
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

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int idCustomer) {
        this.customerID = idCustomer;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    
    
    
}
