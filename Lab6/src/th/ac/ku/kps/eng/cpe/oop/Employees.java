package th.ac.ku.kps.eng.cpe.oop;

public abstract class Employees {
	protected String firstname;
	protected String lastname;
	protected String securityNumber;
	
	public Employees(String f, String l, String ssn) {
		// TODO Auto-generated constructor stub
		firstname = f;
		lastname = l;
		securityNumber = ssn;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s\nsocial security number: %s", firstname, lastname, securityNumber);
	}
	
	public abstract double earning();
}
