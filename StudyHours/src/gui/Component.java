package gui;
/**
 * Component inside GUI such as a button or a text box.
 * All components are rectangular for simplicity's sake.
 * Handles generic component functions for being clicked and handling events.
 * 
 * @author Ben Fisher
 *
 */
public abstract class Component {
	/** Defining coordinates and attribues of componenet. **/
	int x, y, width, height;

	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Component(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Determines if point (x,y) is on the component.
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean onComponent(int x, int y) {
		return this.x <= x && x <= this.width && this.y <= y && y <= this.height;
	}
	
	public abstract void draw();
}
