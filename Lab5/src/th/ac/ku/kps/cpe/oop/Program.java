package th.ac.ku.kps.cpe.oop;

public class Program {
	public static void main(String[] args) {
		Product p1 = new Product("XA1101", "Milk", 150);
		Product p2 = new Product("XA1102", "Sugar", 50);
		Product p3 = new Product("XA1103", "Coffee", 250);
		Product p4 = new Product("XA1103", "Coffee", 250);
		Product p5 = new Product("XA1103", "Coffee", 250);
		
		InventoryCart ic = new InventoryCart(10);
		ic.addProdect(p1);
		ic.addProdect(p2);
		ic.addProdect(p3);
		ic.addProdect(p4);
		ic.addProdect(p5);
		
		Cashier c = new Cashier("John Doe");
		c.printReceipt(ic);
	}
}
