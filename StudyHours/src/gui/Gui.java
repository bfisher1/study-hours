package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import graphics.Graphics;

import javax.swing.Timer;

import graphics.DrawingPanel;

public class Gui {
	List<Component> components;
	private static Graphics2D g2;
	private static DrawingPanel panel;
	
	public static void main(String[] args) throws IOException {
		panel = new DrawingPanel(550,520);
		g2 = panel.getGraphics();
		g2.translate(100, 120);
		g2.setColor(Color.WHITE);
		
		panel.onClick( (x, y) -> handleClick(x, y) );
		panel.onKeyDown(k -> handleKeyDown(k));
		panel.onKeyUp(k -> handleKeyUp(k));
		
		ActionListener updateGraphics = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		    	  	panel.clear();
		    	  	Graphics.plot(50, 50, 50);
					panel.getPanel().repaint();
		      }
		  };
		  Timer graphicsTimer = new Timer(20, updateGraphics);
			graphicsTimer.start();
		
	}
	private static Object handleKeyUp(char k) {
		// TODO Auto-generated method stub
		return null;
	}
	private static Object handleKeyDown(char k) {
		// TODO Auto-generated method stub
		return null;
	}
	private static Object handleClick(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}
	public static Graphics2D getG2() {
		return g2;
	}
	public static DrawingPanel getDrawingPanel() {
		return panel;
	}
}
