package classes;

public class Proprietarios {

    private int codProprietario;
    private String dataCadastro;
    private String observacao;
    private int codDadosPessoais;
    private int codContato;
    private int codEndereco;
    private int codAnimal;

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

    public int getCodDadosPessoais() {
        return codDadosPessoais;
    }

    public void setCodDadosPessoais(int codDadosPessoais) {
        this.codDadosPessoais = codDadosPessoais;
    }

    public int getCodContato() {
        return codContato;
    }

    public void setCodContato(int codContato) {
        this.codContato = codContato;
    }

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public Proprietarios() {
        this.codProprietario = 0;
        this.dataCadastro = "";
        this.observacao = "";
        this.codDadosPessoais = 0;
        this.codContato = 0;
        this.codEndereco = 0;
        this.codAnimal = 0;
    }

    public Proprietarios(int codProp, String dataCadastro, String observacao, int codDadP, int codCont, int codEnd, int codAni) {
        this.codProprietario = codProp;
        this.dataCadastro = dataCadastro;
        this.observacao = observacao;
        this.codDadosPessoais = codDadP;
        this.codContato = codCont;
        this.codEndereco = codEnd;
        this.codAnimal = codAni;
    }
}
