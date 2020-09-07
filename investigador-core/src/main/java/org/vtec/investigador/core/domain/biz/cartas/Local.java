package org.vtec.investigador.core.domain.biz.cartas;

import org.vtec.investigador.core.domain.biz.cartas.constants.DiscriminatorValuesCarta;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = DiscriminatorValuesCarta.DISCRIMINATOR_VALUE_LOCAL)
public class Local extends Carta {
}
