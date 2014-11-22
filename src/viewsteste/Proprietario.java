package viewsteste;

import classes.*;
import Auxiliares.Auxiliar;
import Auxiliares.TextLimitado;
import dao.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proprietario extends javax.swing.JPanel {

    /**
     * Creates new form Proprietario
     */
    public Proprietario() {
        initComponents();
        jpPropri.setVisible(false);

        //limite de caracteres proprietario
        txtNome.setDocument(new TextLimitado(50));
        txtRG.setDocument(new TextLimitado(10));
        txtEmail.setDocument(new TextLimitado(40));
        txtEndereco.setDocument(new TextLimitado(40));
        txtNumEnd.setDocument(new TextLimitado(6));
        txtComplemento.setDocument(new TextLimitado(20));
        txtBairro.setDocument(new TextLimitado(25));
        txtCidade.setDocument(new TextLimitado(35));
        txtEstado.setDocument(new TextLimitado(2));
        txtObservacao.setDocument(new TextLimitado(60));
    }

    boolean verificaConsulta = true;

    /*private void CarregaDados() {
     limparGrade();
     String titulos[] = {"matricula", "valorHora", "qtdeHoras"};
     Object dados[][] = {};
     DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
     Funcionarios.setModel(modelo);
     ArrayList<Funcionario> lista = new FuncionarioDAO().getListagem();
     for (int i = 0; i < lista.size(); i++) {
     modelo.addRow(new String[]{lista.get(i).getMatricula(), "" + lista.get(i).getValorHora(), ""
     + lista.get(i).getQtdeHoras()});
     }
     }*/
    ProprietarioDAO propDa = new ProprietarioDAO();
    DadosPessoaisDAO dadosDa = new DadosPessoaisDAO();
    EnderecoDAO endDa = new EnderecoDAO();
    ContatoDAO contDa = new ContatoDAO();

    public Proprietarios montarProprietario() {
        Proprietarios prop = new Proprietarios();
        prop.setCodProprietario(0);
        java.util.Date pega = txtDataCadastro.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        prop.setDataCadastro(formato.format(pega));
        prop.setObservacao(txtObservacao.getText());
        prop.setCodContato(0);
        prop.setCodDadosPessoais(0);
        prop.setCodEndereco(0);
        prop.setCodAnimal(0);
        /*
         prop.setDadospessoais(null);
         prop.setContato(null);
         prop.setEndereco(null);
         prop.setCliente(null);*/
        return prop;

    }

    public Contato montarContato() {
        Contato cont = new Contato();
        cont.setCodContato(0);
        cont.setEmail(txtEmail.getText());
        cont.setSite("");
        cont.setTelefoneResidencial(txtTelResid.getText());
        cont.setTelefoneCelular(txtTelCell.getText());
        cont.setTelefoneComercial("");
        return cont;
    }

    public Endereco montarEndereco() {
        Endereco end = new Endereco();
        end.setBairro(txtBairro.getText());
        end.setCEP(txtCEP.getText());
        end.setCidade(txtCidade.getText());
        end.setEstado(txtEstado.getText());
        end.setEndereco(txtEndereco.getText());
        end.setCodEndereco(0);
        end.setComplemento(txtComplemento.getText());
        end.setNumero(Integer.parseInt(txtNumEnd.getText()));
        return end;
    }

    public DadosPessoais montarDadosPessoais() {
        DadosPessoais dadosP = new DadosPessoais();
        dadosP.setCPF(txtCPF.getText());
        dadosP.setCodDadosPessoais(0);
        dadosP.setNome(txtNome.getText());
        java.util.Date pega = txtDataNascimento.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        dadosP.setDataNascimento(formato.format(pega));
        dadosP.setRG(txtRG.getText());
        return dadosP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSexo = new javax.swing.ButtonGroup();
        grpChip = new javax.swing.ButtonGroup();
        jtpPropCli = new javax.swing.JTabbedPane();
        jpProprietario = new javax.swing.JPanel();
        jpPropri = new javax.swing.JPanel();
        txtEndereco = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtObservacao = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtDataCadastro = new com.toedter.calendar.JDateChooser();
        txtEstado = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        btnAdicionarCliente = new javax.swing.JButton();
        btnPesquisarCli = new javax.swing.JButton();
        txtNumEnd = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbCliente = new javax.swing.JTable();
        txtDataNascimento = new com.toedter.calendar.JDateChooser("dd/MM/yyyy", "##/##/#####", '_');
        jLabel43 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtTelResid = new javax.swing.JFormattedTextField();
        txtTelCell = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        btnHistorico = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtRG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnPesquisarProp = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jpCliente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField11 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnHistoricoAnimal = new javax.swing.JButton();
        txtSalvarAnimal = new javax.swing.JButton();
        txtCancelarAnimal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnProntuario = new javax.swing.JButton();
        btnExcluirAnimal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtAnimal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jbSexoM = new javax.swing.JRadioButton();
        jbSexoF = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        txtCorAnimal = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtIdadeAnimal = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JComboBox();
        jcbPorteAnimal = new javax.swing.JComboBox();
        txtPesoAnimal = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtAlturaAnimal = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jbChipS = new javax.swing.JRadioButton();
        jbChipN = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        txtProp = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtNumChip = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtObservacaoAnimal = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        ckObito = new javax.swing.JCheckBox();
        txtNascimentoCli = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        txtTipoAnimal = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton27 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();

        setLayout(null);

        jtpPropCli.setBackground(new java.awt.Color(204, 204, 204));
        jtpPropCli.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jpProprietario.setBackground(new java.awt.Color(204, 204, 204));
        jpProprietario.setLayout(null);

        jpPropri.setBackground(new java.awt.Color(204, 204, 204));
        jpPropri.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpPropri.setLayout(null);
        jpPropri.add(txtEndereco);
        txtEndereco.setBounds(10, 130, 280, 28);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("Endereço");
        jpPropri.add(jLabel42);
        jLabel42.setBounds(10, 110, 130, 15);

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        jpPropri.add(txtBairro);
        txtBairro.setBounds(10, 180, 150, 28);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Bairro");
        jpPropri.add(jLabel44);
        jLabel44.setBounds(10, 160, 130, 15);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("CEP");
        jpPropri.add(jLabel45);
        jLabel45.setBounds(520, 110, 90, 15);
        jpPropri.add(txtCidade);
        txtCidade.setBounds(170, 180, 230, 28);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Cidade");
        jpPropri.add(jLabel46);
        jLabel46.setBounds(170, 160, 120, 15);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Clientes");
        jpPropri.add(jLabel47);
        jLabel47.setBounds(10, 260, 100, 15);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Telefone Resid.");
        jpPropri.add(jLabel48);
        jLabel48.setBounds(10, 60, 130, 15);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Telefone Cel.");
        jpPropri.add(jLabel49);
        jLabel49.setBounds(150, 60, 120, 15);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Data Cadastro");
        jpPropri.add(jLabel50);
        jLabel50.setBounds(470, 160, 150, 15);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jpPropri.add(txtEmail);
        txtEmail.setBounds(300, 80, 320, 28);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("E-mail");
        jpPropri.add(jLabel51);
        jLabel51.setBounds(300, 60, 51, 15);
        jpPropri.add(txtObservacao);
        txtObservacao.setBounds(10, 230, 610, 28);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Observação");
        jpPropri.add(jLabel52);
        jLabel52.setBounds(10, 210, 130, 15);

        txtDataCadastro.setBackground(new java.awt.Color(204, 204, 204));
        txtDataCadastro.setEnabled(false);
        txtDataCadastro.setMaxSelectableDate(new java.util.Date(253370775669000L));
        jpPropri.add(txtDataCadastro);
        txtDataCadastro.setBounds(470, 180, 150, 28);
        jpPropri.add(txtEstado);
        txtEstado.setBounds(410, 180, 50, 28);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("Nº");
        jpPropri.add(jLabel53);
        jLabel53.setBounds(300, 110, 60, 15);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Estado");
        jpPropri.add(jLabel54);
        jLabel54.setBounds(410, 160, 50, 15);

        btnAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnAdicionarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarClienteMouseClicked(evt);
            }
        });
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });
        jpPropri.add(btnAdicionarCliente);
        btnAdicionarCliente.setBounds(590, 280, 30, 35);

        btnPesquisarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        btnPesquisarCli.setToolTipText("");
        btnPesquisarCli.setPreferredSize(new java.awt.Dimension(100, 35));
        btnPesquisarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCliActionPerformed(evt);
            }
        });
        jpPropri.add(btnPesquisarCli);
        btnPesquisarCli.setBounds(590, 330, 30, 35);

        txtNumEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumEndActionPerformed(evt);
            }
        });
        jpPropri.add(txtNumEnd);
        txtNumEnd.setBounds(300, 130, 60, 28);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("RG");
        jpPropri.add(jLabel55);
        jLabel55.setBounds(510, 10, 110, 15);

        jtbCliente.setBorder(new javax.swing.border.MatteBorder(null));
        jtbCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CLIENTE", "ESPÉCIE", "RAÇA", "Nº CHIP/ANILHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtbClienteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jtbCliente);

        jpPropri.add(jScrollPane2);
        jScrollPane2.setBounds(10, 280, 570, 90);

        txtDataNascimento.setBackground(new java.awt.Color(204, 204, 204));
        txtDataNascimento.setAlignmentX(0.0F);
        txtDataNascimento.setAlignmentY(0.0F);
        jpPropri.add(txtDataNascimento);
        txtDataNascimento.setBounds(370, 30, 130, 28);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Data Nascimento");
        jpPropri.add(jLabel43);
        jLabel43.setBounds(370, 10, 130, 15);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("Complemento");
        jpPropri.add(jLabel57);
        jLabel57.setBounds(370, 110, 100, 15);
        jpPropri.add(txtComplemento);
        txtComplemento.setBounds(370, 130, 140, 28);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Nome");
        jpPropri.add(jLabel39);
        jLabel39.setBounds(10, 10, 100, 15);

        try {
            txtTelResid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpPropri.add(txtTelResid);
        txtTelResid.setBounds(10, 80, 130, 28);

        try {
            txtTelCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpPropri.add(txtTelCell);
        txtTelCell.setBounds(150, 80, 140, 28);

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jpPropri.add(txtCEP);
        txtCEP.setBounds(520, 130, 100, 28);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jpPropri.add(txtNome);
        txtNome.setBounds(10, 30, 350, 28);

        btnHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filefind.png"))); // NOI18N
        btnHistorico.setText("Histórico");
        btnHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseClicked(evt);
            }
        });
        jpPropri.add(btnHistorico);
        btnHistorico.setBounds(90, 380, 140, 35);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apply.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpPropri.add(btnSalvar);
        btnSalvar.setBounds(250, 380, 130, 35);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excluir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpPropri.add(btnCancelar);
        btnCancelar.setBounds(400, 380, 130, 35);

        txtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRGActionPerformed(evt);
            }
        });
        jpPropri.add(txtRG);
        txtRG.setBounds(510, 30, 110, 28);
        txtRG.getAccessibleContext().setAccessibleName("");
        txtRG.getAccessibleContext().setAccessibleDescription("");

        jpProprietario.add(jpPropri);
        jpPropri.setBounds(9, 74, 630, 430);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Proprietário");
        jpProprietario.add(jLabel8);
        jLabel8.setBounds(270, 10, 100, 15);

        btnPesquisarProp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_pesquisar.png"))); // NOI18N
        btnPesquisarProp.setText("Consultar");
        btnPesquisarProp.setToolTipText("");
        btnPesquisarProp.setPreferredSize(new java.awt.Dimension(100, 35));
        btnPesquisarProp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarPropMouseClicked(evt);
            }
        });
        btnPesquisarProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPropActionPerformed(evt);
            }
        });
        jpProprietario.add(btnPesquisarProp);
        btnPesquisarProp.setBounds(520, 30, 120, 28);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("CPF");
        jpProprietario.add(jLabel40);
        jLabel40.setBounds(340, 40, 30, 15);

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        jpProprietario.add(txtCPF);
        txtCPF.setBounds(380, 30, 120, 28);

        jtpPropCli.addTab("Proprietário", jpProprietario);

        jpCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpCliente.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Animal"));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(16, 48, 321, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nome do Animal");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(17, 27, 99, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Sexo");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(382, 27, 30, 15);

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("M");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(370, 47, 33, 23);

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("F");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(405, 47, 31, 23);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Cor");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 88, 21, 15);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(20, 109, 114, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Idade");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(152, 88, 35, 15);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(152, 109, 99, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Espécie");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(386, 88, 44, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Raça");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(474, 88, 29, 15);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Mamifero" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(386, 109, 70, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Pequeno", "Medio", "Grande" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(278, 156, 84, 20);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(20, 156, 114, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Peso");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(20, 135, 29, 15);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(152, 156, 114, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Altura");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(152, 135, 38, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Chip");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 194, 27, 15);

        jRadioButton3.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton3.setText("Sim");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(20, 216, 41, 23);

        jRadioButton4.setBackground(new java.awt.Color(204, 204, 204));
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Não");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(63, 216, 45, 23);

        jTextField9.setText("Siamês");
        jPanel1.add(jTextField9);
        jTextField9.setBounds(474, 109, 114, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Porte");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(278, 135, 34, 15);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(20, 270, 321, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Proprietário");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(20, 250, 73, 15);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto do Animal"));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gato.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel24))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(386, 135, 212, 225);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Nascimento");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(269, 88, 70, 15);

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Óbito");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(16, 313, 51, 23);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(150, 216, 116, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nº Chip/Anilha");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(153, 195, 90, 15);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(69, 314, 307, 46);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Observação");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(69, 296, 70, 15);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(267, 110, 90, 20);

        jpCliente.add(jPanel1);
        jPanel1.setBounds(11, 74, 0, 0);

        btnHistoricoAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filefind.png"))); // NOI18N
        btnHistoricoAnimal.setText("Histórico");
        btnHistoricoAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistoricoAnimalMouseClicked(evt);
            }
        });
        jpCliente.add(btnHistoricoAnimal);
        btnHistoricoAnimal.setBounds(140, 460, 120, 35);

        txtSalvarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apply.png"))); // NOI18N
        txtSalvarAnimal.setText("Salvar");
        txtSalvarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalvarAnimalActionPerformed(evt);
            }
        });
        jpCliente.add(txtSalvarAnimal);
        txtSalvarAnimal.setBounds(390, 460, 110, 35);

        txtCancelarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excluir.png"))); // NOI18N
        txtCancelarAnimal.setText("Cancelar");
        jpCliente.add(txtCancelarAnimal);
        txtCancelarAnimal.setBounds(505, 460, 120, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cliente");
        jpCliente.add(jLabel6);
        jLabel6.setBounds(290, 0, 42, 15);

        btnProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kedit.png"))); // NOI18N
        btnProntuario.setText("Prontuário");
        btnProntuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProntuarioMouseClicked(evt);
            }
        });
        jpCliente.add(btnProntuario);
        btnProntuario.setBounds(3, 460, 130, 35);

        btnExcluirAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btnExcluirAnimal.setText("Excluir");
        jpCliente.add(btnExcluirAnimal);
        btnExcluirAnimal.setBounds(266, 460, 120, 35);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);
        jPanel3.add(txtAnimal);
        txtAnimal.setBounds(10, 80, 430, 28);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Nome do Cliente");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(10, 60, 320, 15);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Sexo");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(450, 60, 30, 15);

        jbSexoM.setBackground(new java.awt.Color(204, 204, 204));
        grpSexo.add(jbSexoM);
        jbSexoM.setSelected(true);
        jbSexoM.setText("Masculino");
        jbSexoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSexoMActionPerformed(evt);
            }
        });
        jPanel3.add(jbSexoM);
        jbSexoM.setBounds(450, 80, 80, 23);

        jbSexoF.setBackground(new java.awt.Color(204, 204, 204));
        grpSexo.add(jbSexoF);
        jbSexoF.setText("Feminino");
        jbSexoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSexoFActionPerformed(evt);
            }
        });
        jPanel3.add(jbSexoF);
        jbSexoF.setBounds(530, 80, 80, 23);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Cor");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(10, 160, 21, 15);
        jPanel3.add(txtCorAnimal);
        txtCorAnimal.setBounds(10, 180, 270, 28);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Idade");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(140, 110, 35, 15);
        jPanel3.add(txtIdadeAnimal);
        txtIdadeAnimal.setBounds(140, 130, 140, 28);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Espécie");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(170, 210, 80, 15);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Raça");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(320, 210, 80, 15);

        txtEspecie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cachorro", "Gato", "Passarinho", "Peixe", " " }));
        txtEspecie.setSelectedIndex(4);
        txtEspecie.setToolTipText("");
        txtEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecieActionPerformed(evt);
            }
        });
        jPanel3.add(txtEspecie);
        txtEspecie.setBounds(170, 230, 140, 28);

        jcbPorteAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pequeno", "Medio", "Grande", "Muito Grande", " " }));
        jcbPorteAnimal.setSelectedIndex(4);
        jcbPorteAnimal.setToolTipText("");
        jcbPorteAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPorteAnimalActionPerformed(evt);
            }
        });
        jPanel3.add(jcbPorteAnimal);
        jcbPorteAnimal.setBounds(514, 130, 100, 28);
        jPanel3.add(txtPesoAnimal);
        txtPesoAnimal.setBounds(290, 130, 110, 28);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Peso");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(290, 110, 50, 15);
        jPanel3.add(txtAlturaAnimal);
        txtAlturaAnimal.setBounds(410, 130, 90, 28);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Altura");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(410, 110, 38, 15);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Chip");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(290, 160, 50, 15);

        jbChipS.setBackground(new java.awt.Color(204, 204, 204));
        grpChip.add(jbChipS);
        jbChipS.setSelected(true);
        jbChipS.setText("Sim");
        jbChipS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChipSActionPerformed(evt);
            }
        });
        jPanel3.add(jbChipS);
        jbChipS.setBounds(290, 180, 60, 23);

        jbChipN.setBackground(new java.awt.Color(204, 204, 204));
        grpChip.add(jbChipN);
        jbChipN.setText("Não");
        jbChipN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChipNActionPerformed(evt);
            }
        });
        jPanel3.add(jbChipN);
        jbChipN.setBounds(350, 180, 50, 23);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Porte");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(514, 110, 50, 15);

        txtProp.setEditable(false);
        txtProp.setRequestFocusEnabled(false);
        jPanel3.add(txtProp);
        txtProp.setBounds(10, 30, 600, 28);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Proprietário");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(10, 10, 90, 15);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Nascimento");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(10, 110, 70, 15);

        txtNumChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumChipActionPerformed(evt);
            }
        });
        jPanel3.add(txtNumChip);
        txtNumChip.setBounds(410, 180, 116, 28);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Nº Chip/Anilha");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(410, 160, 90, 15);
        jPanel3.add(txtObservacaoAnimal);
        txtObservacaoAnimal.setBounds(10, 290, 600, 120);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Observação");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(10, 270, 70, 15);

        ckObito.setBackground(new java.awt.Color(204, 204, 204));
        ckObito.setText("Declarar Óbito");
        ckObito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckObitoActionPerformed(evt);
            }
        });
        jPanel3.add(ckObito);
        ckObito.setBounds(280, 260, 130, 23);
        jPanel3.add(txtNascimentoCli);
        txtNascimentoCli.setBounds(10, 130, 120, 28);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("Tipo Animal");
        jPanel3.add(jLabel58);
        jLabel58.setBounds(10, 210, 150, 15);
        jPanel3.add(txtRaca);
        txtRaca.setBounds(320, 230, 290, 28);

        txtTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mamífero", "Ave", "Réptil", "Anfíbio", "Peixe", "" }));
        txtTipoAnimal.setSelectedIndex(5);
        txtTipoAnimal.setToolTipText("");
        txtTipoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoAnimalActionPerformed(evt);
            }
        });
        jPanel3.add(txtTipoAnimal);
        txtTipoAnimal.setBounds(10, 230, 150, 28);

        jpCliente.add(jPanel3);
        jPanel3.setBounds(10, 30, 620, 420);

        jtpPropCli.addTab("Cliente", jpCliente);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Histórico Proprietário");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(268, 1, 131, 15);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Histórico Proprietário"));
        jPanel5.setLayout(null);

        jTable3.setBorder(new javax.swing.border.MatteBorder(null));
        jTable3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rex", "22/02/2014", "15:00", "Dinheiro", "25/03/2014", "R$100,00", "Pago"},
                {"Rex", "22/02/2014", "13:30", "Débito", "25/03/2014", "R$200,00", "Pago"},
                {"Jhony", "21/01/2014", "10:00", "Crédito", "19/02/2014", "R$150,00", "Pago"},
                {"Rex", "13/03/2014", "7:00", "Dinheiro", "27/03/2014", "R$30,00", "Pago"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ANIMAL", "ATENDIMENTO", "HORÁRIO", "PAGAMENTO", "DATA PAG.", "VALOR", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(16, 21, 581, 380);

        jPanel6.add(jPanel5);
        jPanel5.setBounds(11, 28, 613, 410);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reload.png"))); // NOI18N
        jButton19.setText("Voltar");
        jPanel6.add(jButton19);
        jButton19.setBounds(480, 450, 140, 35);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fileprint.png"))); // NOI18N
        jButton25.setText("Imprimir");
        jPanel6.add(jButton25);
        jButton25.setBounds(330, 450, 140, 35);

        jtpPropCli.addTab("Histórico Proprietário", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Histórico Animal"));
        jPanel8.setLayout(null);

        jTable4.setBorder(new javax.swing.border.MatteBorder(null));
        jTable4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22/02/2014", "15:00", "Dr. Edvaldo", "Adalberto Batista", "Rex", "Cirurgia", "Aguardando"},
                {"22/02/2014", "13:30", "Dr. Rafael", "Adalberto Batista", "Rex", "Exame", "Realizado"},
                {"21/01/2014", "10:00", "Dra. Fernanda", "Adalberto Batista", "Rex", "Consulta", "Realizado"},
                {"13/03/2014", "7:00", "Dr. Rafael", "Adalberto Batista", "Rex", "Consulta", "Cancelaldo"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ATENDIMENTO", "HORÁRIO", "CLINICO", "PROPRIETÁRIO", "CLIENTE", "TIPO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel8.add(jScrollPane4);
        jScrollPane4.setBounds(16, 21, 581, 390);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(11, 26, 613, 430);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/kedit.png"))); // NOI18N
        jButton27.setText("Prontuário");
        jPanel7.add(jButton27);
        jButton27.setBounds(340, 460, 140, 35);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("Histórico do Animal");
        jPanel7.add(jLabel41);
        jLabel41.setBounds(271, 1, 119, 15);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fileprint.png"))); // NOI18N
        jButton28.setText("Imprimir");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton28);
        jButton28.setBounds(200, 460, 130, 32);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reload.png"))); // NOI18N
        jButton29.setText("Voltar");
        jPanel7.add(jButton29);
        jButton29.setBounds(490, 460, 130, 35);

        jtpPropCli.addTab("Histórico Cliente", jPanel7);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(null);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Prontuário");
        jPanel9.add(jLabel56);
        jLabel56.setBounds(290, 1, 66, 15);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Prontuário");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Exames Laboratoriais");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Hemograma Completo");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Urina");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fezes");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Exames de Imagem");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ultrasom");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Raio-X");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ressonancia Magnética");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tomografia");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Outros Procedimentos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Exames Psicológicos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Exames Bacterológicos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Virais");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Procedimentos Cirúrgicos");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Outros");
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane5.setViewportView(jTree1);

        jPanel9.add(jScrollPane5);
        jScrollPane5.setBounds(1, 34, 177, 412);

        jScrollPane1.setViewportView(jEditorPane1);

        jPanel9.add(jScrollPane1);
        jScrollPane1.setBounds(196, 34, 426, 412);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fileprint.png"))); // NOI18N
        jButton30.setText("Imprimir");
        jPanel9.add(jButton30);
        jButton30.setBounds(150, 460, 140, 35);

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_excluir.png"))); // NOI18N
        jButton31.setText("Cancelar");
        jPanel9.add(jButton31);
        jButton31.setBounds(510, 460, 110, 35);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anexo.png"))); // NOI18N
        jButton32.setText("Anexar Arquivo");
        jPanel9.add(jButton32);
        jButton32.setBounds(-1, 460, 150, 35);

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apply.png"))); // NOI18N
        jButton33.setText("Salvar");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton33);
        jButton33.setBounds(290, 460, 110, 35);

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        jButton34.setText("Excluir");
        jPanel9.add(jButton34);
        jButton34.setBounds(400, 460, 110, 35);

        jtpPropCli.addTab("Prontuário Cliente", jPanel9);

        add(jtpPropCli);
        jtpPropCli.setBounds(10, 11, 650, 537);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnAdicionarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarClienteMouseClicked
        jtpPropCli.setSelectedIndex(1);
        txtAnimal.requestFocusInWindow();
    }//GEN-LAST:event_btnAdicionarClienteMouseClicked

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        txtProp.setText(txtNome.getText());
        txtAnimal.requestFocusInWindow();
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnPesquisarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarCliActionPerformed

    private void btnPesquisarPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPropActionPerformed
        if (Auxiliar.validarCPF(txtCPF)) {
            ArrayList<Proprietarios> lista = new ProprietarioDAO().consultaProp(txtCPF.getText());
            if (lista != null) {
                jpPropri.setVisible(true);
                Auxiliar.limparTodosCampos(jpPropri);
                txtNome.setText(lista.get(0).getDadospessoais().getNome());
                txtCPF.setText(lista.get(0).getDadospessoais().getCPF());
                txtRG.setText(lista.get(0).getDadospessoais().getRG());
                txtTelResid.setText(lista.get(0).getContato().getTelefoneResidencial());
                txtTelCell.setText(lista.get(0).getContato().getTelefoneCelular());
                txtEmail.setText(lista.get(0).getContato().getEmail());
                txtEndereco.setText(lista.get(0).getEndereco().getEndereco());
                txtNumEnd.setText(lista.get(0).getEndereco().getNumero() + "");
                txtBairro.setText(lista.get(0).getEndereco().getBairro());
                txtComplemento.setText(lista.get(0).getEndereco().getComplemento());
                txtCEP.setText(lista.get(0).getEndereco().getCEP());
                txtCidade.setText(lista.get(0).getEndereco().getCidade());
                txtEstado.setText(lista.get(0).getEndereco().getEstado());
                try {
                    txtDataCadastro.setDate(Auxiliar.formataData(lista.get(0).getDataCadastro()));
                    txtDataNascimento.setDate(Auxiliar.formataData(lista.get(0).getDadospessoais().getDataNascimento()));
                } catch (Exception ex) {
                    Logger.getLogger(Proprietario.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtObservacao.setText(lista.get(0).getObservacao());
                verificaConsulta = true;
            } else {
                Object[] options = {"Sim", "Não"};
                int opcao = JOptionPane.showOptionDialog(null, "Proprietário não cadastrado, Deseja inserir um novo Proprietario?", "Não Encontrado",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (opcao == 0 || opcao == -1) {
                    jpPropri.setVisible(true);
                    Auxiliar.limparTodosCampos(jpPropri);
                    txtDataCadastro.setDate(new Date());
                    verificaConsulta = false;
                } else {
                    jpPropri.setVisible(false);
                    Auxiliar.limparTodosCampos(jpPropri);
                    verificaConsulta = true;
                }
            }

        } else {
            jpPropri.setVisible(false);
        }
    }//GEN-LAST:event_btnPesquisarPropActionPerformed

    private void jtbClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtbClienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbClienteAncestorAdded

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (Auxiliar.validarEmail(txtEmail)) {
            if (Auxiliar.validarCPF(txtCPF)) {
                if (verificaConsulta == false) {

                    Contato cont = montarContato();
                    Endereco end = montarEndereco();
                    DadosPessoais dad = montarDadosPessoais();
                    Proprietarios prop = montarProprietario();
                    int respD, respE, respC;
                    String respP;
                    ProprietarioDAO propDAO = new ProprietarioDAO();
                    EnderecoDAO endDAO = new EnderecoDAO();
                    DadosPessoaisDAO dadDAO = new DadosPessoaisDAO();
                    ContatoDAO contDAO = new ContatoDAO();
                    respD = dadDAO.incluirDados(dad);
                    if (respD < 0) {
                        JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
                    } else {
                        respE = endDAO.incluirEnd(end);
                        respC = contDAO.incluirCont(cont);
                        prop.setCodDadosPessoais(respD);
                        prop.setCodContato(respC);
                        prop.setCodEndereco(respE);
                        respP = propDAO.incluirProp(prop);
                        if (respP.equals("OK")) {
                            JOptionPane.showMessageDialog(null, "Proprietario gravado com sucesso");
                        } else {
                            JOptionPane.showMessageDialog(null, respP);
                        }
                        verificaConsulta = true;
                    }

                } else {//se nao for insercao será alteração
                    Contato cont = montarContato();
                    Endereco end = montarEndereco();
                    DadosPessoais dad = montarDadosPessoais();
                    Proprietarios prop = montarProprietario();
                    ProprietarioDAO propDAO = new ProprietarioDAO();
                    EnderecoDAO endDAO = new EnderecoDAO();
                    DadosPessoaisDAO dadDAO = new DadosPessoaisDAO();
                    ContatoDAO contDAO = new ContatoDAO();
                    String D, P, C, E;
                    D = dadDAO.alteraDados(dad);
                    C = contDAO.alteraCont(cont, dad.getCPF());
                    E = endDAO.alteraEnd(end, dad.getCPF());
                    P = propDAO.alteraProp(prop, dad.getCPF());
                    if (D.equals("ok") & E.equals("ok") & C.equals("ok") & P.equals("ok")) {
                        JOptionPane.showMessageDialog(null, "Alteraçao efetuada com sucesso");
                        Date pega = txtDataCadastro.getDate();

                    }

                }
            }//valida cpf novamente
        }//valida email
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    String ValidaSexo = "";

    private void jbSexoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSexoMActionPerformed
        if (jbSexoM.isSelected()) {
            ValidaSexo = "M";
        }
    }//GEN-LAST:event_jbSexoMActionPerformed

    private void jbSexoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSexoFActionPerformed
        if (jbSexoF.isSelected()) {
            ValidaSexo = "F";
        }
    }//GEN-LAST:event_jbSexoFActionPerformed

    private void txtEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecieActionPerformed

    private void jcbPorteAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPorteAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPorteAnimalActionPerformed

    String ValidaChip = "";

    private void jbChipSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChipSActionPerformed
        if (jbChipS.isSelected()) {
            ValidaChip = "S";
            txtNumChip.setEnabled(true);
        }
    }//GEN-LAST:event_jbChipSActionPerformed

    private void jbChipNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChipNActionPerformed
        if (jbChipN.isSelected()) {
            ValidaChip = "N";
            txtNumChip.setEnabled(false);
        }
    }//GEN-LAST:event_jbChipNActionPerformed

    private void txtNumChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumChipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumChipActionPerformed

    private void jTable3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3AncestorAdded

    private void jTable4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4AncestorAdded

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void btnHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseClicked
        jtpPropCli.setSelectedIndex(2);
    }//GEN-LAST:event_btnHistoricoMouseClicked

    private void btnHistoricoAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoAnimalMouseClicked
        // TODO add your handling code here:
        jtpPropCli.setSelectedIndex(3);
    }//GEN-LAST:event_btnHistoricoAnimalMouseClicked

    private void btnProntuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProntuarioMouseClicked
        jtpPropCli.setSelectedIndex(4);
    }//GEN-LAST:event_btnProntuarioMouseClicked

    private void btnPesquisarPropMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarPropMouseClicked
        jpPropri.setVisible(true);
    }//GEN-LAST:event_btnPesquisarPropMouseClicked

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNumEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumEndActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (verificaConsulta = false) {
            verificaConsulta = true;
        }
        txtCPF.setText(null);
        Auxiliar.limparTodosCampos(jpPropri);
        jpPropri.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTipoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoAnimalActionPerformed

    private void txtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGActionPerformed

    public Animal MontarAnimal() {
        Animal ani = new Animal();
        ani.setNomeAnimal(txtAnimal.getText());
        ani.setSexo(ValidaSexo);
        ani.setCor(txtCorAnimal.getText());
        java.util.Date pega = txtNascimentoCli.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ani.setNascimento(formato.format(pega));
        ani.setPeso(Float.parseFloat(txtPesoAnimal.getText()));
        ani.setAltura(Float.parseFloat(txtAlturaAnimal.getText()));
        ani.setPorte(jcbPorteAnimal.getSelectedItem().toString());
        ani.setChip(ValidaChip);
        ani.setNumeroChip(Integer.parseInt(txtNumChip.getText()));
        ani.setObito(ValidaObito);
        ani.setObservacao(txtObservacao.getText());
        //ani.setCodProntuario(1);
        ani.setCodTipoAnimal(txtTipoAnimal.getSelectedIndex());

        return ani;
    }

    public TipoAnimal MontarTipoAnimal() {
        TipoAnimal tpani = new TipoAnimal();
        tpani.setTipoAnimal(txtTipoAnimal.getSelectedItem().toString());

        return tpani;
    }
    
    public Especie MontarEspecie(){
        Especie esp = new Especie();
        esp.setEspecie(txtEspecie.getSelectedItem().toString());
        
        return esp;
    }
    
    public Raca MontarRaca(){
        Raca rc = new Raca();
        rc.setNomeRaca(txtRaca.getText());
        
        return rc;
    }

    private void txtSalvarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalvarAnimalActionPerformed
        Raca rac = MontarRaca();
        Especie esp = MontarEspecie();
        TipoAnimal tpani = MontarTipoAnimal();
        Animal ani = MontarAnimal();

        String aniA;
        int respA, respB, respC;
        
        RacaDAO racDao = new RacaDAO();
        EspecieDAO espDao = new EspecieDAO();
        TipoAnimalDAO tpDao = new TipoAnimalDAO();
        AnimalDAO aniDao = new AnimalDAO();

        respC = racDao.incluirRaca(rac);
        respB = espDao.incluirEspecie(esp);
        respA = tpDao.incluirTipoAnimal(tpani);
        aniA = aniDao.incluirAnimal(ani);

        esp.setCodRaca(respC);
        tpani.setCodEspecie(respB);
        ani.setCodTipoAnimal(respA);

        /*if (verificaConsulta == false){
            
         Contato cont = montarContato();
         Endereco end = montarEndereco();
         DadosPessoais dad = montarDadosPessoais();
         Proprietarios prop = montarProprietario();
         int respD, respE, respC;
         String respP;
         ProprietarioDAO propDAO = new ProprietarioDAO();
         EnderecoDAO endDAO = new EnderecoDAO();
         DadosPessoaisDAO dadDAO = new DadosPessoaisDAO();
         ContatoDAO contDAO = new ContatoDAO();
         respD = dadDAO.incluirDados(dad);
         if (respD < 0) {
         JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
         } else {
         respE = endDAO.incluirEnd(end);
         respC = contDAO.incluirCont(cont);
         prop.setCodDadosPessoais(respD);
         prop.setCodContato(respC);
         prop.setCodEndereco(respE);
         respP = propDAO.incluirProp(prop);
         if (respP.equals("OK")) {
         JOptionPane.showMessageDialog(null, "Proprietario gravado com sucesso");
         } else {
         JOptionPane.showMessageDialog(null, respP);
         }
         verificaConsulta = true;
         }

         } else {//se nao for insercao será alteração
         Contato cont = montarContato();
         Endereco end = montarEndereco();
         DadosPessoais dad = montarDadosPessoais();
         Proprietarios prop = montarProprietario();
         ProprietarioDAO propDAO = new ProprietarioDAO();
         EnderecoDAO endDAO = new EnderecoDAO();
         DadosPessoaisDAO dadDAO = new DadosPessoaisDAO();
         ContatoDAO contDAO = new ContatoDAO();
         String D, P, C, E;
         D = dadDAO.alteraDados(dad);
         C = contDAO.alteraCont(cont, dad.getCPF());
         E = endDAO.alteraEnd(end, dad.getCPF());
         P = propDAO.alteraProp(prop, dad.getCPF());
         if (D.equals("ok") & E.equals("ok") & C.equals("ok") & P.equals("ok")) {
         JOptionPane.showMessageDialog(null, "Alteraçao efetuada com sucesso");
         Date pega = txtDataCadastro.getDate();
         }
         }*/
    }//GEN-LAST:event_txtSalvarAnimalActionPerformed

    boolean ValidaObito = false;

    private void ckObitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckObitoActionPerformed
        if (ckObito.isSelected()) {
            ValidaObito = true;
        }
    }//GEN-LAST:event_ckObitoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirAnimal;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnHistoricoAnimal;
    private javax.swing.JButton btnPesquisarCli;
    private javax.swing.JButton btnPesquisarProp;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckObito;
    private javax.swing.ButtonGroup grpChip;
    private javax.swing.ButtonGroup grpSexo;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JEditorPane jEditorPane1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTree jTree1;
    private javax.swing.JRadioButton jbChipN;
    private javax.swing.JRadioButton jbChipS;
    private javax.swing.JRadioButton jbSexoF;
    private javax.swing.JRadioButton jbSexoM;
    private javax.swing.JComboBox jcbPorteAnimal;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpPropri;
    private javax.swing.JPanel jpProprietario;
    private javax.swing.JTable jtbCliente;
    private javax.swing.JTabbedPane jtpPropCli;
    private javax.swing.JTextField txtAlturaAnimal;
    private javax.swing.JTextField txtAnimal;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JButton txtCancelarAnimal;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCorAnimal;
    private com.toedter.calendar.JDateChooser txtDataCadastro;
    private com.toedter.calendar.JDateChooser txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JComboBox txtEspecie;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdadeAnimal;
    private com.toedter.calendar.JDateChooser txtNascimentoCli;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumChip;
    private javax.swing.JTextField txtNumEnd;
    private javax.swing.JTextField txtObservacao;
    private javax.swing.JTextField txtObservacaoAnimal;
    private javax.swing.JTextField txtPesoAnimal;
    private javax.swing.JTextField txtProp;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRaca;
    private javax.swing.JButton txtSalvarAnimal;
    private javax.swing.JFormattedTextField txtTelCell;
    private javax.swing.JFormattedTextField txtTelResid;
    private javax.swing.JComboBox txtTipoAnimal;
    // End of variables declaration//GEN-END:variables
}
