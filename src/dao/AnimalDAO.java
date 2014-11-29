package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.Animal;
import classes.Especie;
import classes.Proprietarios;
import classes.Raca;
import classes.TipoAnimal;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnimalDAO extends Banco {

    public ArrayList<Animal> getListagem(int cod) {
        ArrayList<Animal> lista = new ArrayList<Animal>();
        try {
            Animal ani = new Animal();
            Raca rac = new Raca();
            Especie esp = new Especie();
            TipoAnimal tip = new TipoAnimal();
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT a.nome, r.nomeraca, e.especie, a.codAnimal \n"
                    + "FROM animal a INNER JOIN raca r \n"
                    + "ON a.codraca = r.codraca INNER JOIN especie e \n"
                    + "ON r.codEspecie = e.codEspecie "
                    + "WHERE a.codproprietario = " + cod + "";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ani.setNomeAnimal(rs.getString("nome"));
                rac.setNomeRaca(rs.getString("nomeRaca"));
                esp.setEspecie(rs.getString("especie"));
                ani.setCodAnimal(rs.getInt("codAnimal"));
                ani.setRaca(rac);
                ani.setEspecie(esp);
                ani.setTipoanimal(tip);

                lista.add(ani);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO :" + e.toString());
        }

        return lista;

    }

    public Animal getAnim(int cod) {
        Animal ani = new Animal();
            Raca rac = new Raca();
            Especie esp = new Especie();
            TipoAnimal tip = new TipoAnimal();
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "SELECT a.nome, a.sexo, a.cor, a.dataNascimento, a.idade, a.peso, a.altura, a.porte, a.chip, a.numchip, a.obito, a.observacao, \n"
                    + "r.nomeRaca, e.especie, t.tipoanimal \n"
                    + "FROM animal a INNER JOIN raca r \n"
                    + "ON a.codraca = r.codraca INNER JOIN especie e \n"
                    + "ON r.codEspecie = e.codEspecie INNER JOIN tipoanimal t \n"
                    + "ON e.codTipoAnimal = t.codTipoAnimal \n"
                    + "WHERE a.codproprietario = '"+cod+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                ani.setNomeAnimal(rs.getString("nome"));
                ani.setSexo(rs.getString("cor"));
                ani.setNascimento(rs.getString("dataNascimento"));
                ani.setIdade(rs.getInt("idade"));
                ani.setPeso(rs.getFloat("peso"));
                ani.setAltura(rs.getFloat("altura"));
                ani.setPorte(rs.getString("porte"));
                ani.setChip(rs.getString("chip"));
                ani.setNumeroChip(rs.getString("numChip"));
                ani.setObito(rs.getBoolean("obito"));
                ani.setObservacao(rs.getString("observacao"));
                rac.setNomeRaca(rs.getString("nomeRaca"));
                esp.setEspecie(rs.getString("especie"));
                tip.setTipoAnimal(rs.getString("tipoAnimal"));
                ani.setRaca(rac);
                ani.setEspecie(esp);
                ani.setTipoanimal(tip);
            } else {
                ani = null;
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            ani = null;
            JOptionPane.showMessageDialog(null,"ERRO :" + e.toString());
        }
        return ani;
    }

    public String incluirAnimal(Animal cli) {
        String resp = "";
        try {
            conecta();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO animal(nome, sexo, cor, dataNascimento, idade, peso, altura, porte, chip, numChip, obito, observacao, CodRaca, codProprietario)"
                    + " VALUES ('" + cli.getNomeAnimal() + "','" + cli.getSexo() + "','" + cli.getCor() + "','" + cli.getNascimento() + "'," + cli.getIdade() + "," + cli.getPeso() + ","
                    + cli.getAltura() + ",'" + cli.getPorte() + "','" + cli.getChip() + "','" + cli.getNumeroChip() + "'," + cli.isObito() + ",'"
                    + cli.getObservacao() + "'," + cli.getCodRaca() + "," + cli.getCodProprietario() + ")";
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
