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
public class MedicamentoManipulado {
    private int codMedMani;
    private String nome;
    private String descricao;
    
    public MedicamentoManipulado(){
        
    }
    
    public MedicamentoManipulado(int codMedMani, String nome, String descricao){
        this.codMedMani = codMedMani;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodMedMani() {
        return codMedMani;
    }

    public void setCodMedMani(int codMedMani) {
        this.codMedMani = codMedMani;
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
}
