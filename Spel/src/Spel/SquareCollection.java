package Spel;

import java.awt.Graphics2D;

public class SquareCollection {

	private Rectangle[] ArrayList;
	private int antalRektanglar  = 10;
	
	//funktionen ska ta in objekten för blue,red,green box å skapa 10 st som rör sig nedåt
	public SquareCollection(BlueBox rekttyp1,RedBox rekttyp2,GreenBox rekttyp3) {
		ArrayList = new Rectangle[antalRektanglar];
		for(int i = 0; i<antalRektanglar ;i++) {
			ArrayList[i] = rekttyp1;
			ArrayList[i] = rekttyp2;
			ArrayList[i] = rekttyp3;
		}
	}
	
	public void update(Keyboard keyboard) {
		
	}

	public void draw(Graphics2D graphics) {
		
	}
	
}
