package th.ac.ku.kps.oop;

public class BankAccount {
	private String name;
	private double amount;
	private Date date;
	
	public BankAccount(String n) {
		name = n;
		amount = 0;
		date = new Date(19,7,2567);
	}
	public BankAccount(String n, double a, Date d) {
		name = n;
		amount = a;
		date = d;
	}
	
	void deposit(double a) {
		amount += a;
	}
	
	boolean withdraw(double a) {
		if(amount>=a) {
			amount -= a;
			return true;
		}else {		
			return false;
		}
	}
	
	void transfer(BankAccount other, double a) {
		if(amount>=other.amount){
			other.amount += a;
			amount -= a;
		}
	}
	
	public double getAmount() {
		return amount;
	}
	
	String getinfo() {
		return name+" "+date.showAll();
	}
}
