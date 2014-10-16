/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

/**
 *
 * @author Dani
 */
public class Limpeza {
    private int codLimpeza;
    private String tipoLimpeza;
    
    public Limpeza(){
        
    }
    
    public Limpeza(int codLimpeza, String tipoLimpeza){
        this.codLimpeza = codLimpeza;
        this.tipoLimpeza = tipoLimpeza;
    }

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
    
}
