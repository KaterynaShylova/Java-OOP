package lesson2;

public abstract class Phone {
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	protected int countCalls;
	protected int countSMS;
	protected String number;
	protected static Phone[] phoneList = new Phone[100];
	private static int n = 0;

	public Phone(String number) {
		this.number = number;
		System.out.println("Phone constructor");
		phoneList[n]= this;
		n++;
	}

	public boolean isTouch() {
		return touch;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public int getScreenSize() {
		return screenSize;
	}
	
	public int getCountCalls() {
		return countCalls;
	}
	
	public int getCountSMS() {
		return countSMS;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void call(String number) {
		System.out.println("Phone class is calling " + number);
		for(int i=0; i<n; i++){
			//System.out.println(numberList[i]);
			if(phoneList[i].getNumber().equals(number)) phoneList[i].answer(number);
		}
	}

	public abstract void sendSMS(String number, String message);
	
	public void answer(String number) {
		System.out.println(number + "Phone class is answering ");
	}
}