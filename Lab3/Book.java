package th.ac.ku.kps.cpe.Lab3;

public class Book {
	public String name;
	public double price;
	public int year;
	public String author;
	
	public Book(String name, double price, int year, String author) {
		this.name = name;
		this.price = price;
		this.year = year;
		this.author = author;
	}
	
	public Book() {
		
	}
	
	public void ShowBook() {
		System.out.println("Book: " + this.name + "\nWritten by " + this.author + "in" + this.year);
		if(this.price != 0) {
			System.out.println("Price is " + this.price + " Bath");
		}
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPrice(double n) {
		this.price = n;
	}
}
