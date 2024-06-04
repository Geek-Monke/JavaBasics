
interface shape {
    double getArea();
}

class Rectangle implements shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return 2 * 3.14 * radius * radius;
    }
}

class Triangle implements shape {
    private double height;
    private double base;

    public Triangle(double h, double b) {
        height = h;
        base = b;
    }

    @Override
    public double getArea() {
        return height * base;
    }
}

public class area3 {
    public static void main(String[] args) {
        Rectangle ob = new Rectangle(2, 5);
        Circle ob1 = new Circle(5);
        Triangle ob2 = new Triangle(5, 6);
        System.out.println("Area of the rectangle :- " + ob.getArea());
        System.out.println("Area of the circle :- " + ob1.getArea());
        System.out.println("Area of the triangle :- " + ob2.getArea());

    }
}