package XMLIO;

import Class.Paciente;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class XMLIO{
    
    public void XMLIO(){}

    public void parser (String file){
    try {

        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(new File(file));

        // normalize text representation
        doc.getDocumentElement().normalize();
        System.out.println("Root element of the doc is " + doc.getDocumentElement().getNodeName());
        


//****************        
        NodeList primeraLista = doc.getFirstChild().getChildNodes();
        System.out.println("Numero de nodos hijos.- " + primeraLista.getLength());

        System.out.println("A::" + doc.getFirstChild().getNodeName());
        for (int i = 0; i < primeraLista.getLength(); i++) {
            if(!primeraLista.item(i).getNodeName().equals("#text")){
            System.out.println(i + ".- " + primeraLista.item(i).getNodeName());
            }
        }


//****************   
        NodeList segundaLista = primeraLista.item(1).getChildNodes();
        System.out.println("B::" + primeraLista.item(1).getNodeName());
        for (int i = 0; i < segundaLista.getLength(); i++) {

           
 
                Node nodo = segundaLista.item(i);
                if(segundaLista.item(i).getNodeName().equals("element")){
                    
                System.out.println("pos;"+i+"; "+nodo.getTextContent());
                }
            

        }


    //****************   
        NodeList terceraLista = primeraLista.item(3).getChildNodes();
        System.out.println("C::" + primeraLista.item(3).getNodeName());
        for (int i = 0; i < terceraLista.getLength(); i++) {

           
 
                Node nodo = terceraLista.item(i);
                
                if(terceraLista.item(i).getNodeName().equals("element")){
                    Element elemento = (Element) terceraLista.item(i);
                System.out.println("pos;"+i+"; "+nodo.getTextContent()+"---->"+elemento.getAttribute("name"));
                //if element equal XXX then create object and insert to db
                
               
                }
            

        }       


        Paciente paciente = new Paciente();
  
        


        


        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        //System.exit (0);

    }
    
    
    


}
