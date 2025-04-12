class Shapes {
    public void area() {
        System.out.println("Every shape has its own area");
    }

    public int area(int length, int height, int width) {
        return length * height * width;
    }

    public int area(int length, int height) {
        return length * height;
    }

    public double area(double me) {
        return me;
    }
}

class Circle extends Shapes {
    public void area() {
        System.out.println("The area of circle is: pie*r*r");
    }
}

class Cube2 extends Shapes {
    public void area() {
        System.out.println("The area of cube is: l*w*h");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Shapes shape1 = new Circle();
        Shapes shape2 = new Cube2();

        shape1.area();
        shape2.area();

        int circleArea = shape1.area(4, 5);
        int cubeArea = shape2.area(3, 4, 5);
        double random = shape2.area(78);

        System.out.println("Calculated area of rectangle: " + circleArea);
        System.out.println("Calculated area of cube: " + cubeArea);
        System.out.println("Random: " + random);
    }
}
