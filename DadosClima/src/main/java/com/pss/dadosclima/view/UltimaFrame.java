/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.pss.dadosclima.view;

import javax.swing.JFormattedTextField;

/**
 *
 * @author UFES
 */
public class UltimaFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form UltimaFrame
     */
    public UltimaFrame() {
        initComponents();
    }

    public JFormattedTextField getDataField() {
        return DataField;
    }

    public JFormattedTextField getPressaoField() {
        return PressaoField;
    }

    public JFormattedTextField getTemperaturaField() {
        return TemperaturaField;
    }

    public JFormattedTextField getUmidadeField() {
        return UmidadeField;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DataLabel = new javax.swing.JLabel();
        TemperaturaLabel = new javax.swing.JLabel();
        UmidadeLabel = new javax.swing.JLabel();
        PressaoLabel = new javax.swing.JLabel();
        DataField = new javax.swing.JFormattedTextField();
        TemperaturaField = new javax.swing.JFormattedTextField();
        UmidadeField = new javax.swing.JFormattedTextField();
        PressaoField = new javax.swing.JFormattedTextField();

        setIconifiable(true);
        setResizable(true);
        setTitle("Ultima atualização");

        DataLabel.setText("Data:");

        TemperaturaLabel.setText("Temperatura:");

        UmidadeLabel.setText("Umidade:");

        PressaoLabel.setText("Pressão:");

        DataField.setEditable(false);
        DataField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        DataField.setText("DD/MM/AA");
        DataField.setFocusable(false);
        DataField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataFieldActionPerformed(evt);
            }
        });

        TemperaturaField.setEditable(false);
        TemperaturaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##,#0"))));
        TemperaturaField.setFocusable(false);

        UmidadeField.setEditable(false);
        UmidadeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        UmidadeField.setFocusable(false);

        PressaoField.setEditable(false);
        PressaoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        PressaoField.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PressaoLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(DataLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TemperaturaLabel)
                                .addComponent(UmidadeLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UmidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TemperaturaField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PressaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataLabel)
                    .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TemperaturaLabel)
                    .addComponent(TemperaturaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UmidadeLabel)
                    .addComponent(UmidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PressaoLabel)
                    .addComponent(PressaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DataFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataField;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JFormattedTextField PressaoField;
    private javax.swing.JLabel PressaoLabel;
    private javax.swing.JFormattedTextField TemperaturaField;
    private javax.swing.JLabel TemperaturaLabel;
    private javax.swing.JFormattedTextField UmidadeField;
    private javax.swing.JLabel UmidadeLabel;
    // End of variables declaration//GEN-END:variables
}
