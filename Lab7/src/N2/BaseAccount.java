package N2;

public abstract class BaseAccount implements Withdraeable{
	protected double money=0;
	
	public abstract boolean deposit(double amount);
	
}
