package dao;

import java.sql.Statement;
import javax.swing.JOptionPane;
import classes.Animal;

public class AnimalDAO extends Banco {

    public String incluirAnimal(Animal ani) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO animal(nome, sexo, cor, data, peso, altura, porte, chip, numChip, obito, "
                    + "observacao, codEspecie, codProntuario) "
                    + "VALUES('" + ani.getNomeAnimal() + "'," + ani.getSexo() + ",'" + ani.getNascimento() + "',"
                    + ani.getPeso() + "," + ani.getAltura() + ",'" + ani.getPorte() + "'," + ani.getNumeroChip() + ",'"
                    + ani.getObservacao() + "'," + ani.getCodEspecie() + "," + ani.getCodProntuario() + ");";

            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            imprimeErro("Erro em Incluir Cliente", e.toString());
        }
        return resp;
    }

    private void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
        System.err.println(msg);
        System.out.println(msgErro);
    }

}
