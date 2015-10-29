/*Написать программу, которая скопирует несколько файлов в один.
Подумать как для этого использовать java.io.SequenceInputStream. */

package lesson5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class HomeTask7 {

	public static void unionFiles(String dir, String full) throws IOException {
		File f = new File(dir);
		File[] fileList = f.listFiles();

		Vector<InputStream> inputStreams = new Vector<InputStream>();
		for (File t : fileList) {
			FileInputStream in = new FileInputStream(t);
			inputStreams.add(in);
		}

		Enumeration<InputStream> enu = inputStreams.elements();
		SequenceInputStream sis = new SequenceInputStream(enu);
		try {
			FileOutputStream out = new FileOutputStream(full);
			try {
				byte[] buf = new byte[1024];
				int r;
				do {
					r = sis.read(buf, 0, buf.length);
					if (r > 0)
						out.write(buf, 0, r);
				} while (r > 0);

			} finally {
				out.close();
			}
		} finally {
			sis.close();
		}

	}

	public static void main(String[] args) {
		try{
		unionFiles("C:\\Program Files (x86)\\Eclipse_WorkSpace\\test1\\","C:\\Program Files (x86)\\Eclipse_WorkSpace\\test1\\all.txt");
		} catch(Exception e){
			e.printStackTrace();
		}

	}
}
