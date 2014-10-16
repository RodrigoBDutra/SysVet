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
public class Financeiro {
    private int codFinanceiro;
    private String tipoConta;
    
    public Financeiro(){
        
    }
    
    public Financeiro(int codFinanceiro, String tipoConta){
        this.codFinanceiro = codFinanceiro;
        this.tipoConta = tipoConta;
    }

    public int getCodFinanceiro() {
        return codFinanceiro;
    }

    public void setCodFinanceiro(int codFinanceiro) {
        this.codFinanceiro = codFinanceiro;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
