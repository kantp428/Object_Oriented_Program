package th.ac.ku.kps.eng.cpe.oop;

public class Product {
//	protected String name;
//	public String getName() {
//		return name;
//	}
	protected double price;
	public double getPrice() {
		return price;
	}
	
	protected double weight;
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	double volumn;
	public void setVolumn(double volumn) {
		this.volumn = volumn;
	}
	public double getVolumn() {
		return volumn;
	}
	
	public Product(double price) {
		this.price = price;
	}
}
