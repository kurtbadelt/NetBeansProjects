/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

/**
 *
 * @author kurtbadelt
 */
public class AddressBook extends DataLayer {
    int addressBookID;
    int customerID;
    String gender;
    String company;
    String firstName;
    String lastName;
    String streetAddress;
    String suburb;
    String postCode;
    String city;
    String state;
    int countryID;
    String Headers="Address Book ID;CustomerID;Gender;Company;Firs Name;Last Name;Street Address;Suburb;Post Code;City;State;Country ID";//provides de headers to be used to write to tables and to excel (replacing vector)

    public AddressBook(int addressBookID, int customerID, String gender, String company, String firstName, String lastName, String streetAddress, String suburb, String postCode, String city, String state, int countryID) {
        this.addressBookID = addressBookID;
        this.customerID = customerID;
        this.gender = gender;
        this.company = company;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.suburb = suburb;
        this.postCode = postCode;
        this.city = city;
        this.state = state;
        this.countryID = countryID;
    }
    
    public String toDB(){
    String output = "";
    output+= this.getAddressBookID()+","+this.getCustomerID()+",'"+this.getGender()+"','"+this.getCompany()+"','"+this.getFirstName()+"','"+this.getLastName()+"','"+this.getStreetAddress()
            +"','"+this.getSuburb()+"','"+this.getPostCode()+"','"+this.getCity()+"','"+this.getState()+"',"+this.getCountryID();
    return output;
    }

        public String toString(){
    String output = "";
    output+= this.getAddressBookID()+";"+this.getCustomerID()+";"+this.getGender()+";"+this.getCompany()+";"+this.getFirstName()+";"+this.getLastName()+";"+this.getStreetAddress()
            +";"+this.getSuburb()+";"+this.getPostCode()+";"+this.getCity()+";"+this.getState()+";"+this.getCountryID();
    return output;
    }
    
    
    public int getAddressBookID() {
        return addressBookID;
    }

    public void setAddressBookID(int addressBookID) {
        this.addressBookID = addressBookID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
    
    
    
    
}
