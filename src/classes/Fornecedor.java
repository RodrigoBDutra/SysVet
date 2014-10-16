package classes;

public class Fornecedor {
    private int codFornecedor;
    private int CNPJ;
    private int IE;
    private String razaoSocial;
    private String nomeFantasia;
    private String observacao;
    
    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getIE() {
        return IE;
    }

    public void setIE(int IE) {
        this.IE = IE;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
     public Fornecedor(){
        
    }
    
    public Fornecedor(int codFornecedor, int CNPJ, int IE, String razaoSocial, String nomeFantasia, String observacao){
        this.codFornecedor = codFornecedor;
        this.CNPJ = CNPJ;
        this.IE = IE;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.observacao = observacao;
    }

}
