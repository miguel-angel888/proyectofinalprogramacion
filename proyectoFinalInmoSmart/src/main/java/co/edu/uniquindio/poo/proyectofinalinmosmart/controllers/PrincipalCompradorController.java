package co.edu.uniquindio.poo.proyectofinalinmosmart.controllers;

import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Comprador;
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

import static co.edu.uniquindio.poo.proyectofinalinmosmart.HelloApplication.empresa;

public class PrincipalCompradorController {

    @FXML
    private Label lblNombreUsuario;

    @FXML
    void initialize() {
        lblNombreUsuario.setText("Bienvenido "+ InicioController.Sesion.nombre);

        lblNombreUsuario.setText("Bienvenido "+ InicioController.Sesion.nombre);
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colArea.setCellValueFactory(new PropertyValueFactory<>("areaMetros"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
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
    private TextField txtCodigo;
    @FXML
    private TextField txtPrecio;

    @FXML
    private TableColumn<String, String> colCodigo;

    @FXML
    private TableColumn<String,String> colCiudad;

    @FXML
    private TableColumn<String, String> colPrecio;
    @FXML
    private TableColumn<String,String> colArea;
    @FXML
    private TableView<Inmueble> tblPublicaciones;

    private void actualizaTabla(){
        tblPublicaciones.getItems().clear();
        for(Usuario vendedor: empresa.getListaUsuarios()){
            if(vendedor instanceof Vendedor){
                for(Inmueble inmueble: ((Vendedor) vendedor).getListaInmuebles()){
                    if(inmueble.getCodigo().equals(txtCodigo.getText()) || inmueble.getPrecio().equals(txtPrecio.getText())){
                        tblPublicaciones.getItems().add(inmueble);
                    }

                }

            }
        }
    }
    @FXML
    void btnBuscarOnAction(ActionEvent event) throws IOException {
        actualizaTabla();
    }

    @FXML
    private Button btnRegresar;
    @FXML
    void btnRegresarOnAction(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/inicio.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    private void actualizarTabla(){
        Usuario usu = empresa.encontrarUsuario(InicioController.Sesion.id);


        tblPublicaciones.getItems().clear();
        tblPublicaciones.getItems().addAll(((Vendedor) usu).getListaInmuebles());
        tblPublicaciones.refresh();
        txtCodigo.setText("");
        txtPrecio.setText("");
    }
    @FXML
    private Button btnComprar;
    @FXML
    private Label lblCompra;

    @FXML
    void btnComprarOnAction(ActionEvent event) throws IOException {
        lblCompra.setText("Felicitaciones ");
            tblPublicaciones.getItems().clear();


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





