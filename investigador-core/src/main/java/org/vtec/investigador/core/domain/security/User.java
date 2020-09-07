package org.vtec.investigador.core.domain.security;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
