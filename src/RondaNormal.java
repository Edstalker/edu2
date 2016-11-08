/**
 * Created by Geral on 04/11/2016.
 */
public class RondaNormal extends Ronda {

    public RondaNormal(){this.tirosPosibles = 2;}

    @Override
    public void registrarTiro(int pinosTirados) {
        if(puntajeAcumulado + pinosTirados <= 10 && tirosRealizados < cantidadDeTirosPosibles()) {
            this.puntajeAcumulado = puntajeAcumulado + pinosTirados;
            this.tirosRealizados++;
        }
    }

    @Override
    public boolean yaTermine() {
        return  tirosRealizados==cantidadDeTirosPosibles() || this.puntajeAcumulado==10;
    }

}
