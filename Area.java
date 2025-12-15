abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class Area {
    public static void main(String[] args) {
        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(8, 6);

        r.area();
        t.area();
    }
}
