final class Calc{
    void show(){
        System.out.println("calc show");
    }
    void add(int a, int b){
        System.out.println("a+b = "+(a+b));
    }
}

// class AdvCalc extends Calc{} // This won't possible because you cannot inherit final class

class A{
    final void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    // void show(){} // Cannot override the final method from A
}

public class final6 {
    public static void main(String[] args) {
        final int db = 69; // final means constant
        // db = 911; // you cant do this now


        Calc obj = new Calc();
        obj.show();
        obj.add(db, 11);
    }
}