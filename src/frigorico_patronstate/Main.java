package frigorico_patronstate;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;



/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Para fecha
    Instant now = Instant.now(); 

    //Cortes Vacunos
    CorteVacuno cv1 = new CorteVacuno(1 , (float)4.68 , 650,Date.from(now), Date.from(now),Date.from(now));
    CorteVacuno cv2 = new CorteVacuno(2 , (float)7 , 1250, Date.from(now), Date.from(now),Date.from(now));
    CorteVacuno cv3 = new CorteVacuno(3 , (float)18 , 8950, Date.from(now), Date.from(now),Date.from(now));
    CorteVacuno cv4 = new CorteVacuno(4 , (float)60 , 950, Date.from(now), Date.from(now),Date.from(now));

    
    //Vector de cv
    CorteVacuno[] CVParaR1 = {cv1,cv2};
    CorteVacuno[] CVParaR2 = {cv3,cv4};
    
    //Remitos
    Remito r1 = new Remito(1, CVParaR1 , Date.from(now), Date.from(now));
    Remito r2 = new Remito(2, CVParaR2 , Date.from(now), Date.from(now));
    
    //Vector de remitos
    Remito[] remitos = {r1,r2};
    
    //Creacion del Gestor.
    GestorPlanDeEntrega gestor = new GestorPlanDeEntrega();
    
    //Datos para el Gestor
    gestor.setRemitos(remitos);
    
    //Metodo de inicio.
    gestor.actualizarEstadoRemitos();
       
    }
    
}
