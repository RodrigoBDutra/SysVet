/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Rodrigo
 */
public class Raca {
    
    private int codRaca;
    private String nomeRaca;    

    public int getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(int codRaca) {
        this.codRaca = codRaca;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public void setNomeRaca(String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }
public Raca(){
    }
    
    public Raca(int codRaca, String nomeRaca){
    
        this.codRaca = codRaca;
        this.nomeRaca = nomeRaca;
        
    }
}