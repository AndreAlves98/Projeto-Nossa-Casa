package br.senac.projeto.controllers;


import br.senac.projeto.Dto.TurnoRequestDto;
import br.senac.projeto.entidades.Turno;
import br.senac.projeto.service.TurnoService;
import br.senac.projeto.utils.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Turno>> listarTodos() {
        return ResponseEntity.ok(turnoService.listarTodos());
    }


    @PostMapping("/criar")
    public ResponseEntity<?> criar(@RequestBody TurnoRequestDto turno) {
        try {
            return ResponseEntity
                    .status(201)
                    .body(turnoService.criar(turno));
        } catch (RuntimeException e) {
            return ResponseEntity
                    .badRequest()
                    .body(RequestUtil.parserMensagem(e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity
                    .internalServerError()
                    .body(RequestUtil.parserMensagem(e.getMessage()));
        }
    }



    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Turno> atualizar(
            @PathVariable Long id,
            @RequestBody TurnoRequestDto turno
    ) {
        try {
            return ResponseEntity.ok(turnoService.atualizar(
                    id,turno
            ));
        } catch (RuntimeException e) {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        } catch (Exception e) {
            return ResponseEntity
                    .internalServerError()
                    .body(null);
        }
    }


    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        try {
            turnoService.deletar(id);
            return ResponseEntity.ok(null);
        } catch (RuntimeException e) {
            return ResponseEntity
                    .badRequest()
                    .body(null);
        } catch (Exception e) {
            return ResponseEntity
                    .internalServerError()
                    .body(null);
        }
    }
}
