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

public class ReporteController {

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnBusqueda;

    @FXML
    private Label lblNombreUsuario;

    @FXML
    private TableColumn<Integer, Integer> colViviendas;

    @FXML
    private TableColumn<String, String> colNombre;

    @FXML
    private TableColumn<String, String> colID;

    @FXML
    private TableView<Usuario> tblPublicaciones;

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

    @FXML
    void btnRegresarOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/inicio.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    void btnBusquedaOnAction(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/busquedaPropiedades.fxml"));

        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
    }

    @FXML
    void initialize() {
        lblNombreUsuario.setText("Bienvenido "+ InicioController.Sesion.nombre);
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colViviendas.setCellValueFactory(new PropertyValueFactory<>("nInmuebles"));
        actualizaTabla();

    }

    private void actualizaTabla(){
        tblPublicaciones.getItems().clear();

                tblPublicaciones.getItems().addAll(empresa.listaUsuariosMayorInmueble());



    }
}
