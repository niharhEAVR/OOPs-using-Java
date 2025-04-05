class StaticVariable {
    static int var1;
    int var2;

}

public class Static5 {
    public static void main(String[] args) {

        StaticVariable.var1 = 69; // If a variable or method is marked static, you can access it without creating an object.

        // StaticVariable.var2 = 765; // we cant access the normal variable directly

        System.out.println(StaticVariable.var1);

        System.out.println(new StaticVariable().var2);

        greet(); // you cannot access a normal method inside a static method main, you have to make that method static
    }
    
    static void greet(){
        System.out.println("Hello!!");
        
        Static5 obj = new Static5();
        obj.mean();
    }

    void mean(){
        System.out.println("me@n2");
    }
}
