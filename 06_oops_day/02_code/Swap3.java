class Number {
    int num;

    Number(int num) {
        this.num = num;
    }
}

public class Swap3 {
    public static void main(String[] args) {
        Number a = new Number(10);
        Number b = new Number(20);
        
        System.out.println(a.num + " " + b.num);
        swap(a, b);
        System.out.println(a.num + " " + b.num);
    }

    static void swap(Number a, Number b) {
        int temp = a.num;
        a.num = b.num;
        b.num = temp;
    }
}