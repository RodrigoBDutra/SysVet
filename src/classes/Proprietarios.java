package classes;

public class Proprietarios {

    private int codProprietario;
    private String dataCadastro;
    private String observacao;

    public int getCodProprietario() {
        return codProprietario;
    }

    public void setCodProprietario(int codProprietario) {
        this.codProprietario = codProprietario;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Proprietarios() {
        this.codProprietario = 0;
        this.dataCadastro = "";
        this.observacao = "";
    }

    public Proprietarios(int codProp,String dataCadastro, String observacao) {
        this.codProprietario = codProp;
        this.dataCadastro = dataCadastro;
        this.observacao = observacao;
    }
    


}
