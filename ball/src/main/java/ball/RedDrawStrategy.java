package ball;

import java.awt.Color;

public class RedDrawStrategy extends DrawStrategy {

	@Override
	public void draw(Ball ball) {
		// TODO Auto-generated method stub
		ball.setColor(Color.red);
		
	}

}
