package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.time.LocalDate;

public class Transaccion {

    //Atributos
    private String codigo;
    private double valorFinal;
    private LocalDate fecha;

    //Relaciones
    private Inmueble inmueble;
    private Oferta oferta;
    private Usuario usuario;

    //Constructor


    public Transaccion(String codigo, double valorFinal,
                       LocalDate fecha, Inmueble inmueble, Oferta oferta, Usuario usuario) {
        this.codigo = codigo;
        this.valorFinal = valorFinal;
        this.fecha = fecha;
        this.inmueble = inmueble;
        this.oferta = oferta;
        this.usuario = usuario;
    }

    //Getters y settters

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
