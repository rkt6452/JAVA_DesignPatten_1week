package ball;

public class HorizonalMoveStrategy extends DirectionStrategy {

	public void move(Ball ball) {
		
		ball.setInterVals(Ball.INTERVAL, 0);
		while(true) {
			ball.setX(ball.getX() + ball.getxInterVal());
			if((ball.getX()<0 && ball.getxInterVal() <0) || ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getxInterVal() > 0) {
				ball.setInterVals(-ball.getxInterVal(), 0);
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}
		}
	}
}
