import javax.swing.*;
import java.awt.*;

public class ContentPaneEX extends JFrame {
	ContentPaneEX() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEX();
	}
}
