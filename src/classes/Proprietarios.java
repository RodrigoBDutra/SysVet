package classes;

public class Proprietarios {

    private int codProprietario;
    private String dataCadastro;
    private String observacao;
    private DadosPessoais dadospessoais;
    private Contato contato;
    private Endereco endereco;
    private Cliente cliente;


    public Proprietarios() {
        this.codProprietario = 0;
        this.dataCadastro = "";
        this.observacao = "";

       
    }

    public Proprietarios(int codProp, String dataCadastro, String observacao, int codDadP, int codCont, int codEnd, int codAni) {
        this.codProprietario = codProp;
        this.dataCadastro = dataCadastro;
        this.observacao = observacao;
    }

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

    public DadosPessoais getDadospessoais() {
        return dadospessoais;
    }

    public void setDadospessoais(DadosPessoais dadospessoais) {
        this.dadospessoais = dadospessoais;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
