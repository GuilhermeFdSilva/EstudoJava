package nivel2.HeartRate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	public Panel() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setBackground(new Color(223, 238, 191));
		setLayout(layout);
		add(new JLabel("Nome: "), c);
		c.gridy = 1;
		c.gridheight = 100;
	}
}
 