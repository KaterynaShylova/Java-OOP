/*�������� ��������� ����������, ������� ����� ���������� �����,���������� �� ����� �����, �� ������ ���� 
�������� ������� ������������� �������. */

package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask1 {
	
	public static void main(String[] args) {
		Map<String, String> voc = new HashMap<String, String>();
		voc.put("������", "hello");
		voc.put("����", "bye");
		voc.put("����", "go");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����:");
		String s = scan.nextLine();
		System.out.println(voc.get(s));
	}

}
