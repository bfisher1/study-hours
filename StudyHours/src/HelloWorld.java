import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	
        primaryStage.setTitle("Hello World!");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 300, 275);
        scene.setFill(Color.AQUAMARINE);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cheetah Math");
        
        Text instructionText = new Text("Hello there");
        instructionText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(instructionText, 2, 2);
        
        TextField input = new TextField();
        grid.add(input, 2, 1);
        
        Button btn = new Button("Check");
        grid.add(btn, 2, 3);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				instructionText.setText(input.getText());
				input.clear();
				
			}
        	
        });
        
        primaryStage.show();
    }
}