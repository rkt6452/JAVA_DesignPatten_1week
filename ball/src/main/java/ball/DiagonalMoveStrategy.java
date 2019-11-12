package ball;

public class DiagonalMoveStrategy extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		// TODO Auto-generated method stub
		ball.setInterVals(Ball.INTERVAL, Ball.INTERVAL);
		while(true) {
			ball.setX(ball.getX() + ball.getxInterVal());
			if((ball.getX()<0 && ball.getxInterVal() <0) || ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getxInterVal() > 0) {
				ball.setInterVals(-ball.getxInterVal(), ball.getyInterVal());
			}
			ball.setY(ball.getY() + ball.getyInterVal());
			if((ball.getY()<0 && ball.getyInterVal() <0) || ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15 && ball.getyInterVal() > 0) {
				ball.setInterVals(ball.getxInterVal(), -ball.getyInterVal());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}
		}
	}

}
