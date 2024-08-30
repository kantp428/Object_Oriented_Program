package Lab8_1;

public abstract class Card implements Withdraeable{
	protected String cardnumber;
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	
	public abstract String type() ;
	public abstract double discount() ;
}
