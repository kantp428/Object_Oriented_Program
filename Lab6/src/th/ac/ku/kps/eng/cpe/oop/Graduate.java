package th.ac.ku.kps.eng.cpe.oop;

public class Graduate extends Student {
	protected String theThesisTitle;
	
	public Graduate(int id, String name, double gpa, String Thes) {
		// TODO Auto-generated constructor stub
		super(id, name, gpa);
		this.theThesisTitle = Thes;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Graduate "+super.toString()+"\nThesis: "+theThesisTitle;
	}
}
