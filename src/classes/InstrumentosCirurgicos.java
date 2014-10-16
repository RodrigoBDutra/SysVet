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
public class InstrumentosCirurgicos {
    private int codInstCirurgico;
    private String nome;
    private String garantia;
    private String marca;
    
    public InstrumentosCirurgicos(){
        
    }
    
    public InstrumentosCirurgicos(int codInstCirurgico, String nome, String garantia, String marca){
        this.codInstCirurgico = codInstCirurgico;
        this.nome = nome;
        this.garantia = garantia;
        this.marca = marca;
    }

    public int getCodInstCirurgico() {
        return codInstCirurgico;
    }

    public void setCodInstCirurgico(int codInstCirurgico) {
        this.codInstCirurgico = codInstCirurgico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
