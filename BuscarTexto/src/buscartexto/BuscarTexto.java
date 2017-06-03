/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buscartexto;

/**
 *
 * @author kurtbadelt
 */
public class BuscarTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringLocator SL = new StringLocator();
        String token="|";
        String dataRaw = SL.readFile("src/PruebaText.txt",token);
        System.out.println("Datos que se leyeron: "+ dataRaw);
        
        String[] separados = SL.separateByToken(dataRaw,token);
        
        for(int i=0;i<separados.length;i++){
            String linea = separados[i];
            
           
            
            System.out.println("Valor Radiacion:  "+SL.buscarValorRadiacion(linea));
            System.out.println("Valor RayosX:  "+SL.buscarValorRayosX(linea));
           
       
            
        }
       
    }
}
