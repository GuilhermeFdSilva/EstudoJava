package nivel2.HeartRate;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Body {
	
	private String name, lastname;
	private  int day, month, year;
	private Object[] start = { "Exit", "Start" };
	private Object[] DAY = new Object[31];
	private Object[] MONTH = new Object[12];
	private Object[] YEAR = new Object[101];

	public void setCalendar() {
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
	}
	public void Start() {
		try {
			int s = JOptionPane.showOptionDialog(null, "Welcome to Heart Rate!", "HeartRate",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, start, start[1]);
			do {
				if (s == 1) {
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
						}
						day = (int) JOptionPane.showInputDialog(null, "Insert the day of your birth", "HeartRate",
								JOptionPane.PLAIN_MESSAGE, null, DAY, DAY[0]);
						month = (int) JOptionPane.showInputDialog(null, "Insert the month of your birth", "HeartRate",
								JOptionPane.PLAIN_MESSAGE, null, MONTH, MONTH[0]);
						year = (int) JOptionPane.showInputDialog(null, "Insert the year of your birth", "HeartRate",
								JOptionPane.PLAIN_MESSAGE, null, YEAR, YEAR[99]);
						HeartRate user = new HeartRate(name, lastname, day, month, year);
						s = JOptionPane.showOptionDialog(null,
								"You at " + user.age() + " years old, have a maximum frequency of "
										+ user.maximumFrequency() + ".\n" + user.idealFrequency(),
										user.getNameFormated(), JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, start,
										start[0]);
					} while (s == 1);
				}else {
					throw new ExitException();
				}
			} while (s == 1);
		}catch(ExitException e) {
		}
	}
}