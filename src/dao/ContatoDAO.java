package dao;

import classes.Contato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ContatoDAO extends Banco{
    public String abreContatos() {
        String sql;
        conecta();
        try {
            sql = "SELECT MAX(codContato) FROM contatos";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("MAX(codContato)") == null) {
                return "0";
            } else {
                return rs.getString("MAX(codContato)");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return null;
        }
    }
     
     public Contato getCont(int codContato) {
        Contato cont = new Contato();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM contatos where codContato = '" + cont.getCodContato() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                 cont.setTelefoneResidencial(rs.getInt("telefoneResidencial"));
                 cont.setTelefoneCelular(rs.getInt("telefoneCelular"));
                 cont.setTelefoneComercial(rs.getInt("telefoneComercial"));
                 cont.setEmail(rs.getString("email"));
                 cont.setSite(rs.getString("site"));
            } else {
                cont = null;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            cont = null;
        }
        return cont;
    }
    
     public String incluirCont(Contato cont) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            /*String sql4 = "SELECT codContato FROM dadospessoais where codContato = " + cont.getCodContato();
            ResultSet rs = stmt.executeQuery(sql4);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "CPF já cadastrado!");
            } else {*/
            String sql = "INSERT INTO contatos(telefoneResidencial,telefoneCelular,telefoneComercial,email,site)"
                    + "VALUES("+ cont.getTelefoneResidencial() + "," + cont.getTelefoneCelular() + "," + cont.getTelefoneComercial() + ",'" + cont.getEmail() + "','" + cont.getSite() + "')";
        
            stmt.executeUpdate(sql);
       
            stmt.close();
            rs.close();
            con.close();
            resp = "OK";
            
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
     
     public String alteraCont(Contato cont) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE contato set codContato =" + cont.getCodContato()+ "'";
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

     public String excluirCont(Contato cont) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "DELETE from contato WHERE codEndereco='" + cont.getCodContato()+ "'"; 
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
}
