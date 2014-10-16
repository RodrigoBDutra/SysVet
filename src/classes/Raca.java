package classes;

public class Raca {
    private int codRaca;
    private String nomeRaca;

    public int getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(int codRaca) {
        this.codRaca = codRaca;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public void setNomeRaca(String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }

    public Raca() {
        
    }

    public Raca(int codRaca, String nomeRaca) {
        this.codRaca = codRaca;
        this.nomeRaca = nomeRaca;
    }
}
