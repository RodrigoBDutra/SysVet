package classes;

public class Mucosa {

    private int codMucosa;
    private String bucal;
    private String labial;
    private String ocular;
    private String vulva;
    private String prepucial;

    public int getCodMucosa() {
        return codMucosa;
    }

    public void setCodMucosa(int codMucosa) {
        this.codMucosa = codMucosa;
    }

    public String getBucal() {
        return bucal;
    }

    public void setBucal(String bucal) {
        this.bucal = bucal;
    }

    public String getLabial() {
        return labial;
    }

    public void setLabial(String labial) {
        this.labial = labial;
    }

    public String getOcular() {
        return ocular;
    }

    public void setOcular(String ocular) {
        this.ocular = ocular;
    }

    public String getVulva() {
        return vulva;
    }

    public void setVulva(String vulva) {
        this.vulva = vulva;
    }

    public String getPrepucial() {
        return prepucial;
    }

    public void setPrepucial(String prepucial) {
        this.prepucial = prepucial;
    }

    public Mucosa() {

    }

    public Mucosa(int codMucosa, String bucal, String labial, String ocular, String vulva, String prepucial) {
        this.codMucosa = codMucosa;
        this.bucal = bucal;
        this.labial = labial;
        this.ocular = ocular;
        this.vulva = vulva;
        this.prepucial = prepucial;
    }

}
