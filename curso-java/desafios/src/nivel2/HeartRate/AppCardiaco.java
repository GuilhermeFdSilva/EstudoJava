package nivel2.HeartRate;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AppCardiaco {
	public static void main(String[] args) {
		String name, lastname;
		int kay, day, month, year;
		Object[] start = { "Exit", "Start" };
		Object[] DAY = new Object[31];
		Object[] MONTH = new Object[12];
		Object[] YEAR = new Object[101];
		for (int i = 0; i < 31; i++) {
			DAY[i] = i + 1;
		}
		for (int i = 0; i < 12; i++) {
			MONTH[i] = i + 1;
		}
		int j = (Calendar.getInstance().get(Calendar.YEAR)) - 100;
		for (int i = 0; i <= 100; i++) {
			YEAR[i] = j;
			j++;
		}
		do {
			kay = JOptionPane.showOptionDialog(new JFrame(), "Welcome to Heart Rate!", "HeartRate",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, start, start[1]);
			if (kay != 0 && kay != -1) {
				do {
					name = JOptionPane.showInputDialog(null, "What's your first name?", "HeartRate",
							JOptionPane.PLAIN_MESSAGE);
					while (name.equals("")) {
						name = JOptionPane.showInputDialog(null, "Invalid name...", "HeartRate",
								JOptionPane.PLAIN_MESSAGE);
					}
					lastname = JOptionPane.showInputDialog(null, "What's your lastname?", "HeartRate",
							JOptionPane.PLAIN_MESSAGE);
					while (lastname.equals("")) {
						lastname = JOptionPane.showInputDialog(null, "Invalid name...", "HeartRate",
								JOptionPane.PLAIN_MESSAGE);
						return;
					}
					day = (int) JOptionPane.showInputDialog(null, "Insert the day of your birth", "HeartRate",
							JOptionPane.PLAIN_MESSAGE, null, DAY, DAY[0]);
					month = (int) JOptionPane.showInputDialog(null, "Insert the month of your birth", "HeartRate",
							JOptionPane.PLAIN_MESSAGE, null, MONTH, MONTH[0]);
					year = (int) JOptionPane.showInputDialog(null, "Insert the year of your birth", "HeartRate",
							JOptionPane.PLAIN_MESSAGE, null, YEAR, YEAR[99]);
				} while (kay == 1);
			}
		} while (kay == 1);
	}
}
