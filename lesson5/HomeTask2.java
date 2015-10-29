package lesson5;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

/*Ќаписать рекурсивную ф-ю дл€ вывода на экран всех файлов и каталогов, им€ которых
длиннее 5 символов и втора€ буква равна СAТ.
 */
public class HomeTask2 {
	
	static class MyFileFilter implements FilenameFilter {

		public MyFileFilter() {
		}

		public boolean accept(File dir, String name) {
			return (name.length()>5 && (name.charAt(1)=='a' || name.charAt(1)=='A'));
		}
	}
	
	public static void showList(String path, ArrayList<String> list) throws IOException{
		File dir = new File(path);
		File[] fileList = dir.listFiles(new MyFileFilter());
		
		if(fileList == null) return;
		
		for(File f:fileList){
				if(f.isFile()) list.add(f.getCanonicalPath());
				else{
					showList(f.getCanonicalPath(), list);
				}
		}
		
	}

	
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();
		try{
		showList("E:\\‘ильмы\\", list);
		} catch(Exception e){
			System.out.println("Directory is not found");
		}
		
		for (String s : list)
			System.out.println(s);
		
	}
}
