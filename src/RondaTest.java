import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Geral on 04/11/2016.
 */
public class RondaTest {
    @Test
    public void creoRonda() {
        Ronda ronda = new RondaNormal();
        assertEquals(2, ronda.cantidadDeTirosPosibles());

        Ronda ronda2 = new UltimaRonda();
        assertEquals(3, ronda2.cantidadDeTirosPosibles());
    }

    @Test
    public void puntajeInicial() {
        Ronda ronda = new RondaNormal();

        assertEquals(0, ronda.getPuntajeRonda());
        Ronda ronda2 = new UltimaRonda();

        assertEquals(0, ronda.getPuntajeRonda());

    }

    @Test
    public void incrementarPuntaje() {
        RondaNormal ronda = new RondaNormal();

        ronda.registrarTiro(10);

        assertEquals(10, ronda.getPuntajeRonda());


        Ronda ronda2 = new UltimaRonda();

        ronda2.registrarTiro(10);

        assertEquals(10, ronda2.getPuntajeRonda());
    }

    @Test
    public void puntajeEnExceso() {
        Ronda ronda = new RondaNormal();

        ronda.registrarTiro(10);
        ronda.registrarTiro(10);
        //Demasiados puntos
        assertEquals(ronda.getPuntajeRonda(), 10);

        Ronda ronda2 = new RondaNormal();
        ronda2.registrarTiro(1);
        ronda2.registrarTiro(1);
        ronda2.registrarTiro(1);
        //Demasiados tiros
        assertEquals(ronda2.getPuntajeRonda(), 2);

    }

    @Test
    public void incrementarPuntajeUltimaRonda() {
        UltimaRonda ronda = new UltimaRonda();

        ronda.registrarTiro(10);
        ronda.registrarTiro(10);
        ronda.registrarTiro(10);

        assertEquals(ronda.getPuntajeRonda(), 30);

        UltimaRonda ronda2 = new UltimaRonda();

        ronda2.registrarTiro(1);
        ronda2.registrarTiro(1);
        ronda2.registrarTiro(1);

        assertEquals(2, ronda2.getPuntajeRonda());


    }

    @Test
    public void rondaNormalTerminada() {
        RondaNormal ronda = new RondaNormal();
        assertEquals(false, ronda.yaTermine());
        ronda.registrarTiro(10);
        assertEquals(true, ronda.yaTermine());

    }

    @Test
    public void ultimaRondaTerminadaPorTiros() {
        UltimaRonda ronda = new UltimaRonda();
        assertEquals(false, ronda.yaTermine());
        ronda.registrarTiro(10);
        assertEquals(false, ronda.yaTermine());
        ronda.registrarTiro(10);
        assertEquals(false, ronda.yaTermine());
        ronda.registrarTiro(10);
        assertEquals(true, ronda.yaTermine());

        UltimaRonda rondaPasable = new UltimaRonda();
        rondaPasable.registrarTiro(6);
        assertEquals(false, rondaPasable.yaTermine());
        rondaPasable.registrarTiro(4);
        assertEquals(false, rondaPasable.yaTermine());
        rondaPasable.registrarTiro(10);
        assertEquals(true, rondaPasable.yaTermine());
    }

    @Test
    public void ultimaRondaTerminadaPorFaltaDePuntos() {

        UltimaRonda rondaPesima = new UltimaRonda();
        rondaPesima.registrarTiro(1);
        assertEquals(false, rondaPesima.yaTermine());
        rondaPesima.registrarTiro(1);
        assertEquals(true, rondaPesima.yaTermine());


    }

}

