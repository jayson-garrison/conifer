package environment;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class userInput {

    @FXML
    private Button create;

    @FXML
    private TextField fileName;

    @FXML
    private ListView<String> listView;

    @FXML
    private Button select;

    @FXML
    void browseFiles(ActionEvent event) {
        FileChooser option = new FileChooser();
        File selectedFile = option.showOpenDialog(null);

        if (selectedFile != null) {
            listView.getItems().add(selectedFile.getAbsolutePath());
        } else {
            System.out.println("File is not valid: user error");
        }
    }

    @FXML
    void execute(ActionEvent event) {

    }

}

