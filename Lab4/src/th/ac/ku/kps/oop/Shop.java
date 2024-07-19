package th.ac.ku.kps.oop;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Product p0 = new Product(0,"Mama",5.5);
		Product p1 = new Product(10,"Lays",10.5);
		Product p2 = new Product(20);
		Product p3 = new Product(30);
		Product p4 = new Product(40);
		
		Product[] allProduct = {p0,p1,p2,p3,p4};
		Scanner sc = new Scanner(System.in);
		
		for(int i=2; i<5; i++) {
			System.out.println("======== Enter Products detail ========");
			System.out.println("Product code " + allProduct[i].getCode());
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			allProduct[i].setName(name);
			allProduct[i].setPrice(price);
		}
		
		System.out.println("========== List of Products ==========");
		for(Product prod : allProduct) {
			System.out.println("Product code " + prod.getCode());
			System.out.println("Name:"+prod.getName()+" , Price: "+prod.getPrice());
		}
		
		System.out.println("====== What do you want to buy? ======");
		System.out.println("Enter product code (press -1 to exit)");
		int Pcode=0,Pamount;
		double sumPrice=0;
		while(Pcode!=-1) {
			System.out.print("Product code:");
			Pcode = sc.nextInt();
			if(Pcode==-1) {
				break;
			}
			System.out.print("Amount of "+allProduct[Pcode/10].getName()+":");
			Pamount = sc.nextInt();
			sumPrice += Pamount * allProduct[Pcode/10].getPrice();
		}
		System.out.println("You have to pay "+sumPrice+" Bath");
		sc.close();
		
	}
}
