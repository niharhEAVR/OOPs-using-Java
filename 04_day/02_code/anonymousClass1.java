class A{
    void show(){
        System.out.println("In A show");
    }
}

public class anonymousClass1 {
    public static void main(String[] args) {
        A obj = new A(){
            void show(){
                System.out.println("In new show");
            }
        };

        obj.show(); // if you compile this code you will see somwthing annoymousClass1$1.class on your folder, which creates a new class but anonymously
    }
}