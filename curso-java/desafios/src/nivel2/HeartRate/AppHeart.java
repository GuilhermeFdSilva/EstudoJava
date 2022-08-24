package nivel2.HeartRate;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AppHeart extends JFrame {
	public AppHeart() {
		organizeLayout();
		setSize(700, 600);
		setTitle("HeartRate");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private void organizeLayout() {
		setLayout(new BorderLayout());
		Face face = new Face();
		face.setPreferredSize(new Dimension(200, 0));
		add(face, BorderLayout.WEST);
		Panel panel =new Panel();
		add(panel, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		new AppHeart();
	}
}