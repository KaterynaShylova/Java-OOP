package lesson2;

public class Engine {
    private double mileage;
    private boolean started;
    private double volume;
    private double spentFuel;
    
    public double getSpentFuel() {
		return spentFuel;
	}

	public void setSpentFuel(double spentFuel) {
		if (started)
		this.spentFuel += spentFuel;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Engine(double mileage, double volume) {
        this.mileage = mileage;
        this.volume=volume;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }
    
    
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }
}
