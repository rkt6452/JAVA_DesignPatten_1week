package ex9_2;

import javax.swing.JLabel;

public class VoiceNotice implements Observer {
	private ElevatorController controller;

	
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		// TODO Auto-generated method stub
		int curFloor = controller.getCurFloor();
		System.out.println("Voice Notice: " + curFloor);
		
	}

}
