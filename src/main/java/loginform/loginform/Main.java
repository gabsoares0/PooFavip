package loginform.loginform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("EN-Fitness");
        stage.setScene(scene);
        stage.show();
    }

    //Aqui é para trocar a pagina tem que configurar assim que terminar cena
  //  public void chageScene(String fxml) throws IOException {
    //    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml));
      //  stg.getScene().setRoot();
    //}

    public static void main(String[] args) {
        launch();
    }
}