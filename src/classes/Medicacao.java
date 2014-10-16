
package classes;

public class Medicacao {
    
    private int codMedicacao;
    private String validade;
    private String fabricante;

    public int getCodMedicacao() {
        return codMedicacao;
    }

    public void setCodMedicacao(int codMedicacao) {
        this.codMedicacao = codMedicacao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public Medicacao(){
        
    }
    
    public Medicacao(int codMedicacao, String validade, String fabricante){
    
        this.codMedicacao = codMedicacao;
        this.validade = validade;
        this.fabricante = fabricante;
                
    }
  
}
