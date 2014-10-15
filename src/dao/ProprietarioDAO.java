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
    public Proprietarios getProp(String nome) {
        Proprietarios prop = new Proprietarios();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM proprietario where nome = '" + nome + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                /*prop.setNome(rs.getString("nome"));
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
                 prop.setEstado((char) rs.getObject("estado")); // ainda não vi como colocar variavel CHAR acho que é assim*/
                prop.setDataCadastro(rs.getString("dataCadastro"));
                prop.setObservacao(rs.getString("observacao"));
            } else {
                prop = null;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            prop = null;
        }
        return prop;
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
            resp = "ERRO AQUI" + e.toString();
        }
        return resp;
    }

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
     * Inclui um Proprietarios na tabela
     */
    public void adicionaLinha(Proprietarios prop) {

    }

    /**
     * Deleta um Proprietarios
     */
    public String excluirProp(Proprietarios prop) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "DELETE from proprietario WHERE nome='" + prop.getDataCadastro() + "'"; //Reescrever está linha corretamente.
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }

}
