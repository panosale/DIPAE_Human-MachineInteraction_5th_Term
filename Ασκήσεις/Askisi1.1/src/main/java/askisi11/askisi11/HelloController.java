package askisi11.askisi11;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
    @FXML
    protected void onFirstButtonClick() {
        welcomeText.setText("First button pressed.");
    }
    @FXML
    protected void onSecondButtonClick() {
        welcomeText.setText("Second button pressed.");
    }
}