/*Ќаписать класс, который умеет хранить в себе массив любых типов данных (int, long etc.). –еализовать метод,
который возвращает любой элемент массива по индексу. */

package lesson8;

public class HomeTask3{

	public static void main(String[] args) {
		Integer[] in = {1, 2, 3, 5, 6, 10};
		Container<Integer> c = new Container<Integer>(in);
		
		String[] ms = {"a", "b", "c", "d", "e", "f"};
		Container<String> s = new Container<String>(ms);

		Integer intRes = c.getElem(2);
		String strRes = s.getElem(4);
		
		System.out.println(intRes);
		System.out.println(strRes);
	}

}
