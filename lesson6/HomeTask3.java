/*Создать 100 потоков, каждый из которых выведет на экран свой номер и дождется, пока его прервут.
 */
package lesson6;

import java.util.ArrayList;
import java.util.List;

public class HomeTask3 {
	
	public static class NumberThread extends Thread{
		
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
	
	public static void main(String[] args) {
		try{
			List<NumberThread> list = new ArrayList<NumberThread>();
			for(int i=0; i<100; i++) {
				NumberThread l = new NumberThread();
				l.start();
				list.add(l);
			}
		
			for(NumberThread n: list)
				n.interrupt();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
