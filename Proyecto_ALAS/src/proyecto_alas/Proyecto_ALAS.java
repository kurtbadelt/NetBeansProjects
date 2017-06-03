/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_alas;

import XMLIO.XMLIO;

/**
 *
 * @author kurtbadelt
 */



public class Proyecto_ALAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        XMLIO xmlio = new XMLIO();
        xmlio.parser("test.xml");
        
        
    }
}
