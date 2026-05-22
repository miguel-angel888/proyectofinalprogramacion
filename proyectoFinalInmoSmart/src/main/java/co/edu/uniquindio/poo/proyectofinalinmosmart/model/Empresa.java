package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;

public class Empresa {

    //Atributos
    private String nombre;


    //Relaciones
    private ArrayList<Transaccion> listaTransacciones;
    private ArrayList<Usuario> listaUsuarios;

    //Constructor
    public Empresa(String nombre,ArrayList<Transaccion> listaTransacciones,ArrayList<Usuario> listaUsuarios){
        this.nombre=nombre;
        this.listaTransacciones=listaTransacciones;
        this.listaUsuarios=listaUsuarios;
    }
   //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
