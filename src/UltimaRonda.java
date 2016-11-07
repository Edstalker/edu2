/**
 * Created by Geral on 04/11/2016.
 */
public class UltimaRonda extends Ronda {

    @Override
    public int cantidadDeTirosPosibles() {
        return 3;
    }

    @Override
    public void registrarTiro(int pinosTirados) {
        if(puntajeAcumulado + pinosTirados <= 10) {
            this.puntajeAcumulado = puntajeAcumulado + pinosTirados;
        }
    }
}
