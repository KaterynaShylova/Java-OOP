/* –ешить задачу подсчета повтор€ющихс€ элементов в массиве с помощью HashMap.
 */
package lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeTask3 {

	public static void main(String[] args) {
		//int[] vector = new int[10];
		//for(int i=0; i<vector.length; i++)
		//	vector[i]=(int)(10*Math.random());
		String[] vector = {"1", "3", "2", "2", "7", "0", "1", "4", "4", "6"};
		
		for(String n: vector)
			System.out.print(n);
		System.out.println();
		
		Map<String, String> map = new HashMap<String, String>();
		for(int i=0; i<vector.length; i++)
			map.put(vector[i], ""+i);
		
		//вывод map на экран
		//Set<Map.Entry<String,String>> set = map.entrySet();
		//for (Map.Entry<String, String> entry : set)
		//System.out.print(entry.getKey());
		//System.out.println();
		
		int res = vector.length - map.size();
		System.out.println("Res = " + res);


	}

}
