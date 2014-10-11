package classes;

public class DadosPessoais {
    
    private int codDadosPessoais;
    private String nome;
    private String dataNascimento;
    private int CPF;
    private int RG;

    public int getCodDadosPessoais() {
        return codDadosPessoais;
    }

    public void setCodDadosPessoais(int codDadosPessoais) {
        this.codDadosPessoais = codDadosPessoais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }
    
    public DadosPessoais(){
        
    }
    
    public DadosPessoais(int codDadosPesso, String nome, String dataNasc, int CPF, int RG){
        this.codDadosPessoais = codDadosPesso;
        this.nome = nome;
        this.dataNascimento = dataNasc;
        this.CPF = CPF;
        this.RG = RG;
    }
    
}
