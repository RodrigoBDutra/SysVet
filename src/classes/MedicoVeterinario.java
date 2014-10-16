
package classes;


public class MedicoVeterinario {
    private int codVeterinario;
    private int CRMV;

    public int getCodVeterinario() {
        return codVeterinario;
    }

    public void setCodVeterinario(int codVeterinario) {
        this.codVeterinario = codVeterinario;
    }

    public int getCRMV() {
        return CRMV;
    }

    public void setCRMV(int CRMV) {
        this.CRMV = CRMV;
    }
    public MedicoVeterinario(){
        
    }
    
    public MedicoVeterinario(int codVeterinario, int CRMV){
    
        this.codVeterinario = codVeterinario;
        this.CRMV = CRMV;                
    }
}

