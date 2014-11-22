package dao;

import classes.Contato;
import classes.Especie;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EspecieDAO extends Banco {

    public Especie consultaEspecie(int codEspecie) {
        Especie esp = new Especie();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM especie where codEspecie = '" + esp.getCodEspecie() + "'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                esp.setEspecie(rs.getString("especie"));

            } else {
                esp = null;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            esp = null;
        }
        return esp;
    }

    public int incluirEspecie(Especie esp) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO especie(especie, codRaca)"
                    + "VALUES('" + esp.getEspecie() + "',"
                    + esp.getCodRaca()+ ")";

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

    public String alteraCont(Especie esp, int codAnimal) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();

            String sql = "UPDATE especie SET especie = '" + esp.getEspecie() + "' "
                    + "WHERE codEspecie = ("
                    + "SELECT codEspecie FROM Animal WHERE codAnimal = " + codAnimal + ")";
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
