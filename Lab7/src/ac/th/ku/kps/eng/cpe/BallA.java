package ac.th.ku.kps.eng.cpe;

public class BallA extends Ball implements RollAble {	
	
	public BallA(String tM) {
		super(tM);
	}
	
	@Override
	public void inflate(double n) {
		System.out.println(super.getTraedMark()+"'s ball is inflated "+n+" cu.ft.");
		
	}
	
	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println(super.getTraedMark()+" rolls rather smoothly");
		
	}
	
}
