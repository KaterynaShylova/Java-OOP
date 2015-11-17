//// Написать метод для конвертации массива строк/чисел в список.

package lesson8;

import java.util.ArrayList;
import java.util.List;

public class HomeTask1 {
	
	public static <T> List<T> convert(T[] m){
		List<T> res = new ArrayList<T>();
		for (int i=0; i< m.length;i++)
			res.add(m[i]);		
		return res;
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[10];
		String[] b = new String[5];
		
		List<Integer> a1 = new ArrayList<>();
		a1 = HomeTask1.<Integer>convert(a);

		List<String> b1 = new ArrayList<>();
		b1 = HomeTask1.<String>convert(b);
	}

}
