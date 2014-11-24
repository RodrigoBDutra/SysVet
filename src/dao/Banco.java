package dao;
import classes.Transferencia;
import classes.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class Banco {

    Connection con;
    Statement stmt;
    ResultSet rs;
    private int codi;
    private String nom;

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void conecta() {
        try {
            String serverName = "localhost";
            String mydatabase = "bancosysvet";
            String username = "root";
            String password = "root";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            con = DriverManager.getConnection(url, username, password);
            stmt = (Statement) con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados");
        }
    }

    public boolean valida(String login) {
        conecta();
        String sql;
        try {
            sql = "SELECT * FROM usuario WHERE login='" + login + "'";
            rs = stmt.executeQuery(sql);

            if (rs.first()) {

                return false;

            } else {

                return true;

            }

        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }

    public boolean gravaUsuario(String nome, String login, String senha, String permissao, String logado) {
        conecta();
        String sql;
        try {
            if (valida(login)) {
                sql = "INSERT INTO usuario(nome, login, senha, permissao, logado) VALUES ('";
                sql += nome + "','" + login + "','" + senha + "','" + permissao + "','" + logado + "')";

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Login já existente, por favor, digite outro login");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    }

   /* public String abreUsuarios() {
        String sql;
        conecta();
        try {
            sql = "SELECT MAX(codigo) FROM usuario";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            
            return rs.getString("MAX(codigo)");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return null;
        }

    }*/

    public boolean atualizaUsuario(int codigo, String nome, String login, String senha, String permissao) {
        String sql;
        conecta();
        try {
            sql = "UPDATE usuario SET nome='" + nome + "', login='" + login + "', " + "senha='" + senha + "', permissao='" + permissao +"' WHERE codigo=" + codigo + ";";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    }

    public boolean verificaSenha(int codigo, String senha) {
        String sql;
        conecta();
        try{
            sql = "SELECT senha FROM usuario WHERE codigo=" + codigo + ";";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("senha").equals(senha)) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }

    }

    public ResultSet buscaUsuario(String login) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM usuario WHERE login='" + login + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("login") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }

    public boolean excluiUsuario(int codigo) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM usuario WHERE codigo=" + codigo + ";";
            System.out.println(sql);
            stmt.executeUpdate(sql);

            return true;

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean login(String login, String senha) {
        String sql;
        conecta();

        try {

            /*Retirado este trecho de codigo para não deslogar quem estiver logado no sistema em REDE.*/
            /*sql = "UPDATE usuario SET logado='n' WHERE login='" + login + "'";
             System.out.println(sql);
             stmt.executeUpdate(sql);
             */
            sql = "SELECT * FROM usuario WHERE login='" + login + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("logado").equalsIgnoreCase("n")) {
                if (rs.getString("senha").equals(senha)) {
                    Usuario user = new Usuario();
                    user.setCodigo(rs.getInt("codigo"));
                    user.setNome(rs.getString("nome"));
                    user.setLogin(rs.getString("login"));
                    user.setSenha(rs.getString("senha"));
                    user.setPermissao(rs.getString("permissao"));
                    user.setLogado(rs.getString("logado"));
                    Transferencia.logado = user;

                    sql = "UPDATE usuario SET logado='s' WHERE login='" + login + "'";
                    System.out.println(sql);
                    stmt.executeUpdate(sql);
                    return true;
                }
                return false;
            } else {
                System.out.println("Usuario já está logado na rede!");
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean logoff(String login) {
        String sql;
        conecta();

        try {
            sql = "SELECT login FROM usuario WHERE login='" + Transferencia.logado.getLogin() + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("login").equals(Transferencia.logado.getLogin())) {

                sql = "UPDATE usuario SET logado='n' WHERE login='" + Transferencia.logado.getLogin() + "'";
                System.out.println(sql);
                stmt.executeUpdate(sql);

                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean getPermissao(int i) {
        String sql;
        conecta();

        try {

            sql = "SELECT * FROM usuario WHERE logado='s'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();

            if ("1".equals(rs.getString("permissao").substring(i - 1, i))) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }

    public void logado() {

        String sql;
        conecta();

        try {

            sql = "SELECT * FROM usuario WHERE logado='s'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();

            nom = rs.getString("nome");
            codi = Integer.parseInt(rs.getString("codigo"));

        } catch (SQLException e) {

            System.out.println("Erro ao executar o comando SQL:" + e.toString());
        }
    }
    

}
