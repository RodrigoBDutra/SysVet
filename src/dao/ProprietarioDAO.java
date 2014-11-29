package dao;

import classes.*;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class ProprietarioDAO extends Banco {

    

    /**
     * Pesquisa um Proprietarios pelo nome
     *
     * @param cpf
     * @return null se não achar ou o objeto preenchido se achar
     */
    public ArrayList<Proprietarios> consultaProp(String cpf) {
        ArrayList<Proprietarios> lista = new ArrayList<Proprietarios>();
        try {
            conecta();
            String sql = "SELECT p.codproprietario, d.nome, d.dataNascimento, d.cpf, d.rg, p.dataCadastro, p.observacoes, c.telefoneResidencial, c.telefoneCelular,"
                    + "c.email, e.endereco, e.numero, e.bairro, e.complemento, e.cep, e.cidade, e.estado "
                    + "FROM dadospessoais d "
                    + "INNER JOIN proprietario p "
                    + "ON p.codDadosPessoais = d.codDadosPessoais "
                    + "INNER JOIN contatos c "
                    + "ON p.codContato = c.codContato "
                    + "INNER JOIN endereco e "
                    + "ON p.codEndereco = e.codEndereco "
                    + "WHERE d.cpf = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            Proprietarios prop = new Proprietarios();
            DadosPessoais dad = new DadosPessoais();
            Contato cont = new Contato();
            Endereco end = new Endereco();

            if (rs.next()) {
                
                dad.setNome(rs.getString("nome"));
                dad.setDataNascimento(rs.getString("dataNascimento"));
                dad.setCPF(rs.getString("cpf"));
                dad.setRG(rs.getString("rg"));
                cont.setTelefoneResidencial(rs.getString("telefoneResidencial"));
                cont.setTelefoneCelular(rs.getString("telefoneCelular"));
                cont.setEmail(rs.getString("email"));
                end.setEndereco(rs.getString("endereco"));
                end.setNumero(rs.getInt("numero"));
                end.setCEP(rs.getString("cep"));
                end.setBairro(rs.getString("bairro"));
                end.setComplemento(rs.getString("complemento"));
                end.setCidade(rs.getString("cidade"));
                end.setEstado(rs.getString("estado"));
                prop.setDataCadastro(rs.getString("dataCadastro"));
                prop.setObservacao(rs.getString("observacoes"));
                prop.setCodProprietario(rs.getInt("codProprietario"));
                prop.setEndereco(end);
                prop.setContato(cont);
                prop.setDadospessoais(dad);

                lista.add(prop);

            } else {
                lista = null;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            imprimeErro("Erro ao buscar pessoas", e.getMessage());
            return null;
        }
        return lista;
    }

    /**
     * Cadastro um Proprietarios no banco de dados
     *
     * @param prop
     * @return ok para sucesso ou mensagem de erro
     */
    public String incluirProp(Proprietarios prop) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO proprietario(dataCadastro, observacoes, codDadosPessoais, codContato, codEndereco)"
                    + "VALUES('" + prop.getDataCadastro() + "','" + prop.getObservacao() + "'," + prop.getCodDadosPessoais() + "," + prop.getCodContato() + "," + prop.getCodEndereco() + ")";

            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            imprimeErro("Erro em Incluir Proprietário", e.toString());
        }
        return resp;
    }

    /**
     * Alterar um Proprietarios
     */
    public String alteraProp(Proprietarios prop, String cpf) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE proprietario SET observacoes = '" + prop.getObservacao() + "' "
                    + "WHERE codDadosPessoais = ("
                    + "SELECT codDadosPessoais FROM dadospessoais WHERE cpf = '" + cpf + "')";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

            resp = "ok";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

    /**
     * Deleta um Proprietarios
     */
    public String excluirProp(Proprietarios prop) {
        DadosPessoais dad = new DadosPessoais();
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "ON DELETE CASCADE FROM proprietario USING dadospessoais WHERE cpf='" + dad.getCPF() + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

        } catch (Exception e) {
            imprimeErro("Erro ao deletarProprietário", e.toString());
        }
        return resp;
    }

    private void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
        System.err.println(msg);
        System.out.println(msgErro);
    }
}
