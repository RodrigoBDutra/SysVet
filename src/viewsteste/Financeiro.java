/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsteste;

/**
 *
 * @author vini
 */
public class Financeiro extends javax.swing.JPanel {

    /**
     * Creates new form Financeiro
     */
    public Financeiro() {
        initComponents();
        jpFinanceiro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jpFinanceiro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Financeiro");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(256, 1, 61, 15);

        jTextField6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel6.add(jTextField6);
        jTextField6.setBounds(14, 40, 320, 28);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        jButton10.setText("Consultar");
        jButton10.setToolTipText("");
        jButton10.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(345, 41, 128, 32);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton12.setText("Inserir");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);
        jButton12.setBounds(483, 42, 129, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Contas");
        jPanel6.add(jLabel14);
        jLabel14.setBounds(20, 20, 43, 15);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filefind.png"))); // NOI18N
        jButton20.setText("Histórico");
        jPanel6.add(jButton20);
        jButton20.setBounds(195, 450, 140, 35);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apply.png"))); // NOI18N
        jButton15.setText("Salvar");
        jPanel6.add(jButton15);
        jButton15.setBounds(343, 450, 130, 35);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excluir.png"))); // NOI18N
        jButton16.setText("Cancelar");
        jPanel6.add(jButton16);
        jButton16.setBounds(480, 450, 140, 35);

        jpFinanceiro.setBackground(new java.awt.Color(153, 153, 153));
        jpFinanceiro.setBorder(javax.swing.BorderFactory.createTitledBorder("Financeiro"));
        jpFinanceiro.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Data Emissão");
        jpFinanceiro.add(jLabel8);
        jLabel8.setBounds(16, 82, 81, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descrição");
        jpFinanceiro.add(jLabel6);
        jLabel6.setBounds(16, 24, 57, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Valor Emitido");
        jpFinanceiro.add(jLabel7);
        jLabel7.setBounds(180, 80, 81, 15);
        jpFinanceiro.add(jTextField2);
        jTextField2.setBounds(16, 45, 458, 28);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField1);
        jTextField1.setBounds(180, 100, 107, 28);
        jpFinanceiro.add(jTextField13);
        jTextField13.setBounds(16, 249, 581, 100);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Observação");
        jpFinanceiro.add(jLabel11);
        jLabel11.setBounds(20, 230, 70, 15);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField3);
        jTextField3.setBounds(300, 100, 107, 28);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Desconto (%)");
        jpFinanceiro.add(jLabel9);
        jLabel9.setBounds(300, 80, 97, 15);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField7);
        jTextField7.setBounds(410, 100, 107, 28);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Valor");
        jpFinanceiro.add(jLabel10);
        jLabel10.setBounds(410, 80, 97, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Data Venc.");
        jpFinanceiro.add(jLabel15);
        jLabel15.setBounds(20, 140, 66, 15);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField8);
        jTextField8.setBounds(180, 160, 107, 28);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Juros(%)");
        jpFinanceiro.add(jLabel16);
        jLabel16.setBounds(180, 140, 57, 15);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField9);
        jTextField9.setBounds(300, 160, 107, 28);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Valor Multa");
        jpFinanceiro.add(jLabel17);
        jLabel17.setBounds(300, 140, 70, 15);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField10);
        jTextField10.setBounds(410, 160, 107, 28);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Valor");
        jpFinanceiro.add(jLabel18);
        jLabel18.setBounds(410, 140, 31, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Situação");
        jpFinanceiro.add(jLabel12);
        jLabel12.setBounds(20, 200, 53, 15);

        jComboBox1.setForeground(new java.awt.Color(255, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aguardando Pagamento", " " }));
        jpFinanceiro.add(jComboBox1);
        jComboBox1.setBounds(80, 200, 252, 28);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jpFinanceiro.add(jTextField12);
        jTextField12.setBounds(484, 45, 107, 28);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Nº Nota");
        jpFinanceiro.add(jLabel19);
        jLabel19.setBounds(484, 24, 97, 15);
        jpFinanceiro.add(jDateChooser1);
        jDateChooser1.setBounds(20, 100, 140, 28);
        jpFinanceiro.add(jDateChooser2);
        jDateChooser2.setBounds(20, 160, 140, 28);

        jPanel6.add(jpFinanceiro);
        jpFinanceiro.setBounds(9, 76, 610, 360);

        jTabbedPane1.addTab("Financeiro", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Historico de Contas a Pagar");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(282, 1, 170, 15);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Historico Contas a Pagar"));

        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22/06/2014", "Animax", "Ração Animax", "R$50,00", "R$0,00"},
                {"23/06/2014", "Aloxic", "Atroveram", "R$45,00", "R$45,00"},
                {"24/06/2014", "Colão", "Coleira", "R$20,00", "R$0,00"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DATA", "FORNECEDOR", "DESCRIÇÃO", "VALOR A PAGAR", "VALOR PAGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.add(jPanel3);
        jPanel3.setBounds(11, 65, 613, 370);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fileprint.png"))); // NOI18N
        jButton22.setText("Imprimir");
        jPanel7.add(jButton22);
        jButton22.setBounds(350, 450, 130, 35);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reload.png"))); // NOI18N
        jButton17.setText("Voltar");
        jPanel7.add(jButton17);
        jButton17.setBounds(490, 450, 130, 35);

        jRadioButton4.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setText("Quinzenal");
        jPanel7.add(jRadioButton4);
        jRadioButton4.setBounds(290, 40, 90, 23);

        jRadioButton5.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton5.setText("Mensal");
        jPanel7.add(jRadioButton5);
        jRadioButton5.setBounds(390, 40, 80, 23);

        jRadioButton6.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton6.setText("Anual");
        jPanel7.add(jRadioButton6);
        jRadioButton6.setBounds(480, 40, 70, 23);

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setText("Semanal");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton3);
        jRadioButton3.setBounds(200, 40, 80, 23);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Hoje");
        jPanel7.add(jRadioButton2);
        jRadioButton2.setBounds(130, 40, 60, 23);

        jTabbedPane1.addTab("Histórico Financeiro", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jpFinanceiro.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jpFinanceiro.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2AncestorAdded

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel jpFinanceiro;
    // End of variables declaration//GEN-END:variables
}
