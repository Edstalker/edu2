/**
 * Created by Geral on 04/11/2016.
 */
public class RondaNormal extends Ronda {
    @Override
    public int cantidadDeTirosPosibles() {
        return 2;
    }

    @Override
    public void registrarTiro(int pinosTirados) {
        if(puntajeAcumulado + pinosTirados <= 10 && tirosRealizados < cantidadDeTirosPosibles()) {
            this.puntajeAcumulado = puntajeAcumulado + pinosTirados;
            this.tirosRealizados++;
        }
    }
}
