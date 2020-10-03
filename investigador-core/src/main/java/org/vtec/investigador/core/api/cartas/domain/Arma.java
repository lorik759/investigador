package org.vtec.investigador.core.api.cartas.domain;

import org.vtec.investigador.core.api.cartas.domain.constants.DiscriminatorValuesCarta;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = DiscriminatorValuesCarta.DISCRIMINATOR_VALUE_ARMA)
public class Arma extends Carta {
}
