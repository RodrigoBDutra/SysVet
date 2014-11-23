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

public class AnimalDAO extends Banco {

    public String incluirAnimal(Animal cli) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO animal(nome, sexo, cor, dataNascimento, peso, altura, porte, chip, numChip, obito, observacao, CodRaca)"
                    + " VALUES ('" + cli.getNomeAnimal() + "','" + cli.getSexo() + "','" + cli.getCor() + "','" + cli.getNascimento() + "'," + cli.getPeso() + ","
                    + cli.getAltura() + ",'" + cli.getPorte() + "','" + cli.getChip() + "','" + cli.getNumeroChip() + "'," + cli.isObito() + ",'"
                    + cli.getObservacao() + "'," + cli.getCodRaca() + ")";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();
            resp = "OK";
        } catch (Exception e) {
            imprimeErro("Erro em Incluir Cliente", e.toString());
        }
        return resp;
    }

    public String alteraAnimal(Animal cli) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "UPDATE proprietario set nomeAnimal ='" + cli.getNomeAnimal() + "' , nascimento ='" + cli.getNascimento() + "' , idade ='" + cli.getIdade()
                    + "', sexo='" + cli.getSexo() + "', peso='" + cli.getPeso() + "', altura='" + cli.getAltura()
                    + "', porte='" + cli.getPorte() + "', cor='" + cli.getCor() + "', chip='" + cli.getChip() + "', numeroChip='" + cli.getNumeroChip()
                    + "', especie='" + cli.getEspecie() + "', obito='" + cli.isObito() + "', observacao=" + cli.getObservacao() + "')";
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

    /**
     * Inclui um Proprietario na tabela
     */
    public void adicionaLinha(Animal cli) {

    }

    /**
     * Deleta um Proprietario
     */
    public String excluirAnimal(Animal cli) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "DELETE from cliente where nomeAnimal='" + cli.getNomeAnimal() + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            con.close();

        } catch (Exception e) {
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
