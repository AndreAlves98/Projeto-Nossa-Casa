package br.senac.projeto.Dto;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class TurnoRequestDto {

    private Long id;

    private String colabResp;
    private String turno;
    private String status;
    private LocalDateTime dataHoraIni;
    private LocalDateTime dataHoraFim;
    private String pendencias;

    public TurnoRequestDto() {}

    public TurnoRequestDto(Long id, String colabResp, String turno, String status, LocalDateTime dataHoraIni, LocalDateTime dataHoraFim, String pendencias) {
        this.id = id;
        this.colabResp = colabResp;
        this.turno = turno;
        this.status = status;
        this.dataHoraIni = dataHoraIni;
        this.dataHoraFim = dataHoraFim;
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

    public LocalDateTime getdataHoraIni() {
        return dataHoraIni;
    }

    public void setdataHoraIni(LocalDateTime dataHoraIni) {
        this.dataHoraIni = dataHoraIni;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getPendencias() {
        return pendencias;
    }

    public void setPendencias(String pendencias) {
        this.pendencias = pendencias;
    }

}
