package th.ac.ku.kps.oop;

public class Date {
	private int day;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day>0 && day<32)
			this.day = day;
	}
	
	private int month;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>0 && month<13)
			this.month = month;
	}
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<2024)
			this.year = year+543;
	}

	public Date(int d, int m, int y) {
		if(d>0 && d<32 && m>0 && m<13) {
			day = d;
			month = m;
			if(y <= 2024) {
				y = y + 543;
			}
			year = y;
		}else {
			day = 19;
			month = 7;
			year = 2567;
		}
	}
	String showAll() {
		return day+"/"+month+"/"+year;
	}
}
