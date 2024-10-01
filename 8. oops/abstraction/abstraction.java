// abstraction class can't be instantiated , can have abstract as well as non-abstract methods
// abstract methods dont have body, implemented by subclass

package abstraction;

public class abstraction {
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelerate();
        c1.brake(4);
    }
}

abstract class Vehicle {
    abstract void accelerate();
    abstract int brake(int wheels);
}

class Car extends Vehicle {

    void accelerate() {
        System.out.println("Car is accelerating");
    }

    int brake(int wheels) {
        System.out.println("Car brakes are pushed");
        return wheels;
    }
}