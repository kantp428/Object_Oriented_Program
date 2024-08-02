package th.ac.ku.kps.eng.cpe.oop;

public class Undergrad extends Student {
	protected String year;
	
	public Undergrad(int id, String name, double gpa,String year) {
		// TODO Auto-generated constructor stub
		super(id, name, gpa);
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Undergraduate "+super.toString()+"\nYear: "+year;
	}
}
