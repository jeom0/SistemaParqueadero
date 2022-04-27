package view;

import controlador.CTarifas;
import controlador.CVehiculo;
import javax.swing.JOptionPane;

public class PanelIngresarVehiculo extends javax.swing.JPanel {

    public PanelIngresarVehiculo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textTipovehiculo = new javax.swing.JTextField();
        textHoraentrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFechaingreso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textTarifa = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Placa");

        textPlaca.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        textPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlacaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Vehiculo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Hora de Entrada:");

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus-pequeno.png"))); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textHoraentrada.setToolTipText("Ingrese la hora en este formato 00 : 00");
        textHoraentrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textHoraentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHoraentradaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de ingreso:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tarifa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFechaingreso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTarifa)
                            .addComponent(textTipovehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(textHoraentrada))))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textTipovehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textHoraentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPlacaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Boolean guardar = true;
        String mensaje = "";
        String placa = textPlaca.getText();
        String tipovehiculo = textTipovehiculo.getText();
        String fechaingreso = textFechaingreso.getText();
        String horaentrada = textHoraentrada.getText();
        String tipotarifa = textTarifa.getText();
 
          
        
    if(placa.length()==0){
        guardar = false;
        mensaje+="Escriba la placa, por favor\n";
    }
    
     if(tipovehiculo.length()==0){
        guardar = false;
        mensaje+="Escriba el tipo de vehiculo, por favor\n";
    }
    
    if(fechaingreso.length()==0){
        guardar = false;
        mensaje+="Escriba la placa, por favor\n";
    } 
    
    if(horaentrada.length()==0){
        guardar = false;
        mensaje+="Escriba la hora de entrada del vehiculo, por favor\n";
    }  
    
    if(tipotarifa.length()==0){
        guardar = false;
        mensaje+="Escriba la tarifa del vehiculo, por favor\n";
    }
    
    if(guardar){
        CVehiculo control = new CVehiculo();
        CTarifas controlar = new CTarifas();
        control.insertar(placa, tipovehiculo, fechaingreso, horaentrada);
        controlar.insertar(tipovehiculo, tipotarifa);
        textPlaca.setText("");
        textTipovehiculo.setText("");
        textFechaingreso.setText("");
        textHoraentrada.setText("");
        textTarifa.setText("");
        
    }
    else JOptionPane.showMessageDialog(null, mensaje);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textHoraentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHoraentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHoraentradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textFechaingreso;
    private javax.swing.JTextField textHoraentrada;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textTarifa;
    private javax.swing.JTextField textTipovehiculo;
    // End of variables declaration//GEN-END:variables
}
