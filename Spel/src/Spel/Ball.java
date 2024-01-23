package Spel;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Rectangle{

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height, Color.gray);
	}
	
	@Override
	public void update(Keyboard keyboard) {
		
		//här ska du fixa så den beror på knapptryck
		
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());
	}

}
