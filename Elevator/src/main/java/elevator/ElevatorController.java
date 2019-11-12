package elevator;

public class ElevatorController extends Subject {
	private int curFloor = 1;
	private int destination = 0;
	
	public void gotoFloor(int destination) {
		curFloor = destination;
		notifyObservers();
	}
	
	public int getCurFloor() {
		return curFloor;
	}
}
