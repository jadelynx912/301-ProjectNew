import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class adminMainPageController {

    @FXML
    private MenuButton adminActionSelect;

    @FXML
    private AnchorPane adminMainPane;

    @FXML
    private Label adminMainTitle;

    @FXML
    private MenuItem createScholarship;

    @FXML
    private MenuItem manageAccounts;

    @FXML
    private MenuItem notifyApplicants;

    @FXML
    void openCreateScholarship(ActionEvent event) {
        Stage primaryStage = (Stage)(((MenuItem) event.getTarget()).getParentPopup().getScene().getWindow());
        Parent root;
        try {
            root = FXMLLoader.load(MainApp.class.getResource("CreateScholarship.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("Login Error");
        }
    }

    @FXML
    void openManageAccounts(ActionEvent event) {
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root;
        try {
            root = FXMLLoader.load(MainApp.class.getResource("AdminLogin.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("Login Error");
        }
    }

    @FXML
    void openNotifyApplicants(ActionEvent event) {
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root;
        try {
            root = FXMLLoader.load(MainApp.class.getResource("AdminLogin.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            System.out.println("Login Error");
        }
    }

}
