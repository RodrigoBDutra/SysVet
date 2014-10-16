package classes;

public class HistoricoFornecedor {
    private int codHistFornecedor;
    private int entrega;
    private String status;

    public int getCodHistFornecedor() {
        return codHistFornecedor;
    }

    public void setCodHistFornecedor(int codHistFornecedor) {
        this.codHistFornecedor = codHistFornecedor;
    }

    public int getEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public HistoricoFornecedor(){
        
    }
    
    public HistoricoFornecedor(int codHistFornecedor, int entrega, String status){
        this.codHistFornecedor = codHistFornecedor;
        this.entrega = entrega;
        this.status = status;           
    }   
}
