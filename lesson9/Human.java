/* 1. Написать класс «человек». Реализовать его методы clone, equals, hashCode, toString.
 * 2. Реализовать возможность сериализации для класса «человек».
*/

package lesson9;

import java.io.Serializable;
import java.time.LocalDate;

public class Human implements Cloneable, Serializable{
	private String name;
	private String surname;
	private LocalDate birthDate;
	private int dnk;
	
	public static final long serialVersionUID = 1L;
	
	public Human(String name, String surname, LocalDate birthDate) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		dnk = (int) (100000*Math.random());
	}
	
	@Override
	public String toString(){
		return name + " " + surname + ", " + birthDate + ", DNK =" + dnk;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Human h = (Human) super.clone();
		h.birthDate = (LocalDate) birthDate.now();
		return h;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(this == obj)
			return true;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Human comp =(Human) obj;
		return( this.name.equals(comp.name) && this.surname.equals(comp.name) && this.birthDate.equals(comp.birthDate));// && this.dnk==comp.dnk);
	}
	
	@Override
	public int hashCode(){
		return dnk^birthDate.getYear()^birthDate.getMonthValue()^birthDate.getDayOfYear();
	}

	public int getDnk() {
		return dnk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
