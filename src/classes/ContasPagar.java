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
public class ContasPagar {
    private int codContasPagar;
    private String descricao;
    private String dataEmissao;
    private float valorEmitido;
    private float desconto;
    private float valor;
    private String dataVencimento;
    private float juros;
    private float multa;
    private String status;
    private String observacao;
    
    public ContasPagar(){
        
    }
    
    public ContasPagar(int codContasPagar, String descricao, String dataEmissao, float valorEmitido, float desconto, float valor, String dataVencimento, float juros, float multa, String status, String observacao){
    this.codContasPagar = codContasPagar;
    this.descricao = descricao;
    this.dataEmissao = dataEmissao;
    this.valorEmitido = valorEmitido;
    this.desconto = desconto;
    this.valor = valor;
    this.dataVencimento = dataVencimento;
    this.juros = juros;
    this.multa = multa;
    this.status = status;
    this.observacao = observacao;
    
    
    }

    public int getCodContasPagar() {
        return codContasPagar;
    }

    public void setCodContasPagar(int codContasPagar) {
        this.codContasPagar = codContasPagar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
