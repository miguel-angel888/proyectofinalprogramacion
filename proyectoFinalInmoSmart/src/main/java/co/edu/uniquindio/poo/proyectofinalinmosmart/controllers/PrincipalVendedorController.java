package co.edu.uniquindio.poo.proyectofinalinmosmart.controllers;

import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Inmueble;
import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Usuario;
import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static co.edu.uniquindio.poo.proyectofinalinmosmart.HelloApplication.empresa;
import static co.edu.uniquindio.poo.proyectofinalinmosmart.utils.Paths.INICIO_VIEW;


public class PrincipalVendedorController {

    @FXML
    private Label lblNombreUsuario;
    @FXML
    private TableColumn<String, String> colCodigo;

    @FXML
    private TableColumn<String,String> colCiudad;

    @FXML
    private TableColumn<String, String> colPrecio;

    @FXML
    private Button btnPublicar;
    @FXML
    private TableColumn<String,String> colArea;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtArea;
    @FXML
    private Button btnRegresar;

    @FXML
    private TableView<Inmueble> tblPublicaciones;

    @FXML
    void initialize(){


        lblNombreUsuario.setText("Bienvenido "+ InicioController.Sesion.nombre);

        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colArea.setCellValueFactory(new PropertyValueFactory<>("areaMetros"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));


    }
    @FXML
    void btnRegresarOnAction(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/inicio.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void btnPublicarOnAction(ActionEvent event) {
        ArrayList<Usuario> listaUsuariosLocal = empresa.getListaUsuarios();
        boolean resultado = false;
        for(Usuario usuario : listaUsuariosLocal){
            if(usuario instanceof Vendedor && usuario.getId().equals(InicioController.Sesion.id)){
                resultado = ((Vendedor) usuario).publicarInmueble(txtCodigo.getText(), txtCiudad.getText(), txtPrecio.getText(), txtArea.getText());
            }
        }
        if(resultado){
            actualizarTabla();


        }

    }

    private void actualizarTabla(){
       Usuario usu = empresa.encontrarUsuario(InicioController.Sesion.id);
       if(usu != null && usu instanceof Vendedor){

           tblPublicaciones.getItems().clear();
           tblPublicaciones.getItems().addAll(((Vendedor) usu).getListaInmuebles());
           tblPublicaciones.refresh();
           txtCodigo.setText("");
           txtCiudad.setText("");
           txtArea.setText("");
           txtPrecio.setText("");
       }


    }

    @FXML
    private Button btnEliminarPublicacion;

    @FXML
    void btnEliminarOnAction(ActionEvent event) throws IOException {
        Usuario usu = empresa.encontrarUsuario(InicioController.Sesion.id);
        if(usu != null && usu instanceof Vendedor){

           Inmueble inmueble =  tblPublicaciones.getSelectionModel().getSelectedItem();
           ((Vendedor) usu).eliminarPublicacion(inmueble);

           actualizarTabla();
        }
    }

    @FXML
    private Button btnBusqueda;

    @FXML
    public void btnBusquedaOnAction(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/busquedaPropiedades.fxml"));

        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
    }

    @FXML
    private Button btnReporte;
    @FXML
    void btnReporteOnAction(ActionEvent event) throws IOException {
        System.out.println("Entró al botón reporte");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/reporte.fxml"));

        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
    }
}
