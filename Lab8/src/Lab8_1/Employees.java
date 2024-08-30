package Lab8_1;

public abstract class Employees {
	protected String firstname;
	protected String lastname;
	protected String securityNumber;
	protected SavingsAccount Acc;
	//protected Card card;
	
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
	
	public SavingsAccount.Debitcard getCard() {
		if(Acc==null) {
			return null;
		}else {
			return Acc.getDcard();			
		}
	}
	
	public abstract double earning();
}