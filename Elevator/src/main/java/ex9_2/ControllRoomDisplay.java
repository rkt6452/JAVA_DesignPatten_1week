package ex9_2;

import javax.swing.JLabel;

public class ControllRoomDisplay implements Observer {

	private ElevatorController controller;
	//private JLabel BBQ;
	
	public ControllRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}

	public void update() {
		// TODO Auto-generated method stub
		int curFloor = controller.getCurFloor();
		String c;
		//System.out.println("CotrollRoom Display : " + curFloor);
		//c = Integer.toString(curFloor);
		//BBQ.setText(c);
	}

}
