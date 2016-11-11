import java.util.LinkedList;

/**
 * Created by leonelszperling on 11/11/2016.
 */
public class Juego {


    private LinkedList<Ronda> listaDeRondas;
    private Ronda rondaActual;
    //private int contadorDeRonda;

    public Juego() {
        //rondaActual = new RondaNormal();
        //contadorDeRonda = 1;
        listaDeRondas = new LinkedList<Ronda>();
        for(int i = 0; i < 10; i++)
            listaDeRondas.add(new RondaNormal());

        rondaActual = listaDeRondas.getFirst();
    }

    public int getPuntaje() {

        int puntajeAcumulado = 0;
        for (Ronda rondita: listaDeRondas) {
            puntajeAcumulado += rondita.getPuntajeRonda();

        }

        return puntajeAcumulado;
    }

    public boolean juegoTerminado() {
        return false;
    }

    public int currentRondaNumber() {
        return listaDeRondas.indexOf(rondaActual) +1;
    }

    public void tiraronPinos(int pinosTirados) {

        rondaActual.registrarTiro(pinosTirados);

        if(rondaActual.yaTermine() && listaDeRondas.getLast() != rondaActual) {

            int indiceDelActual = listaDeRondas.indexOf(rondaActual);

            int indiceDelSiguiente = indiceDelActual +1;
            rondaActual = listaDeRondas.get(indiceDelSiguiente);
        }


    }

}
