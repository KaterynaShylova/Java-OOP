/*Написать программу для копирования всех файлов из одного каталога в другой.*/
package lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class HomeTask4 {
	
	public static void copyFiles(String dir1, String dir2) throws Exception {
		File f = new File(dir1);
		File[] listFiles = f.listFiles();
		
		for(File each: listFiles){
			FileInputStream in = new FileInputStream(each);				
			try {
				FileOutputStream out = new FileOutputStream(dir2+each.getName());
				try {
					byte[] buf = new byte[1024];
					int r;
					do {
						r = in.read(buf, 0, buf.length);
						if (r > 0)
							out.write(buf, 0, r);
					} while (r > 0);
				} finally {
					out.close();
				}
			} finally {
				in.close();
			}
		}
	}
	
	
	public static void main(String[] args) {
		try{
			copyFiles("C:\\Program Files (x86)\\Eclipse_WorkSpace\\test1\\", "C:\\Program Files (x86)\\Eclipse_WorkSpace\\test2\\");
		} catch(Exception e){
			System.out.println("Directory is not found");
		}
		
	}
}
