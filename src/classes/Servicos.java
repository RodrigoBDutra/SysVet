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
public class Servicos {
    private int codServicos;
    private String dataServico;
    private String observacao;
    private float valorFinal;
    
    public Servicos(){
        
    }
    
    public Servicos(int codServicos, String dataServico, String observacao, float valorFinal){
        this.codServicos = codServicos;
        this.dataServico = dataServico;
        this.observacao = observacao;
        this.valorFinal = valorFinal;
    }

    public int getCodServicos() {
        return codServicos;
    }

    public void setCodServicos(int codServicos) {
        this.codServicos = codServicos;
    }

    public String getDataServico() {
        return dataServico;
    }

    public void setDataServico(String dataServico) {
        this.dataServico = dataServico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
}
