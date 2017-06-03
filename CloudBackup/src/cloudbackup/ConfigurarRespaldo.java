/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConfigurarRespaldo.java
 *
 * Created on Jul 15, 2012, 12:25:05 PM
 */
package cloudbackup;

import cloudbackup.utils.Util;
import cloudbackup.utils.Ziper;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import org.jdesktop.application.Action;
import org.jdesktop.application.Task;

/**
 *
 * @author kurtbadelt
 */
public class ConfigurarRespaldo extends javax.swing.JPanel {

    /** Creates new form ConfigurarRespaldo */
    public ConfigurarRespaldo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelPaso1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelPaso2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSeleccionados = new javax.swing.JList();
        jButtonQuitar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelPaso3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelGuardarComo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(844, 613));
        setSize(new java.awt.Dimension(844, 613));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cloudbackup.CloudBackupApp.class).getContext().getResourceMap(ConfigurarRespaldo.class);
        jLabelTitulo.setBackground(resourceMap.getColor("jLabelTitulo.background")); // NOI18N
        jLabelTitulo.setFont(resourceMap.getFont("jLabelTitulo.font")); // NOI18N
        jLabelTitulo.setForeground(resourceMap.getColor("jLabelTitulo.foreground")); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText(resourceMap.getString("jLabelTitulo.text")); // NOI18N
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N
        jLabelTitulo.setOpaque(true);

        jLabelPaso1.setFont(resourceMap.getFont("jLabelPaso1.font")); // NOI18N
        jLabelPaso1.setText(resourceMap.getString("jLabelPaso1.text")); // NOI18N
        jLabelPaso1.setName("jLabelPaso1"); // NOI18N

        jButtonBuscar.setIcon(resourceMap.getIcon("jButtonBuscar.icon")); // NOI18N
        jButtonBuscar.setText(resourceMap.getString("jButtonBuscar.text")); // NOI18N
        jButtonBuscar.setName("jButtonBuscar"); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabelPaso2.setFont(resourceMap.getFont("jLabelPaso2.font")); // NOI18N
        jLabelPaso2.setText(resourceMap.getString("jLabelPaso2.text")); // NOI18N
        jLabelPaso2.setName("jLabelPaso2"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jListSeleccionados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "", "", "", "", "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListSeleccionados.setName("jListSeleccionados"); // NOI18N
        jScrollPane1.setViewportView(jListSeleccionados);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(cloudbackup.CloudBackupApp.class).getContext().getActionMap(ConfigurarRespaldo.class, this);
        jButtonQuitar.setAction(actionMap.get("QuitarDeLista")); // NOI18N
        jButtonQuitar.setText(resourceMap.getString("jButtonQuitar.text")); // NOI18N
        jButtonQuitar.setName("jButtonQuitar"); // NOI18N

        jButton1.setAction(actionMap.get("VaciarLista")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jLabelPaso3.setFont(resourceMap.getFont("jLabelPaso3.font")); // NOI18N
        jLabelPaso3.setText(resourceMap.getString("jLabelPaso3.text")); // NOI18N
        jLabelPaso3.setName("jLabelPaso3"); // NOI18N

        jButton2.setAction(actionMap.get("GuardarComo")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jLabelGuardarComo.setFont(resourceMap.getFont("jLabelGuardarComo.font")); // NOI18N
        jLabelGuardarComo.setForeground(resourceMap.getColor("jLabelGuardarComo.foreground")); // NOI18N
        jLabelGuardarComo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGuardarComo.setText(resourceMap.getString("jLabelGuardarComo.text")); // NOI18N
        jLabelGuardarComo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelGuardarComo.setName("jLabelGuardarComo"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jButton3.setAction(actionMap.get("Comprimir")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jButton4.setAction(actionMap.get("Upload")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabelTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(jLabelPaso1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 450, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(7, 7, 7)
                        .add(jButtonBuscar))
                    .add(layout.createSequentialGroup()
                        .add(499, 499, 499)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButtonQuitar))
                    .add(layout.createSequentialGroup()
                        .add(206, 206, 206)
                        .add(jLabelPaso3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 346, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(7, 7, 7)
                        .add(jButton2))
                    .add(layout.createSequentialGroup()
                        .add(379, 379, 379)
                        .add(jLabel1)
                        .add(29, 29, 29)
                        .add(jButton3))
                    .add(layout.createSequentialGroup()
                        .add(519, 519, 519)
                        .add(jLabel2)
                        .add(18, 18, 18)
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(54, 54, 54)
                        .add(jLabelGuardarComo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1054, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(101, 101, 101)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 795, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelPaso2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 435, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(jLabelTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(jLabelPaso1))
                    .add(jButtonBuscar))
                .add(26, 26, 26)
                .add(jLabelPaso2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1)
                    .add(jButtonQuitar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(jLabelPaso3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton2))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(jLabel1))
                    .add(jButton3))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(jLabel2))
                    .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(42, 42, 42)
                .add(jLabelGuardarComo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        JFileChooser jfilechooser = new JFileChooser();

        String rootFolder = System.getProperty("user.home");

        jfilechooser.setCurrentDirectory(new java.io.File(rootFolder));
        jfilechooser.setDialogTitle("Archivos a Respaldar");
        jfilechooser.setMultiSelectionEnabled(true);
        jfilechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        


        final int respuesta = jfilechooser.showDialog(this, "Seleccionar");



        if (!(respuesta == JFileChooser.CANCEL_OPTION)) {


            File[] files = jfilechooser.getSelectedFiles();
            ConfigurarRespaldo.this.jListSeleccionados.setModel(modelo);
            ConfigurarRespaldo.this.Archivos = new String[files.length];

            for (int i = 0; i < files.length; i++) {


                modelo.addElement(files[i]);
                ConfigurarRespaldo.this.Archivos[i] = files[i].getPath();




            }
        }


    }

    @Action
    public void QuitarDeLista() {
        int[] seleccionados = this.jListSeleccionados.getSelectedIndices();

        try{
        for (int i = 0; i < seleccionados.length; i++) {
            System.out.println("selected Index: " + seleccionados[i]);
            modelo.removeElementAt(seleccionados[i]);


        }
        }catch(Exception ex){
            ex.printStackTrace();
        } 

        this.jListSeleccionados.repaint();


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    @Action
    public void VaciarLista() {
        modelo.removeAllElements();
        
    }

    @Action
    public void GuardarComo() {
        
        JFileChooser jfilechooser = new JFileChooser();


        final int respuesta = jfilechooser.showSaveDialog(this);

        if (!(respuesta == JFileChooser.CANCEL_OPTION)) {

            String FileName = jfilechooser.getSelectedFile().getPath()+".zip";
            
        this.jLabelGuardarComo.setText("Tu Respaldo se va a guardar como: "+FileName);
        this.nombreArchivo = FileName;
        }
        
    }

    @Action
    public Task Comprimir() {
        return new ComprimirTask(org.jdesktop.application.Application.getInstance(cloudbackup.CloudBackupApp.class));
    }

    private class ComprimirTask extends org.jdesktop.application.Task<Object, Void> {
        ComprimirTask(org.jdesktop.application.Application app) {
            // Runs on the EDT.  Copy GUI state that
            // doInBackground() depends on from parameters
            // to ComprimirTask fields, here.
            
            super(app);
        }
        @Override protected Object doInBackground() {
            // Your Task's code here.  This method runs
            // on a background thread, so don't reference
            // the Swing GUI from here.
             Ziper ziper = new Ziper();
             ziper.zipMultipleFiles(nombreArchivo, Archivos);
             
             String label = nombreArchivo+";"+System.getProperty("user.name")+";"+util.TimeStamp()+";";
             String savedconfig = label;
             for(int i=0;i<Archivos.length;i++){
                 savedconfig+= Archivos[i]+";";
             }
             util.writeStringToHistorial(savedconfig,"Backup @ "+util.TimeStamp()+"by "+System.getProperty("user.name"));
             
             
             
            
            return null;  // return your result
        }
        @Override protected void succeeded(Object result) {
            // Runs on the EDT.  Update the GUI based on
            // the result computed by doInBackground().
            ConfigurarRespaldo.this.jLabelGuardarComo.setText("Los Archivos se comprimieron con éxito");
        }
    }

    @Action
    public Task Upload() {
        return new UploadTask(org.jdesktop.application.Application.getInstance(cloudbackup.CloudBackupApp.class));
    }

    private class UploadTask extends org.jdesktop.application.Task<Object, Void> {
        UploadTask(org.jdesktop.application.Application app) {
            // Runs on the EDT.  Copy GUI state that
            // doInBackground() depends on from parameters
            // to UploadTask fields, here.
            super(app);
        }
        @Override protected Object doInBackground() {
            // Your Task's code here.  This method runs
            // on a background thread, so don't reference
            // the Swing GUI from here.
            return null;  // return your result
        }
        @Override protected void succeeded(Object result) {
            // Runs on the EDT.  Update the GUI based on
            // the result computed by doInBackground().
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonQuitar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelGuardarComo;
    private javax.swing.JLabel jLabelPaso1;
    private javax.swing.JLabel jLabelPaso2;
    private javax.swing.JLabel jLabelPaso3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList jListSeleccionados;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    DefaultListModel modelo = new DefaultListModel();
    String nombreArchivo="";
    String []Archivos=null;
    Util util = new Util();
}