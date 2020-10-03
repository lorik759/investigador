package org.vtec.investigador.core.api.secaoJogo.domain;

import org.vtec.investigador.core.security.domain.User;

import javax.persistence.*;

@Entity
@Table(name = "SEC_JOG")
public class SecaoJogo {

    private Long id;

    private String name;

    private Integer turnos;

    private User adiministrador;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "SEC_NAME", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TURN_NUM", nullable = false)
    public Integer getTurnos() {
        return turnos;
    }

    public void setTurnos(Integer turnos) {
        this.turnos = turnos;
    }

    @ManyToOne
    @JoinColumn(name = "USR_ID", nullable = false)
    public User getAdiministrador() {
        return adiministrador;
    }

    public void setAdiministrador(User adiministrador) {
        this.adiministrador = adiministrador;
    }
}
