package frigorico_patronstate;

/**
 *
 * @author Javier
 */
public abstract class Estado {
    private String ambito;
    private String nombre;
    
    public void paraEntregar(Remito remito){};

    public void enPlanDeEntrega(CorteVacuno corteVacuno) {};
    
    public Estado crearEstado(){return this;};
    
    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
