package Lab8_1;

public class SavingsAccount extends BaseAccount{
	
	private FixedSalary employee;
	private SavingsAccount.Debitcard Dcard;
	
	class Debitcard extends Card{
		private String type="visa";
		private double discount=2.5;

		@Override
		public boolean withdraw(double amount) {
			// TODO Auto-generated method stub
			return SavingsAccount.this.withdraw(amount);
		}

		@Override
		public String type() {
			// TODO Auto-generated method stub
			return type;
		}

		@Override
		public double discount() {
			// TODO Auto-generated method stub
			return discount;
		}
		public SavingsAccount getSc() {
			return SavingsAccount.this;
		}
		
	}
	
	public FixedSalary getEmployee() {
		return employee;
	}
	
	public SavingsAccount.Debitcard getDcard() {
		return Dcard;
	}
	
	public SavingsAccount(FixedSalary em) {
		this.employee = em;
		this.Dcard = new SavingsAccount.Debitcard();
		this.Dcard.setCardnumber(em.securityNumber);
		this.employee.Acc = this;
//		Dcard.sc = this;
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean out=false;
		if(super.money>=amount) {
			super.money-=amount;
			out=true;
		}
		
		return out;
	}

	@Override
	public boolean deposit(double amount) {
		money+=amount;
		return true;
	}

}
