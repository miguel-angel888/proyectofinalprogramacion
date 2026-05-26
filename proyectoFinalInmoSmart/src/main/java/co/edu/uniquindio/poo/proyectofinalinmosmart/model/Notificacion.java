package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

public class Notificacion {

    //Atributos
    private boolean estadoOferta;
    private double precioInmueble;
    private String medioEnvio;

    //Relaciones
    private Inmueble inmueble;
    private Oferta oferta;


    //Constructor

    public Notificacion() {
    }

    public Notificacion(boolean estadoOferta, double precioInmueble,
                        String medioEnvio, Inmueble inmueble, Oferta oferta) {
        this.estadoOferta = estadoOferta;
        this.precioInmueble = precioInmueble;
        this.medioEnvio = medioEnvio;
        this.inmueble = inmueble;
        this.oferta = oferta;
    }

    //getters y setters

    public boolean isEstadoOferta() {
        return estadoOferta;
    }

    public void setEstadoOferta(boolean estadoOferta) {
        this.estadoOferta = estadoOferta;
    }

    public double getPrecioInmueble() {
        return precioInmueble;
    }

    public void setPrecioInmueble(double precioInmueble) {
        this.precioInmueble = precioInmueble;
    }

    public String getMedioEnvio() {
        return medioEnvio;
    }

    public void setMedioEnvio(String medioEnvio) {
        this.medioEnvio = medioEnvio;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
}
