package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class MyController implements Initializable {
 @FXML
 private TextField result;
 
 
 @FXML
 private TextField login;
 
 @FXML
 private Button btn;
 
 
 @Override
 public void initialize(URL arg0, ResourceBundle arg1) {
  // TODO Auto-generated method stub
  
 }
 public void ShowDate(ActionEvent event) {
  String a=login.getText();
  int a1 = new Integer(a);
  result.setText(Integer.toHexString(a1));
 }
 public void ShowDate2(ActionEvent event) {
	  String a=login.getText();
	  int a1 = new Integer(a);
	  result.setText(Integer.toOctalString(a1));
	 }
}
