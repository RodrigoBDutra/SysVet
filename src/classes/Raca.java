package classes;

public class Raca {

    private int codRaca;
    private String nomeRaca;
    private int codEspecie;
    private Especie especie;
    
    public Raca() {
        this.codRaca = 0;
        this.nomeRaca = "";
        this.codEspecie = 0;
    }

    public Raca(int codRaca, String nomeRaca, int codEspecie) {
        this.codRaca = codRaca;
        this.nomeRaca = nomeRaca;
        this.codEspecie = codEspecie;
    }

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

    public int getCodEspecie() {
        return codEspecie;
    }

    public void setCodEspecie(int codEspecie) {
        this.codEspecie = codEspecie;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
