/**
 * Created by Geral on 04/11/2016.
 */
public abstract class Ronda {
    protected int puntajeAcumulado;
    public int tirosRealizados;
    protected int tirosPosibles;


    public int cantidadDeTirosPosibles() {
        return tirosPosibles;
    }

    public int getPuntajeRonda() {
        return puntajeAcumulado;
    }


    public abstract void registrarTiro(int pinosTirados);


    public abstract boolean yaTermine();

    public boolean soyStrike() {
        return tirosRealizados != cantidadDeTirosPosibles() && this.puntajeAcumulado==10;
    }

    public boolean soySplit() {
            return tirosRealizados == cantidadDeTirosPosibles() && this.puntajeAcumulado==10;
    }
}
