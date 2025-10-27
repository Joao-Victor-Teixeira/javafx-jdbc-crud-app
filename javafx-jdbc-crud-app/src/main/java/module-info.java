module com.joaodev { 

    
    requires javafx.controls; 
    requires javafx.fxml;    
    requires java.sql;       

    opens com.joaodev.gui to javafx.fxml;
    opens com.joaodev.model.entities to javafx.base;
    opens com.joaodev to javafx.graphics, javafx.fxml; 

}
