package dao;

import classes.Raca;
import classes.TipoAnimal;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TipoAnimalDAO extends Banco {

    public int incluirTipoAnimal(TipoAnimal tpAni) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO tipoanimal(tipoAnimal,codEspecie) "
                    + "VALUES('" + tpAni.getTipoAnimal() + "'," + tpAni.getCodEspecie() + ")";

            stmt.executeUpdate(sql);
            ResultSet rs2 = stmt.executeQuery("SELECT LAST_INSERT_ID()");
            while (rs2.next()) {
                resp = rs2.getInt(1);
            }
            rs2.close();

            stmt.close();
            rs.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return resp;
    }
}
