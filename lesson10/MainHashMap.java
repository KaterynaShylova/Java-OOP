package lesson10;

import java.util.Set;

import lesson10.HomeTask6.Entry;

public class MainHashMap {

	public static void main(String[] args) {		
		HomeTask6 <String, String> s = new HomeTask6 <String, String>();
		
		s.put("1", "value1");
		s.put("2", "value2");
		s.put("3", "value3");
		System.out.println(s.containsValue("value2"));
		Set<Entry<String, String>> set = s.entrySet();
		for(Entry<String, String> temp: set)
			System.out.println(temp.getKey()+" "+temp.getValue());
		Set<String> k = s.keySet();
		for(String temp: k)
			System.out.print(temp + ", ");

	}
}
