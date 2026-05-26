module co.edu.uniquindio.poo.proyectofinalinmosmart {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.management;
    requires java.desktop;


    opens co.edu.uniquindio.poo.proyectofinalinmosmart to javafx.fxml;
    exports co.edu.uniquindio.poo.proyectofinalinmosmart;
    exports co.edu.uniquindio.poo.proyectofinalinmosmart.controllers;
    opens co.edu.uniquindio.poo.proyectofinalinmosmart.controllers to javafx.fxml;
    opens co.edu.uniquindio.poo.proyectofinalinmosmart.model to javafx.base;
}