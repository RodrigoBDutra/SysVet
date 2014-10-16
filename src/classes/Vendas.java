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
public class Vendas {
    
   private int codVendas;
   private float valorFinal;
   private float desconto;
   private String formaPagamento;
   private int notaFiscal;
   private float valorRecebido;
   private float troco;
   private float totalVendas;

   public Vendas(){
       
   }
   
   public Vendas(int codVendas, float valorFinal, float desconto, String formaPagamento, int notaFiscal, float valorRecebido, float troco, float totalVendas){
       this.codVendas = codVendas;
       this.valorFinal = valorFinal;
       this.desconto = desconto;
       this.formaPagamento = formaPagamento;
       this.notaFiscal = notaFiscal;
       this.valorRecebido = valorRecebido;
       this.troco = troco;
       this.totalVendas = totalVendas;
   }
   
    public int getCodVendas() {
        return codVendas;
    }

    public void setCodVendas(int codVendas) {
        this.codVendas = codVendas;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public float getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    
}

