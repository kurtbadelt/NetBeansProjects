/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelDeControl.java
 *
 * Created on Jul 15, 2012, 12:25:45 PM
 */
package cloudbackup;

/**
 *
 * @author kurtbadelt
 */
public class PanelDeControl extends javax.swing.JPanel {

    /** Creates new form PanelDeControl */
    public PanelDeControl() {
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

        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(844, 613));
        setSize(new java.awt.Dimension(844, 613));

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cloudbackup.CloudBackupApp.class).getContext().getResourceMap(PanelDeControl.class);
        jLabelTitulo.setBackground(resourceMap.getColor("jLabelTitulo.background")); // NOI18N
        jLabelTitulo.setFont(resourceMap.getFont("jLabelTitulo.font")); // NOI18N
        jLabelTitulo.setForeground(resourceMap.getColor("jLabelTitulo.foreground")); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText(resourceMap.getString("jLabelTitulo.text")); // NOI18N
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelTitulo.setName("jLabelTitulo"); // NOI18N
        jLabelTitulo.setOpaque(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(221, 30));
        jLabelTitulo.setSize(new java.awt.Dimension(218, 30));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelTitulo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(543, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
