package nivel2.HeartRate;

import java.time.LocalDate;
import java.time.Period;

public class HeartRate {
	private String name, lastname;
	private int day, month, year;
	private String nameFormated = String.format("%s %s", name, lastname);
	public String getNameFormated() {
		return nameFormated;
	}
	HeartRate(String name, String lastname, int day, int month, int year){
		this.name = name;
		this.lastname = lastname;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int age() {
		LocalDate birthday = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		return Period.between(birthday, today).getYears();
	}
	public int maximumFrequency() {
		return 220 - age();
	}
	public String idealFrequency() {
		int maximumIdeal = Math.round(maximumFrequency() * 0.85F);
		int minimumIdeal = Math.round(maximumFrequency() * 0.5F);
		return "Your ideal frequncy is betwen, " + minimumIdeal + " and " + maximumIdeal + ".";
	}
}
