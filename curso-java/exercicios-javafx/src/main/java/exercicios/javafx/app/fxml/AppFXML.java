package exercicios.javafx.app.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        String arquivoCss = getClass().getResource("Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("Login.fxml");
        GridPane raiz =  FXMLLoader.load(arquivoFXML);
        Scene cena = new Scene(raiz, 350, 350);
        cena.getStylesheets().add(arquivoCss);
        stage.setResizable(false);
        stage.setTitle("Tela de Login");
        stage.setScene(cena);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
