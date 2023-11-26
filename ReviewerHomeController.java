import java.io.BufferedReader;
import java.io.FileReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReviewerHomeController {

    @FXML
    private Label Desc1;

    @FXML
    private Label Desc2;

    @FXML
    private Label Desc3;

    @FXML
    private Label Desc4;

    @FXML
    private Label Desc5;

    @FXML
    private Label Name1;

    @FXML
    private Label Name2;

    @FXML
    private Label Name3;

    @FXML
    private Label Name4;

    @FXML
    private Label Name5;

    @FXML
    private Button apply1;

    @FXML
    private Button apply2;

    @FXML
    private Button apply3;

    @FXML
    private Button apply4;

    @FXML
    private Button apply5;

    @FXML
    private Button backButton;

    @FXML
    private Button checkStatus;

    @FXML
    private Button editAccount;

    @FXML
    private Button nextPage;

    @FXML
    private Button prevPage;

    @FXML
    private TextField searchBar;

    private int numDisplayOn = 0;
    private String filename = "src/Data/scholarships.csv";
    private int readIndex = 1;

    @FXML
    private void initialize(){
        String line;
        String[] lineParts;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            if (numDisplayOn < 0) { numDisplayOn += 5; }
            while((line = reader.readLine()) != null){
                lineParts = line.split("/");
                if (count == 0 + numDisplayOn){
                    Name1.setText(lineParts[0]);
                    Desc1.setText(lineParts[readIndex]);
                }
                else if (count == 1 + numDisplayOn){
                    Name2.setText(lineParts[0]);
                    Desc2.setText(lineParts[readIndex]);
                }
                else if (count == 2 + numDisplayOn){
                    Name3.setText(lineParts[0]);
                    Desc3.setText(lineParts[readIndex]);
                }
                else if (count == 3 + numDisplayOn){
                    Name4.setText(lineParts[0]);
                    Desc4.setText(lineParts[readIndex]);
                }
                else if (count == 4 + numDisplayOn){
                    Name5.setText(lineParts[0]);
                    Desc5.setText(lineParts[readIndex]);
                }
                count += 1;
            }
            if (count < numDisplayOn){
                numDisplayOn -= 5;
            }
            while (count < 5 + numDisplayOn){
                if (count == 0 + numDisplayOn){
                    Name1.setText("");
                    Desc1.setText("");
                }
                else if (count == 1 + numDisplayOn){
                    Name2.setText("");
                    Desc2.setText("");
                }
                else if (count == 2 + numDisplayOn){
                    Name3.setText("");
                    Desc3.setText("");
                }
                else if (count == 3 + numDisplayOn){
                    Name4.setText("");
                    Desc4.setText("");
                }
                else if (count == 4 + numDisplayOn){
                    Name5.setText("");
                    Desc5.setText("");
                }
                count += 1;
            }
        } catch (Exception e) { 
            Name1.setText("");
            Desc1.setText("");
            Name2.setText("");
            Desc2.setText("");
            Name3.setText("");
            Desc3.setText("");
            Name4.setText("");
            Desc4.setText("");
            Name5.setText("");
            Desc5.setText("");
        }
    }

    @FXML
    void displayNext5(ActionEvent event) {
        numDisplayOn += 5;
        initialize();
    }

    @FXML
    void displayPrev5(ActionEvent event) {
        numDisplayOn -= 5;
        initialize();
    }

    @FXML
    void apply(ActionEvent event) {

    }

    @FXML
    void searchScholarships(ActionEvent event) {

    }

}
