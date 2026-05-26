package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;

public class Comprador extends Usuario{

    //Atributos

    //Relaciones
    private ArrayList<Oferta> listaOfertas;

    //Constructor


    public Comprador(String id, String nombre, String telefono, String correo) {
        super(id, nombre, telefono, correo);
    }

    public Comprador(String id, String nombre, String telefono, String correo, int puntosReputacion, ArrayList<Transaccion> listaTransacciones, ClasificacionUsuario clasificacionUsuario) {
        super(id, nombre, telefono, correo, puntosReputacion, listaTransacciones, clasificacionUsuario);
    }

    public Comprador(String id, String nombre, String telefono, String correo, int puntosReputacion,
                     ArrayList<Transaccion> listaTransacciones, ClasificacionUsuario clasificacionUsuario, ArrayList<Oferta> listaOfertas) {
        super(id, nombre, telefono, correo, puntosReputacion, listaTransacciones,
                clasificacionUsuario);
        this.listaOfertas = listaOfertas;
    }

   //Getters y Setters

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }

    public void setListaOfertas(ArrayList<Oferta> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }

    //Buscar Y comprar publicacion
}
