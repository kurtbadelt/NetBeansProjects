/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudbackup.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

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

    public String listFilesForFolder(final File folder) {
        String output = "";
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {

                output += fileEntry.getName() + ";";
            }
        }

        return output;
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

    public void writeStringToHistorial(String data, String fileName) {
        try {



            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("src/Historial/" + fileName + ".hstl")));
            salida.println(data);
            salida.close();

        } catch (Exception e) {


            e.printStackTrace();



        }
    }

    public String TimeStamp() {
        String timestamp = "";
        java.util.Date date = new java.util.Date();
        timestamp = new Timestamp(date.getTime()).toString();

        return timestamp;

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

    public String readFromHistorial(String fileName) {
        String output = "";

        try {
            String line = "";

            BufferedReader reader = new BufferedReader(new FileReader("src/Historial/" + fileName));
            int i = 0;



            line = reader.readLine();


            output = line;






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
}
