/*������� �-� ������� ���������� ������� � ����������� ��� ���������� �� ����.
 */
package lesson10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask2 {
	private static String[] menu = {"1. ���� �������", "2. �������", "3. ��������� ������� � ����", "4. ������� ������� �� ����� �� �����", "5. �����"};
	private static Map<String, String> voc = new HashMap<String, String>();
	
	public static void addWord(String s1, String s2){
		voc.put(s1, s2);
	}
	
	public static void translate(String s){
		System.out.println(voc.get(s));
	}
	
	public static void saveToFile(Map<String, String> voc){
		try{
			FileOutputStream fos = new FileOutputStream("C:\\Program Files (x86)\\Eclipse_WorkSpace\\vocabulary.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try{
				oos.writeObject(voc);
			} finally{
				oos.close();
			}
		} catch(IOException e){
			e.getStackTrace();
		} 
	}
	
	public static void printVoc(String path){
		try{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try{
				System.out.println(ois.readObject());
			} catch(ClassNotFoundException ex){
				ex.getStackTrace();
			}finally{
				ois.close();
			}
		}catch(IOException e){
			e.getStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		voc.put("������", "hello");
		voc.put("����", "bye");
		voc.put("����", "go");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ����� ����:");
		for(String temp: menu)
			System.out.println(temp);
		boolean runWhile = true;
		while(runWhile){
			String s = scan.nextLine();
			switch(s){
			case "1":{
				System.out.println("������� ����� ��� �������:");
				String s1 = scan.nextLine();
				System.out.println("������� ������� ������� �����:");
				String s2 = scan.nextLine();
				addWord(s1, s2);
			};break;
			case "2":{
				System.out.println("������� �����:");
				String word = scan.nextLine();
				translate(word);
			}; break;
			case "3":{
				saveToFile(voc);
			};break;
			case "4": {
				printVoc("C:\\Program Files (x86)\\Eclipse_WorkSpace\\vocabulary.txt");
			};break;
			case "5": {
				runWhile = false;
				System.out.println("��������� ���������");
			}; break;
			default: System.out.println("�������� ����� ����");

		}
		}
	}

}
