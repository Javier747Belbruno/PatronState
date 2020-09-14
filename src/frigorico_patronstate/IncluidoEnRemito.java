package frigorico_patronstate;

/**
 *
 * @author Javier
 */
public class IncluidoEnRemito extends Estado {
    
    @Override
    public Estado crearEstado() {
        EnPlanDeEntrega enPlanDeEntrega = new EnPlanDeEntrega();
        return enPlanDeEntrega;
    }

    @Override
    public void enPlanDeEntrega(CorteVacuno corteVacuno) {
        Estado estado = crearEstado();
        corteVacuno.setEstado(estado);
    }
    
}