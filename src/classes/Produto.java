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
public class Produto {
    private int codProduto;
    private int EAN;
    private String nomeProduto;
    private int NCM;
    private int unidade;
    private float valorUnidade;
    private float lucro;
    private float valorVenda;
    private int estoqueMinimo;
    
    public Produto (){
        
    }
    
    public Produto(int codProduto, int EAN, String nomeProduto, int NCM, int unidade, float valorUnidade, float lucro, float valorVenda, int estoqueMinimo){
        this.codProduto = codProduto;
        this.EAN = EAN;
        this.nomeProduto = nomeProduto;
        this.NCM = NCM;
        this.unidade = unidade;
        this.valorUnidade = valorUnidade;
        this.valorVenda = valorVenda;
        this.lucro = lucro;
        this.valorVenda = valorVenda;
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getEAN() {
        return EAN;
    }

    public void setEAN(int EAN) {
        this.EAN = EAN;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getNCM() {
        return NCM;
    }

    public void setNCM(int NCM) {
        this.NCM = NCM;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
}
