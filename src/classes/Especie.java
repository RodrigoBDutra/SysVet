package classes;

public class Especie {

    private int codEspecie;
    private String especie;
    private int codTipoAnimal;
    private TipoAnimal tipoaAnimal;

    public Especie() {
        this.codEspecie = 0;
        this.especie = "";
        this.codTipoAnimal = 0;
    }

    public Especie(int codEspecie, String especie, int codTipoAnimal) {
        this.codEspecie = codEspecie;
        this.especie = especie;
        this.codTipoAnimal = codTipoAnimal;
    }

    public int getCodEspecie() {
        return codEspecie;
    }

    public void setCodEspecie(int codEspecie) {
        this.codEspecie = codEspecie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getCodTipoAnimal() {
        return codTipoAnimal;
    }

    public void setCodTipoAnimal(int codTipoAnimal) {
        this.codTipoAnimal = codTipoAnimal;
    }

    public TipoAnimal getTipoaAnimal() {
        return tipoaAnimal;
    }

    public void setTipoaAnimal(TipoAnimal tipoaAnimal) {
        this.tipoaAnimal = tipoaAnimal;
    }

}
