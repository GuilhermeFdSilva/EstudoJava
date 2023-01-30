package exercicios.javafx.app.layout;

import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TesteTilePane extends TilePane {
    public TesteTilePane() {
        List<Quadrado> quadrados = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            quadrados.add(new Quadrado(i * 10));
        }
        getChildren().addAll(quadrados);
    }
}
