
package classes;


public class Exames {
    
    private int codExame;
    private String nomeExame;
    private String descricao;
    
    public int getCodExame() {
        return codExame;
    }

    public void setCodExame(int codExame) {
        this.codExame = codExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
         public Exames(){
        
    }
    
    public Exames(int codExame, String nomeExame, String descricao){
    
        this.codExame = codExame;
        this.nomeExame = nomeExame;
        this.descricao = descricao;
                
    }
}
