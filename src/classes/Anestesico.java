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
public class Anestesico {
    private int codAnestesico;
    private String nome;
    private String descricao;
    
    public Anestesico (int codAnestesico, String nome, String descricao){
        this.codAnestesico = codAnestesico;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodAnestesico() {
        return codAnestesico;
    }

    public void setCodAnestesico(int codAnestesico) {
        this.codAnestesico = codAnestesico;
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
