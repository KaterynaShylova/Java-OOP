/* Написать программу, которая запросит ввести с консоли информацию о 10 людях, запишет ее на диск, а при следующем
старте прочитает записи и выведет сохраненные данные на экран. Одинаковые записи должны игнорироваться (Set + equals*).
 */
package lesson9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HomeTask3 {
	public static void main(String[] args) {
		String path = "C:\\Program Files (x86)\\Eclipse_WorkSpace\\human2.txt";
		File f = new File(path);

		if (!f.exists()) {
			//записываем информацию в файл
			Scanner scan = new Scanner(System.in);
			System.out.println("Введите данные:");
			try {
				Set<Human> s = new HashSet<Human>();
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				try {
					for (int i = 0; i < 10; i++) {
						System.out.println("Введите имя:");
						String name = scan.nextLine();
						System.out.println("Введите фамилию:");
						String surname = scan.nextLine();
						System.out.println("Введите дату рождения:");
						int year = scan.nextInt();
						int month = scan.nextInt();
						int day = scan.nextInt();
						LocalDate birth = LocalDate.of(year, month, day);
						Human temp = new Human(name, surname, birth);

						Iterator<Human> it = s.iterator();
						int n = 0;
						while (it.hasNext())
							if (it.next().equals(temp))
								n++;
						if (n == 0)
							s.add(temp);
						scan.nextLine();
					}

					Iterator<Human> itNew = s.iterator();
					while (itNew.hasNext())
						oos.writeObject(itNew.next());
				} finally {
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		// считываем из файла
		else {
			try {
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				try {
					while (fis.available() > 0) {
						Human h = (Human) ois.readObject();
						System.out.println(h.toString());
					}
				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				} finally {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
