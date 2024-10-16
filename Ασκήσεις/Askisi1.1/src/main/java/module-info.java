module askisi11.askisi11 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens askisi11.askisi11 to javafx.fxml;
    exports askisi11.askisi11;
}