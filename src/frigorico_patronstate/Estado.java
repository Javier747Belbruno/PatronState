/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frigorico_patronstate;

/**
 *
 * @author Javier
 */
public class Estado {
    private String ambito;
    private String nombre;
    
    public void paraEntregar(Remito remito){};

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

    public void enPlanDeEntrega(CorteVacuno corteVacuno) {};


    
}
