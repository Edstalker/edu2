import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Geral on 04/11/2016.
 */
public class RondaTest {
    @Test
    public void creoRonda(){
        Ronda ronda = new RondaNormal();
        assertEquals(2, ronda.cantidadDeTirosPosibles());

        Ronda ronda2 = new UltimaRonda();
        assertEquals(3, ronda2.cantidadDeTirosPosibles());
    }

    @Test
    public void puntajeInicial(){
        Ronda ronda = new RondaNormal();

        assertEquals(0,ronda.getPuntajeAcumulado());
        Ronda ronda2 = new UltimaRonda();

        assertEquals(0,ronda.getPuntajeAcumulado());

    }

    @Test
    public void incrementarPuntaje(){
        Ronda ronda = new RondaNormal();

        ronda.registrarTiro(10);

        assertEquals(10,ronda.getPuntajeAcumulado());


        Ronda ronda2 = new UltimaRonda();

        ronda2.registrarTiro(10);

        assertEquals(10,ronda2.getPuntajeAcumulado());
    }

    @Test
    public void incrementarPuntajeEnExceso(){
        Ronda ronda = new RondaNormal();

        ronda.registrarTiro(10);
        ronda.registrarTiro(10);

        assertEquals(ronda.getPuntajeAcumulado(), 10);

        Ronda ronda2 = new RondaNormal();
        ronda2.registrarTiro(1);
        ronda2.registrarTiro(1);
        ronda2.registrarTiro(1);

        assertEquals(ronda2.getPuntajeAcumulado(), 2);

        //a verga
    }
}