package org.vtec.investigador.core.domain.biz;

import org.vtec.investigador.core.domain.biz.cartas.Local;
import org.vtec.investigador.core.domain.biz.cartas.Personagem;
import org.vtec.investigador.core.domain.security.User;

import javax.persistence.*;

@Entity
@Table(name = "JOGR")
public class Jogador {

    private Long id;

    private User usuario;

    private Personagem personagem;

    private Local posicao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    @ManyToOne
    @JoinColumn(name = "PER_ID")
    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    @ManyToOne
    @JoinColumn(name = "LOCL_ID")
    public Local getPosicao() {
        return posicao;
    }

    public void setPosicao(Local posicao) {
        this.posicao = posicao;
    }
}
