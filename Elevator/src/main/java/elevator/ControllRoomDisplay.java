package elevator;

import javax.swing.JLabel;

public class ControllRoomDisplay implements Observer {

	private ElevatorController controller;


	
	public ControllRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}

	public void update() {
		// TODO Auto-generated method stub
		int curFloor = controller.getCurFloor();
		System.out.println("CotrollRoom Display : " + curFloor);

	}
}
