package dipae_5thtemp.askisi11;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMessage;

    @FXML
    protected void onFirstButtonClick() {
        lblMessage.setText("First button was pressed!");
    }
    @FXML
    protected void onSecondButtonClick() {
        lblMessage.setText("Second button was pressed!");
    }
}