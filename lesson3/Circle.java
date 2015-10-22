package lesson3;

public class Circle extends Figure{
	private double radius;
	
	public Circle(int xPOS, int yPOS, double radius){
		super(xPOS, yPOS);
		this.radius = radius;
	}

	@Override
	public String getname(){
		return "Circle";
	}
	
	@Override
	public double getSquare(){
		return Math.PI*radius*radius;
	}

}
