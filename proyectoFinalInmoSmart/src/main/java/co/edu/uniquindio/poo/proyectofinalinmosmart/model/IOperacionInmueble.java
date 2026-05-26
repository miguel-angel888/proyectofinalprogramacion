package co.edu.uniquindio.poo.proyectofinalinmosmart.model;

import java.util.ArrayList;
import java.util.Optional;

public interface IOperacionInmueble {

     static String publicarInmueble(Usuario vendedor, Inmueble inmueble,
                                                   ArrayList<Publicacion> listaPublicaciones ){

           for(Publicacion publicacion : listaPublicaciones){
               if(publicacion.getInmueble().equals(inmueble)){
                   return "El inmueble ya esta publicado";
               }
           }
            return "Incompleto";

    }

}
