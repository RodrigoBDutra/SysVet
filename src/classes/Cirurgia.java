package classes;

public class Cirurgia {

    private int codCirurgia;
    private String descricao;
    private boolean alta;

    public int getCodCirurgia() {
        return codCirurgia;
    }

    public void setCodCirurgia(int codCirurgia) {
        this.codCirurgia = codCirurgia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Cirurgia() {

    }

    public Cirurgia(int codCirurgia, String descricao, boolean alta) {
        this.codCirurgia = codCirurgia;
        this.descricao = descricao;
        this.alta = alta;
    }
}
