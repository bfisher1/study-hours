package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class AdditionPanel extends Page {
    private GridPane grid;
    private Scene scene;
    public AdditionPanel(Stage primaryStage) {
    	StackPane root = new StackPane();
    	grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        scene = new Scene(root, 300, 275);
        scene.setFill(Color.DARKGRAY);
        
        Text title = new Text("Adding");
        root.getChildren().add(title);
        Color color = Color.AQUA;
        BackgroundFill fill = new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(fill);
        root.setBackground(background);
        
        Button retBtn = new Button("Return");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(retBtn);
        
        root.getChildren().add(hbox);
        
        retBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene( (new MenuPanel(primaryStage)).getScene() );
			}
        	
        });
    }
	/**
	 * @return the grid
	 */
	public GridPane getGrid() {
		return grid;
	}
	/**
	 * @return the scene
	 */
	public Scene getScene() {
		return scene;
	}
    
}
