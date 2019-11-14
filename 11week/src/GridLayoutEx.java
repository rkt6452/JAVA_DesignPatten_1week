import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
	GridLayoutEx() {
		setTitle("GridLayoutEx Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(4, 4);
		grid.setVgap(5);
		c.setLayout(grid);
		c.add(new JLabel("1"));
		c.add(new JLabel("2"));
		c.add(new JLabel("3"));
		c.add(new JLabel("4"));
		c.add(new JLabel("5"));
		c.add(new JLabel("6"));
		c.add(new JLabel("7"));
		c.add(new JLabel("8"));
		c.add(new JLabel("9"));
		c.add(new JLabel("10"));
		c.add(new JLabel("11"));
		c.add(new JLabel("12"));
		c.add(new JLabel("13"));
		c.add(new JLabel("14"));
		c.add(new JLabel("15"));
		c.add(new JLabel("16"));
		

		setSize(200, 200);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			new GridLayoutEx();
		}

}
