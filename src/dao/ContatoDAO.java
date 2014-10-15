package dao;

import classes.Contato;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ContatoDAO extends Banco {

    public Contato getCont(int codContato) {
        Contato cont = new Contato();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM contatos where codContato = '" + cont.getCodContato() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                cont.setTelefoneResidencial(rs.getString("telefoneResidencial"));
                cont.setTelefoneCelular(rs.getString("telefoneCelular"));
                cont.setTelefoneComercial(rs.getString("telefoneComercial"));
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

    public int incluirCont(Contato cont) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO contatos(telefoneResidencial,telefoneCelular,telefoneComercial,email,site)"
                    + "VALUES('" + cont.getTelefoneResidencial() + "','" + cont.getTelefoneCelular() + "','" + cont.getTelefoneComercial() + "','" + cont.getEmail() + "','" + cont.getSite() + "')";

            stmt.executeUpdate(sql);
            ResultSet rs2 = stmt.executeQuery("SELECT LAST_INSERT_ID()");
            while (rs2.next()) {
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

    public String alteraCont(Contato cont) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE contato set codContato =" + cont.getCodContato() + "'";
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
            String sql = "DELETE from contato WHERE codEndereco='" + cont.getCodContato() + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
}
