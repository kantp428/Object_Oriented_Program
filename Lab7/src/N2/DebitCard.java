package N2;

public class DebitCard extends Card{
	private String type="visa";
	private double discount=2.5;

	@Override
	public boolean withdraw(double amount) {
		boolean out = false;
		if(this.sc.money >= amount) {
			this.sc.money -= amount;
			out = true;
		}
		
		return out;
	}
	@Override
	public String type() {
		return type;
	}
	@Override
	public double discount() {
		return discount;
	}
}
