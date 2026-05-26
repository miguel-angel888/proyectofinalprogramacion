package co.edu.uniquindio.poo.proyectofinalinmosmart.controllers;


import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


import java.io.IOException;

import static co.edu.uniquindio.poo.proyectofinalinmosmart.HelloApplication.empresa;

public class InicioController {

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private TextField txtNombre;

    @FXML
    private Label lblInicioFallido;

    @FXML
    private TextField txtID;

    @FXML
    private Button btnRegistro;

    @FXML
    void initialize() {
        System.out.println("Entró al initialize");
        cmbRol.getItems().addAll("Vendedor","Comprador");


    }
    public class Sesion{
        public static String nombre;
        public static String id;
        public static String correo;
        public static String telefono;
        public static String rol;
    }
    @FXML
    void onClick(ActionEvent event) throws IOException {
        Sesion.nombre = txtNombre.getText();
        Sesion.id = txtID.getText();
        Sesion.correo = cmbRol.getValue();
        Sesion.telefono = cmbRol.getValue();
        Sesion.rol = cmbRol.getValue();


         if(txtNombre.getText().isBlank() ||
                txtID.getText().isBlank() ||
                !txtID.getText().matches("\\d+") || cmbRol.getValue() == null){
            lblInicioFallido.setText("Inicio fallido intente otra vez");
        }
        else if(cmbRol.getValue().equals("Comprador")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/principalComprador.fxml"));

            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/principalVendedor.fxml"));

            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(root));
        }
    }

    @FXML
    void btnRegistroOnAction(ActionEvent event) throws IOException {
        System.out.println(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/registro.fxml"));
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/registro.fxml")
        );

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }


}