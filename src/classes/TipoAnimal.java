package classes;

public class TipoAnimal {

    private int codTipoAnimal;
    private String tipoAnimal;
    private int codRaca;
    private Raca raca;

    public int getCodTipoAnimal() {
        return codTipoAnimal;
    }

    public void setCodTipoAnimal(int codTipoAnimal) {
        this.codTipoAnimal = codTipoAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(int codRaca) {
        this.codRaca = codRaca;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public TipoAnimal() {

    }

    public TipoAnimal(int codTipoAnimal, String tipoAnimal, int codRaca) {
        this.codTipoAnimal = codTipoAnimal;
        this.tipoAnimal = tipoAnimal;
        this.codRaca = codRaca;

    }

}
