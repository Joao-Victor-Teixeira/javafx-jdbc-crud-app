module com.joaodev {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joaodev to javafx.fxml;
    exports com.joaodev;
}
