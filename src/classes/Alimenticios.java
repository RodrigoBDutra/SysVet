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
public class Alimenticios {
    private int codAlimenticios;
    private String nome;
    private String validade;
    private String marca;
    
    public Alimenticios(){
        
    }
    
    public Alimenticios (int codAlimenticios, String nome, String descricao){
        this.codAlimenticios = codAlimenticios;
        this.nome = nome;
        this.validade = validade;
        this.marca = marca;
    }

    public int getCodAlimenticios() {
        return codAlimenticios;
    }

    public void setCodAlimenticios(int codAlimenticios) {
        this.codAlimenticios = codAlimenticios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
