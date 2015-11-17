/* �������� ��������� ����� ������ ������������� � ��������� ����������, ��������, ������ � ������ ���������� 
� ������������ �� ������. */
package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeTask5 {

	private static Map<Integer, User> map = new HashMap<Integer, User>();
	private static String[] menu = { "1. �������� ������������", "2. ������� ������������", "3. ����� ������������",
			"4. ������� ����", "5. �����" };
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
			System.out.println("���� ������������ � ����� �������");
		else System.out.println("������������ �� ������");
	}
	
	public static void toPrint(Integer number){
		Set<Map.Entry<Integer, User>> entry = map.entrySet();
		for(Map.Entry<Integer, User> en : entry){
			if(en.getKey()==number)
				System.out.println(en.getValue().toString());
			else System.out.println("������������ �� ������");
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
				System.out.println("������� ��� ������������:");
				String name = scan.nextLine();
				System.out.println("������� ������� ������������:");
				String surname = scan.nextLine();
				add(name, surname);
			}; break;
			case ("2"):{
				System.out.println("������� ����� ������������ ��� ��������:");
				Integer number = scan.nextInt();
				delete(number);
			}; break;
			case ("3"):{
				System.out.println("����� �� ������:");
				Integer number = scan.nextInt();
				find(number);
			}; break;
			case ("4"):{
				System.out.println("������� ����� ������������:");
				Integer number = scan.nextInt();
				toPrint(number);
			}; break;
			case ("5"): {
				rw = false; 
				System.out.println("��������� ���������");
				}; break;

			}
		}

	}

}
