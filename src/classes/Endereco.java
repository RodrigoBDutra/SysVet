package classes;

public class Endereco {
    
    private int codEndereco;
    private String endereco;
    private int numero;
    private String bairro;
    private String complemento;
    private String CEP;
    private String cidade;
    private String estado;

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }   

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    public Endereco(){
        
    }
    
    public Endereco(int codEnd, String end, int num, String bairro, String comple, String CEP, String cidade, String estado){
        this.codEndereco = codEnd;
        this.endereco = end;
        this.numero = num;
        this.bairro = bairro;
        this.complemento = comple;
        this.CEP = CEP;
        this.cidade = cidade;
        this.estado = estado;
    }
    
}
