/*������������ ������ ����� ����� � ���� ����� ������ (�1, 2, 3, 4, 4,5�). 
 * ���������� �� ������������� ��������� � ������ � ������� ��������� �� �����. */
package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeTask4 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� ����� ����� �������: ");
		String s = scan.nextLine();
		String[] vector = s.split(",");
		
		for(int i=0; i<vector.length; i++){
			vector[i] = vector[i].trim();
			map.put(vector[i],vector[i]);
		}
		
		Set<Map.Entry<String,String>> set = map.entrySet();
		for (Map.Entry<String, String> entry : set)
		System.out.print(entry.getKey() + ", ");
	}

}
