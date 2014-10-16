package classes;

public class GrupoAcesso {

    private int codGrupo;
    private String nome;
    private String descricao;

    public int getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
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

    public GrupoAcesso() {

    }

    public GrupoAcesso(int codGrupo, String nome, String descricao) {
        this.codGrupo = codGrupo;
        this.nome = nome;
        this.descricao = descricao;
    }
}
