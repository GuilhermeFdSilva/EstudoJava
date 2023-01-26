package exercicios.javafx.app.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        Button buttonA = new Button("A");
        Button buttonB = new Button("B");
        Button buttonC = new Button("C");
        buttonA.setOnAction(e -> System.out.println("A"));
        buttonB.setOnAction(e -> System.out.println("B"));
        buttonC.setOnAction(e -> System.exit(0));
        box.getChildren().add(buttonA);
        box.getChildren().add(buttonB);
        box.getChildren().add(buttonC);
        Scene cena = new Scene(box, 150, 100);
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
