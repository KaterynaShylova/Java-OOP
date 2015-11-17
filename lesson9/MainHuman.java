package lesson9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class MainHuman {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
		Human h1 = new Human("Ivan", "Fedotov", LocalDate.of(1985, 2, 14));
		Human h2 = new Human("Olga", "Sinina", LocalDate.of(1990, 7, 25));

		Human h3 = (Human) h1.clone();

		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Program Files (x86)\\Eclipse_WorkSpace\\human.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeObject(h1);
				oos.writeObject(h2);
				oos.writeObject(h3);
			} finally {
				oos.close();
			}
			
			Human h11, h22, h33;
			FileInputStream fis = new FileInputStream("C:\\Program Files (x86)\\Eclipse_WorkSpace\\human.txt");
			ObjectInputStream oin = new ObjectInputStream(fis);
			try {
			h11 = (Human) oin.readObject();
			h22 = (Human) oin.readObject();
			h33 = (Human) oin.readObject();
			System.out.println(h11.toString());
			System.out.println(h22.toString());
			System.out.println(h33.toString());
			} finally {
			oin.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
