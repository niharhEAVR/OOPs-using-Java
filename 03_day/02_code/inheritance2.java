class Calc {
    int add(int n1, int n2) {
        System.out.println(n1 + n2);
        return 0;
    }

    int sub(int n1, int n2) {
        System.out.println(n1 - n2);
        return 0;
    }
}

class AdvCalc extends Calc { // 'extends' keyword inherits from another class, and this is called single level inheritence
    int mul(int n1, int n2) {
        System.out.println(n1 * n2);
        return 0;
    }

    int div(int n1, int n2) {
        System.out.println(n1 / n2);
        return 0;
    }
}
// here 'AdvCalc' is called sub class and 'Calc' is called super class

class VeryAdvCalc extends AdvCalc { // this class is accessing the AdvCalc and Calc class also, thats why its called multilevel inheritance
    int power(int n1, int n2) {
        System.out.println(Math.pow(n1, n2));
        return 0;
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        Calc a = new Calc();
        a.add(5, 9);
        a.sub(14, 9);

        AdvCalc b = new AdvCalc();
        b.add(10, 40);
        b.mul(3, 6);

        VeryAdvCalc c = new VeryAdvCalc();
        c.power(6, 2);
        c.add(3, 4);
    }
}
