package classes;

class Anestesico {

    private int codAnestesico;
    private String nome;
    private String descricao;

    public int getCodAnestesico() {
        return codAnestesico;
    }

    public void setCodAnestesico(int codAnestesico) {
        this.codAnestesico = codAnestesico;
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
    
    public Anestesico(){
        
    }    
    
    public Anestesico(int codAnestesico, String nome, String descricao) {
        this.codAnestesico = codAnestesico;
        this.nome = nome;
        this.descricao = descricao;
    }

}
