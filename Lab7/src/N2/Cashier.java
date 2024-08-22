package N2;

public class Cashier {
	private double discount=0;
	private InventoryCart ic;
	
	public void doPayment(InventoryCart ic, DebitCard card) {
		System.out.println("\t   CARD TYPE: "+card.type());
		String[] last = card.cardnumber.split("-");
		System.out.println("      CARD Number: xxx-xxx-"+last[2]);
		discount = card.discount();
		
		this.ic = ic;
	}
	
	public void printReceipt() {
		System.out.println("\t    Pumpkin Shop");
		
		double sum = 0;
		for(Product i : ic.getNew()) {
			if(i==null) break;
			int amount=0;
			for(Product j : ic.getCart()) {
				if(j==null) break;
				if(i.getClass().getSimpleName().equals(j.getClass().getSimpleName())) {
					double value_i;
					double value_j;
					if(i.getClass().getSimpleName().equals("Milk")) {
						value_i = i.getVolumn();
						value_j = j.getVolumn();
					}else {
						value_i = i.getWeight();
						value_j = j.getWeight();
					}
					if(value_i==value_j) {
						sum+=i.getPrice();
						amount+=1;
					}					
				}
//				
//				if(i.getClass().getSimpleName().equals("Milk")) {
//					value = "CC "+i.getVolumn();
//				}else {
//					value = "Gram "+i.getWeight();
//				}
				////////////////////////////////////////////////////////////////
			}
			System.out.println("\t"+amount+" x "+i.getClass().getSimpleName()+"\t"+i.getPrice());
		}
		System.out.println("\t----------------------\n");
		System.out.println("\t   CARD DISCOUNT "+discount+"%\n");
		System.out.println("\tTotal\t\t"+(sum*(1-(discount/100)))+"$");
	}
	
	
	
}