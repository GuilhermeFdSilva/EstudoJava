package exercicios.javafx.app.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
    private int numero = 0;
    private void atualizarLabelNumero(Label label){
        label.setText(Integer.toString(numero));
        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");
        if(numero > 0){
            label.getStyleClass().add("verde");
        }else if(numero < 0){
            label.getStyleClass().add("vermelho");
        }
    }
    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador");
        labelTitulo.getStyleClass().add("titulo");
        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");
        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");
        botaoIncremento.setOnAction(e -> {
            numero++;
            atualizarLabelNumero(labelNumero);
        });
        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");
        botaoDecremento.setOnAction(e -> {
            numero--;
            atualizarLabelNumero(labelNumero);
        });
        HBox boxBotoes = new HBox(botaoDecremento, botaoIncremento);
        boxBotoes.setSpacing(10);
        boxBotoes.setAlignment(Pos.CENTER);
        VBox boxPrincipal = new VBox(labelTitulo, labelNumero, boxBotoes);
        boxPrincipal.setSpacing(10);
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.getStyleClass().add("conteudo");
        String caminhoDoCss = getClass().getResource("Contador.css").toExternalForm();
        Scene cena = new Scene(boxPrincipal, 400, 400);
        cena.getStylesheets().add(caminhoDoCss);
        cena.getStylesheets().add("https://fonts.googleapis.com/css2?family=Roboto+Mono");
        stage.setScene(cena);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
