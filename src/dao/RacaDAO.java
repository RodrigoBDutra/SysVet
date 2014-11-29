package dao;

import classes.DadosPessoais;
import classes.Raca;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RacaDAO extends Banco {

    public int incluirRaca(Raca rac) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO raca(nomeRaca, codEspecie) VALUES('" + rac.getNomeRaca() + "'," + rac.getCodEspecie() + "); ";

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
}
