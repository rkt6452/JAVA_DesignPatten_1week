package ball;

public class Client {
	private static final int INIT_LOCAION[] = { 50, 100, 150};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball [] balls = new Ball[3];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new Ball(INIT_LOCAION[i], INIT_LOCAION[i]);
			balls[i].setDrawStrategy(new BlueDrawStrategy());
			
			if(i==1) {
				balls[i].setDirectionStrategy(new DiagonalMoveStrategy());
			}
			else if(i==2){
				balls[i].setDirectionStrategy(new HorizonalMoveStrategy());
				balls[i].setDrawStrategy(new RedDrawStrategy());
			}
			else {
				balls[i].setDirectionStrategy(new VerticalMoveStrategy());
			}
			balls[i].start();
		}
		new BallFrame(balls);
	}
}
