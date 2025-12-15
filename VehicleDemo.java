abstract class Vehicle {
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}

class Car extends Vehicle {
    private double d, t, dis;

    Car(double d, double t, double dis) {
        this.d = d;
        this.t = t;
        this.dis = dis;
    }

    double calculateSpeed() {
        return d / t;
    }

    double calculateVelocity() {
        return dis / t;
    }
}

class Bike extends Vehicle {
    private double d, t, dis;

    Bike(double d, double t, double dis) {
        this.d = d;
        this.t = t;
        this.dis = dis;
    }

    double calculateSpeed() {
        return d / t;
    }

    double calculateVelocity() {
        return dis / t;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(10, 5, 10);
        Vehicle bike = new Bike(20, 10, 20);

        System.out.println("Car speed: " + car.calculateSpeed());
        System.out.println("Car velocity: " + car.calculateVelocity());

        System.out.println("Bike speed: " + bike.calculateSpeed());
        System.out.println("Bike velocity: " + bike.calculateVelocity());
    }
}