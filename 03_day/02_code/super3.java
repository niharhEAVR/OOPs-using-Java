class A{
    public A(){
        System.out.println("In normal constructor of A");
    }
    public A(int a){
        System.out.println("In parameterized constructor of A");
    } 
}
class B extends A{
    public B(){
        super(9);
        System.out.println("In normal constructor of B");
    }
    public B(int b){
        System.out.println("In parameterized constructor of B");
    } 
}

public class super3 {
    public static void main(String[] args) {
       new B();
    }
}
