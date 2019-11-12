package elevator;

public class VoiceNotice implements Observer {
	private ElevatorController controller;
	
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		// TODO Auto-generated method stub
		int voiceNotice = controller.getCurFloor();
		System.out.println("Voice Notice: " + voiceNotice);
	}

}
