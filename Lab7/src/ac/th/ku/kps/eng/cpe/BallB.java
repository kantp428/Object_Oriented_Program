package ac.th.ku.kps.eng.cpe;

public class BallB extends BallA {

	public BallB(String tM) {
		super(tM);
	}
	
	@Override
	public void inflate(double n) {
		System.out.println(super.getTraedMark()+"'s ball is inflated "+n+" cu.ft.");
		
	}
	
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println(super.getTraedMark()+" rolls smoothly");
		
	}
	
}
