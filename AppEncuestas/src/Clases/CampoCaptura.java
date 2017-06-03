/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *es una clase que agrupa una etiqueta, un campo de captura de datos
 * el cual puede tomar 3 valores distintos, textfield, combobox o
 * un checkbox, esta es la clase raiz
 * @author kurtbadelt
 */
public class CampoCaptura {

    private JComboBox jComboBoxCampo = null;
    private JTextField jTextFieldCampo = null;
    private JCheckBox jCheckBoxCampo = null;
    private JLabel etiqueta = null;
    private JLabel aviso = null;
    public String[] tiposDisponibles = new String[3];
    public boolean mandatorio = false;
    public String tipo;

    /**
     * Constructor de la clase, recibe el tipo de campo y el nombre del mismo
     * el nombre será usado en la etiqueta y será el nombre que el usuario verá
     * el tipo puede tener 3 valores, Abierta, OpcionMultiple, Check
     * la calse cuenta con una variable publica llamada tiposDisponibles es un arreglo
     * de strings que pueden consltar para saber que opciones se tienen
     * @param tipo
     * @param nombre 
     */
    public CampoCaptura(String tipo, String nombre) {
        etiqueta = new JLabel();
        etiqueta.setText(nombre);
        tiposDisponibles[0] = "Abierta";
        tiposDisponibles[1] = "OpcionMultiple";
        tiposDisponibles[2] = "OpcionMultiple";



        if (tipo.equals(this.tiposDisponibles[1])) {
            jComboBoxCampo = new JComboBox();
            jComboBoxCampo.addItem("-----");
            this.tipo = this.tiposDisponibles[1];
            jComboBoxCampo.setToolTipText(etiqueta.getText());


        }

        if (tipo.equals(this.tiposDisponibles[0])) {
            jTextFieldCampo = new JTextField();
            this.tipo = this.tiposDisponibles[0];
            jTextFieldCampo.setToolTipText(etiqueta.getText());

        }

        if (tipo.equals(this.tiposDisponibles[2])) {
            jCheckBoxCampo = new JCheckBox();
            this.tipo = this.tiposDisponibles[2];
            jCheckBoxCampo.setToolTipText(etiqueta.getText());


        }


    }

    /**
     * Metodo para agregar este objeto a un panel dado
     * @param panel 
     */
    public void agregarAPanel(JPanel panel) {
        if (this.etiqueta != null) {
            panel.add(this.etiqueta);
        }

        if (this.jComboBoxCampo != null) {
            panel.add(this.jComboBoxCampo);
        }

        if (this.jTextFieldCampo != null) {
            panel.add(this.jTextFieldCampo);
        }

        if (this.jCheckBoxCampo != null) {
            panel.add(this.jCheckBoxCampo);
        }


    }

    public void cargarOpciones(Vector<String> datos) {
        if (this.tipo.equals(this.tiposDisponibles[1])) {
            if (this.jComboBoxCampo != null) {
                for (int i = 0; i < datos.size(); i++) {
                    this.jComboBoxCampo.addItem(datos.elementAt(i));

                }
            }
        }

    }

    /**
     * implementacion del metodo to string.
     * @return 
     */
    public String toString() {
        String output = "valorNoInicializado";
        output = this.etiqueta.getText() + ";" + this.tipo + ";";

        if (this.jTextFieldCampo != null) {
            if (this.tipo.equals(this.tiposDisponibles[0])) {
                output += this.jTextFieldCampo.getText();
                return output;
            }
        }

        if (this.jComboBoxCampo != null) {
            if (this.tipo.equals(this.tiposDisponibles[1])) {
                output += this.jComboBoxCampo.getSelectedItem().toString();
                return output;
            }
        }

        if (this.jCheckBoxCampo != null) {
            if (this.tipo.equals(this.tiposDisponibles[2])) {
                if (this.jCheckBoxCampo.isSelected()) {
                    output += "casillaSeleccionada";
                    return output;
                }
            }

        }


        return output;

    }

    /**
     * 
     * @return 
     */
    public String toDB() {
        String output = "valorNoInicializado";
        output = this.etiqueta.getText() + "','" + this.tipo + "','";
        if (this.tipo.equals(this.tiposDisponibles[0])) {
            output += this.jTextFieldCampo.getText();
            return output;
        }
        if (this.tipo.equals(this.tiposDisponibles[1])) {
            output += this.jComboBoxCampo.getSelectedItem().toString();
            return output;
        }
        if (this.tipo.equals(this.tiposDisponibles[2])) {
            if (this.jCheckBoxCampo.isSelected()) {
                output += "casillaSeleccionada";
                return output;
            }

        }


        return output;

    }
}
