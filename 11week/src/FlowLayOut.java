import javax.swing.*;
import java.awt.*;

public class FlowLayOut extends JFrame {
	FlowLayOut() {
	setTitle("FloewLayOut Sample");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	
	c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
	c.add(new JButton("OK"));
	c.add(new JButton("OK"));
	c.add(new JButton("OK"));
	c.add(new JButton("OK"));
	c.add(new JButton("OK"));
	c.add(new JButton("OK"));

	setSize(350, 250);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayOut();
	}
	
}