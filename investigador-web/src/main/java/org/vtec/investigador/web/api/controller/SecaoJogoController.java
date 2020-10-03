package org.vtec.investigador.web.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.vtec.investigador.core.api.secaoJogo.domain.SecaoJogo;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/secoesJogos", produces = MediaType.APPLICATION_JSON_VALUE)
public class SecaoJogoController {

    @GetMapping
    public List<SecaoJogo> listar() {
        //Simulacao simples para teste
        SecaoJogo secaoJogo = new SecaoJogo();
        secaoJogo.setId(1L);
        secaoJogo.setName("teste");
        return Collections.singletonList(secaoJogo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SecaoJogo> get(@PathVariable("id") Long id) {
        SecaoJogo secaoJogo = new SecaoJogo();
        secaoJogo.setId(id);
        secaoJogo.setName("teste");
        return ResponseEntity.ok(secaoJogo);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SecaoJogo adicinar(@RequestBody SecaoJogo secaoJogo) {
        return secaoJogo;
    }

    @PutMapping("/{id}")
    public ResponseEntity<SecaoJogo> atualizar(@PathVariable("id") Long id, @RequestBody SecaoJogo secaoJogo) {
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SecaoJogo> remover(@PathVariable("id") Long id) {
        return ResponseEntity.notFound().build();
    }
}
