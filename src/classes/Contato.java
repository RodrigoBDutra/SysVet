package classes;

public class Contato {
    
    private int codContato;
    private int telefoneResidencial;
    private int telefoneCelular;
    private int telefoneComercial;
    private String email;
    private String site;

    public int getCodContato() {
        return codContato;
    }

    public void setCodContato(int codContato) {
        this.codContato = codContato;
    }

    public int getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(int telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public int getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(int telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public int getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(int telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    public Contato(){
        
    }
    public Contato(int codCont, int telRes, int telCel, int telCom, String mail, String site){
        this.codContato = codCont;
        this.telefoneResidencial = telRes;
        this.telefoneCelular = telCel;
        this.telefoneComercial = telCom;
        this.email = mail;
        this.site = site;
    }
    
}
