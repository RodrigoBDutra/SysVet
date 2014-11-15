package classes;

public class Controlados {

    private int codControlado;
    private String nome;
    private String descricao;

    public int getCodControlado() {
        return codControlado;
    }

    public void setCodControlado(int codControlado) {
        this.codControlado = codControlado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Controlados() {

    }

    public Controlados(int codControlado, String nome, String descricao) {
        this.codControlado = codControlado;
        this.nome = nome;
        this.descricao = descricao;
    }
}
