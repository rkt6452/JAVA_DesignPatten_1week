package ball;

public class VerticalMoveStrategy extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		// TODO Auto-generated method stub
		ball.setInterVals(0, Ball.INTERVAL);
		while(true) {
			ball.setY(ball.getY() + ball.getyInterVal());
			if((ball.getY()<0 && ball.getyInterVal() <0) || ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15 && ball.getyInterVal() > 0) {
				ball.setInterVals(0, -ball.getyInterVal());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}
		}
	}

}
