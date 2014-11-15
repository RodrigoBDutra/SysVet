package classes;

public class HistoricoAnimal {

    private int codHistorico;
    private String atendimento;
    private String horario;
    private String nomeMedico;
    private int CRMV;
    private String tipoAtendimento;
    private String status;

    public int getCodHistorico() {
        return codHistorico;
    }

    public void setCodHistorico(int codHistorico) {
        this.codHistorico = codHistorico;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public int getCRMV() {
        return CRMV;
    }

    public void setCRMV(int CRMV) {
        this.CRMV = CRMV;
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

    public HistoricoAnimal() {

    }

    public HistoricoAnimal(int codHistorico, String atendimento, String horario, String nomeMedico, int CRMV, String tipoAtendimento, String status) {
        this.codHistorico = codHistorico;
        this.atendimento = atendimento;
        this.horario = horario;
        this.nomeMedico = nomeMedico;
        this.CRMV = CRMV;
        this.tipoAtendimento = tipoAtendimento;
        this.status = status;
    }
}
