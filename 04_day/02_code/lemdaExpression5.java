@FunctionalInterface
interface showing { // functional interface is a interface with only one method
    void show();
}

@FunctionalInterface
interface addition {
    void add(int a, int b);
}

@FunctionalInterface
interface subtraction {
    int sub(int a, int b);
}

public class lemdaExpression5 {
    public static void main(String[] args) {

        showing obj = () -> { // this is called lemda expression and its only valid for functional interfaces
            System.out.println("In show");
        };
        obj.show();

        addition obj2 = (a,b)->System.out.println("addition is: " + (a + b));
        
        obj2.add(10, 20);


        subtraction obj3 = (a,b) -> a-b; // curly bracket needs return keyword
        int result = obj3.sub(10,5);
        System.out.println(result);
    }
}