package Spel;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Sprite{

	private Color color;
	private int speed;
	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
		this.speed = 5;
	}

	@Override
	public void update(Keyboard keyboard) {
		// TODO Auto-generated method stub
		
		//rektanglars rörelse
		setY(getY() + this.speed);
	}

	@Override
	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub
		graphics.setColor(color);
		graphics.fillRect(getX(),getY(),getWidth(),getHeight());
	}

}

