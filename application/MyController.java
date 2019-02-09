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
	private TextField b;
	@FXML
	private TextField result2;
	
	@FXML
	private TextField a;
	
	@FXML
	private TextField c;
	
	@FXML
	private Button btn;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	public void ShowDate(ActionEvent event) {
		String a1=a.getText();
		String b1=b.getText();
		String c1=c.getText();
		double a2 = new Double(a1);
		double b2 = new Double(b1);
		double c2 = new Double(c1);
        double d=(b2*b2-4*a2*c2);
        String d1 = Double.toString(d);
        result.setText(d1);
        if (d<0) {
        	result.setText("Нет решения");
    		result2.setText("Нет решения");
        }
        if (d==0) {
        	double x1=(-b2+Math.sqrt(d))/(2*a2);
            String x12 = Double.toString(x1);
        	result.setText(x12);
    		result2.setText("Только 1 решение");
        }
        if (d>0) {
        double x1=(-b2+Math.sqrt(d))/(2*a2);
        String x12 = Double.toString(x1);

        		double x2=(-b2-d)/(2*a2);
        		String x22 = Double.toString(x2);
		result.setText(x12);
		result2.setText(x22);
        }
	}

}
