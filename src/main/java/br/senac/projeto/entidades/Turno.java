package br.senac.projeto.entidades;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String colabResp;

    @Column(nullable = false, length = 10)
    private String turno;

    @Column(nullable = false, length = 10)
    private String status;

    @Column(nullable = false)
    private LocalDateTime dataHoraIni;

    @Column(nullable = false)
    private LocalDateTime dataHoraFim;

    @Column(length = 1000)
    private String pendencias;


    public Turno() {}

    public Turno(Long id, String colabResp, String turno, String status, LocalDateTime dataHoraIni, LocalDateTime dataHoraFim, String pendencias) {
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

    public LocalDateTime getDataHoraIni() {
        return dataHoraIni;
    }

    public void setDataHoraIni(LocalDateTime dataHoraIni) {
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
