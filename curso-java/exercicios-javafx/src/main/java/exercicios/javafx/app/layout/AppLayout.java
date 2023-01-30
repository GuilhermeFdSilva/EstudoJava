package exercicios.javafx.app.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent raiz;
//        raiz = new TesteAnchorPane();
//        raiz = new TesteBorderPane();
//        raiz = new TesteFlowPane();
//        raiz = new TesteGridPane();
//        raiz = new TesteStackPnane();
        raiz = new TesteTilePane();
        Scene scene =new Scene(raiz, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Gerenciadores de Layout");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
