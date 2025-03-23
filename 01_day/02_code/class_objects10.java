class Calculator {
    public int add(int a,int b) {
        System.out.println("Addition is: " + (a + b));
        return 0;
    }
}

public class class_objects10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        Calculator calc = new Calculator();
        calc.add(a, b);

    }
}
