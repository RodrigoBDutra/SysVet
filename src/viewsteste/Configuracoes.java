/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsteste;

import dao.Banco;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author vini
 */
public class Configuracoes extends javax.swing.JPanel {

    Banco ba = new Banco();
    String sen;
    int flag = 0;
    int codigoCons = 0;
    String loginAtual = "";

    /**
     * Creates new form Configuracao
     */
    public Configuracoes() {
        initComponents();
        PainelConf.setVisible(false);
    }

    public boolean validaCampos(JTextField nome, JTextField login, JTextField senha, JCheckBox mantSen, JTextField senhaAtual, JTextField senhaNova) {
        String expr = "";
        if (nome.equals("") || nome == null) {
            nome.requestFocus();
            expr += " Nome ";
        }
        if (login.equals("") || login == null) {
            login.requestFocus();
            expr += " login ";
        }
        if (senha.equals("") && flag == 1) {
            expr += " senha ";
            return false;
        }

        if (flag == 0 && !mantSen.isSelected() && mantSen.equals("")) {
            mantSen.requestFocus();
            expr += " nova senha ";
        }

        if (flag == 0 && !mantSen.isSelected() && senhaAtual.equals("")) {
            senhaAtual.requestFocus();
            expr += " senha atual ";
        }
        return true;
    }

