package Spel;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class SquareCollection {

	private ArrayList<Rectangle> Rectangles;
	private int antalRektanglar  = 10;
	private int rekMellanrum = 10;
	private int rekBredd = 20;
	
	//funktionen ska ta in objekten för blue,red,green box å skapa 10 st som rör sig nedåt
	public SquareCollection() {
		Rectangles = new ArrayList<>();
		for(int i = 0; i< antalRektanglar;i++) {
			int mellanRum = i*(rekMellanrum + rekBredd);
			int bytFärg = i % 3;
			//byter färg och lägger bara till 10 st rektanglar totalt
			if(bytFärg == 0) {
				Rectangles.add(new BlueBox(190 + mellanRum,20,rekBredd,20));
			}else if (bytFärg == 1) {
				Rectangles.add(new RedBox(205 + mellanRum,20,rekBredd,20));
			}else {
				Rectangles.add(new GreenBox(395 + mellanRum/2 + 2*40,20,rekBredd,20));
			}
		}
	}
	
	public void update(Keyboard keyboard) {
		for (Rectangle rectangle : Rectangles) {
            rectangle.update(keyboard);
            //tar bort rektanglar från ArrayList ifall de går över 600 alltså höjden på gameboarden
            if(rectangle.getY() > 600) {
            	Rectangles.remove(rectangle);
            }
        }
	}

	public void draw(Graphics2D graphics) {
		for(Rectangle Rectangle : Rectangles) {
			Rectangle.draw(graphics);
		}
 	}
	
}
