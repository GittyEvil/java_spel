package Spel;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends Sprite{

	private Color color;
	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void update(Keyboard keyboard) {
		// TODO Auto-generated method stub
	}

	@Override
	public void draw(Graphics2D graphics) {
		// TODO Auto-generated method stub
		graphics.setColor(color);
		graphics.fillRect(getX(),getY(),getWidth(),getHeight());
	}

}

