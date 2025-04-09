import java.util.Scanner;

class Sum {
    int num1;
    int num2;

    Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int sum() {
        return this.num1 + this.num2;
    }

}

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two values:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Sum result = new Sum(num1, num2);
        System.out.println("Sum is: " + result.sum());
        sc.close();
    }
}
