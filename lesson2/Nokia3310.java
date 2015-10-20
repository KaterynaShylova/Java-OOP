package lesson2;

public class Nokia3310 extends Phone {
	public Nokia3310(String number) {
		super(number);
		System.out.println("Nokia3310 constructor "+number);
		touch = false;
		hasWifi = false;
		screenSize = 2;
		countCalls = 0;
		countSMS = 0;
		//this.number = number;
		
	}

	@Override
	public void call(String number) {
		super.call(number);
		System.out.println("Nokia3310 class is calling " + number);
		countCalls++;
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
		countSMS++;
	}
}