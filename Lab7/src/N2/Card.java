package N2;

public abstract class Card implements Withdraeable{
	protected SavingsAccount sc;
	protected String cardnumber;
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	
	public SavingsAccount getSc() {
		return sc;
	}
	public abstract String type() ;
	public abstract double discount() ;
}
