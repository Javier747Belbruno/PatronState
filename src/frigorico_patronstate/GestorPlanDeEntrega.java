package frigorico_patronstate;

/**
 *
 * @author Javier
 */
public class GestorPlanDeEntrega {
    
    private Remito[] remitos;

    public GestorPlanDeEntrega() {
    }

    public Remito[] getRemitos() {
        return remitos;
    }

    public void setRemitos(Remito[] remitos) {
        this.remitos = remitos;
    }
    
    public void actualizarEstadoRemitos(){
        for (Remito remito : remitos) {
            remito.paraEntregar();
        }
    }
    
}
