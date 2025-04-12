abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Calculating area of shape...");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class Abstraction5 {
    public static void main(String[] args) {
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 7);

        s2.display();
        System.out.println("Rectangle area: " + s2.area());

        s3.display();
        System.out.println("Triangle area: " + s3.area());
    }
}