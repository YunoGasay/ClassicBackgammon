import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Interface gameInterface = loader.getController();
        gameInterface.go();
        stage.setTitle("Classic Backgammon");
        stage.setResizable(false);
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
