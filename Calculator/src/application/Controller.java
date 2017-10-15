package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
	@FXML
	private Button button6;
	@FXML
	private Button button7;
	@FXML
	private Button button8;
	@FXML
	private Button button9;
	@FXML
	private Button button0;
	@FXML
	private Button add;
	@FXML
	private Button equal;
	@FXML
	private Button clear;
	
	@FXML
	private TextField result;
	
	
	public void initialize() {
		initEvent();
	}
	int i = 0,j = 0;
	int operator = 0;
	public void initEvent() {
		initButtonEvent(button1, "1");
		initButtonEvent(button2, "2");
		initButtonEvent(button3, "3");
		initButtonEvent(button4, "4");
		initButtonEvent(button5, "5");
		initButtonEvent(button6, "6");
		initButtonEvent(button7, "7");
		initButtonEvent(button8, "8");
		initButtonEvent(button9, "9");
		initButtonEvent(button0, "0");
		initOperatorEvent(add,1);
		initOperatorEvent(equal,0);
		clear.setOnAction(event->{
			result.setText("");
		});
	}
	private void initOperatorEvent(Button button,int type) {
		button.setOnAction(event->{
			switch(type) {
			case 1:{
				i=Integer.valueOf("0"+result.getText());
				result.setText("+");
				break;
			}
			case 0:{
				j=Integer.valueOf(result.getText());
				switch(operator) {
				case 1:result.setText(Integer.toString(i+j));break;
				}
				break;
			}
		}
			operator = type;			
		});
	}
	private void initButtonEvent(Button button, String num) {
		button.setOnAction(event->{
			result.setText(result.getText() + num);
		});
	}
}
