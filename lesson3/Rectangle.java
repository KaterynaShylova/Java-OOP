package lesson3;

public class Rectangle extends Figure{
	private double sideA;
	private double sideB;
	
	public Rectangle(int xPOS, int yPOS, double sideA, double sideB) {
		super(xPOS, yPOS);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	@Override
	public String getname(){
		return "Rectangle";
	}
	
	@Override
	public double getSquare(){
		return sideA*sideB;
	}

}
