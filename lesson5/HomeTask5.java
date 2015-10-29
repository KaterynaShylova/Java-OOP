/*Написать программу, которая создаст текстовый файл и запишет в него
список файлов (путь, имя, дата создания) из заданного каталога. */

package lesson5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class HomeTask5 {
	
	public static  void logFiles(String dir) throws Exception {
		File f = new File(dir);
		File[] listFiles = f.listFiles();
		
		//FileOutputStream res = new FileOutputStream("c:\\logfiles.txt");
		FileWriter res = new FileWriter("C:\\Program Files (x86)\\Eclipse_WorkSpace\\logfiles.txt");
		try{
			for(File t: listFiles){
				res.write("Путь: "+ t.getCanonicalPath()+"; имя файла: "+t.getName()+"; дата создания: " + t.lastModified()+"\n");
			}
			
		}finally{
			res.close();
		}
	}
	
	
	public static void main(String[] args) {
		try{
		logFiles("C:\\Program Files (x86)\\Eclipse_WorkSpace\\test1\\");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
