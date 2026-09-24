package br.senac.projeto.Dto;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class TurnoRequestDto {

    private Long id;

    private String colabResp;
    private String turno;
    private String status;
    private LocalDateTime DataHoraIni;
    private LocalDateTime DataHoraFim;
    private String pendencias;

    public TurnoRequestDto() {}

    public TurnoRequestDto(Long id, String colabResp, String turno, String status, LocalDateTime dataHoraIni, LocalDateTime dataHoraFim, String pendencias) {
        this.id = id;
        this.colabResp = colabResp;
        this.turno = turno;
        this.status = status;
        DataHoraIni = dataHoraIni;
        DataHoraFim = dataHoraFim;
        this.pendencias = pendencias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColabResp() {
        return colabResp;
    }

    public void setColabResp(String colabResp) {
        this.colabResp = colabResp;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHoraIni() {
        return DataHoraIni;
    }

    public void setDataHoraIni(LocalDateTime dataHoraIni) {
        DataHoraIni = dataHoraIni;
    }

    public LocalDateTime getDataHoraFim() {
        return DataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        DataHoraFim = dataHoraFim;
    }

    public String getPendencias() {
        return pendencias;
    }

    public void setPendencias(String pendencias) {
        this.pendencias = pendencias;
    }

}
