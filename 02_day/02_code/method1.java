class Computer {
    public void playMusic() {
        System.out.println("music is playing");
    }

    public String getMePen() {
        return "pen";
    }

    public int calculator(int a, char c, int b) {
        if (c == '+')
            return a + b;
        else if (c == '-')
            return a - b;
        else if (c == '/')
            return a / b;
        else
            return a * b;
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
    // in java this is called Method Overloading which allows you to create multiple methods with the same name but different parameter lists.
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public double add(double a,int b){
        return a+b;
    }
}

public class method1 {
    public static void main(String[] args) {

        Computer calc = new Computer();
        calc.playMusic();
        String result = calc.getMePen();
        System.out.println("Here is your: " + result);
        int result2 = calc.calculator(10, '-', 20);
        System.out.println(result2);

        calc.add(2, 2);
        calc.add(10, 20, 30);
    }
}