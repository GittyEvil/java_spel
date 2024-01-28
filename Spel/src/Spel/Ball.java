package Spel;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Sprite{

	private int speed;
	private Color color;
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		this.speed = 5;
		this.color = Color.gray;
	}
	
	@Override
	public void update(Keyboard keyboard) {
		
		//här ska du fixa så den beror på knapptryck
		if(keyboard.isKeyDown(Key.Up)) {
			setY(getY() - this.speed);
		}
		if(keyboard.isKeyDown(Key.Down)) {
			setY(getY() + this.speed);
		}
		if(keyboard.isKeyDown(Key.Right)) {
			setX(getX() + this.speed);
		}
		if(keyboard.isKeyDown(Key.Left)) {
			setX(getX() - this.speed);
		}
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());
	}

}
