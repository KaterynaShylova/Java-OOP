package lesson3;

public class Triangle extends Figure{
	private double sideA;
	private double sideB;
	private double angle;
	
	public Triangle(int xPOS, int yPOS, double sideA, double sideB, double angle) {
		super(xPOS, yPOS);
		this.sideA = sideA;
		this.sideB = sideB;
		this.angle = angle;
	}
	
	@Override
	public String getname(){
		return "Triangle";
	}
	
	@Override
	public double getSquare(){
		return ((sideA*sideB)*Math.sin(angle))/2;
	}

}
