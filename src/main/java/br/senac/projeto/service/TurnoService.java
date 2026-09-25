package br.senac.projeto.service;


import br.senac.projeto.Dto.TurnoRequestDto;
import br.senac.projeto.entidades.Turno;
import br.senac.projeto.repositorio.TurnoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {

    @Autowired
    private TurnoRepositorio turnoRepositorio;

    //01 - LISTAR TURNOS
    public List<Turno> listarTodos() { return turnoRepositorio.findAll(); }

    public Turno buscarPorId(Long id) {
        return turnoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Turno Não encontrado"));
    }


    //02 - CRIAR TURNO
    public Turno criar(TurnoRequestDto dto) {
        Turno novoTurno = new Turno();
        this.copiarDadosParaEntidade(dto, novoTurno);
        return turnoRepositorio.save(novoTurno);
    }

    //03 - ATUALIZAR TURNO
    public Turno atualizar(Long id, TurnoRequestDto dto) {
        Turno existente = this.buscarPorId(id);
        // this.normalizar(dto);
        //this.validarRegrasNegocio(dto, id);
        this.copiarDadosParaEntidade(dto, existente);
        return turnoRepositorio.save(existente);
    }

    // 04 - DELETAR TURNO
    public void deletar(Long id) {
        if (!turnoRepositorio.existsById(id)) {
            throw new RuntimeException ("Turno não encontrado!");
        }
        turnoRepositorio.deleteById(id);
    }

    // 05 - REGRAS DE NEGOCIOS
    private void copiarDadosParaEntidade(TurnoRequestDto entrada, Turno saida) {
        saida.setColabResp(entrada.getColabResp());
        saida.setTurno(entrada.getTurno());
        saida.setStatus(entrada.getStatus());
        saida.setDataHoraIni(entrada.getdataHoraIni());
        saida.setDataHoraFim(entrada.getdataHoraIni());
        saida.setPendencias(entrada.getPendencias());
    }

}
