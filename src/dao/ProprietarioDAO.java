/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.Proprietario;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author vinicius
 */
public class ProprietarioDAO extends Banco {
    
    
    
    
    

    public ArrayList<Proprietario> getListagem() {
        ArrayList<Proprietario> listaProprietario = new ArrayList<Proprietario>();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM proprietario ORDERBY name";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Proprietario prop = new Proprietario();
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

    /**
     * Pesquisa um Proprietario pelo nome
     *
     * @param nome a ser pesquisado
     * @return null se não achar ou o objeto preenchido se achar
     */

    public Proprietario getProp(String nome) {
        Proprietario prop = new Proprietario();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM proprietario where nome = '" + nome + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
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
            } else {
                prop = null;
            }
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            prop = null;
        }
        return prop;
    }
    
    /**
     * Cadastro um Proprietario no banco de dados
     * @param prop
     * @return ok para sucesso ou mensagem de erro
     */
    
    public String incluirProp(Proprietario prop){
        String resp="";
        try{
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO proprietario(nome,data,cpf,rg,telResidencial,"
                    + "TelCelular,email,endereco,numero,cep,bairro,cidade,estado,dataCadastro,observacao)";
           sql+= "Values('" + prop.getNome()+"','" +prop.getData()+"',"+prop.getCpf()+",'"+prop.getRg()+ "'," 
                   + prop.getTelResidencia()+"," + prop.getTelCelular()+",'" +prop.getEmail()+"','"+prop.getEndereco()+"',"
                   + prop.getNumero()+",'"+prop.getBairro()+"','"+prop.getCidade()+"','"
                   +prop.getEstado()+"','"+prop.getDataCadastro()+"','"+prop.getObservacao()+"')";
           stmt.executeUpdate(sql);
           
           stmt.close();
           con.close();
           resp= "OK";
        }catch (Exception e){
            resp= e.toString();
        }
        return resp;
    }
    
    
        public String alteraProp(Proprietario prop){
        String resp="";
        try{
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE proprietario set nome ='" + prop.getNome() + "' , data ='" +prop.getData()+ "' , cpf ='"+prop.getCpf()+
                    "', rg='"+prop.getRg()+ "', telResidencial='"+ prop.getTelResidencia()+"', telCelular='"+ prop.getTelCelular()+
                    "', email='"+prop.getEmail()+"', endereco='"+prop.getEndereco()+"', numero='" + prop.getNumero()+"', cidade='"+prop.getCidade()+
                    "', estado='"+prop.getEstado()+"', dataCadastro='"+prop.getDataCadastro()+"', observacao="+prop.getObservacao()+"')";
             System.out.println(sql);
             stmt.executeUpdate(sql);
             stmt.close();
             con.close();
             
             resp="ok";
        }catch(Exception e){
            resp = e.toString();
        }
        return resp;
    }
        
     /**
      * Inclui um Proprietario na tabela
      */   
        
        public void adicionaLinha(Proprietario prop){
            
        }
        
        /**
         * Deleta um Proprietario
         */
        
       public String excluirProp (Proprietario prop){
           String resp="";
           try{
               conecta();
               Statement stmt = con.createStatement();
               String sql = "DELETE from Proprietario where nome='"+prop.getNome()+"'";
               stmt.executeUpdate(sql);
               stmt.close();
               con.close();
               
               
           }catch(Exception e){
               resp = e.toString();
           }
           return resp;
       }
       
       
       
       
}
