/*Создать поток, который создаст 50 потоков, каждый из которых выведет на экран свой номер и дождется, пока его прервут.
Прерывание дочерних потоков должно выполнятся из потока их порождающего.
 */
package lesson6;

import java.util.ArrayList;
import java.util.List;

public class HomeTask4 {
	
	public static class MyThread extends Thread{
		
		public void run(){
			System.out.println(getId());
			while(! isInterrupted()){
				try{
				Thread.sleep(1);
				}catch(InterruptedException e){
					return;
				}
			}
		}
	}
	
	public static class MyMainThread extends Thread{
		
		public void run(){
			List<MyThread> list = new ArrayList<MyThread>();
			for(int i=0; i<50; i++){
				MyThread m = new MyThread();
				m.start();
				list.add(m);
			}
			for(MyThread n: list)
				n.interrupt();
			
			while(! isInterrupted()){
				try{
				Thread.sleep(1);
				}catch(InterruptedException e){
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MyMainThread t = new MyMainThread();
		t.start();
	}
}
