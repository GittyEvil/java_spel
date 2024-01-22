package Spel;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	public Game(GameBoard board) {

	}

	public void update(Keyboard keyboard) {

	}

	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.WHITE);
		graphics.drawString("Halå", 100, 100);
		graphics.fillRect(100, 100, 50, 50);
	}
}
