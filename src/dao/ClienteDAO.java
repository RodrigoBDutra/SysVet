package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.Animal;
import classes.Proprietarios;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClienteDAO extends Banco{
   
     public String incluirCli(Animal cli) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO animal(nome, sexo, cor, dataNascimento, peso,"
                    + " altura, porte, chip, numChip, codEspecie, obito, observação)"
                    + "VALUES('" + cli.getNomeAnimal() + "','" + cli.isSexo()+ ","+ cli.getNascimento() +"," +cli.getCor()+
                    "'," + cli.getIdade() + "," + cli.getPeso() + "," + cli.getAltura() +
                    "," + cli.getPorte() +  "," + cli.isChip()+
                    "," + cli.getNumeroChip()+"," +cli.getCodEspecie()+","+cli.isObito()+ 
                    ","+cli.getObservacao()+")";

            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            imprimeErro("Erro em IncluirProprietário", e.toString());
        }
        return resp;
    }
    
    
        public String alteraCli(Animal cli){
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
        
        public void adicionaLinha(Animal cli){
            
        }
        
        /**
         * Deleta um Proprietario
         */
        
       public String excluirProp (Animal cli){
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
       
       private void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
        System.err.println(msg);
        System.out.println(msgErro);
    }
}
