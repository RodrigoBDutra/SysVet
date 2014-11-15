package classes;

public class Agenda {

    private int codAgenda;
    private String dataAgendamento;
    private String horaAgendamento;
    private String tipoAtendimento;
    private String status;
    private String observacao;

    public int getCodAgenda() {
        return codAgenda;
    }

    public void setCodAgenda(int codAgenda) {
        this.codAgenda = codAgenda;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getHoraAgendamento() {
        return horaAgendamento;
    }

    public void setHoraAgendamento(String horaAgendamento) {
        this.horaAgendamento = horaAgendamento;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Agenda() {

    }

    public Agenda(int codAgenda, String dataAgendamento, String horaAgendamento, String tipoAtendimento, String status, String observacoes) {
        this.codAgenda = codAgenda;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.tipoAtendimento = tipoAtendimento;
        this.status = status;
        this.observacao = observacoes;
    }
}
