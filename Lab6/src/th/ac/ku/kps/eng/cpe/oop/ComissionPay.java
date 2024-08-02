package th.ac.ku.kps.eng.cpe.oop;

public class ComissionPay extends Employees{
	public ComissionPay(String firstname, String lastname, String ssn, double gs, double cr) {
		// TODO Auto-generated constructor stub
		super(firstname, lastname, ssn);
		this.grossSale = gs;
		this.com_rate = cr;
	}
	
	protected double grossSale;
	protected double com_rate;
	
	public double earning() {
		return grossSale * com_rate;
	}
}
