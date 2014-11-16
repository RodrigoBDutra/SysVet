package classes;

import viewsteste.Proprietario;

public class Animal {

    private int codAnimal;
    private String nomeAnimal;
    private String nascimento;
    private int idade;
    private String sexo;
    private float peso;
    private float altura;
    private String porte;
    private String cor;
    private String chip;
    private int numeroChip;
    private int codEspecie;
    private int codProntuario;
    private boolean obito;
    private String observacao;
    private Especie especie;
    private Raca raca;
    private TipoAnimal tipoanimal;

    public Animal() {
        this.codAnimal = 0;
        this.nomeAnimal = "";
        this.nascimento = "";
        this.idade = 0;
        this.sexo = "";
        this.peso = 0;
        this.altura = 0;
        this.porte = "";
        this.cor = "";
        this.chip = "";
        this.numeroChip = 0;
        this.codEspecie = 0;
        this.obito = false;
        this.observacao = "";

    }

    public Animal(String nomeAnimal, String nascimento,
            int idade, String sexo, float peso, float altura,
            String porte, String cor, String chip, int numeroChip,
            String raca, int codEspecie, boolean obito,
            String observacao) {

        this.nomeAnimal = nomeAnimal;
        this.nascimento = nascimento;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.porte = porte;
        this.cor = cor;
        this.chip = chip;
        this.numeroChip = numeroChip;
        this.codEspecie = codEspecie;
        this.obito = obito;
        this.observacao = observacao;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public int getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
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

    public boolean isObito() {
        return obito;
    }

    public void setObito(boolean obito) {
        this.obito = obito;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Raca getRaca() {
        return raca;
    }

    public TipoAnimal getTipoanimal() {
        return tipoanimal;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public void setTipoanimal(TipoAnimal tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    public int getCodProntuario() {
        return codProntuario;
    }

    public void setCodProntuario(int codProntuario) {
        this.codProntuario = codProntuario;
    }
}
