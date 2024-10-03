package Program;
import java.io.*;
import java.util.*;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<Item>();
		File f = new File("sell.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String shopping = "y";
		while(shopping.equals("y")) {
			System.out.print("Enter the name of item: ");
			String name = sc.nextLine();
			System.out.print("Enter the unit price: ");
			double price = sc.nextDouble();
			System.out.print("Enter the quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			items.add(new Item(name, price, quantity));
			System.out.print("Continue shopping (y/n)? ");
			shopping = sc.nextLine();
		}
		
		System.out.println("Final shopping cart totals");
		double sum = 0;
		for(Item i : items) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
				bw.write(i.getFitem());
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			sum += i.getPrice() * i.getQuantity();
		}
		System.out.println("Total $ Amount in Cart: $"+sum);
		sc.close();
	}
}
