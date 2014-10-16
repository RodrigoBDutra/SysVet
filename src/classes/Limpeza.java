package classes;

public class Limpeza {
    private int codLimpeza;
    private String tipoLimpeza;
    
    public int getCodLimpeza() {
        return codLimpeza;
    }

    public void setCodLimpeza(int codLimpeza) {
        this.codLimpeza = codLimpeza;
    }

    public String getTipoLimpeza() {
        return tipoLimpeza;
    }

    public void setTipoLimpeza(String tipoLimpeza) {
        this.tipoLimpeza = tipoLimpeza;
    }
    
    public Limpeza(){
        
    }
    
    public Limpeza(int codLimpeza, String tipoLimpeza){
        this.codLimpeza = codLimpeza;
        this.tipoLimpeza = tipoLimpeza;
    }    
}
