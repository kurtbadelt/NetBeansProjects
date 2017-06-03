/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudbackup.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author kurtbadelt
 */
public class Ziper {
    
    public void zipMultipleFiles(String outputFile, String[] sourceFiles){
        
                  try
                {
                   
                        //create byte buffer
                        byte[] buffer = new byte[1024];
                       
                        /*
                         * To create a zip file, use
                         *
                         * ZipOutputStream(OutputStream out)
                         * constructor of ZipOutputStream class.
                        */
                         
                         //create object of FileOutputStream
                         FileOutputStream fout = new FileOutputStream(outputFile);
                         
                         //create object of ZipOutputStream from FileOutputStream
                         ZipOutputStream zout = new ZipOutputStream(fout);
                         
                         for(int i=0; i < sourceFiles.length; i++)
                         {
                               
                               // System.out.println("Adding " + sourceFiles[i]);
                                //create object of FileInputStream for source file
                                FileInputStream fin = new FileInputStream(sourceFiles[i]);
 
                                /*
                                 * To begin writing ZipEntry in the zip file, use
                                 *
                                 * void putNextEntry(ZipEntry entry)
                                 * method of ZipOutputStream class.
                                 *
                                 * This method begins writing a new Zip entry to
                                 * the zip file and positions the stream to the start
                                 * of the entry data.
                                 */
 
                                zout.putNextEntry(new ZipEntry(sourceFiles[i]));
 
                                /*
                                 * After creating entry in the zip file, actually
                                 * write the file.
                                 */
                                int length;
 
                                while((length = fin.read(buffer)) > 0)
                                {
                                   zout.write(buffer, 0, length);
                                }
 
                                /*
                                 * After writing the file to ZipOutputStream, use
                                 *
                                 * void closeEntry() method of ZipOutputStream class to
                                 * close the current entry and position the stream to
                                 * write the next entry.
                                 */
 
                                 zout.closeEntry();
 
                                 //close the InputStream
                                 fin.close();
                               
                         }
                       
                         
                          //close the ZipOutputStream
                          zout.close();
                         
                         // System.out.println("Zip file has been created!");
               
                }
                catch(IOException ioe)
                {
                        System.out.println("IOException :" + ioe);
                }
        
    }
    
}
