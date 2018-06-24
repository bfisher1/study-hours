package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MenuPanel extends Page {
	private GridPane grid;
    private Scene scene;
    public MenuPanel(Stage primaryStage) {
    	grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        scene = new Scene(grid, 300, 275);
        scene.setFill(Color.DARKGRAY);
        Text title = new Text("Menu");
        grid.add(title, 0, 0);
        
        Button addBtn = new Button("Adding");
        grid.add(addBtn, 0, 1);
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene( (new AdditionPanel(primaryStage)).getScene() );
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
