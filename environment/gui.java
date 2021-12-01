/**
 * Author: Jayson C. Garrison
 * Inception: 11/29/21
 * Description: gui application for conifer; uses JavaFX
 * Utilization: window.fxml
 * Project: conifer
 */
package environment;

// import javax.swing.*;
import info.*;
// import java.awt.*;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

public class gui extends Application {

    version ver;
    public gui() {
        // version is 0.0
        ver = new version();
        // update the version
        ver.setVersion(0.4);
        //invoke("");
    } // end default constructor

    public void invoke(String args) {
        launch(args);
    }

    /**
     * start the gui
     * @param primaryStage the primary stage
     * @throws Exception 
     */
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("window.fxml"));
        primaryStage.setTitle("conifer version " + ver.getVersion());
        Scene interf = new Scene(root, 650, 700);
        primaryStage.setScene(interf);
        primaryStage.show();
        primaryStage.setResizable(false);
    } // end start

    public static void main(String[] args) { 
        launch(args);
    } // end main 
} // end gui
