/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frigorico_patronstate;

import java.util.Date;

/**
 *
 * @author Javier
 */
public class Remito {
    private Date fecha;
    private Date fechaEntrega;
    private Integer numero;
    private Estado estado;
    private CorteVacuno[] cortesVacunos;
    
    public void actualizarEstadoCortesVacunos(){
        
    }
    
    public void paraEntregar(){
        estado.paraEntregar(this);
    }

    public Remito( Integer numero, CorteVacuno[] cortesVacunos , Date fecha, Date fechaEntrega) {
        this.fecha = fecha;
        this.fechaEntrega = fechaEntrega;
        this.numero = numero;
        this.cortesVacunos = cortesVacunos;
        this.estado = new Pendiente();////////////////////////////////
    }

    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public CorteVacuno[] getCortesVacunos() {
        return cortesVacunos;
    }

    public void setCortesVacunos(CorteVacuno[] cortesVacunos) {
        this.cortesVacunos = cortesVacunos;
    }
    
    
    
}
