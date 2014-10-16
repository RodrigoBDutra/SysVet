package classes;

public class Categoria {
    private int codCategoria;
    
    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }
    
    public Categoria(){
        
    }
    
    public Categoria(int codCategoria){
        this.codCategoria = codCategoria;
    }
}
