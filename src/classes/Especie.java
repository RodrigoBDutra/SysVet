package classes;

public class Especie {
    private int codEspecie;
    private String especie;
    
    public int getCodEspecie() {
        return codEspecie;
    }

    public void setCodEspecie(int codEspecie) {
        this.codEspecie = codEspecie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
     public Especie(){
        
    }
    
    public Especie(int codEspecie, String especie){
        this.codEspecie = codEspecie;
        this.especie = especie;
    }
}
