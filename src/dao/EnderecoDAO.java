package dao;

import classes.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EnderecoDAO  extends Banco {
        
    public Endereco getEnd(int codEndereco) {
        Endereco end = new Endereco();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM endereco where codEndereco = '" + end.getCodEndereco() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                end.setEndereco(rs.getString("endereco"));
                end.setNumero(rs.getInt("numero"));
                end.setCEP(rs.getString("cep"));
                end.setBairro(rs.getString("bairro"));
                end.setCidade(rs.getString("cidade"));
                end.setEstado(rs.getString("estado"));
            } else {
                end = null;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            end = null;
        }
        return end;
    }

    public int incluirEnd(Endereco end) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();
                String sql = "INSERT INTO endereco(endereco, numero, bairro, complemento, cep, cidade, estado)"
                        + "VALUES('" + end.getEndereco() + "'," + end.getNumero() + ",'" + end.getBairro() + "','" + 
                        end.getComplemento() + "','" + end.getCEP() + "','" + end.getCidade() + "','" + end.getEstado() + "')";
               
                stmt.executeUpdate(sql);
                ResultSet rs2 = stmt.executeQuery("SELECT LAST_INSERT_ID()");
                while(rs2.next()){
                    resp = rs2.getInt(1); 
                 }
                rs2.close();
                stmt.close();
                con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return resp;
    }

    public String alteraEnd(Endereco end) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE endereco set codEndereco =" + end.getCodEndereco() + "";
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

    public String excluirEnd(Endereco end) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "DELETE from Endereco WHERE codEndereco='" +end.getCodEndereco() + "'"; //Reescrever está linha corretamente.
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "ok";
        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
}
