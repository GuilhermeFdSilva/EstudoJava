package nivel2.HeartRate;

public class Calendar {
	private static final Calendar calendar = new Calendar();
	private final Integer[] DAY = new Integer[31];
	private final Integer[] MONTH = new Integer[12];
	private final Integer[] YEAR = new Integer[101];
	public static Calendar getInstance() {
		return calendar;
	}
	public Integer[] getDAY() {
		return DAY;
	}
	public Integer[] getMONTH() {
		return MONTH;
	}
	public Integer[] getYEAR() {
		return YEAR;
	}
	public int getDay(int i) {
		return DAY[i];
	}
	public int getMonth(int i) {
		return MONTH[i];
	}
	public int getYear(int i) {
		return YEAR[i];
	}
	private Calendar() {
		int day = 1;
		int month = 1;
		int j = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - 100;
		for(int i = 0; i < DAY.length; i++) {
			DAY[i] = day;
			day++;
		}
		for(int i = 0; i < MONTH.length; i++) {
			MONTH[i] = month;
			month++;
		}
		for(int i = 0; i < 101; i++) {
			YEAR[i] = j;
			j++;
		}
	}
}