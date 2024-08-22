package ac.th.ku.kps.eng.cpe;

public class Program {
	public static void TestBall(BallA a, BallA b, BallA c) {
		System.out.println(a.getTraedMark()+" is a trademark of "+a.getClass().getSimpleName());
		a.inflate(1.0);
		a.roll();
		System.out.println(b.getTraedMark()+" is a trademark of "+b.getClass().getSimpleName());
		b.inflate(1.1);
		b.roll();
		System.out.println(c.getTraedMark()+" is a trademark of "+c.getClass().getSimpleName());
		c.inflate(1.2);
		c.roll();
	}
	
	public static void main(String[] args) {
		BallA bA = new BallA("Zentria");
		BallA bB = new BallB("Zapphire");
		BallA bC = new BallC("Zenith");
		
		TestBall(bA,bB,bC);
	}
}
