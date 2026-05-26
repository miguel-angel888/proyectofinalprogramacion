/**
 * Clase para probar el funcionamiento del código
 * @author Miguel ANgel Medina COrrea
 * @since 2026-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */


import java.util.ArrayList;
import java.util.logging.Logger;


import co.edu.uniquindio.poo.proyectofinalinmosmart.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la aplicación
 */
public class OperacionesInmuebleTest {
    private static final Logger LOG = Logger.getLogger(OperacionesInmuebleTest.class.getName());

    /*
     *  Verifica el correcto funcionamiento del registro de empleados
     * */
    @Test
    public void registrarEmpleado() {

        LOG.info("Iniciando el registro de empleados");

        ArrayList<Usuario> listaUsuariosVerdadera = new ArrayList<>();
        Usuario vendedor = new Vendedor("1", "Juan", "123", "correo");
        Usuario comprador = new Comprador("2", "Pedro", "456", "correo2");
        Empresa empresa = new Empresa();
        listaUsuariosVerdadera.add(comprador);
        listaUsuariosVerdadera.add(vendedor);


        empresa.registrarUsuario(comprador);
        empresa.registrarUsuario(vendedor);


        assertIterableEquals(listaUsuariosVerdadera, empresa.getListaUsuarios());
        LOG.info("Finalizando el registro de empleados. los empleados son: "+listaUsuariosVerdadera);
    }

    @Test
    public void registrarInmuebleTest() {

        LOG.info("Iniciando el registro de inmuebles");

        Vendedor vendedor = new Vendedor("1", "Juan", "123", "correo");
        vendedor.getListaInmuebles().clear();
        boolean resultado = vendedor.publicarInmueble("123", "Armenia", "25", "25000");

        assertTrue(resultado);
        assertEquals(1, vendedor.getListaInmuebles().size());

        Inmueble inmueble = vendedor.getListaInmuebles().get(0);

        assertEquals("123", inmueble.getCodigo());
        assertEquals("Armenia", inmueble.getCiudad());
        assertEquals("25", inmueble.getAreaMetros());
        assertEquals("25000", inmueble.getPrecio());

        LOG.info("Finalizando el registro de inmuebles");
    }
    @Test
    public void eliminarInmuebleTest() {

            LOG.info("Iniciando prueba de eliminación de inmueble");

            Vendedor vendedor = new Vendedor("1", "Juan", "123", "correo");
            vendedor.getListaInmuebles().clear();
            Inmueble inmueble = new Inmueble("123", "Armenia", "25", "25000");
            vendedor.getListaInmuebles().add(inmueble);

            assertEquals(1, vendedor.getListaInmuebles().size());

            vendedor.eliminarPublicacion(inmueble);

            assertEquals(0, vendedor.getListaInmuebles().size());

            LOG.info("Finalizando prueba de eliminación de inmueble");
        }

}

