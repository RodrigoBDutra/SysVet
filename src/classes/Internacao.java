package classes;

public class Internacao {
    private int codInternacao;
    private String dataInicio;
    private String dataFim;
    private String descricao;
    
    public int getCodInternacao() {
        return codInternacao;
    }

    public void setCodInternacao(int codInternacao) {
        this.codInternacao = codInternacao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Internacao(){
        
    }
    
    public Internacao(int codInternacao, String dataInicio, String dataFim, String descricao){
        this.codInternacao = codInternacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
    }
}
