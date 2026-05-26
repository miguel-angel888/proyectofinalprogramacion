package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.time.LocalDate;

public class Publicacion {

    //Atributos
    private String codigoPublicacion;
    private LocalDate fechaPublicacion;
    private String descripcionPublicacion;

    //Relaciones
    private Inmueble inmueble;

    //Constructor

    public Publicacion() {
    }

    public Publicacion(Inmueble inmueble, String descripcionPublicacion, LocalDate fechaPublicacion, String codigoPublicacion) {
        this.inmueble = inmueble;
        this.descripcionPublicacion = descripcionPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.codigoPublicacion = codigoPublicacion;
    }

    public String getCodigoPublicacion() {
        return codigoPublicacion;
    }

    public void setCodigoPublicacion(String codigoPublicacion) {
        this.codigoPublicacion = codigoPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcionPublicacion() {
        return descripcionPublicacion;
    }

    public void setDescripcionPublicacion(String descripcionPublicacion) {
        this.descripcionPublicacion = descripcionPublicacion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
}
