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
public class Pendiente extends Estado {

    public Pendiente() {
    }

    
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
