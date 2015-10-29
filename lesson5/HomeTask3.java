/*Ќаписать программу, котора€ считает текстовый файл, заменит в нем все
слова УHelloФ на У1234Ф и запишет изменени€ в тот-же файл.
 */
package lesson5;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HomeTask3 {

	public static void convert(String name, ArrayList<String> res) throws IOException{
		FileInputStream in = new FileInputStream(name);
		BufferedReader l = new BufferedReader(new InputStreamReader(in));
		
		ArrayList<String> temp = new ArrayList<>();
		try{
			String c = l.readLine();
			while(c!=null) {
				temp.add(c);
				c = l.readLine();
			} 
		
			for(String s: temp)	{
				s = s.replace("Hello", "1234");
				res.add(s);
			}
		} finally {
			l.close();
		}
		
		FileOutputStream out = new FileOutputStream(name);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream b = new DataOutputStream(baos);
		try{
			for(String s: res){
				b.writeBytes(s);
			}
			byte[] arr = baos.toByteArray();
			out.write(arr);
		} finally{
			out.close();
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		try{
			convert("C:\\Program Files (x86)\\Eclipse_WorkSpace\\test.txt", list);
		} catch(Exception e){
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		for(String s: list) System.out.println(s);
	}
}
