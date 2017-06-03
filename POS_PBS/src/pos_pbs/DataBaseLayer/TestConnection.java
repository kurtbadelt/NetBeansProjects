/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataBaseLayer;

import java.util.ArrayList;
import pos_pbs.DataLayer.User;

/**
 *
 * @author kurtbadelt
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 LocalDBDriver ldb = new LocalDBDriver();
       
       ldb.createConnection();
       
       User usr = new User(1,"Kurt","Yañez","16640740","kurt.badelt@gmail.com","kurtB","#Include1",1,1);
       ldb.insertADataLayerObject(usr, "User");

       

        
    }
}
