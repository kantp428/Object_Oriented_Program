package th.ac.ku.kps.eng.cpe.oop;

public class Program2 {
	public static void main(String[] args) {
		Milk p1 = new Milk(150);
		p1.setVolumn(250);
		Sugar p2 = new Sugar(50);
		p2.setWeight(250);
		Product p3 = new Coffee(250);
		p3.setWeight(50);
		Product p4 = new Coffee(250);
		p4.setWeight(30);
		Product p5 = new Coffee(250);
		p5.setWeight(30);
		
		InventoryCart ic = new InventoryCart(10);
		ic.add(p1);
		ic.add(p2);
		ic.add(p3);
		ic.add(p4);
		ic.add(p5);
		
//		for(Product i : ic.getCart()) {
//			System.out.println(i);
//		}
		
		Cashier c = new Cashier("john Doe");
		c.printReceipt(ic);
	}
}
