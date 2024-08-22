package N2;

public class SavingsAccount extends BaseAccount{

	private FixedSalary employee;
	private DebitCard Dcard;
	
	public FixedSalary getEmployee() {
		return employee;
	}
	public DebitCard getDcard() {
		return Dcard;
	}
	
	public SavingsAccount(FixedSalary em) {
		this.employee = em;
		this.Dcard = new DebitCard();
		this.Dcard.setCardnumber(em.securityNumber);
		this.Dcard.sc = this;
		this.employee.card = this.Dcard;
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean out=false;
		if(super.money>=amount) {
			super.money-=amount;
		}
		
		return out;
	}

	@Override
	public boolean deposit(double amount) {
		money+=amount;
		return true;
	}

}
