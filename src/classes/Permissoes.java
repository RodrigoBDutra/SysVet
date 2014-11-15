package classes;

public class Permissoes {

    private int codPermissao;
    private String tipoAcesso;
    private int nivelPermissao;
    private String descricao;

    public int getCodPermissao() {
        return codPermissao;
    }

    public void setCodPermissao(int codPermissao) {
        this.codPermissao = codPermissao;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public int getNivelPremissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Permissoes() {

    }

    public Permissoes(int codPermissao, String tipoAcesso, int nivelPermissao, String descricao) {
        this.codPermissao = codPermissao;
        this.tipoAcesso = tipoAcesso;
        this.nivelPermissao = nivelPermissao;
        this.descricao = descricao;
    }
}
