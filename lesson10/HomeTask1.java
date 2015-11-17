/*Написать программу переводчик, которая будет переводить текст,написанный на одном языке, на другой язык 
согласно заранее составленному словарю. */

package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask1 {
	
	public static void main(String[] args) {
		Map<String, String> voc = new HashMap<String, String>();
		voc.put("привет", "hello");
		voc.put("пока", "bye");
		voc.put("идти", "go");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите слово:");
		String s = scan.nextLine();
		System.out.println(voc.get(s));
	}

}
