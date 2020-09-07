package org.vtec.investigador.core.domain.biz.cartas;

import org.vtec.investigador.core.domain.biz.cartas.constants.Cor;
import org.vtec.investigador.core.domain.biz.cartas.constants.DiscriminatorValuesCarta;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = DiscriminatorValuesCarta.DISCRIMINATOR_VALUE_PERSONAGEM)
public class Personagem extends Carta {

    private Cor cor;

    @Enumerated(EnumType.STRING)
    @Column(name = "PER_COR", nullable = false)
    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
