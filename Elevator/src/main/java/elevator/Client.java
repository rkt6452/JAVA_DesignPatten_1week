package elevator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame {

	private int CurrentFloor;
	private JLabel Now;
	private JLabel ElevatorDisplay;
	private JLabel VoiceNotice;
	private JLabel FloorDisplay;
	private JLabel CotrollRoomDisplay;
	
	ElevatorController controller = new ElevatorController();
	Observer elvatorDisplay = new ElevatorDisplay(controller);
	Observer voiceNotice = new VoiceNotice(controller);
	Observer floorDisplay = new FloorDisplay(controller);
	Observer controllRoomDisplay = new ControllRoomDisplay(controller);

	JButton floor7;
	JButton floor6;
	JButton floor5;
	JButton floor4;
	JButton floor3;
	JButton floor2;
	JButton floor1;
	
	public Client() {
		
		controller.addobserver(elvatorDisplay);
		controller.addobserver(voiceNotice);
		controller.addobserver(floorDisplay);
		controller.addobserver(controllRoomDisplay);
		
		setTitle("Elevator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		Container c1 = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		Box descBox = Box.createHorizontalBox();
		Box mainBox = Box.createVerticalBox();
		Box mainBox1 = Box.createVerticalBox();

		ElevatorDisplay = new JLabel(" ElevatorDisplay 1");
		VoiceNotice = new JLabel(" VoiceNotice 1");
		FloorDisplay = new JLabel(" FloorDisplay 1");
		CotrollRoomDisplay = new JLabel(" CotrollRoomDisplay 1");

		floor7 = new JButton("Floor 7");
		floor6 = new JButton("Floor 6");
		floor5 = new JButton("Floor 5");
		floor4 = new JButton("Floor 4");
		floor3 = new JButton("Floor 3");
		floor2 = new JButton("Floor 2");
		floor1 = new JButton("Floor 1¤±");

		floor7.addActionListener(new MyActionListener());
		floor6.addActionListener(new MyActionListener());
		floor5.addActionListener(new MyActionListener());
		floor4.addActionListener(new MyActionListener());
		floor3.addActionListener(new MyActionListener());
		floor2.addActionListener(new MyActionListener());
		floor1.addActionListener(new MyActionListener());

		mainBox.add(floor7);
		mainBox.add(floor6);
		mainBox.add(floor5);
		mainBox.add(floor4);
		mainBox.add(floor3);
		mainBox.add(floor2);
		mainBox.add(floor1);

		mainBox1.add(ElevatorDisplay);
		mainBox1.add(VoiceNotice);
		mainBox1.add(FloorDisplay);
		mainBox1.add(CotrollRoomDisplay);
		
		descBox.add(mainBox);
		descBox.add(mainBox1);
		
		c.add(descBox);

		Now = new JLabel("ÇöÀç 1ÃþÀÔ´Ï´Ù.");
		descBox.add(Now);
		
		System.out.println("ÇöÀç 1ÃþÀÔ´Ï´Ù");

		setSize(400, 300);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			CurrentFloor = controller.getCurFloor();
			int DFloor;

			floor7.setText("Floor 7");
			floor6.setText("Floor 6");
			floor5.setText("Floor 5");
			floor4.setText("Floor 4");
			floor3.setText("Floor 3");
			floor2.setText("Floor 2");
			floor1.setText("Floor 1");
			
			JButton b = (JButton) e.getSource();
			
			System.out.println();
			
			if (b.getText().equals("Floor 7")) {
				DFloor = 7;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(7);
				b.setText("Floor"+DFloor+"¤±");
			} else if (b.getText().equals("Floor 6")) {
				DFloor = 6;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(6);
				b.setText("Floor"+DFloor+"¤±");
			} else if (b.getText().equals("Floor 5")) {
				DFloor = 5;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(5);
				b.setText("Floor"+DFloor+"¤±");
			} else if (b.getText().equals("Floor 4")) {
				DFloor = 4;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(4);
				b.setText("Floor"+DFloor+"¤±");
			} else if (b.getText().equals("Floor 3")) {
				DFloor = 3;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(3);
				b.setText("Floor"+DFloor+"¤±");
			} else if (b.getText().equals("Floor 2")) {
				DFloor = 2;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(2);
				b.setText("Floor"+DFloor+"¤±");
			} else if (b.getText().equals("Floor 1")) {
				DFloor = 1;
				FloorMove(DFloor, CurrentFloor);
				controller.gotoFloor(1);
				b.setText("Floor"+DFloor+"¤±");
			}
		}

		private void FloorMove(int DFloor, int CurrentFloor) {
			if (DFloor < CurrentFloor) {
				while (DFloor != CurrentFloor) {
					System.out.println("NOW " + CurrentFloor--);
					Now.setText("ÇöÀç " + CurrentFloor + "ÃþÀÔ´Ï´Ù.");
					MatrixTime(500);
				}
				System.out.println("!µµÂø!");
				System.out.println( CurrentFloor+"Ãþ ÀÔ´Ï´Ù.");
			} else if (DFloor > CurrentFloor) {
				while (DFloor != CurrentFloor) {
					System.out.println("NOW " + CurrentFloor++);
					Now.setText("ÇöÀç " + CurrentFloor + "ÃþÀÔ´Ï´Ù.");
					MatrixTime(500);
				}
				System.out.println("!µµÂø!");
				System.out.println( CurrentFloor+"Ãþ ÀÔ´Ï´Ù.");
			} else {
				Now.setText("°°Àº ÃþÀÔ´Ï´Ù.");
				System.out.println("°°Àº ÃþÀÔ´Ï´Ù.");
			}
			ElevatorDisplay.setText(" ElevatorDisplay " + CurrentFloor);
			VoiceNotice.setText(" VoiceNotice " + CurrentFloor);
			FloorDisplay.setText(" FloorDisplay " + CurrentFloor);
			CotrollRoomDisplay.setText(" CotrollRoomDisplay " + CurrentFloor);
			
		}
	}

	public static void main(String[] args) {
		new Client();
	}

	public void MatrixTime(int delayTime) {
		long saveTime = System.currentTimeMillis();
		long currTime = 0;
		while (currTime - saveTime < delayTime) {
			currTime = System.currentTimeMillis();
		}
	}

}
