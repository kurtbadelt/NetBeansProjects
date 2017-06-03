/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.Util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import pos_pbs.DataBaseLayer.LocalDBDriver;

/**
 *
 * @author kurtbadelt
 */
public class Util {

    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";

    /**
     * 
     * @param input
     * @return
     * @throws Exception 
     */
    public String encrypString(String input) throws Exception {


        StringEncrypter encrypter = new StringEncrypter(DESEDE_ENCRYPTION_SCHEME);

        return encrypter.encrypt(input);
    }

    /**
     * 
     * @param input
     * @return
     * @throws Exception 
     */
    public String decryptString(String input) throws Exception {


        StringEncrypter encrypter = new StringEncrypter(DESEDE_ENCRYPTION_SCHEME);

        return encrypter.decrypt(input);
    }


    /**
     * 
     * @param s
     * @param token
     * @return 
     */
    public String[] separateByToken(final String s, String token) {
        String[] output = null;
        if (s != null) {

            final StringTokenizer stk = new StringTokenizer(s, token);
            int size = stk.countTokens();
            output = new String[size];

            for (int i = 0; i < size; i++) {
                output[i] = stk.nextToken();
            }
        }
        return output;

    }

    /*
     * 
     * @param tabla
     * @param data
     * @param headers
     * @param token
     * @throws Exception 
     */
    public void fillTable(final JTable tabla, String[] data, String headers, String token) throws Exception {
        String[] columnas = this.separateByToken(headers, token);
        final CustomTableModel modelo = new CustomTableModel(columnas);

        modelo.setRowCount(data.length);

        for (int i = 0; i < data.length; i++) {

            String rawData = data[i];

            String[] separatedData = this.separateByToken(rawData, token);

            for (int j = 0; j < separatedData.length; j++) {
                if (separatedData.length < columnas.length) {
                    if (j >= separatedData.length) {
                        modelo.setValueAt("", i, j);
                    } else {
                        modelo.setValueAt(separatedData[j], i, j);
                    }
                } else {
                    if ((separatedData[j] != null) || (!separatedData[j].toString().equalsIgnoreCase("null"))) {
                        modelo.setValueAt(separatedData[j], i, j);
                    } else {
                    }

                }

            }
        }
        //Fijando ancho m�nimo de las columnas
        tabla.setModel(modelo);
        final TableColumnModel tcm = tabla.getColumnModel();
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tcm.getColumn(i).setMinWidth(100);
        }
    }

    /**
     * 
     * @param cadena
     * @param fileName 
     */
    public void writeStringToConfigfile(String data, String fileName) {
        try {

            String encryptedData = this.encrypString(data);

            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("src/ConfigFiles/" + fileName + ".conf")));
            salida.println(encryptedData);
            salida.close();

        } catch (Exception e) {



            this.writeErrorToLog(e, "Util_writeStringToConfigFile");


        }
    }

    public void writeErrorToLog(Exception ex, String fileName) {
        try {


            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            String day = dateFormat.format(date);
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("src/Logs/" + fileName + " @ " + day + "-" + date.getTime() + ".txt")));
            salida.println(ex.getMessage());
            salida.close();

        } catch (Exception e) {


            e.printStackTrace();



        }
    }

    public void writeStringToLog(String data, String fileName) {
        try {


            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            String day = dateFormat.format(date);
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("src/Logs/" + fileName + " @ " + day + "-" + date.getTime() + ".txt")));
            salida.println("Login @" + day + " by " + data);
            salida.close();

        } catch (Exception e) {


            e.printStackTrace();



        }
    }

    /**
     * ConfigFiles Should has one line only
     * @param FileName
     * @return 
     */
    public String readFromConfigFile(String fileName) {
        String output = "";

        try {
            String line = "";
            String decryptedLine = "";
            BufferedReader reader = new BufferedReader(new FileReader("src/ConfigFiles/" + fileName + ".conf"));
            int i = 0;



            line = reader.readLine();



            decryptedLine = this.decryptString(line);
            output = decryptedLine;





        } catch (Exception ex) {

            this.writeErrorToLog(ex, "Util_readFromConfigFile");
            ex.printStackTrace();
        }


        return output;
    }

    /**
     * 
     * @param combo
     * @param texto 
     */
    public void selectTextInComboBox(final JComboBox combo, final String text) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            final String tmp = combo.getItemAt(i).toString();
            if (tmp.equals(text)) {
                combo.setSelectedIndex(i);
                break;
            }
        }
    }

    public int getIndexFromComboSelection(JComboBox combo) {
        int index = -1;
        String data = combo.getSelectedItem().toString();
        String[] separatedData = this.separateByToken(data, "/");
        index = Integer.parseInt(separatedData[1]);
        return index;
    }

    public void fillComboBox(JComboBox combo, ArrayList data) {
        for (int i = 0; i < data.size(); i++) {
            combo.addItem(data.get(i));
        }

    }

    public void fillUserTypeCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllUserType());
    }

    public void fillSystemStatusCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllSystemStatus());
    }
    
    public void fillTablesCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.ShowTables());
    }

    public void fillOutboundCarrierCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllOutboundCarrier());
    }

    public void fillPayTypeCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllPayType());
    }

    public void fillProductColorCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllProductColor());
    }

    public void fillProductBrandCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllProductBrand());
    }

    public void fillProductCategoryCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllProductCategory());
    }

    public void fillProductUnitofMeasureCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllProductUnitofMeasure());
    }

    public void fillShipmentStatusCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllShipmentStatus());
    }

    public void fillInbounCarrierCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllInboundCarrier());
    }

    public void fillOpexTargetCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllOpexTarget());
    }

    public void fillOpexVendorCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllOpexVendor());
    }

    public void fillOpexCategoryCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllOpexCategory());
    }

    public void fillOpexFundsCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllOpexFunds());
    }

    public void fillProductVendorCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllProductVendor());
    }

    public void fillProductCountryOfCombo(JComboBox combo) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectAllProductCountryOf());
    }

    public void fillProductModel(JComboBox combo, int productBrandID) {
        LocalDBDriver ldb = new LocalDBDriver();
        ldb.createConnection();
        this.fillComboBox(combo, ldb.selectProductModelByProductBrand(productBrandID));
    }

    /**
     * 
     * @param fecha
     * @return 
     */
    public String dayOFWeek(String fecha) {
        String salida = "";
        Date cFecha = stringToDate(fecha);
        int diaSemana = cFecha.getDay();
        switch (diaSemana) {
            case 0:
                salida = "Sunday";
                break;
            case 1:
                salida = "Monday";
                break;
            case 2:
                salida = "Tuesday";
                break;
            case 3:
                salida = "Wednesday";
                break;
            case 4:
                salida = "Thursday";
                break;
            case 5:
                salida = "Friday";
                break;
            case 6:
                salida = "Saturday";
                break;
        }
        return salida;
    }

    /**
     * 
     * @param fecha
     * @return 
     */
    public Date stringToDate(String fecha) {
        Date date = null;

        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"/* ,Locale.getDefault() */);
            df.setCalendar(Calendar.getInstance());
            date = df.parse(fecha);
        } catch (Exception ex) {

            this.writeErrorToLog(ex, "Util_stringToDate");
        }

        return date;
    }

    /**
     * 
     * @return 
     */
    public String getUserDir() {
        String output = "";
        output = System.getProperty("user.home");

        return output;
    }

    /**
     * 
     * @return 
     */
    public int getScreenWith() {
        int output = 0;
        //Get the size of the systems monitor
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        output = (int) dim.getWidth();
        return output;
    }

    /**
     * 
     * @return 
     */
    public int getScreenHeight() {
        int output = 0;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        output = (int) dim.getHeight();
        return output;
    }

    public void selectTextInCombo(final JComboBox combo, final String text) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            final String tmp = combo.getItemAt(i).toString();
            if (tmp.equals(text)) {
                combo.setSelectedIndex(i);
                break;
            }
        }
    }
    
    
    	public void exportTable(final JTable table,final String Filename){
		try{
			final ArrayList encabezados = new ArrayList();

			for(int i=0;i<table.getColumnCount();i++){
				encabezados.add(table.getColumnName(i));
			}


			final ArrayList[] data = new ArrayList[encabezados.size()];
			for(int i=0;i<data.length;i++){
				data[i] = new ArrayList();
			}

			for(int c=0;c<table.getColumnCount();c++){
				for(int i=0;i<table.getRowCount();i++){
					try{
						data[c].add(table.getValueAt(i, c).toString());
						
						
					}catch(Exception ex){
						data[c].add("");	
					}
				}
			}

			excelOutput export = new excelOutput();
			export.Exportar(encabezados, data, Filename, "Requested");

		}catch(final Exception ex){
			this.writeErrorToLog(ex, "ExportTable");

		}	
	}
}
