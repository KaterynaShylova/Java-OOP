//// Написать метод, который создаст список, положит в него 10 элементов, затем удалит первые два и последний, а
//// затем выведет результат на экран.

package lesson8;

import java.util.ArrayList;
import java.util.List;

public class HomeTask2 {
	
	public static void list(){
		List<String> list = new ArrayList<>();
		for (int i=0; i<10; i++){
			list.add("A"+i);
		}
		
		//for(int i=0; i<10; i++)
		//	System.out.println(list.get(i));
		
		list.subList(0, 2).clear();
		int size = list.size();
		list.remove(size-1);
		
		for(String s: list)
			System.out.println(s);
	}

	public static void main(String[] args) {
		HomeTask2.list();


	}

}
