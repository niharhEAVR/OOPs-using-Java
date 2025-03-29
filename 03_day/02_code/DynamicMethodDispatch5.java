class Computer {
    void show() {
        System.out.println("Processor");
    }
}

class laptop extends Computer {
}

public class DynamicMethodDispatch5 {
    public static void main(String[] args) {
        Computer obj = new laptop();
        obj.show();
    }
}