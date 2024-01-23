package Spel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	private Color current;
	private int timer;
	private BlueBox rekt;
	private RedBox rekt2;
	private GreenBox rekt3;
	private SquareCollection Rectangles;
	
	public Game(GameBoard board) {
		current = Color.WHITE;
		this.timer = 0;
		
		Rectangles = new SquareCollection();
	}

	public void update(Keyboard keyboard) {
		this.timer++;
		if(this.timer % 40 == 0) {
			
		}
		/*rekt.update(keyboard);
		rekt2.update(keyboard);
		rekt3.update(keyboard);*/
		Rectangles.update(keyboard);
	}

	public void draw(Graphics2D graphics) {
		/*
		 * graphics.setColor(current);
		graphics.drawString("Halå", 100, 100);
		graphics.fillRect(100, 100, 50, 50);
		 * */
		
		/*rekt.draw(graphics);
		rekt2.draw(graphics);
		rekt3.draw(graphics);*/
		
		Rectangles.draw(graphics);
	}
}
