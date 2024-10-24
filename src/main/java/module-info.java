module loginform.loginform {
    requires javafx.controls;
    requires javafx.fxml;


    opens loginform.loginform to javafx.fxml;
    opens sample to javafx.fxml;
    exports loginform.loginform;
    exports sample;
}