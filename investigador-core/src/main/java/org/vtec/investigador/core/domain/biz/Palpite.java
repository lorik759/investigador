package org.vtec.investigador.core.domain.biz;

import org.vtec.investigador.core.domain.biz.cartas.Arma;
import org.vtec.investigador.core.domain.biz.cartas.Local;
import org.vtec.investigador.core.domain.biz.cartas.Personagem;

import javax.persistence.*;

@Entity
@Table(name = "PALPI")
public class Palpite {

    private Long id;

    private Personagem personagem;

    private Local local;

    private Arma arma;

    private Jogador jogador;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "PER_ID", nullable = false)
    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    @ManyToOne
    @JoinColumn(name = "LOCL_ID", nullable = false)
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    @ManyToOne
    @JoinColumn(name = "ARMA_ID", nullable = false)
    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @ManyToOne
    @JoinColumn(name = "JOGR_ID", nullable = false)
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
