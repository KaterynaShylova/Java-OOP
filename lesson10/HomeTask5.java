/* Написать программу «База данных пользователей» с функциями добавления, удаления, поиска и вывода информации 
о пользователе по номеру. */
package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeTask5 {

	private static Map<Integer, User> map = new HashMap<Integer, User>();
	private static String[] menu = { "1. Добавить пользователя", "2. Удалить пользователя", "3. Найти пользователя",
			"4. Вывести инфо", "5. Выход" };
	private static Integer n = 1;
	
	public static void add(String name, String surname){
		map.put(n, new User(name, surname));
		n++;
	}
	
	public static void delete(Integer number){
		map.remove(number);
	}
	
	public static void find(Integer number){
		Set<Integer> set = map.keySet();
		if(set.contains(number))
			System.out.println("Есть пользователь с таким номером");
		else System.out.println("Пользователь не найден");
	}
	
	public static void toPrint(Integer number){
		Set<Map.Entry<Integer, User>> entry = map.entrySet();
		for(Map.Entry<Integer, User> en : entry){
			if(en.getKey()==number)
				System.out.println(en.getValue().toString());
			else System.out.println("Пользователь не найден");
		}
	}

	public static void main(String[] args) {
		for (String s : menu)
			System.out.println(s);
		Scanner scan = new Scanner(System.in);
		boolean rw = true;
		while (rw) {
			String m = scan.nextLine();
			switch (m) {
			case ("1"):{
				System.out.println("Введите имя пользователя:");
				String name = scan.nextLine();
				System.out.println("Введите фамилию пользователя:");
				String surname = scan.nextLine();
				add(name, surname);
			}; break;
			case ("2"):{
				System.out.println("Введите номер пользователя для удаления:");
				Integer number = scan.nextInt();
				delete(number);
			}; break;
			case ("3"):{
				System.out.println("Поиск по номеру:");
				Integer number = scan.nextInt();
				find(number);
			}; break;
			case ("4"):{
				System.out.println("Введите номер пользователя:");
				Integer number = scan.nextInt();
				toPrint(number);
			}; break;
			case ("5"): {
				rw = false; 
				System.out.println("Программа завершена");
				}; break;

			}
		}

	}

}
