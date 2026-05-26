package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;

public class Empresa {

    //Atributos
    private String nombre;


    //Relaciones
    private ArrayList<Transaccion> listaTransacciones;
    private ArrayList<Usuario> listaUsuarios;

    //Constructor

    public Empresa(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Empresa() {
        this.listaUsuarios = new ArrayList<>();
        añadirUsuarioBase();
    }

    public Empresa(String nombre, ArrayList<Transaccion> listaTransacciones, ArrayList<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.listaTransacciones = listaTransacciones;
        this.listaUsuarios = listaUsuarios;
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

    //Metodo para registrar usuario

    public String registrarUsuario(Usuario usuario) {
        if (listaUsuarios.isEmpty()) {
            listaUsuarios.add(usuario);
            return "Usuario registrado";
        }
        for (Usuario u : listaUsuarios) {
            if (u.getId().equals(usuario.getId())) {
                return "Usuario ya existe";
            }

        }
        listaUsuarios.add(usuario);
        return "Usuario registrado";
    }

    //Metodo para buscar usuario
    public boolean buscarUsuario(String id) {
        if (listaUsuarios == null) {
            return false;

        }
        for (Usuario u : listaUsuarios) {
            if (u.getId().equals(id)) {

                return true;
            }
        }
        return false;
    }

    public Usuario encontrarUsuario(String id) {
        if (listaUsuarios == null) {
            return null;

        }
        for (Usuario u : listaUsuarios) {
            if (u.getId().equals(id)) {

                return u;
            }
        }
        return null;
    }
    //Metodo para añadir usuario base
    public void añadirUsuarioBase( ) {
        listaUsuarios.add(new Vendedor("000", "Base", "000", "Base@Gmail"));
    }


}
