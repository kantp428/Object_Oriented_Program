package N2;

public class InventoryCart {
	private int item;
	private Product[] Cart;
	private Product[] New;
	private int index = 0;
	private int Newindex = 0;
	
	public InventoryCart(int item) {
		this.item = item;
		Cart = new Product[item];
		New = new Product[item];
	}
	
	public Product[] getCart() {
		return Cart;
	}
	
	public Product[] getNew() {
		return New;
	}
	
	public int getItem() {
		return item;
	}
	
	public void add(Product p) {
		if(this.index<item) {
			Cart[index] = p;
			index++;
		}else {
			System.out.println("Full cart already cannot add more.");
		}
		boolean found = false;
		////////////////////////////////////////////////////////////////////////////////
		for(Product i : New) {
			if(i==null) break;
			if(i.getClass().getSimpleName().equals(p.getClass().getSimpleName())) {
				double value_i, value_p;
				if(i.getClass().getSimpleName().equals("Milk")) {
					value_i = i.getVolumn();
					value_p = p.getVolumn();
				}else {
					value_i = i.getWeight();
					value_p = p.getWeight();
				}
				if(value_i==value_p) {		
					found = true;
					break;
				}
			}
		}
		if(!found) {
			New[Newindex] = p;
			Newindex++;
		}
	}
	
	public void getAllProdect() {
		for(int i=0; i<this.item; i++) {
			Cart[i] = null;
		}
		index = 0;
	}

}