module loginform.loginform {
    requires javafx.controls;
    requires javafx.fxml;


    opens loginform.loginform to javafx.fxml;
    exports loginform.loginform;
}