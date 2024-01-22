package Spel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	private Color current;
	private int timer;
	private BlueBox rekt;
	public Game(GameBoard board) {
		current = Color.WHITE;
		this.timer = 0;
		rekt = new BlueBox(20,20,20,20);
		
	}

	public void update(Keyboard keyboard) {
		this.timer++;
		if(this.timer % 40 == 0) {
			
		}
	}

	public void draw(Graphics2D graphics) {
		/*
		 * graphics.setColor(current);
		graphics.drawString("Halå", 100, 100);
		graphics.fillRect(100, 100, 50, 50);
		 * */
		
		rekt.draw(graphics);
		
	}
}
