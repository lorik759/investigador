package org.vtec.investigador.core.api.crime.domain;

import org.vtec.investigador.core.api.cartas.domain.Arma;
import org.vtec.investigador.core.api.cartas.domain.Local;
import org.vtec.investigador.core.api.cartas.domain.Personagem;

import javax.persistence.*;

@Entity
@Table(name = "CRIME")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Crime {

    private Long id;

    private Personagem personagem;

    private Local local;

    private Arma arma;

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
}
