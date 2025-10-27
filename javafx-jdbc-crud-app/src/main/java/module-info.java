module com.joaodev {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joaodev.gui to javafx.fxml;
    exports com.joaodev;
}
