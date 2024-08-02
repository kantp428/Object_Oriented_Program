package th.ac.ku.kps.eng.cpe.oop;
import java.lang.reflect.Field;

public class Cashier {
	private String name;
	
	public Cashier(String name) {
		this.name = name;
	}
	
	static boolean checkField(Class<?> C, String name) {
		boolean result = false;
		Field[] fields = C.getDeclaredFields();
		
		for(Field i: fields) {
			if(i.getName().equals(name)) {
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public void printReceipt(InventoryCart ic) {
		System.out.println(" Pumpkin Shop ( " + this.name + " )");
		
		double sum = 0;
		for(Product i : ic.getNew()) {
			String value = null;
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
				
				if(i.getClass().getSimpleName().equals("Milk")) {
					value = "CC "+i.getVolumn();
				}else {
					value = "Gram "+i.getWeight();
				}
				////////////////////////////////////////////////////////////////
			}
			System.out.println(amount+" x "+i.getClass().getSimpleName()+"\t"+i.getPrice()+"\t"+value);
		}
		System.out.println("\t--------------------");
		System.out.println("\t\tTotal\t\t"+sum+"$");
	}
	
	
	
}