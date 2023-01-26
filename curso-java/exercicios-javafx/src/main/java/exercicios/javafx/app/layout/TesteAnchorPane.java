package exercicios.javafx.app.layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class TesteAnchorPane extends AnchorPane {
    public TesteAnchorPane(){
        Quadrado q1 = new Quadrado();
        setLeftAnchor(q1, 10.0);
        setTopAnchor(q1, 10.0);
        Quadrado q2 = new Quadrado();
        setRightAnchor(q2, 10.0);
        setTopAnchor(q2, 10.0);
        Quadrado q3 = new Quadrado();
        setBottomAnchor(q3, 10.0);
        setLeftAnchor(q3, 10.0);
        Quadrado q4 = new Quadrado();
        setRightAnchor(q4, 10.0);
        setBottomAnchor(q4, 10.0);
        VBox vBox = new VBox();
        setLeftAnchor(vBox, 110.0);
        setRightAnchor(vBox, 110.0);
        setTopAnchor(vBox, 110.0);
        setBottomAnchor(vBox, 110.0);
        vBox.setAlignment(Pos.CENTER);
        Quadrado q5 = new Quadrado();
        vBox.getChildren().add(q5);
        getChildren().addAll(q1, q2, q3, q4, vBox);
    }
}
