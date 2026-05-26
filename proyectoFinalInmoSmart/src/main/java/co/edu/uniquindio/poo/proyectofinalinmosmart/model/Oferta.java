package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import javax.management.Notification;
import java.time.LocalDate;

public class Oferta {

    //Atributos
    private String codigoOferta;
    private double valorOferta;
    private LocalDate fechaOferta;
    private EstadoOferta estadoOferta;

    //Relaciones
    private Transaccion transaccion;
    private Inmueble inmueble;
    private Notificacion notificacion;


    //Constructor

    public Oferta() {
    }

    public Oferta(String codigoOferta, double valorOferta, LocalDate fechaOferta,
                  EstadoOferta estadoOferta, Transaccion transaccion, Inmueble inmueble,
                  Notificacion notificacion) {
        this.codigoOferta = codigoOferta;
        this.valorOferta = valorOferta;
        this.fechaOferta = fechaOferta;
        this.estadoOferta = estadoOferta;
        this.transaccion = transaccion;
        this.inmueble = inmueble;
        this.notificacion = notificacion;
    }
    //Getters y Setters

    public String getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(String codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public double getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(double valorOferta) {
        this.valorOferta = valorOferta;
    }

    public LocalDate getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(LocalDate fechaOferta) {
        this.fechaOferta = fechaOferta;
    }

    public EstadoOferta getEstadoOferta() {
        return estadoOferta;
    }

    public void setEstadoOferta(EstadoOferta estadoOferta) {
        this.estadoOferta = estadoOferta;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
}
