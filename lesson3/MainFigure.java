package lesson3;

public class MainFigure {

	public static void main(String[] args) {
		Figure[] list = {
			new Rectangle(1, 2, 5, 8),
			new Triangle(3, 2, 4, 7, 45),
			new Circle(2, 1, 10)
		};
		
		StringBuilder text;
		
		for(Figure f: list){
			text = new StringBuilder()
					.append(f.getname())
					.append(": ")
					.append("square = ")
					.append(f.getSquare());
			System.out.println(text.toString());
		}


	}

}
