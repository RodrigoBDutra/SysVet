package classes;

public class Departamento {

    private int codDepartamento;
    private String nomeDepartamento;
    private String descricao;

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNomedepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomedepartamento) {
        this.nomeDepartamento = nomedepartamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Departamento() {
    }

    public Departamento(int codDepartamento, String nomeDepartamento, String descricao) {

        this.codDepartamento = codDepartamento;
        this.nomeDepartamento = nomeDepartamento;
        this.descricao = descricao;
    }
}
