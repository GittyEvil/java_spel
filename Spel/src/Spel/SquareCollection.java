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
			int mellanRum = 20 + i*(30);
			int bytFärg = i % 3;
			if(bytFärg == 0) {
				Rectangles.add(new BlueBox(mellanRum,20,20,20));
			}else if (bytFärg == 1) {
				Rectangles.add(new RedBox(mellanRum + 40,20,20,20));
			}else {
				Rectangles.add(new GreenBox(mellanRum+2*30,20,20,20));
			}
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
