import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	BorderLayoutEx() {
		setTitle("BorderLayoutEx Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		c.add(new JButton("OK N"), BorderLayout.NORTH);
		c.add(new JButton("OK S"), BorderLayout.SOUTH);
		c.add(new JButton("OK W"), BorderLayout.WEST);
		c.add(new JButton("OK E"), BorderLayout.EAST);
		c.add(new JButton("OK C"), BorderLayout.CENTER);

		setSize(300, 200);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			new BorderLayoutEx();
		}

}
