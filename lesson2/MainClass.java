package lesson2;

public class MainClass {
	public static void main(String[] args) {
		// Phone p = new Phone(); ошибка т.к. класс абстрактный
		Nokia3310 nokia = new Nokia3310("575-18-42");
		System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.sendSMS("567-78-89", "text message");
		nokia.call("344-21-06");
		System.out.println("quantity of calls: "+ nokia.getCountCalls());
		System.out.println("quantity of SMS: "+ nokia.getCountSMS());
		System.out.println("----------------------------------");
		
		IPhone iphone = new IPhone("123-45-67");
		System.out.println("IPhone screen size: " + iphone.getScreenSize());
		iphone.call("575-18-42");
		iphone.sendSMS("567-78-89", "text message");
		System.out.println("quantity of calls: "+ iphone.getCountCalls());
		System.out.println("quantity of SMS: "+ iphone.getCountSMS());
		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5("567-78-89");
		System.out.println("IPhone5 screen size: " + iphone5.getScreenSize());
		iphone5.call("575-18-42");
		iphone5.sendSMS("123-45-67", "text message");
		iphone5.call("344-21-06");
		System.out.println("quantity of calls: "+ iphone5.getCountCalls());
		System.out.println("quantity of SMS: "+ iphone5.getCountSMS());
		System.out.println("----------------------------------");
		
		SamsungS4 samsungS4 = new SamsungS4("344-21-06");
		System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
		samsungS4.call("123-45-67");
		samsungS4.sendSMS("575-18-42", "text message");
		System.out.println("quantity of calls: "+ samsungS4.getCountCalls());
		System.out.println("quantity of SMS: "+ samsungS4.getCountSMS());
		}

}
