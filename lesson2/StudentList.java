package lesson2;

import java.util.Date;

public class StudentList {
	private Student[] list = new Student[5];
	private int p = 0;
	
	public void add(Student s) {
		if(p<list.length)	list[p++] = s;
		else System.out.println("Студент " +s.getName()+" "+s.getSurname()+ " не может быть добавлен так как список закончен");
	}
	
	public void delete(String surname){
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname)){
				for(int j=i;j<p-1;j++){
				list[j]=list[j+1];
				}
				p=p-1;
			}				
		}		
	}
	
	public Student get(int n) {
		return list[n];
	}
	
	public int find(String name) {
		for (int i = 0; i < p; i++) {
			if (list[i].getName().equalsIgnoreCase(name))
				return i;
		}
		
		return -1;
	}
	
	public int findSurname(String surname) {
		for (int i = 0; i < p; i++) {
			if (list[i].getSurname().equalsIgnoreCase(surname))
				return i;
		}
		
		return -1;
	}
	
	public int findBirth(Date birth) {
		for (int i = 0; i < p; i++) {
			if (list[i].getBirth().equals(birth))
				return i;
		}
		
		return -1;
	}
	
	public void print(){
		for (int i = 0; i < p; i++) {
			System.out.println(list[i].getName()+" "+list[i].getSurname());
			}
	}
}
