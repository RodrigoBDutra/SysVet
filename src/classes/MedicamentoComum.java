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
public class MedicamentoComum {
    private int codMedComum;
    private String nome;
    private String descricao;
    
    public MedicamentoComum(){
        
    }
    
    public MedicamentoComum(int codMedComum, String nome, String descricao){
        this.codMedComum = codMedComum;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodMedComum() {
        return codMedComum;
    }

    public void setCodMedComum(int codMedComum) {
        this.codMedComum = codMedComum;
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
