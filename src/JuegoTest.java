import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leonelszperling on 11/11/2016.
 */
public class JuegoTest {

    @Test
    public void creoJuegoValido(){

        Juego nuevoJuego = new Juego();

        assertEquals(0, nuevoJuego.getPuntaje());
        assertFalse(nuevoJuego.juegoTerminado());
        assertEquals(1,nuevoJuego.currentRondaNumber());

    }

    @Test
    public void realizarTiroSimple(){
        Juego nuevoJuego = new Juego();
        nuevoJuego.tiraronPinos(9);
        assertEquals(9,nuevoJuego.getPuntaje());
        assertEquals(1, nuevoJuego.currentRondaNumber());
    }

    @Test
    public void realizarStrike(){
        Juego nuevoJuego = new Juego();
        nuevoJuego.tiraronPinos(10);
        assertEquals(10,nuevoJuego.getPuntaje());
        assertEquals(2, nuevoJuego.currentRondaNumber());
    }
    @Test
    public void realizarSplit(){
        Juego nuevoJuego = new Juego();
        nuevoJuego.tiraronPinos(9);
        nuevoJuego.tiraronPinos(1);
        assertEquals(10,nuevoJuego.getPuntaje());
        assertEquals(2, nuevoJuego.currentRondaNumber());
    }

    @Test
    public void completarJuego(){
        Juego nuevoJuego = new Juego();
        for(int i = 0; i < 20; i++)
            nuevoJuego.tiraronPinos(1);

        assertEquals(20,nuevoJuego.getPuntaje());
        //assertTrue(nuevoJuego.juegoTerminado());
    }
}