package lesson3;

public abstract class Figure {
	protected int xPOS;
	protected int yPOS;
	protected String name;
	
	public Figure(int xPOS, int yPOS) {
		this.xPOS = xPOS;
		this.yPOS = yPOS;
	}
	
	public String getname(){
		return "Figure";
	}
	
	public abstract double getSquare();

}
