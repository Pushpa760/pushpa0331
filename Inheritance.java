class Base {
    Base() {
        System.out.println("Base class constructor called");
    }
}

class DerivedOne extends Base {
    DerivedOne() {
        System.out.println("DerivedOne class constructor called");
    }
}

class DerivedTwo extends Base {
    DerivedTwo() {
        System.out.println("DerivedTwo class constructor called");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Creating object of DerivedOne:");
        DerivedOne d1 = new DerivedOne();

        System.out.println("\nCreating object of DerivedTwo:");
        DerivedTwo d2 = new DerivedTwo();
    }
}