    public void limpaTela() {
        txt_nome2.setText("");
        txt_login2.setText("");
        txt_senhaAtual2.setText("");
        txt_senha2.setText("");
        txt_NovaSenha2.setText("");
        manterSenha3.setSelected(true);
        checkPerProprietario.setSelected(false);
        checkPerAgenda.setSelected(false);
        checkPerServico.setSelected(false);
        checkPerEstoque.setSelected(false);
        checkPerVenda.setSelected(false);
        checkPerFornecedor.setSelected(false);
        checkPerFinanceiro.setSelected(false);
        checkPerProdutos.setSelected(false);
        checkPerConfiguracoes.setSelected(false);
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
        jLabel6 = new javax.swing.JLabel();
        btnBackup = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        PainelConf = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        txt_login2 = new javax.swing.JTextField();
        txt_nome2 = new javax.swing.JTextField();
        txt_senha2 = new javax.swing.JPasswordField();
        txt_senhaAtual2 = new javax.swing.JPasswordField();
        manterSenha3 = new javax.swing.JCheckBox();
        jLabel51 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txt_NovaSenha2 = new javax.swing.JPasswordField();
        jLabel56 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        checkPerAgenda = new javax.swing.JCheckBox();
        checkPerProprietario = new javax.swing.JCheckBox();
        checkPerFornecedor = new javax.swing.JCheckBox();
        checkPerServico = new javax.swing.JCheckBox();
        checkPerEstoque = new javax.swing.JCheckBox();
        checkPerVenda = new javax.swing.JCheckBox();
        checkPerFinanceiro = new javax.swing.JCheckBox();
        checkPerProdutos = new javax.swing.JCheckBox();
        checkPerConfiguracoes = new javax.swing.JCheckBox();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        txt_BuscaLogin2 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Configurações");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(261, 1, 87, 15);

        btnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backup.png"))); // NOI18N
        btnBackup.setText("Realizar Backup");
        btnBackup.setToolTipText("");
        btnBackup.setPreferredSize(new java.awt.Dimension(100, 35));
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });
        jPanel6.add(btnBackup);
        btnBackup.setBounds(460, 460, 140, 30);

        jTextField16.setText("C:\\Users\\Rafael\\Documentos/SysVet");
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField16);
        jTextField16.setBounds(150, 460, 301, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Diretório Backup:");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(30, 470, 97, 10);

        PainelConf.setBackground(new java.awt.Color(153, 153, 153));
        PainelConf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelConf.setLayout(null);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apply.png"))); // NOI18N
        btnAlterar.setText("Salvar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterar1ActionPerformed(evt);
            }
        });
        PainelConf.add(btnAlterar);
        btnAlterar.setBounds(490, 140, 100, 30);

        txt_login2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_login2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_login2txt_loginMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_login2txt_loginMouseReleased(evt);
            }
        });
        txt_login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_login2txt_loginActionPerformed(evt);
            }
        });
        PainelConf.add(txt_login2);
        txt_login2.setBounds(10, 90, 210, 28);

        txt_nome2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PainelConf.add(txt_nome2);
        txt_nome2.setBounds(10, 40, 440, 28);

        txt_senha2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_senha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senha2txt_senhaActionPerformed(evt);
            }
        });
        PainelConf.add(txt_senha2);
        txt_senha2.setBounds(240, 90, 210, 28);

        txt_senhaAtual2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_senhaAtual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaAtual2txt_senhaAtualActionPerformed(evt);
            }
        });
        PainelConf.add(txt_senhaAtual2);
        txt_senhaAtual2.setBounds(260, 180, 180, 28);

        manterSenha3.setBackground(new java.awt.Color(204, 204, 204));
        manterSenha3.setSelected(true);
        manterSenha3.setText("Manter senha atual");
        manterSenha3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                manterSenha3ItemStateChanged(evt);
            }
        });
        manterSenha3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                manterSenha3StateChanged(evt);
            }
        });
        manterSenha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manterSenha3manterSenha1ActionPerformed(evt);
            }
        });
        PainelConf.add(manterSenha3);
        manterSenha3.setBounds(260, 260, 170, 20);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Nome");
        PainelConf.add(jLabel51);
        jLabel51.setBounds(10, 20, 100, 20);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });
        PainelConf.add(btnExcluir);
        btnExcluir.setBounds(490, 180, 100, 30);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Senha");
        PainelConf.add(jLabel52);
        jLabel52.setBounds(240, 70, 80, 20);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("Senha Atual");
        PainelConf.add(jLabel53);
        jLabel53.setBounds(260, 160, 140, 20);

        txt_NovaSenha2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_NovaSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NovaSenha2txt_NovaSenhaActionPerformed(evt);
            }
        });
        PainelConf.add(txt_NovaSenha2);
        txt_NovaSenha2.setBounds(260, 230, 180, 28);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Nova Senha");
        PainelConf.add(jLabel56);
        jLabel56.setBounds(260, 210, 140, 20);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Permissões"));
        jPanel8.setLayout(null);

        checkPerAgenda.setBackground(new java.awt.Color(204, 204, 204));
        checkPerAgenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerAgenda.setText("Agenda");
        checkPerAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerAgendajCheckBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerAgenda);
        checkPerAgenda.setBounds(10, 50, 67, 23);

        checkPerProprietario.setBackground(new java.awt.Color(204, 204, 204));
        checkPerProprietario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerProprietario.setText("Proprietário");
        checkPerProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerProprietariojCheckBox3ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerProprietario);
        checkPerProprietario.setBounds(10, 20, 90, 23);

        checkPerFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        checkPerFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerFornecedor.setText("Fornecedor");
        checkPerFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerFornecedorjCheckBox8ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerFornecedor);
        checkPerFornecedor.setBounds(10, 110, 87, 23);

        checkPerServico.setBackground(new java.awt.Color(204, 204, 204));
        checkPerServico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerServico.setText("Serviço");
        checkPerServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerServicojCheckBox9ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerServico);
        checkPerServico.setBounds(10, 80, 65, 23);

        checkPerEstoque.setBackground(new java.awt.Color(204, 204, 204));
        checkPerEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerEstoque.setText("Estoque");
        checkPerEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerEstoquejCheckBox10ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerEstoque);
        checkPerEstoque.setBounds(10, 140, 71, 23);

        checkPerVenda.setBackground(new java.awt.Color(204, 204, 204));
        checkPerVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerVenda.setText("Vendas");
        checkPerVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerVendajCheckBox11ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerVenda);
        checkPerVenda.setBounds(110, 20, 65, 23);

        checkPerFinanceiro.setBackground(new java.awt.Color(204, 204, 204));
        checkPerFinanceiro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerFinanceiro.setText("Financeiro");
        checkPerFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerFinanceirojCheckBox12ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerFinanceiro);
        checkPerFinanceiro.setBounds(110, 50, 79, 23);

        checkPerProdutos.setBackground(new java.awt.Color(204, 204, 204));
        checkPerProdutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerProdutos.setText("Produtos");
        checkPerProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerProdutosjCheckBox13ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerProdutos);
        checkPerProdutos.setBounds(110, 80, 75, 20);

        checkPerConfiguracoes.setBackground(new java.awt.Color(204, 204, 204));
        checkPerConfiguracoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerConfiguracoes.setText("Configurações");
        checkPerConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPerConfiguracoesjCheckBox16ActionPerformed(evt);
            }
        });
        jPanel8.add(checkPerConfiguracoes);
        checkPerConfiguracoes.setBounds(110, 110, 110, 23);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel8.add(jSeparator12);
        jSeparator12.setBounds(100, 30, 10, 102);

        PainelConf.add(jPanel8);
        jPanel8.setBounds(10, 140, 230, 170);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("Login");
        PainelConf.add(jLabel57);
        jLabel57.setBounds(10, 70, 90, 20);

        jPanel6.add(PainelConf);
        PainelConf.setBounds(10, 100, 620, 350);

        txt_BuscaLogin2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(txt_BuscaLogin2);
        txt_BuscaLogin2.setBounds(30, 50, 180, 28);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Login");
        jPanel6.add(jLabel50);
        jLabel50.setBounds(30, 30, 90, 20);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        btnBuscar.setText("Consultar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnBuscar);
        btnBuscar.setBounds(220, 50, 120, 28);

        jTabbedPane1.addTab("Configurações", jPanel6);

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

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackupActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void btnAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterar1ActionPerformed
        if (flag == 0) {//alterar
            if (!txt_login2.getText().equals(loginAtual) &&  !ba.valida(txt_login2.getText())) {
                JOptionPane.showMessageDialog(null, "Este login já está sendo usado, Por favor, digite outro login!");
                txt_login2.requestFocus();
                txt_BuscaLogin2.setText("");
            } else {
                String nome, login, senhaNova, senhaAtual, permissao = "", senha;
                nome = txt_nome2.getText();
                login = txt_login2.getText();
                senhaNova = txt_NovaSenha2.getText();
                txt_senha2.setEditable(false);
                
                if (manterSenha3.isSelected()) {
                    senha = sen;
                } else {
                    senha = senhaNova;
                }
                senhaAtual = txt_senhaAtual2.getText();
                
                if (checkPerProprietario.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerAgenda.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerServico.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerFornecedor.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerEstoque.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerVenda.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerFinanceiro.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                if (checkPerProdutos.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                
                if (checkPerConfiguracoes.isSelected()) {
                    permissao += "1";
                } else {
                    permissao += "0";
                }
                
                if (ba.verificaSenha(codigoCons, senhaAtual) || manterSenha3.isSelected()) {
                    if (ba.atualizaUsuario(codigoCons, nome, login, senha, permissao)) {
                        codigoCons = 0;
                        limpaTela();
                        PainelConf.setVisible(false);
                        JOptionPane.showMessageDialog(null, "O Usuario foi atualizado corretamente!");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "O Usuario não foi atualizado corretamente!");
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "senha Atual incorreta para o login: " + login);
                }
            }
        } else if (flag == 1) {//insercao
            if (validaCampos(txt_nome2, txt_login2, txt_senha2, manterSenha3, txt_NovaSenha2, txt_senhaAtual2)) {
                if (ba.buscaUsuario(txt_login2.getText()) != null) {
                    JOptionPane.showMessageDialog(null, "Este login já está sendo usado, Por favor, digite outro login!");
                    txt_login2.requestFocus();
                } else {
                    String nome, login, senha, permissao = "";
                    nome = txt_nome2.getText();
                    login = txt_login2.getText();
                    senha = txt_senha2.getText();
                    String logado = "n";
                    txt_senha2.setEditable(true);
                    if (checkPerProprietario.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }

                    if (checkPerAgenda.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (checkPerServico.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (checkPerFornecedor.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (checkPerEstoque.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (checkPerVenda.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (checkPerFinanceiro.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (checkPerProdutos.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }

                    if (checkPerConfiguracoes.isSelected()) {
                        permissao += "1";
                    } else {
                        permissao += "0";
                    }
                    if (ba.gravaUsuario(nome, login, senha, permissao, logado)) {
                        PainelConf.setVisible(false);
                        limpaTela();
                        codigoCons = 0;
                        flag = 0;
                    }

                }

            } else {//se estiver os campos vazios
                JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos.");
            }
        }
    }//GEN-LAST:event_btnAlterar1ActionPerformed

    private void txt_login2txt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_login2txt_loginMouseClicked

    }//GEN-LAST:event_txt_login2txt_loginMouseClicked

    private void txt_login2txt_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_login2txt_loginMouseReleased

    }//GEN-LAST:event_txt_login2txt_loginMouseReleased

    private void txt_login2txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_login2txt_loginActionPerformed

    }//GEN-LAST:event_txt_login2txt_loginActionPerformed

    private void txt_senha2txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senha2txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senha2txt_senhaActionPerformed

    private void txt_senhaAtual2txt_senhaAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaAtual2txt_senhaAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaAtual2txt_senhaAtualActionPerformed

    private void manterSenha3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_manterSenha3ItemStateChanged

    }//GEN-LAST:event_manterSenha3ItemStateChanged

    private void manterSenha3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_manterSenha3StateChanged
        if (manterSenha3.isSelected()) {
            txt_senhaAtual2.setEnabled(false);
            txt_NovaSenha2.setEnabled(false);
        } else {
            txt_senhaAtual2.setEnabled(true);
            txt_NovaSenha2.setEnabled(true);
        }
    }//GEN-LAST:event_manterSenha3StateChanged

    private void manterSenha3manterSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manterSenha3manterSenha1ActionPerformed

    }//GEN-LAST:event_manterSenha3manterSenha1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Pesquise um Usuario para excluir");

        } else if (flag == 0) {

            if (ba.excluiUsuario(codigoCons)) {
                txt_BuscaLogin2.setText("");
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                limpaTela();
            } else {
                JOptionPane.showMessageDialog(null, "Não encontrado");
            }

        }
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void txt_NovaSenha2txt_NovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NovaSenha2txt_NovaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NovaSenha2txt_NovaSenhaActionPerformed

    private void checkPerAgendajCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerAgendajCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerAgendajCheckBox1ActionPerformed

    private void checkPerProprietariojCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerProprietariojCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerProprietariojCheckBox3ActionPerformed

    private void checkPerFornecedorjCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerFornecedorjCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerFornecedorjCheckBox8ActionPerformed

    private void checkPerServicojCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerServicojCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerServicojCheckBox9ActionPerformed

    private void checkPerEstoquejCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerEstoquejCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerEstoquejCheckBox10ActionPerformed

    private void checkPerVendajCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerVendajCheckBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerVendajCheckBox11ActionPerformed

    private void checkPerFinanceirojCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerFinanceirojCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerFinanceirojCheckBox12ActionPerformed

    private void checkPerProdutosjCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerProdutosjCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerProdutosjCheckBox13ActionPerformed

    private void checkPerConfiguracoesjCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPerConfiguracoesjCheckBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPerConfiguracoesjCheckBox16ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        if (txt_BuscaLogin2 == null || txt_BuscaLogin2.getText().equals("") || txt_BuscaLogin2.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um login para efetuar a busca.");
        } else {
            ResultSet rs;
            String login = txt_BuscaLogin2.getText();
            String permissao;

            rs = ba.buscaUsuario(login);
            try {
                if (ba.buscaUsuario(login) != null) {
                    txt_senha2.setEnabled(false);
                    PainelConf.setVisible(true);
                    manterSenha3.setEnabled(true);
                    txt_senhaAtual2.setEnabled(false);
                    txt_NovaSenha2.setEnabled(false);
                    txt_nome2.setText(rs.getString("nome"));
                    codigoCons = rs.getInt("codigo");
                    sen = rs.getString("senha");
                    permissao = rs.getString("permissao");
                    txt_login2.setText(txt_BuscaLogin2.getText());
                    loginAtual = txt_login2.getText();

                    char a = '1';

                    if (permissao.charAt(0) == a) {
                        checkPerProprietario.setSelected(true);
                    } else {
                        checkPerProprietario.setSelected(false);
                    }

                    if (permissao.charAt(1) == a) {
                        checkPerAgenda.setSelected(true);
                    } else {
                        checkPerAgenda.setSelected(false);
                    }

                    if (permissao.charAt(2) == a) {
                        checkPerServico.setSelected(true);
                    } else {
                        checkPerServico.setSelected(false);
                    }

                    if (permissao.charAt(3) == a) {
                        checkPerFornecedor.setSelected(true);
                    } else {
                        checkPerFornecedor.setSelected(false);
                    }

                    if (permissao.charAt(4) == a) {
                        checkPerEstoque.setSelected(true);
                    } else {
                        checkPerEstoque.setSelected(false);
                    }

                    if (permissao.charAt(5) == a) {
                        checkPerVenda.setSelected(true);
                    } else {
                        checkPerVenda.setSelected(false);
                    }
                    if (permissao.charAt(6) == a) {
                        checkPerFinanceiro.setSelected(true);
                    } else {
                        checkPerFinanceiro.setSelected(false);
                    }
                    if (permissao.charAt(7) == a) {
                        checkPerProdutos.setSelected(true);
                    } else {
                        checkPerProdutos.setSelected(false);
                    }
                    if (permissao.charAt(8) == a) {
                        checkPerConfiguracoes.setSelected(true);
                    } else {
                        checkPerConfiguracoes.setSelected(false);
                    }
                } else {
                    limpaTela();
                    Object[] options = {"Sim", "Não"};
                    int opcao = JOptionPane.showOptionDialog(null, "O Usuario não foi encontrado, Deseja inserir um novo Usuario?", "Não Encontrado",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                    if (opcao == 0 || opcao == -1) {
                        limpaTela();
                        PainelConf.setVisible(true);
                        flag = 1;
                        codigoCons = 0;
                        txt_login2.setText(txt_BuscaLogin2.getText());
                        txt_BuscaLogin2.setText("");
                        txt_senha2.setEnabled(true);
                        manterSenha3.setEnabled(false);
                        loginAtual = "";
                    } else {
                        PainelConf.setVisible(false);
                        limpaTela();
                        flag = 0;
                        loginAtual = "";
                    }

                }

            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelConf;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JCheckBox checkPerAgenda;
    private javax.swing.JCheckBox checkPerConfiguracoes;
    private javax.swing.JCheckBox checkPerEstoque;
    private javax.swing.JCheckBox checkPerFinanceiro;
    private javax.swing.JCheckBox checkPerFornecedor;
    private javax.swing.JCheckBox checkPerProdutos;
    private javax.swing.JCheckBox checkPerProprietario;
    private javax.swing.JCheckBox checkPerServico;
    private javax.swing.JCheckBox checkPerVenda;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JCheckBox manterSenha3;
    private javax.swing.JTextField txt_BuscaLogin2;
    private javax.swing.JPasswordField txt_NovaSenha2;
    private javax.swing.JTextField txt_login2;
    private javax.swing.JTextField txt_nome2;
    private javax.swing.JPasswordField txt_senha2;
    private javax.swing.JPasswordField txt_senhaAtual2;
    // End of variables declaration//GEN-END:variables
}
