package N2;

public class Program2 {
	public static void main(String[] args) {
		
		FixedSalary employeeA = new FixedSalary("Clark", "Kent","555-999-5555", 15000.00);

		System.out.println(employeeA.getCard());
		SavingsAccount b = new SavingsAccount(employeeA);
		System.out.println(employeeA.getCard().getCardnumber());

		b.deposit(1000); 
		Milk p1 = new Milk(150);
		p1.setVolumn(250);
		Sugar p2 = new Sugar(50);
		p2.setWeight(250);
		Product p3 = new Coffee(250);
		p3.setWeight(50);
		Product p4 = new Coffee(250);
		p4.setWeight(50);
		
		InventoryCart ic = new InventoryCart(10);
		ic.add(p1);
		ic.add(p2);
		ic.add(p3);
		ic.add(p4);
		
//		for(Product i : ic.getCart()) {
//			System.out.println(i);
//		}
		
		Cashier c = new Cashier();
		//System.out.println(employeeA.getCard().getCardnumber());
		c.doPayment(ic, employeeA.getCard());
		c.printReceipt();
		
//		System.out.println("\n"+b.money);
//		employeeA.getCard().withdraw(500);
//		System.out.println("\n"+b.money);
//		b.withdraw(200);
//		System.out.println("\n"+b.money);
	}
}