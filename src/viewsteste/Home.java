package viewsteste;

import classes.Transferencia;
import classes.Usuario;
import dao.Banco;
import java.awt.CardLayout;

import javax.swing.*;

public class Home extends javax.swing.JFrame {

    Banco ba = new Banco();
     private CardLayout card;
    

    public Home() {

        initComponents();

        lblFulano.setText("Bem vindo " + Transferencia.logado.getNome());
         card = new CardLayout();
         pnConteudo.setLayout(card);
         pnConteudo.add(new Inicio());

    }
    
    boolean bInicio = true;
    boolean bProprietario = true;
    boolean bAgenda = true;
    boolean bServicos = true;
    boolean bFornecedor = true;
    boolean bEstoque = true;
    boolean bVendas = true;
    boolean bFinanceiro = true;
    boolean bProdutos = true;
    boolean bConfiguracoes = true;
    boolean bSuporte = true;
    boolean bLogoff = true;
    boolean bSair = true;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrpSexoCliente = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        lblFulano = new java.awt.Label();
        btnInicio = new javax.swing.JButton();
        btnProprietario = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnServicos = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnLogoff = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        pnConteudo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setFocusableWindowState(false);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setLayout(null);

        lblFulano.setAlignment(java.awt.Label.RIGHT);
        lblFulano.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFulano.setText("Bem vindo Fulano!");
        panel1.add(lblFulano);
        lblFulano.setBounds(584, 1, 350, 19);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 960, 20);

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_inicio1.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio);
        btnInicio.setBounds(700, 40, 70, 80);

        btnProprietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_proprietario1.png"))); // NOI18N
        btnProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProprietarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProprietario);
        btnProprietario.setBounds(770, 40, 70, 80);

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
        btnServicos.setBounds(700, 120, 70, 80);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones_agenda1.png"))); // NOI18N
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgenda);
        btnAgenda.setBounds(840, 40, 70, 80);

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

        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_Fornecedor.png"))); // NOI18N
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnFornecedor);
        btnFornecedor.setBounds(770, 120, 70, 80);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(870, 550, 70, 40);

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
        btnLogoff.setBounds(770, 550, 90, 40);

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
        btnSuporte.setBounds(690, 550, 80, 50);

        pnConteudo.setName(""); // NOI18N

        javax.swing.GroupLayout pnConteudoLayout = new javax.swing.GroupLayout(pnConteudo);
        pnConteudo.setLayout(pnConteudoLayout);
        pnConteudoLayout.setHorizontalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pnConteudoLayout.setVerticalGroup(
            pnConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(pnConteudo);
        pnConteudo.setBounds(20, 40, 660, 540);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo telas.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 600);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(50, 50, 610, 530);

        setSize(new java.awt.Dimension(975, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        Inicio i = new Inicio();
        i.setVisible(true);
        if (bInicio) {
            pnConteudo.add(new Inicio(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProprietarioActionPerformed
        Proprietario p = new Proprietario();
        p.setVisible(true);
        if (bProprietario) {
            pnConteudo.add(new Proprietario(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnProprietarioActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
        Estoque e = new Estoque();
        e.setVisible(true);
        if (bEstoque) {
            pnConteudo.add(new Estoque(),"");
           
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        // TODO add your handling code here:
        Servico s = new Servico();
        s.setVisible(true);
        if (bServicos) {
            pnConteudo.add(new Servico(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnServicosActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
        Agenda a = new Agenda();
        a.setVisible(true);
        if (bAgenda) {
            pnConteudo.add(new Agenda(),"");
            
        }
        this.card.show(this.pnConteudo,"");
        
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        // TODO add your handling code here:
        Vendas v = new Vendas();
        v.setVisible(true);
        if (bVendas) {
            pnConteudo.add(new Vendas(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        // TODO add your handling code here:
        Financeiro f = new Financeiro();
        f.setVisible(true);
        if (bFinanceiro) {
            pnConteudo.add(new Financeiro(),"");
           
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        // TODO add your handling code here:
        Produtos pr = new Produtos();
        pr.setVisible(true);
        if (bProdutos) {
            pnConteudo.add(new Produtos(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
        Configuracao c = new Configuracao();
        c.setVisible(true);
        if (bConfiguracoes) {
            pnConteudo.add(new Configuracao(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoffMouseClicked
        //ba.logoff(Transferencia.logado.getLogin());
        Login log = new Login();
        this.setVisible(false);
        log.setVisible(true);

    }//GEN-LAST:event_btnLogoffMouseClicked

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed

    }//GEN-LAST:event_btnLogoffActionPerformed

    private void btnSuporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuporteMouseClicked
        JOptionPane.showMessageDialog(null, "Central de atendimento SysVet\n\nTelefone: (11)4647-6035\n"
                + "E-mail: suporte@sysvet.com.br\nSite: www.-------.com.br");
    }//GEN-LAST:event_btnSuporteMouseClicked

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuporteActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        // TODO add your handling code here:
        Fornecedor fo = new Fornecedor();
        fo.setVisible(true);
        if (bFornecedor) {
            pnConteudo.add(new Fornecedor(),"");
            
        }
        this.card.show(this.pnConteudo,"");
    }//GEN-LAST:event_btnFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgrpSexoCliente;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnProprietario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnServicos;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JButton btnVendas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label lblFulano;
    private java.awt.Panel panel1;
    private javax.swing.JPanel pnConteudo;
    // End of variables declaration//GEN-END:variables
}
