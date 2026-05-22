package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.lang.reflect.Array;

public abstract class Usuario implements IOperacionInmobiliaria{

    //Atributos
    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private int puntosReputacion;
    private ClasificacionUsuario clasificacionUsuario;

    //Relaciones
    private ArrayList<Transaccion> listaTransacciones;

    //Constructor

    public Usuario(String id, String nombre, String telefono,
                   String correo, int puntosReputacion,
                   ArrayList<Transaccion> listaTransacciones,ClasificacionUsuario clasificacionUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.puntosReputacion = puntosReputacion;
        this.listaTransacciones = listaTransacciones;
        this.clasificacionUsuario = clasificacionUsuario;
    }

    //Getters y Setters


    public ClasificacionUsuario getClasificacionUsuario() {
        return clasificacionUsuario;
    }

    public void setClasificacionUsuario(ClasificacionUsuario clasificacionUsuario) {
        this.clasificacionUsuario = clasificacionUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPuntosReputacion() {
        return puntosReputacion;
    }

    public void setPuntosReputacion(int puntosReputacion) {
        this.puntosReputacion = puntosReputacion;
    }

    public ArrayList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }
}
