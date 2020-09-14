package frigorico_patronstate;

import java.util.Date;

/**
 *
 * @author Javier
 */
public class CorteVacuno {
    private Integer nroSecuencia;
    private Float peso;
    private Integer precioCorteVacuno;
    private Estado estado;
    private Date fechaComercializacion;
    private Date fechaEnvasado;
    private Date fechaVencimiento;
    
    public void enPlanEntrega() {
        estado.enPlanDeEntrega(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public CorteVacuno( Integer nroSecuencia, Float peso, Integer precioCorteVacuno , Date fechaComercializacion, Date fechaEnvasado, Date fechaVencimiento) {
        this.fechaComercializacion = fechaComercializacion;
        this.fechaEnvasado = fechaEnvasado;
        this.fechaVencimiento = fechaVencimiento;
        this.nroSecuencia = nroSecuencia;
        this.peso = peso;
        this.precioCorteVacuno = precioCorteVacuno;
        this.estado = new IncluidoEnRemito();
    }
    
    public Date getFechaComercializacion() {
        return fechaComercializacion;
    }

    public void setFechaComercializacion(Date fechaComercializacion) {
        this.fechaComercializacion = fechaComercializacion;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getNroSecuencia() {
        return nroSecuencia;
    }

    public void setNroSecuencia(Integer nroSecuencia) {
        this.nroSecuencia = nroSecuencia;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getPrecioCorteVacuno() {
        return precioCorteVacuno;
    }

    public void setPrecioCorteVacuno(Integer precioCorteVacuno) {
        this.precioCorteVacuno = precioCorteVacuno;
    }

    @Override
    public String toString() {
        return "CorteVacuno{" + "fechaComercializacion=" + fechaComercializacion + ", fechaEnvasado=" + fechaEnvasado + ", fechaVencimiento=" + fechaVencimiento + ", nroSecuencia=" + nroSecuencia + ", peso=" + peso + ", precioCorteVacuno=" + precioCorteVacuno + '}';
    }
}
