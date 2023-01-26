module exercicios.javafx.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens exercicios.javafx.app.basico to javafx.fxml;
    opens exercicios.javafx.app.layout to javafx.fxml;
    exports exercicios.javafx.app.basico;
    exports exercicios.javafx.app.layout;
}