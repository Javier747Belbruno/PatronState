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
public class IncluidoEnRemito extends Estado{

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
