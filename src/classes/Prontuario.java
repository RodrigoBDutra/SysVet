package classes;

public class Prontuario {

    private int codProntuario;
    private String Ectoparasitas;
    private String estadoGeral;
    private String tumor;
    private String ferida;
    private float temperatura;
    private int frequenciaRespiratoria;
    private int frequenciaCardiaca;
    private String observacoes;

    public int getCodProntuario() {
        return codProntuario;
    }

    public void setCodProntuario(int codProntuario) {
        this.codProntuario = codProntuario;
    }

    public String getEctoparasitas() {
        return Ectoparasitas;
    }

    public void setEctoparasitas(String Ectoparasitas) {
        this.Ectoparasitas = Ectoparasitas;
    }

    public String getEstadoGeral() {
        return estadoGeral;
    }

    public void setEstadoGeral(String estadoGeral) {
        this.estadoGeral = estadoGeral;
    }

    public String getTumor() {
        return tumor;
    }

    public void setTumor(String tumor) {
        this.tumor = tumor;
    }

    public String getFerida() {
        return ferida;
    }

    public void setFerida(String ferida) {
        this.ferida = ferida;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public int getFrequenciaRespiratoria() {
        return frequenciaRespiratoria;
    }

    public void setFrequenciaRespiratoria(int frequenciaRespiratoria) {
        this.frequenciaRespiratoria = frequenciaRespiratoria;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Prontuario() {

    }

    public Prontuario(int codProntuario, String Ectoparasitas, String estadoGeral, String tumor, String ferida, float temperatura, int frequenciaRespiratoria, int frequenciaCardiaca, String observacoes) {
        this.codProntuario = codProntuario;
        this.Ectoparasitas = Ectoparasitas;
        this.estadoGeral = estadoGeral;
        this.tumor = tumor;
        this.ferida = ferida;
        this.temperatura = temperatura;
        this.frequenciaRespiratoria = frequenciaRespiratoria;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.observacoes = observacoes;
    }
}
