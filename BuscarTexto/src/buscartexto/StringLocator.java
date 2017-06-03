/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buscartexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 *
 * @author kurtbadelt
 */
public class StringLocator {

    /**
     * Este metodo recibe la ruta del archivo y devuelve el contenido de un 
     * archivo en un solo string cada línea viene separada por un token
     * @param fileName
     * @param token
     * @return 
     */
    public String readFile(String fileName, String token) {
        String output = "";

        try {


            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int i = 0;

            String str = "";
            while ((str = reader.readLine()) != null) {



                output += str + token;
            }





        } catch (Exception ex) {


            ex.printStackTrace();
        }


        return output;
    }

    /**
     * recibe una cadena de caracteres busca un token, si lo encuentra lo separa
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

    /**
     * busca la palabra radiación o radiacion
     * @param linea
     * @return 
     */
    public boolean buscarRadiacion(String linea) {
        String Linea = linea.trim().toLowerCase();
        if ((Linea.contains("radiación")) || (Linea.contains("radiacion"))) {
            return true;

        }



        return false;
    }

    public boolean buscarTuboRayos(String linea) {
        String Linea = linea.trim().toLowerCase();
        if ((Linea.contains("rayos x")) || (Linea.contains("rayosx"))) {
            return true;

        }



        return false;
    }

    /**
     * 
     * @param linea
     * @return 
     */
    public String buscarValorRadiacion(String linea) {
        String output = "";
        String comillas = "" + '"';
        if (buscarRadiacion(linea)) {
            String[] separados = this.separateByToken(linea, comillas);

            output = separados[1];

        }

        return output;

    }

    public String buscarValorRayosX(String linea) {
        String output = "";
        String comillas = "" + '"';
        if (buscarTuboRayos(linea)) {
            String[] separados = this.separateByToken(linea, comillas);

            output = separados[1];

        }

        return output;

    }

    public float convertirStringAFlotante(String input) {
        float output = -1;
        try {
            output = Float.parseFloat(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
}
