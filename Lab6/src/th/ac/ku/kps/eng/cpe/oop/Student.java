package th.ac.ku.kps.eng.cpe.oop;

public class Student {
	protected String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected int id;
	public int getId() {
		return id;
	}
	
	protected double gpa;
	public double getGpa() {
		return gpa;
	}
	
	public Student(int id, String name, double gpa) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public Student(int id, double gpa) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student:\n"+"ID: "+id+"\nName: "+name+"\nGPA: "+gpa;
	}
}
