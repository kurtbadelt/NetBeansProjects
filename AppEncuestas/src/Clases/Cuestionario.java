/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *Esta clase es la implementaciòn de un arreglo de campos de captura para
 * formar un cuestionario
 * @author kurtbadelt
 */
public class Cuestionario {
    String NombreCuestionario;
    int IDCuestionario;
    int NumeroPreguntas;
    CampoCaptura [] preguntas;
    private JLabel Titulo = null;
    int Xinicio;
    int Yinicio;
    
    
    /**
     * Metodo constructor del cuestionario
     * @param NombreCuestionario
     * @param NumeroPreguntas
     * @param panel
     * @param IDCuestionario
     * @param tipos
     * @param nombrePregunta 
     */
    public Cuestionario(String NombreCuestionario, int NumeroPreguntas, JPanel panel, int IDCuestionario, String[] tipos, String[] nombrePregunta) {
        this.NombreCuestionario = NombreCuestionario;
        this.NumeroPreguntas = NumeroPreguntas;
        
        this.IDCuestionario = IDCuestionario;
        this.Titulo = crearTitulo(this.NombreCuestionario);
        this.darFormatoAlPanel(panel);
        
        preguntas = new CampoCaptura[NumeroPreguntas];
        panel.add(this.Titulo);
        
        
        
        for (int i = 0; i < this.NumeroPreguntas; i++) {

            //String tipo,String nombre,int Xinicio,int Yinicio,JPanel panel
            preguntas[i] = new CampoCaptura(tipos[i], nombrePregunta[i]);
            preguntas[i].agregarAPanel(panel);
        }
        
        
        
    }
    
    /**
     * es un metodo diseñado para alimentar la Jtables 
     * que se utilizan en la GUI, se va a utilizar un metodo
     * a medida que se encuentra en utilerias, separa los punto comas
     * la idea es que se tiene una tupla (renglon) por cada pregunta
     * Titulo del cuestionario, Numero de preguntas, id del cuestionario, pregunta, tipo de pregunta, respuesta
     * ejemplo:
     * CuestionarioEjemplo;5;1892;Pregunta Numero 1;Abierta;Respuesta
     * @return 
     */
    public  Vector <String> CuestionarioToTable(){
    Vector <String> output= new Vector();
    String dato;
    
    
    for(int i=0;i<this.NumeroPreguntas;i++){
        dato = this.NombreCuestionario+";"+this.NumeroPreguntas+";"+this.IDCuestionario+";"+this.preguntas[i].toString();
        output.add(dato);
    }
    
    
    
    
    return output;
    }
    
    
    /**
     * metodo muy similar al anterior pero en este caso el formato esta
     * diseñado para ser insertado en una base de datos.
     * ejemplo:
     * Titulo del cuestionario, Numero de preguntas, id del cuestionario, pregunta, tipo de pregunta, respuesta
     * CuestionarioEjemplo','5','1892','Pregunta Numero 1','Abierta','Respuesta"';"
     * @return 
     */
    public  Vector <String> CuestionarioToDB(){
    Vector <String> output= new Vector();
    String dato;
    
    
    for(int i=0;i<this.NumeroPreguntas;i++){
        dato = this.NombreCuestionario+"','"+this.NumeroPreguntas+"','"+this.IDCuestionario+"','"+this.preguntas[i].toDB()+"';";
        output.add(dato);
    }
    
    
    
    
    return output;
    }
    
    
    
    /**
     * se define el formato correcto para el panel recibido
     * se utiliza un GridLayout
     * @param panel 
     */
    public void darFormatoAlPanel(JPanel panel) {
        panel.setLayout(new GridLayout(10, 10, this.NumeroPreguntas + 2, 1));
        
    }

    /**
     * Crea y da formato al titulo del cuestionario
     * @param texto
     * @return 
     */
    private JLabel crearTitulo(String texto) {
        JLabel tituloTemp = new JLabel();
        tituloTemp.setText(texto);
        tituloTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTemp.setBackground(new Color(183, 213, 251));        
        tituloTemp.setFont(new Font("Dialog", Font.PLAIN, 24));        
        tituloTemp.setHorizontalAlignment(SwingConstants.CENTER);        
        tituloTemp.setOpaque(true);  // Generated
        //  tituloTemp.setIcon(new ImageIcon(getClass().getResource("/Icons/clean-L.png")));
        return tituloTemp;
    }

    
    
    
}
