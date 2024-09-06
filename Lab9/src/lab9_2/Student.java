package lab9_2;

import java.util.Stack;

public class Student {
	private String name;
	private String grade;
	
	public Student(String name ,String grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() throws SpaceInNameException, DigitInNameException {
		if(name.indexOf(" ")!=-1) {
			throw new SpaceInNameException();
		}else {
			for(int i=0; i<10; i++) {
				if(name.indexOf((char)i+'0')!=-1) {
					throw new DigitInNameException();
				}
			}
		}
		
		return name;
	}
		
	public double calGPA() throws InvalidGradeException, IGradeException{
		char[] gradeArr = this.grade.toCharArray();
		double GPA=0;
		String ableGrade = "EDCBAF";
		
		for(char i : gradeArr) {
			if((i!='I') && (ableGrade.indexOf(i)==-1)) {
				throw new InvalidGradeException();
			}else if(i == 'I') {
				throw new IGradeException();
			}else {
				int grade = ableGrade.indexOf(i);
				if(grade==5) grade=0;
				GPA = GPA + grade;
			}
		}
		
		return GPA/grade.length();
	}
	
	public void show() {
		
		try {
			System.out.println(getName() +" registered "+grade.length()+" subjects and got GPA "+this.calGPA());	
		}catch (SpaceInNameException e) {
			e.printEx();
		}catch (DigitInNameException e) {
			e.printEx();
		}catch (InvalidGradeException e) {
			e.printEx();
		}catch (IGradeException e) {
			e.printEx();
		}
		
//		catch(Exception e) {
//			
//		}
	}
	
	class SpaceInNameException extends Exception{
		public void printEx() {
			System.out.println("(space is not allowed in name) can not display");
		}
	}
	
	class DigitInNameException extends Exception{
		public void printEx() {
			System.out.println("(digit is not allowed in name) can not display");
		}
	}
	
	class InvalidGradeException extends Exception{
		public void printEx() {
			System.out.println("(grade must be A B C D E F) can not display");
		}
	}
	
	class IGradeException extends Exception{
		public void printEx() {
			System.out.println("(grade I is incomplete) can not display");
		}
	}
	
}
