/**
 * Created by Geral on 04/11/2016.
 */
public abstract class Ronda {
    protected int puntajeAcumulado;
    public int tirosRealizados;

    public abstract int cantidadDeTirosPosibles();

    public int getPuntajeAcumulado() {
        return puntajeAcumulado;
    }

    public abstract void registrarTiro(int pinosTirados);
}
