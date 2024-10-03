package Program;

import java.io.*;
import java.util.*;

public class P2 {
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		File f = new File("sell.txt");
		BufferedReader bf = null;
		String line = "";
		try {
			bf = new BufferedReader(new FileReader(f)); 
			while((line = bf.readLine()) != null) {
					String[] col = line.split(",");
					items.add(new Item(col[0], Double.valueOf(col[1]), Integer.valueOf(col[2])));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Final shopping cart totals");
		double sum = 0;
		for(Item i : items) {
			System.out.println(i);
			sum += i.getPrice() * i.getQuantity();
		}
		System.out.println("Total $ Amount in Cart: $"+sum);	
	}
}
