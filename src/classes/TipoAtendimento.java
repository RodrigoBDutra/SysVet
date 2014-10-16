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
public class TipoAtendimento {
    private int codTipoAtendimento;
    
    public TipoAtendimento(){
        
    }
    
    public TipoAtendimento(int codTipoAtendimento){
        this.codTipoAtendimento = codTipoAtendimento;
    }

    public int getCodTipoAtendimento() {
        return codTipoAtendimento;
    }

    public void setCodTipoAtendimento(int codTipoAtendimento) {
        this.codTipoAtendimento = codTipoAtendimento;
    }
}
