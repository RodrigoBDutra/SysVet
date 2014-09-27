/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.Transferencia;
import dao.Banco;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Inicial extends javax.swing.JFrame {

    
    Banco ba = new Banco();
    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
        lblFulano.setText("Bem vindo " + Transferencia.logado.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        lblFulano = new java.awt.Label();
        btnProprietario = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAnimal = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnServicos = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLogoff = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Início", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque Abaixo do Mínimo"));
        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Atroveran         LabCao      5ml");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(10, 60, 260, 15);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("Racao               Qualimix    2kg");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(10, 30, 260, 15);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 270, 600, 210);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ultimas Consultas"));
        jPanel4.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Rex       Dr. Rafael       22/03        11:40");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(10, 30, 280, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Juca      Dr. Edvaldo     22/03        10:30");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(10, 60, 280, 15);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 30, 600, 230);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 640, 510);

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setLayout(null);

        lblFulano.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel1.add(lblFulano);
        lblFulano.setBounds(710, 1, 230, 19);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 960, 20);

        btnProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_proprietario1.png"))); // NOI18N
        btnProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProprietarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProprietario);
        btnProprietario.setBounds(770, 40, 70, 80);

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_inicio1.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio);
        btnInicio.setBounds(700, 40, 70, 80);

        btnAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_animal1.png"))); // NOI18N
        btnAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnimal);
        btnAnimal.setBounds(840, 40, 70, 80);

        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_estoque1.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstoque);
        btnEstoque.setBounds(840, 120, 70, 80);

        btnServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_serviço1.png"))); // NOI18N
        btnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosActionPerformed(evt);
            }
        });
        getContentPane().add(btnServicos);
        btnServicos.setBounds(770, 120, 70, 80);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones_agenda1.png"))); // NOI18N
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgenda);
        btnAgenda.setBounds(700, 120, 70, 80);

        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones_vendas1.png"))); // NOI18N
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVendas);
        btnVendas.setBounds(700, 200, 70, 80);

        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_financeiro1.png"))); // NOI18N
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro);
        btnFinanceiro.setBounds(770, 200, 70, 80);

        btnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones_produtos1.png"))); // NOI18N
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdutos);
        btnProdutos.setBounds(840, 200, 70, 80);

        btnConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones_configurações1.png"))); // NOI18N
        btnConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracoes);
        btnConfiguracoes.setBounds(770, 280, 70, 80);

        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_ajuda1.png"))); // NOI18N
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjuda);
        btnAjuda.setBounds(700, 280, 70, 80);

        btnSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/suporte.png"))); // NOI18N
        btnSuporte.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSuporte.setContentAreaFilled(false);
        btnSuporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuporteMouseClicked(evt);
            }
        });
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuporte);
        btnSuporte.setBounds(10, 550, 100, 50);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(280, 550, 100, 50);

        btnLogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeLogoff.png"))); // NOI18N
        btnLogoff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogoff.setContentAreaFilled(false);
        btnLogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoffMouseClicked(evt);
            }
        });
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogoff);
        btnLogoff.setBounds(140, 550, 100, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo telas.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-16, -6, 970, 610);

        setSize(new java.awt.Dimension(961, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
        Configuracoes conf = new Configuracoes();
        this.setVisible(false);
        conf.setVisible(true);
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuporteActionPerformed

    private void btnSuporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuporteMouseClicked
        JOptionPane.showMessageDialog(null, "Central de atendimento SysVet\n\nTelefone: (11)4647-6035\n"
                + "E-mail: suporte@sysvet.com.br\nSite: www.-------.com.br");
    }//GEN-LAST:event_btnSuporteMouseClicked

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        
    }//GEN-LAST:event_btnLogoffActionPerformed

    private void btnLogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoffMouseClicked
        ba.logoff(Transferencia.logado.getLogin());
        Login log = new Login();
        this.setVisible(false);
        log.setVisible(true);
        
    }//GEN-LAST:event_btnLogoffMouseClicked

    private void btnProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProprietarioActionPerformed
        // TODO add your handling code here:
        Proprietario prop = new Proprietario();
        this.setVisible(false);
        prop.setVisible(true);
    }//GEN-LAST:event_btnProprietarioActionPerformed

    private void btnAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalActionPerformed
        // TODO add your handling code here:
        Animal ani = new Animal();
        this.setVisible(false);
       ani.setVisible(true);
    }//GEN-LAST:event_btnAnimalActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
        Agenda agen = new Agenda();
        this.setVisible(false);
        agen.setVisible(true);
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        // TODO add your handling code here:
        Servicos ser = new Servicos();
        this.setVisible(false);
        ser.setVisible(true);
    }//GEN-LAST:event_btnServicosActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
        Estoque est = new Estoque();
        this.setVisible(false);
        est.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        // TODO add your handling code here:
        Vendas ven = new Vendas();
        this.setVisible(false);
        ven.setVisible(true);
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        // TODO add your handling code here:
        FinanceiroPagar fin = new FinanceiroPagar();
        this.setVisible(false);
        fin.setVisible(true);
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:
        Produtos pro = new Produtos();
        this.setVisible(false);
        pro.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        // TODO add your handling code here:
        Ajuda aju = new Ajuda();
        this.setVisible(false);
        aju.setVisible(true);
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null,"Você realmente deseja sair do sistema?","Confirmação",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            ba.logoff(Transferencia.logado.getLogin());
        }else if(sair == JOptionPane.NO_OPTION){
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
        
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnAnimal;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnProprietario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServicos;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JButton btnVendas;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private java.awt.Label lblFulano;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
