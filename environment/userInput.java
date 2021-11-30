package environment;

import java.io.File;
import process.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class userInput {

    private FileChooser option;
    private File selectedFile;

    @FXML
    private Button create;

    @FXML
    private TextField fileName;

    @FXML
    private ListView<String> listView;

    @FXML
    private ListView<String> listViewProject;

    @FXML
    private Button select;

    @FXML
    void browseFilesRoot(ActionEvent event) {
        option = new FileChooser();
        selectedFile = option.showOpenDialog(null);

        if (selectedFile != null) {
            listViewProject.getItems().add(selectedFile.getAbsolutePath());
        } else {
            System.out.println("File is not valid: user error");
        }
    }

    @FXML
    void browseFiles(ActionEvent event) {
        option = new FileChooser();
        selectedFile = option.showOpenDialog(null);

        if (selectedFile != null) {
            listView.getItems().add(selectedFile.getAbsolutePath());
        } else {
            System.out.println("File is not valid: user error");
        }
    }

    @FXML
    void execute(ActionEvent event) {
        String fName = fileName.getText();
        String path = selectedFile.getAbsolutePath();
        
        System.out.println(fName);
        System.out.println(path);
        // call createJar
        createJar proc = new createJar(fName, selectedFile);
        proc.execute();
    }

}

