package th.ac.ku.kps.cpe.Lab3;

public class TestBox {
	public static void main(String[] args) {
		Box b1 = new Box(3,4,5);
		
		b1.getVolume();
		
//		b1.setDimension(3, 4, 5);
		System.out.println(b1.getVolume());
		
		b1.resizeBox(b1, 2);
		b1.showSize();
		System.out.println(b1.getVolume());
		
	}
}
