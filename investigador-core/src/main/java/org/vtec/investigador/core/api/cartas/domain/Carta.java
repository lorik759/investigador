package org.vtec.investigador.core.api.cartas.domain;

import javax.persistence.*;

@Entity
@Table(name = "CART")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "CART_TYP", discriminatorType = DiscriminatorType.INTEGER)
public abstract class Carta {

    private Long id;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "CART_NAME", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
