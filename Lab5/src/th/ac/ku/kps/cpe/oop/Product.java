package th.ac.ku.kps.cpe.oop;

public class Product {
	private String code;
	public String getCode() {
		return code;
	}
	private String name;
	public String getName() {
		return name;
	}
	private double price;
	public double getPrice() {
		return price;
	}
	
	public Product(String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
}
