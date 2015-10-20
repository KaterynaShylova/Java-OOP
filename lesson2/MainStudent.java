package lesson2;

import java.util.Date;

public class MainStudent {
	public static void main(String[] args) {
		StudentList sl = new StudentList();
		
		sl.add(new Student("Seva", "Evgienko", new Date(1986, 1, 1)));
		sl.add(new Student("Vasya", "Pupkin", new Date(1970, 3, 28)));
		sl.add(new Student("Ivan", "Ivanov", new Date(1985, 7, 12)));
		sl.add(new Student("Petr", "Karpov", new Date(1981, 10, 4)));
		sl.add(new Student("Tanya", "Veselova", new Date(1979, 9, 29)));
		
		int n = sl.find("Seva");
		System.out.println(sl.get(n).getBirth().toString());
		int m=sl.findSurname("Pupkin");
		System.out.println(sl.get(m).getBirth().toString());
		int p=sl.findBirth(new Date(1986, 1, 1));
		System.out.println(sl.get(p).getName());
		
		sl.print();
		//sl.delete("Ivanov");
		System.out.println("");
		//sl.print();
		
		sl.add(new Student("Vlad", "Titorenko", new Date(1979, 9, 29)));
		sl.print();
	}
}
