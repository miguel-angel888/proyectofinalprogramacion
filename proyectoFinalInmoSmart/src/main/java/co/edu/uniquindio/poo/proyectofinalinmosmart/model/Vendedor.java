package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;

public class Vendedor extends Usuario{

    //Atributos

    //Relaciones
    private ArrayList<Inmueble> listaInmuebles;

    //Constructor
    public Vendedor(String id, String nombre, String telefono, String correo, int puntosReputacion,
                    ArrayList<Transaccion> listaTransacciones, ArrayList<Inmueble> listaInmuebles) {
        super(id, nombre, telefono, correo, puntosReputacion, listaTransacciones);
        this.listaInmuebles = listaInmuebles;
    }

    //Getters y Setters

    public ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public void setListaInmuebles(ArrayList<Inmueble> listaInmuebles) {
        this.listaInmuebles = listaInmuebles;
    }
}
