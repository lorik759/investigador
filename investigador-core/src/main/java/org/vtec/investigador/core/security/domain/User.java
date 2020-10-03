package org.vtec.investigador.core.security.domain;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
