package graphics;

import java.awt.Color;
import gui.Gui;

	public class Graphics {
		public static void plot(int x, int y, int radius) {
			Gui.getG2().setColor(Color.GREEN);
			Gui.getG2().fillOval(x, y, radius, radius);	
		}
		public static void rect(int x, int y, int width, int height, Color color) {
			Gui.getG2().setColor(color);
			Gui.getG2().fillRect(x, y, width, height);
		}
}
