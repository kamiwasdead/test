package test;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




public class LoginController extends Application {
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	
	
	@FXML
	 void onLog(){
		String fakeUsername="Liam";
		String fakePass="123";
		
		String inputUsername=username.getText();
		String inputPassword=password.getText();
		
		if(fakeUsername.equals(inputUsername) && fakePass.equals(inputPassword)) {
			System.out.println("Succesful login!");
		} else {
			System.out.println("Unsuccessful login!");
		}
	}
	@FXML
	 void onSig(Stage primaryStage) throws Exception {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
