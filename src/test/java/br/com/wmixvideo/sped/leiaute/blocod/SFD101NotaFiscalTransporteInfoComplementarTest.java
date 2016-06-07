package br.com.wmixvideo.sped.leiaute.blocod;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class SFD101NotaFiscalTransporteInfoComplementarTest {

    @Test
    public void testeToString() throws Exception {
        final SFD101NotaFiscalTransporteInfoComplementar linha = new SFD101NotaFiscalTransporteInfoComplementar()
                .setValorFundoCombatePobreza(BigDecimal.valueOf(3.05))
                .setValorICMSDestino(BigDecimal.valueOf(3.1))
                .setValorICMSRemetente(BigDecimal.valueOf(3.15));

        Assert.assertEquals("|D101|3,05|3,10|3,15|", linha.toString());
    }

}