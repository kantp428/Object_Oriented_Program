package th.ac.ku.kps.oop;

public class Product {
	private int code;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product(int c, String n, double p) {
		code = c;
		name = n;
		price = p;
	}
	public Product(int c) {
		code = c;
	}
	
}
