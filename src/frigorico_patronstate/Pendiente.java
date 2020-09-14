package frigorico_patronstate;

/**
 *
 * @author Javier
 */
public class Pendiente extends Estado {

    public Pendiente() {
    }

    @Override
    public Estado crearEstado(){
        ParaEntregar paraEntregar = new ParaEntregar();
        return paraEntregar;
    }

    @Override
    public void paraEntregar(Remito remito){
        actualizarEstadosCortesVacunos(remito.getCortesVacunos());
        remito.setEstado(crearEstado());
    };
    
    public void actualizarEstadosCortesVacunos(CorteVacuno[] cortesVacunos){
        for (CorteVacuno cortesVacuno : cortesVacunos) {
            cortesVacuno.enPlanEntrega();
        }
    }
     
}
