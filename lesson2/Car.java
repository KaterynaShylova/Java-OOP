package lesson2;

public class Car {
	   private String name;
	    private Engine engine; // мотор
	    private Climate climate = new Climate(); // климат-контроль
	    
	    public Car(String name, double volume) {
	        this.name = name;
	        engine = new Engine(0, volume);
	    }
	    
	    public Car(String name, double mileage, double volume) {
	        this.name = name;
	        engine = new Engine(mileage, volume);
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public double getMileage() {
	        return engine.getMileage();
	    }
	    
	    public double getSpentFuel() {
	    	return engine.getSpentFuel();
	    }
	    
	    // завести мотор
	    public void turnOn() {
	        engine.turnOn();
	        climate.turnOn();
	        climate.setTemperature(21);
	    }
	    
	    // заглушить мотор
	    public void turnOff() {
	        climate.turnOff();
	    	engine.turnOff();
	    }
	    
	    // установить скорость
	    public void start(int speed, double hours) {
	        if (engine.isStarted()) { // еще не заведен мотор
	        	// пройденная дистанция
	        	double distance = hours * speed;
	        	engine.addMileage(distance);
	        	//потрачено топлива
	        	int volume = (int)(engine.getVolume());
	        	double spentFuel;
	        	switch(volume){
	        		case(1): spentFuel=0.06*distance;break;
	        		case(2): spentFuel=0.07*distance;break;
	        		case(3): spentFuel=0.08*distance;break;
	        		default: spentFuel=0.08*distance;break;
	        	}	
	        	engine.setSpentFuel(spentFuel);
	        }
	    }
    	
}
