package th.ac.ku.kps.eng.cpe.oop;

public class FixedSalary extends Employees{
	public FixedSalary(String firstname, String lastname, String ssn, double s) {
		// TODO Auto-generated constructor stub
		super(firstname, lastname, ssn);
		salary = s;
	}
	
	protected double salary;
	public double earning() {
		return salary;
	}
}
