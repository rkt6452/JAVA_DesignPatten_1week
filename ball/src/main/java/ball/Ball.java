package ball;

import java.awt.Color;

public class Ball extends Thread {
	public static final int SIZE = 20;
	public static final int INTERVAL = 10;
	private int x, y;
	private int xInterVal, yInterVal;
	private DirectionStrategy directionStrategy;
	private DrawStrategy drawStrategy;
	private Color color;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.xInterVal = this.yInterVal = 0;		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getxInterVal() {
		return xInterVal;
	}
	
	public int getyInterVal() {
		return yInterVal;
	}

	public void setInterVals(int xInterVal, int yInterVal) {
		this.xInterVal = xInterVal;
		this.yInterVal = yInterVal;
	}
	
	public void setDirectionStrategy(DirectionStrategy directionStrategy) {
		this.directionStrategy = directionStrategy;
	}

	public void setDrawStrategy(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public void draw() {
		drawStrategy.draw(this);
	}
	public void move() {
		directionStrategy.move(this);
	}
	public void run() {
		draw();
		move();
	}
}
