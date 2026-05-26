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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

import static co.edu.uniquindio.poo.proyectofinalinmosmart.HelloApplication.empresa;

public class BusquedaPropiedadesController {

    @FXML
    private Label lblNombreUsuario;
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

    @FXML
    private Button btnRegresar;

    @FXML
    void initialize() {
        lblNombreUsuario.setText("Bienvenido "+ InicioController.Sesion.nombre);
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colArea.setCellValueFactory(new PropertyValueFactory<>("areaMetros"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        actualizaTabla();

    }

    private void actualizaTabla(){
        tblPublicaciones.getItems().clear();
        for(Usuario vendedor: empresa.getListaUsuarios()){
            if(vendedor instanceof Vendedor){

                tblPublicaciones.getItems().addAll(((Vendedor) vendedor).getListaInmuebles());

            }
        }
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
    private Button btnHome;

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        if(InicioController.Sesion.rol.equals("Vendedor")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/principalVendedor.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/principalComprador.fxml"));

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}
