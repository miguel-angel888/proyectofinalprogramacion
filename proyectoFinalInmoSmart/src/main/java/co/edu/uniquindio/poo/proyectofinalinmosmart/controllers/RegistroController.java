package co.edu.uniquindio.poo.proyectofinalinmosmart.controllers;

import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Comprador;
import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Usuario;
import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Vendedor;
import javafx.event.ActionEvent;
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

import java.io.IOException;


import static co.edu.uniquindio.poo.proyectofinalinmosmart.HelloApplication.empresa;

public class RegistroController {

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtDocumento;
    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    private Button btnGuardar;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtTelefono;
    @FXML
    private Label lblInicioFallido;





    @FXML
    void initialize() {
        System.out.println("Entró al initialize");
        cmbRol.getItems().addAll("Vendedor","Comprador");
    }

    @FXML
    void btnGuardarOnAction(ActionEvent event) {

        String nombre = txtNombre.getText();
        String documento = txtDocumento.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String rol = cmbRol.getValue();



        if(!rol.equals("Vendedor") && !rol.equals("Comprador")){
            lblInicioFallido.setText("Registro Fallido");
        }
        else if(rol.equals("Vendedor")){
            Usuario nuevoVendedor = new Vendedor(documento,nombre,telefono,correo);
            lblInicioFallido.setText("Registro Exitoso Vendedor");
            empresa.getListaUsuarios().add(nuevoVendedor);
        }
        else if(rol.equals("Comprador")){
            Usuario nuevoVendedor = new Comprador();
            lblInicioFallido.setText("Registro Exitoso Comprador");
            empresa.getListaUsuarios().add(nuevoVendedor);
        }
        txtNombre.setText("");
         txtDocumento.setText("");
         txtCorreo.setText("");
         txtTelefono.setText("");
         cmbRol.setValue(null);

    }
    @FXML
    private void btnRegresoOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/proyectofinalinmosmart/inicio.fxml"));

        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
