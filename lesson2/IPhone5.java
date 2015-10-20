package lesson2;

public class IPhone5 extends IPhone {
	public IPhone5(String number) {
		super(number);
		System.out.println("IPhone5 constructor "+number);
		screenSize = 4;
		imei = "1111111";
	}

	/*
	 * @Override public void call(String number) { System.out.println(
	 * "IPhone class is calling " + number); }
	 */ // ������ �.�. ����� final
	
	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);
	}
}