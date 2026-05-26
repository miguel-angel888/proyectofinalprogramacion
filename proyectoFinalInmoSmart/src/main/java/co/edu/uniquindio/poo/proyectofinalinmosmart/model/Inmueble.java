package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;

public class Inmueble {


    //Atributos
    private String codigo;
    private String direccion;
    private String ciudad;
    private String areaMetros;
    private String precio;
    private EstadoInmueble estadoInmueble;
    private String tipoInmueble;
    private TipoOperacion tipoOperacion;

    //Relaciones
    private Transaccion transaccion;
    private Vendedor vendedor;
    private ArrayList<Oferta> listaOfertas;
    private Publicacion publicacion;
    private Notificacion notificacion;

    //Constructor

    public Inmueble(String codigo, String ciudad, String areaMetros, String precio) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.areaMetros = areaMetros;
        this.precio = precio;
    }

    public Inmueble() {
    }

    public Inmueble(String codigo, String direccion, String ciudad, String areaMetros, String precio, EstadoInmueble estadoInmueble, String tipoInmueble, TipoOperacion tipoOperacion, Transaccion transaccion, Vendedor vendedor,
                    ArrayList<Oferta> listaOfertas,
                    Publicacion publicacion, Notificacion notificacion) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.areaMetros = areaMetros;
        this.precio = precio;
        this.estadoInmueble = estadoInmueble;
        this.tipoInmueble = tipoInmueble;
        this.tipoOperacion = tipoOperacion;
        this.transaccion = transaccion;
        this.vendedor = vendedor;
        this.listaOfertas = listaOfertas;
        this.publicacion = publicacion;
        this.notificacion = notificacion;
    }
    //Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAreaMetros() {
        return areaMetros;
    }

    public void setAreaMetros(String areaMetros) {
        this.areaMetros = areaMetros;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public EstadoInmueble getEstadoInmueble() {
        return estadoInmueble;
    }

    public void setEstadoInmueble(EstadoInmueble estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }

    public void setListaOfertas(ArrayList<Oferta> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }

    public Publicacion getpublicacion() {
        return publicacion;
    }

    public void setpublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
}