/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2pbo;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author zahra
 */
public class Form extends javax.swing.JPanel {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        koneksi Koneksi = new koneksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        merk_lbl = new javax.swing.JLabel();
        plat_lbl = new javax.swing.JLabel();
        warna_lbl = new javax.swing.JLabel();
        jenis_lbl = new javax.swing.JLabel();
        txtMerk = new javax.swing.JTextField();
        txtJenis = new javax.swing.JTextField();
        txtWarna = new javax.swing.JTextField();
        txtPlat = new javax.swing.JTextField();
        button_submit = new javax.swing.JButton();

        merk_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        merk_lbl.setText("Merk");

        plat_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        plat_lbl.setText("Plat");

        warna_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        warna_lbl.setText("Warna");

        jenis_lbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jenis_lbl.setText("Jenis");

        txtMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMerkActionPerformed(evt);
            }
        });

        txtJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisActionPerformed(evt);
            }
        });

        txtWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarnaActionPerformed(evt);
            }
        });

        txtPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlatActionPerformed(evt);
            }
        });

        button_submit.setText("Submit");
        button_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_submit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warna_lbl)
                            .addComponent(plat_lbl)
                            .addComponent(merk_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jenis_lbl))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(merk_lbl)
                    .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plat_lbl)
                    .addComponent(txtPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warna_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenis_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(button_submit)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisActionPerformed

    private void txtMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerkActionPerformed

    private void txtPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlatActionPerformed

    private void txtWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarnaActionPerformed

    private void button_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_submitActionPerformed
         if(txtMerk.getText().isEmpty() || txtPlat.getText().isEmpty() || txtWarna.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data belum terisi.");
        }else{
            try{
                String query = "INSERT into mobil (Merk,Plat,Warna,Jenis) VALUES ('"+txtMerk.getText()+"','"+txtPlat.getText()+"','"+txtWarna.getText()+"','"+jenis_lbl.getSelectedItem()+"')";
                var Koneksi = (Connection)Koneksi.getKoneksi();
                java.sql.PreparedStatement stmt = Koneksi.prepareStatement(query);
                int success = stmt.executeUpdate(query);
                if(success == 1){
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan.");
                }else{
                    JOptionPane.showMessageDialog(null, "Data gagal ditambahkan.");
                }
                
                txtMerk.setEditable(true);
                txtMerk.setText(null);
                txtPlat.setText(null);
                txtWarna.setText(null);
                txtJenis.setSelectedItem(this);
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        } 
    }//GEN-LAST:event_button_submitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_submit;
    private javax.swing.JLabel jenis_lbl;
    private javax.swing.JLabel merk_lbl;
    private javax.swing.JLabel plat_lbl;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtPlat;
    private javax.swing.JTextField txtWarna;
    private javax.swing.JLabel warna_lbl;
    // End of variables declaration//GEN-END:variables
}
