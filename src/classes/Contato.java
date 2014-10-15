package classes;

public class Contato {
    
    private int codContato;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String telefoneComercial;
    private String email;
    private String site;

    
    public Contato(){
        
    }
    public Contato(int codCont,String telRes, String telCel, String telCom, String mail, String site){
        this.codContato = codCont;
        this.telefoneResidencial = telRes;
        this.telefoneCelular = telCel;
        this.telefoneComercial = telCom;
        this.email = mail;
        this.site = site;
    }

    public int getCodContato() {
        return codContato;
    }

    public void setCodContato(int codContato) {
        this.codContato = codContato;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
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
    
}
