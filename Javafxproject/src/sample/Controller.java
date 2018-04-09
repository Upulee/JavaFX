package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;


public class Controller {
    @FXML private TextField username;
    @FXML public void login(ActionEvent event){
      System.out.println(username.getText());
    }
}
