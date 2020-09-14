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
    
    };
}
