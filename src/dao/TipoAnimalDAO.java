package dao;

import classes.Raca;
import classes.TipoAnimal;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class TipoAnimalDAO extends Banco {

    public ArrayList<TipoAnimal> consultaTipo() {
        ArrayList<TipoAnimal> lista = new ArrayList<TipoAnimal>();
        try {
            conecta();
            String sql = "SELECT * FROM tipoanimal ORDER BY tipoAnimal";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TipoAnimal tpAni = new TipoAnimal();
                tpAni.setTipoAnimal(rs.getString("tipoAnimal"));
                tpAni.setCodTipoAnimal(rs.getInt("codTipoAnimal"));

                lista.add(tpAni);

            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            imprimeErro("Erro ao buscar especie", e.getMessage());
            return null;
        }
        return lista;
    }

    public int incluirTipoAnimal(TipoAnimal tpAni) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();

            String sql = "INSERT INTO tipoanimal(tipoAnimal) VALUES('" + tpAni.getTipoAnimal() + "')";

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

    private void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
        System.err.println(msg);
        System.out.println(msgErro);
    }
}
