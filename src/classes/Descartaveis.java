package classes;

public class Descartaveis {
    private int codDescartaveis;
    private String nome;
    private String validade;
    private String marca;
    
    public int getCodDescartaveis() {
        return codDescartaveis;
    }

    public void setCodDescartaveis(int codDescartaveis) {
        this.codDescartaveis = codDescartaveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public Descartaveis(){
        
    }
    
    public Descartaveis(int codDescartaveis, String nome, String validade, String marca){
        this.codDescartaveis = codDescartaveis;
        this.nome = nome;
        this.validade = validade;
        this.marca = marca;
    }

}
