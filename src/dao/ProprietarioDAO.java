package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProprietarioDAO extends Banco {

    /* public ArrayList<Proprietario> getListagem() {
     ArrayList<Proprietario> listaProprietario = new ArrayList<Proprietario>();
     try {
     conecta();
     Statement stmt = con.createStatement();
     String sql = "SELECT * FROM proprietario ORDER BY nome";
     ResultSet rs = stmt.executeQuery(sql);
     while (rs.next()) {
     Proprietarios prop = new Proprietarios();
     prop.setNome(rs.getString("nome"));
     prop.setData(rs.getString("data"));
     prop.setCpf(rs.getInt("cpf"));
     prop.setRg(rs.getString("rg"));
     prop.setTelResidencia(rs.getInt("telResidencial"));
     prop.setTelCelular(rs.getInt("telCelular"));
     prop.setEmail(rs.getString("email"));
     prop.setEndereco(rs.getString("endereco"));
     prop.setNumero(rs.getInt("numero"));
     prop.setCep(rs.getInt("cep"));
     prop.setBairro(rs.getString("bairro"));
     prop.setCidade(rs.getString("cidade"));
     prop.setEstado((char) rs.getObject("estado")); // ainda não vi como colocar variavel CHAR acho que é assim
     prop.setDataCadastro(rs.getString("dataCadastro"));
     prop.setObservacao(rs.getString("observacao"));
     listaProprietario.add(prop);
     }
     rs.close();
     stmt.close();
     con.close();
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "ERRO: " + e.toString());
     }
     return listaProprietario;
     }
     */
    /**
     * Pesquisa um Proprietarios pelo nome
     *
     * @param nome a ser pesquisado
     * @return null se não achar ou o objeto preenchido se achar
     */
    public ArrayList<ProprietarioDAO> consultaProp(String cpf) {
        ArrayList<ProprietarioDAO> listaProprietario = new ArrayList<ProprietarioDAO>();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT d.nome, d.dataNascimento, d.cpf, d.rg, p.dataCadastro, p.observacoes, c.telefoneResidencial, c.telefoneCelular, \n"
                    + "c.email, e.endereco, e.numero, e.bairro, e.complemento, e.cep, e.cidade, e.estado\n"
                    + "FROM dadospessoais d INNER JOIN proprietario p \n"
                    + "ON p.codDadosPessoais = d.codDadosPessoais\n"
                    + "INNER JOIN contatos c\n"
                    + "ON p.codContato = c.codContato\n"
                    + "INNER JOIN endereco e\n"
                    + "ON p.codEndereco = e.codEndereco\n"
                    + "WHERE d.cpf = '" + cpf + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Proprietarios prop = new Proprietarios();
                DadosPessoais dad = new DadosPessoais();
                Contato cont = new Contato();
                Endereco end = new Endereco();
                //pega os atributos
                dad.setNome(rs.getString("nome"));
                dad.setDataNascimento(rs.getString("data"));
                dad.setCPF(rs.getString("cpf"));
                dad.setRG(rs.getString("rg"));
                cont.setTelefoneResidencial(rs.getString("telResidencial"));
                cont.setTelefoneCelular(rs.getString("telCelular"));
                cont.setEmail(rs.getString("email"));
                end.setEndereco(rs.getString("endereco"));
                end.setNumero(rs.getInt("numero"));
                end.setCEP(rs.getString("cep"));
                end.setBairro(rs.getString("bairro"));
                end.setCidade(rs.getString("cidade"));
                end.setEstado(rs.getString("estado"));
                prop.setDataCadastro(rs.getString("dataCadastro"));
                prop.setObservacao(rs.getString("observacao"));
                listaProprietario.add(temp);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            imprimeErro("Erro ao buscar pessoas", e.getMessage());
            return null;
        }
        return null;
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
            //rs.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            imprimeErro("Erro em IncluirProprietário", e.toString());
        }
        return resp;
    }

    /**
     * Alterar um Proprietarios
     */
    public String alteraProp(Proprietarios prop) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE proprietario set nome ='"/* + prop.getNome() + "' , data ='" +prop.getData()+ "' , cpf ='"+prop.getCpf()+
                     "', rg='"+prop.getRg()+ "', telResidencial='"+ prop.getTelResidencia()+"', telCelular='"+ prop.getTelCelular()+
                     "', email='"+prop.getEmail()+"', endereco='"+prop.getEndereco()+"', numero='" + prop.getNumero()+"', cidade='"+prop.getCidade()+
                     "', estado='"+prop.getEstado()+"', dataCadastro='"+prop.getDataCadastro()+"', observacao="+prop.getObservacao()+"')"*/;
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
        System.exit(0);
    }
}
