package classes;

public class Financeiro {

    private int codFinanceiro;
    private String tipoConta;

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

    public Financeiro() {

    }

    public Financeiro(int codFinanceiro, String tipoConta) {
        this.codFinanceiro = codFinanceiro;
        this.tipoConta = tipoConta;
    }

}
