package ac.th.ku.kps.eng.cpe;

public abstract class Ball {
	private String traedMark;
	
	public Ball(String tM) {
		this.traedMark = tM;
	}
	
	public String getTraedMark() {
		return traedMark;
	}
	
	public abstract void inflate(double n);

}

	
