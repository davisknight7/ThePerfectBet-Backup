module edu.bsu.cs222.perfectbet {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.path;
    requires json.smart;


    opens edu.bsu.cs222.perfectbet to javafx.fxml;
    exports edu.bsu.cs222.perfectbet;
    exports edu.bsu.cs222.perfectbet.Model;
    opens edu.bsu.cs222.perfectbet.Model to javafx.fxml;
    exports edu.bsu.cs222.perfectbet.Controller;
    opens edu.bsu.cs222.perfectbet.Controller to javafx.fxml;
    exports edu.bsu.cs222.perfectbet.View;
    opens edu.bsu.cs222.perfectbet.View to javafx.fxml;
}