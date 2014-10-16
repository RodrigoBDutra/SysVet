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
public class Cargo {
    private int codCargo;
    private String cargo;
    private String descricao;
    private String expediente;
    
    public Cargo(){
        
    }
    
    public Cargo(int codCargo, String cargo, String descricao, String expediente){
        this.codCargo = codCargo;
        this.cargo = cargo;
        this.descricao = descricao;
        this.expediente = expediente;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }
}
