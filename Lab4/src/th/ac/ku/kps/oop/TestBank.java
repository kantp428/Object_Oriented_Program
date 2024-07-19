package th.ac.ku.kps.oop;

public class TestBank {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Tek");
		BankAccount b2 = new BankAccount("Win",500,new Date(1,11,2015));
		
		b1.deposit(1000);
		b2.transfer(b1, 300);
		b2.withdraw(300);
		System.out.println(b1.getinfo());
		System.out.println(b1.getAmount());
		System.out.println(b2.getinfo());
		System.out.println(b2.getAmount());
	}
}
