package th.ac.ku.kps.cpe.oop;

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
	
	public void addProdect(Product p) {
		if(this.index<item) {
			Cart[index] = p;
			index++;
		}else {
			System.out.println("Full cart already cannot add more.");
		}
		boolean found = false;
		
		for(Product i : New) {
			if(i==null) break;
			if(i.getCode().equals(p.getCode())) {
				found = true;
				break;
			}
		}
		if(!found) {
			New[Newindex] = p;
			Newindex++;
		}
	}
	
	public void getProdect(Product p) {
		//
	}
	
	public void getAllProdect() {
		for(int i=0; i<this.item; i++) {
			Cart[i] = null;
		}
		index = 0;
	}

}
