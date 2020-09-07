package org.vtec.investigador.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vtec.investigador.core.domain.biz.SecaoJogo;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/secoesJogos")
public class SecaoJogoController {

    @GetMapping
    public List<SecaoJogo> listar() {
        //Simulacao simples para teste
        SecaoJogo secaoJogo = new SecaoJogo();
        secaoJogo.setId(1L);
        secaoJogo.setName("teste");
        return Collections.singletonList(secaoJogo);
    }
}
