import javafx.scene.control.ListCell;
import javafx.scene.media.MediaException;

/**
 * Created by Geral on 04/11/2016.
 */
public class UltimaRonda extends Ronda {


    public UltimaRonda(){
        this.tirosPosibles = 3;
    }



    @Override
    public void registrarTiro(int pinosTirados) {

        if (tirosRealizados<cantidadDeTirosPosibles()-1) {
            puntajeAcumulado = puntajeAcumulado + pinosTirados;
            tirosRealizados++;
        }
        else if (tirosRealizados==cantidadDeTirosPosibles()-1 && puntajeAcumulado >=10){
            puntajeAcumulado = puntajeAcumulado + pinosTirados;
            tirosRealizados++;
        }
    }

    @Override
    public boolean yaTermine() {
        return tirosRealizados==3 || (tirosRealizados==2 && puntajeAcumulado <10);
    }


}

