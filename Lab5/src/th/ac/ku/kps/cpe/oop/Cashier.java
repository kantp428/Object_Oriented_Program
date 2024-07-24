package th.ac.ku.kps.cpe.oop;

public class Cashier {
	private String name;
	
	public Cashier(String name) {
		this.name = name;
	}
	
	public void printReceipt(InventoryCart ic) {
		System.out.println(" Pumpkin Shop ( " + this.name + " )");
		
//		for(Product i : ic.getCart()) {
//			if(i==null) break; 
//			System.out.println(i.getName()+" "+i.getCode()+" "+i.getPrice());
//		}
		
		double sum = 0;
		for(Product i : ic.getNew()) {
			if(i==null) break;
			int amount=0;
			for(Product j : ic.getCart()) {
				if(j==null) break;
				if(i.getCode()==j.getCode()) {
					sum+=i.getPrice();
					amount+=1;
				}
			}
			System.out.println(amount+" x "+i.getName()+"\t("+i.getCode()+")\t"+i.getPrice());
		}
		System.out.println("\t--------------------");
		System.out.println("\t\tTotal\t\t"+sum+"$");
	}
	
	
	
}
