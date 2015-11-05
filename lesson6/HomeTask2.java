/*Создать поток, который будет каждые 10 секунд выводить текущее время на экран. 
  Сделать возможность прерывания потока с помощью команды с консоли.
*/

package lesson6;

import java.time.LocalTime;
import java.util.Scanner;

public class HomeTask2 {
	
	public static class ShowTime extends Thread {
		
		public void run() {
			while(! isInterrupted()){
				LocalTime time = LocalTime.now();
				System.out.println(time);
				try{
					Thread.sleep(10000);
				} catch(InterruptedException e){
					System.out.println("Thread is interrupted");
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		try{
			ShowTime t = new ShowTime();
			t.start();
			Scanner scan = new Scanner(System.in);
			System.out.println("Остановить поток? y/n");
			String s = scan.next();
			if(s.equals("y")) t.interrupt();
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
