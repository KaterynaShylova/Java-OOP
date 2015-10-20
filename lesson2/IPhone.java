package lesson2;

public class IPhone extends Phone {
	protected String imei;

	public IPhone(String number) {
		super(number);
		System.out.println("IPhone constructor "+number);
		touch = true;
		hasWifi = true;
		screenSize = 3;
		countCalls = 0;
		countSMS = 0;
		//this.number = number;
	}

	@Override
	final public void call(String number) {
		super.call(number);
		System.out.println("IPhone class is calling " + number);
		countCalls++;
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);
		countSMS++;
	}
	
	@Override
	public void answer(String number) {
		System.out.println(number + " IPhone class is answering ");
	}
}
