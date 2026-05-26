package co.edu.uniquindio.poo.proyectofinalinmosmart;

import co.edu.uniquindio.poo.proyectofinalinmosmart.model.Empresa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static co.edu.uniquindio.poo.proyectofinalinmosmart.utils.Paths.INICIO_VIEW;



public class HelloApplication extends Application {

    public static Empresa empresa = new Empresa();


    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(INICIO_VIEW));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
