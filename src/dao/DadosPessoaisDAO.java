package dao;

import classes.DadosPessoais;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DadosPessoaisDAO extends Banco {

    public DadosPessoais consultaDados(String cpf) {
        DadosPessoais dad = new DadosPessoais();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT p.codProprietario, p. FROM"
                    + " * FROM dadosPessoais where cpf = '" + dad.getCPF() + "' INNER";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dad.setNome(rs.getString("nome"));
                dad.setDataNascimento(rs.getString("dataNascimento"));
                dad.setCPF(rs.getString("cpf"));
                dad.setRG(rs.getString("rg"));
            } else {
                dad = null;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            dad = null;
        }
        return dad;
    }

    public int incluirDados(DadosPessoais dad) {
        int resp = 0;
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql4 = "SELECT cpf FROM dadospessoais where cpf = '" + dad.getCPF() + "'";
            ResultSet rs = stmt.executeQuery(sql4);
            if (rs.next()) {
                resp = -1;
            } else {
                String sql = "INSERT INTO dadospessoais(nome, datanascimento, cpf, rg) "
                        + "VALUES('" + dad.getNome() + "','" + dad.getDataNascimento()
                        + "','" + dad.getCPF() + "','" + dad.getRG() + "')";

                stmt.executeUpdate(sql);
                ResultSet rs2 = stmt.executeQuery("SELECT LAST_INSERT_ID()");
                while (rs2.next()) {
                    resp = rs2.getInt(1);
                }
                rs2.close();
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return resp;
    }

    public String alteraDados(DadosPessoais dad) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();

            String sql = "UPDATE dadospessoais set nome ='" + dad.getNome() + "',datanascimento = '" + dad.getDataNascimento() + "',"
                    + "rg = '" + dad.getRG() + "' WHERE cpf = '" + dad.getCPF() + "';";
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

    public String excluirDados(DadosPessoais dad) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "DELETE from DadosPessoais WHERE cpf='" + dad.getCPF() + "'"; //Reescrever está linha corretamente.
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

        } catch (Exception e) {
            resp = e.toString();
        }
        return resp;
    }
}
