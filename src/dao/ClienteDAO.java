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
import classes.Cliente;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author vinicius
 */
public class ClienteDAO extends Banco{
    
    
     public ArrayList<Cliente> getListagem() {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM cliente ORDERBY nomeAnimal";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setNomeAnimal(rs.getString("nomeAnimal"));
                cli.setNascimento(rs.getString("nascimento"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getBoolean("sexo"));
                cli.setPeso(rs.getFloat("peso"));
                cli.setAltura(rs.getFloat("altura"));
                cli.setPorte(rs.getString("porte"));
                cli.setCor(rs.getString("cor"));
                cli.setChip(rs.getBoolean("chip"));
                cli.setNumeroChip(rs.getInt("numeroChip"));
                cli.setRaca(rs.getString("raca"));
                cli.setEspecie(rs.getString("especie"));
                cli.setObito(rs.getBoolean("obito")); // ainda não vi como colocar variavel CHAR acho que é assim
                cli.setObservacao(rs.getString("observacao"));
                listaCliente.add(cli);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.toString());
        }
        return listaCliente;
    }

    /**
     * Pesquisa um Cliente pelo nome
     *
     * @param nomeAnimal a ser pesquisado
     * @return null se não achar ou o objeto preenchido se achar
     */

    public Cliente getCli(String nome) {
        Cliente cli = new Cliente();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM cliente where nome = '" + nome + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
               cli.setNomeAnimal(rs.getString("nomeAnimal"));
                cli.setNascimento(rs.getString("nascimento"));
                cli.setIdade(rs.getInt("idade"));
                cli.setSexo(rs.getBoolean("sexo"));
                cli.setPeso(rs.getFloat("peso"));
                cli.setAltura(rs.getFloat("altura"));
                cli.setPorte(rs.getString("porte"));
                cli.setCor(rs.getString("cor"));
                cli.setChip(rs.getBoolean("chip"));
                cli.setNumeroChip(rs.getInt("numeroChip"));
                cli.setRaca(rs.getString("raca"));
                cli.setEspecie(rs.getString("especie"));
                cli.setObito(rs.getBoolean("obito")); // ainda não vi como colocar variavel CHAR acho que é assim
                cli.setObservacao(rs.getString("observacao"));
                
            } else {
                cli = null;
            }
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            cli = null;
        }
        return cli;
    }
    
    
    
    /**
     * Cadastro um Cliente no banco de dados
     * @param cli
     * @return ok para sucesso ou mensagem de erro
     */
    
    public String incluirProp(Cliente cli){
        String resp="";
        try{
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO clientes(nomeAnimal,nascimento,idade,sexo,peso,altura,porte"
                    + "cor,chip,numeroChip,raca,especie,obito,observacao)";
           sql+= "Values('" + cli.getNomeAnimal()+"','" +cli.getNascimento()+"',"+cli.getIdade()+",'"+cli.isSexo()+ "'," 
                   + cli.getPeso()+"," + cli.getAltura()+",'" +cli.getPorte()+"','"+cli.getCor()+"',"
                   + cli.isChip()+",'"+cli.getNumeroChip()+"','"+cli.getRaca()+"','"
                   +cli.getEspecie()+"','"+cli.isObito()+"','"+cli.getObservacao()+"')";
           stmt.executeUpdate(sql);
           
           stmt.close();
           con.close();
           resp= "OK";
        }catch (Exception e){
            resp= e.toString();
        }
        return resp;
    }
    
    
        public String alteraCli(Cliente cli){
        String resp="";
        try{
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE proprietario set nomeAnimal ='" + cli.getNomeAnimal()+ "' , nascimento ='" +cli.getNascimento()+ "' , idade ='"+cli.getIdade()+
                    "', sexo='"+cli.isSexo()+ "', peso='" + cli.getPeso()+"', altura='"+ cli.getAltura()+
                    "', porte='"+cli.getPorte()+"', cor='"+cli.getCor()+"', chip='" + cli.isChip()+"', numeroChip='"+cli.getNumeroChip()+
                    "', especie='"+cli.getEspecie()+"', obito='"+cli.isObito()+"', observacao="+cli.getObservacao()+"')";
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
        
        public void adicionaLinha(Cliente cli){
            
        }
        
        /**
         * Deleta um Proprietario
         */
        
       public String excluirProp (Cliente cli){
           String resp="";
           try{
               conecta();
               Statement stmt = con.createStatement();
               String sql = "DELETE from cliente where nomeAnimal='"+cli.getNomeAnimal()+"'";
               stmt.executeUpdate(sql);
               stmt.close();
               con.close();
               
               
           }catch(Exception e){
               resp = e.toString();
           }
           return resp;
       }
       
       
}
