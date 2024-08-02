package th.ac.ku.kps.eng.cpe.oop;

public class HourlySalary extends Employees{
	public HourlySalary(String firstname, String lastname, String ssn, double perH, int hour) {
		// TODO Auto-generated constructor stub
		super(firstname, lastname, ssn);
		this.hour = hour;
		this.perHour = perH;
	}
	
	protected int hour;
	protected double perHour;
	
	public double earning() {
		return hour * perHour;
	}
	
}