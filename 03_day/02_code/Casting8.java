class Aa {
    void show1() {
        System.out.println("In Aa show");
    }
}

class Bb extends Aa {
    void show2() {
        System.out.println("In Bb show");
    }
}

public class Casting8 {
    public static void main(String[] args) {
        Aa obj = (Aa) new Bb(); // this is called upcasting
        obj.show1();

        Bb obj2 = (Bb) obj;
        obj2.show1();
        obj2.show2();
    }
}
