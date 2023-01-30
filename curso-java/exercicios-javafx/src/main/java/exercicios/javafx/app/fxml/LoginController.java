package exercicios.javafx.app.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {
    @FXML
    private TextField campoEmail;
    @FXML
    private PasswordField campoSenha;
    public void entrar(){
        boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
        boolean senhaValida = campoSenha.getText().equals("12345678");
        if(emailValido && senhaValida){
            Notifications.create().position(Pos.TOP_CENTER).title("Login FXML").text("Login efetuado com sucesso!").showInformation();
        }else{
            Notifications.create().position(Pos.TOP_CENTER).title("Login FXML").text("Usuário e senha inválidos...").showError();
        }
    }
}
