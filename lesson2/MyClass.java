package lesson2;

public class MyClass {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2);
        Car ferrari = new Car("Ferrari", 20000, 3);
            
        bmw.turnOn();
        ferrari.turnOn();
            
        final int[] speeds = new int[] {20, 60, 100};
            
        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);
            
        bmw.turnOff();
        ferrari.turnOff();
            
        System.out.println(bmw.getName() + ": " + bmw.getMileage());
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage());
        
        System.out.println(bmw.getName() + ": " + bmw.getSpentFuel());
        System.out.println(ferrari.getName() + ": " + ferrari.getSpentFuel());
        
    }
}
