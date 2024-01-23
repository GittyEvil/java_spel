package Spel;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class SquareCollection {

	private ArrayList<Rectangle> Rectangles;
	private int antalRektanglar  = 10;
	
	//funktionen ska ta in objekten för blue,red,green box å skapa 10 st som rör sig nedåt
	public SquareCollection() {
		Rectangles = new ArrayList<>();
		for(int i = 0; i< antalRektanglar;i++) {
			Rectangles.add(new BlueBox(20+(i*20),20,20,20));
			Rectangles.add(new RedBox(40+(i*40),20,20,20));
			Rectangles.add(new GreenBox(60+(i*60),20,20,20));
		}
	}
	
	public void update(Keyboard keyboard) {
		for (Rectangle rectangle : Rectangles) {
            rectangle.update(keyboard);
        }
	}

	public void draw(Graphics2D graphics) {
		for(Rectangle Rectangle : Rectangles) {
			Rectangle.draw(graphics);
		}
 	}
	
}
