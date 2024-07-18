package th.ac.ku.kps.cpe.Lab3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter and The Chamber of Secret", 0, 2542, "J.K. Rowling");
		book1.ShowBook();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Book name: ");
		String bn = scan.nextLine();
		book1.setName(bn);
		
		System.out.print("Enter Book price: ");
		double bp = scan.nextDouble();
		book1.setPrice(bp);
		
		book1.ShowBook();
		
		
		
		scan.close();
	}

}
