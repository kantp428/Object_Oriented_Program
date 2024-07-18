package th.ac.ku.kps.cpe.Lab3;

public class Vector {
	public double x;
	public double y;
	public double z;
	
	public Vector(double p1, double p2, double p3) {
		x = p1;
		y = p2;
		z = p3;
	}
	
	public Vector() {
		this(0,0,0);
	}
	
	public void printVector() {
		System.out.printf("(%.0f,%.0f,%.0f)\n",x,y,z);
	}
}
