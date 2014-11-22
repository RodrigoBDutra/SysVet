package classes;

public class TipoAnimal {

    private int codTipoAnimal;
    private String tipoAnimal;
    private int codEspecie;
    private Especie especie;

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

    public TipoAnimal() {

    }

    public TipoAnimal(int codTipoAnimal, String tipoAnimal, int codRaca) {
        this.codTipoAnimal = codTipoAnimal;
        this.tipoAnimal = tipoAnimal;
        this.codEspecie = codEspecie;

    }

}
