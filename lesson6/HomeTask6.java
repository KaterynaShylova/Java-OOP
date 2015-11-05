/* Написать программу копирования файла с выводом прогресса в % на консоль. */

package lesson6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeTask6 extends Thread {
	private String fileName;

	public HomeTask6(String fileName) {
		this.fileName = fileName;
	}

		public void run() {
			try {
				File f = new File(fileName);
				long sz = f.length();
				String n = f.getName();
				String dir = f.getParent();
				
				FileInputStream in = new FileInputStream(f);
				try {
					FileOutputStream out = new FileOutputStream(dir+"\\Copy"+n);
					try {
						byte[] buf = new byte[2048];
						int r;
						long p = 0;
						long res;
						long temp;
						do{
							r= in.read(buf, 0, buf.length);
							if(r>0)
								out.write(buf, 0, r);
								temp = (p*100)/sz;
								p = p+buf.length;
								res = (p*100)/sz;
								if(temp!=res)
									System.out.println(res+"%");
						}while(r>0);

					} finally {
						out.close();
					}
				} finally {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				//System.out.println("File not found");
			}

		}
	
	public static void main(String[] args) {
		HomeTask6 t = new HomeTask6("E:\\Фильмы\\Бали3.mp4");
		t.start();
	}
}
