package classes;

public class Equipamentos {

    private int codEquipamento;
    private String nome;
    private String garantia;
    private String marca;

    public int getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(int codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Equipamentos() {
    }

    public Equipamentos(int codEquipamento, String nome, String garantia, String marca) {

        this.codEquipamento = codEquipamento;
        this.nome = nome;
        this.garantia = garantia;
        this.marca = marca;
    }
}
