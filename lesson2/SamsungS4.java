package lesson2;

public class SamsungS4 extends Phone {
	public SamsungS4(String number) {
		super(number);
		System.out.println("SamsungS4 constructor "+ number);
		touch = false;
		hasWifi = true;
		screenSize = 5;
		countCalls = 0;
		countSMS = 0;
		//this.number = number;
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		System.out.println("SamsungS4 is calling " + number);
		countCalls++;
	}
	
	@Override
	public void sendSMS(String number, String message){
		System.out.println("SamsungS4 class is sending sms "+" Hello. " + message + " to " + number);
		countSMS++;
	}
}
