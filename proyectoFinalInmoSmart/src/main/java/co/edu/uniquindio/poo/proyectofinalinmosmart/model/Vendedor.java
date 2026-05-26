package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;

public class Vendedor extends Usuario{

    //Atributos

    //Relaciones
    private ArrayList<Inmueble> listaInmuebles;

    //Constructor

    public Vendedor(String id, String nombre, String telefono, String correo) {
        super(id, nombre, telefono, correo);
        this.listaInmuebles = new ArrayList<>();
        añadirInmuebleBase();
    }

    public Vendedor() {
    }

    public Vendedor(String id, String nombre, String telefono, String correo, int puntosReputacion,
                    ArrayList<Transaccion> listaTransacciones, ClasificacionUsuario clasificacionUsuario, ArrayList<Inmueble> listaInmuebles) {
        super(id, nombre, telefono, correo, puntosReputacion, listaTransacciones, clasificacionUsuario);
        this.listaInmuebles = listaInmuebles;
    }

    //Getters y Setters

    public ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public void setListaInmuebles(ArrayList<Inmueble> listaInmuebles) {
        this.listaInmuebles = listaInmuebles;
    }


    //Metodo para publicar inmuebles

    public boolean publicarInmueble(String codigo,String ciudad,String area,String precio){

        for(Inmueble inmueble : listaInmuebles){
            if(inmueble.getCodigo().equals(codigo)){
                return false;
            }
        }
        listaInmuebles.add(new Inmueble( codigo, ciudad, area, precio));
        return true;
    }

    //metodo para añadir un inmueble base{
    public void añadirInmuebleBase( ) {
        listaInmuebles.add(new Inmueble("", "", "", ""));
    }

    //metodo para eliminar una pubnlicacion
    public void eliminarPublicacion(Inmueble inmueble) {
        listaInmuebles.remove(inmueble);
    }



}
