import java.util.Scanner;

public class LargestNum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("Enter three values: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("The largest number is: " + num1);
                } else {
                    System.out.println("The largest number is: " + num3);
                }
            } else {
                if (num2 > num3) {
                    System.out.println("The largest number is: " + num2);
                } else {
                    System.out.println("The largest number is: " + num3);
                }
            }
            i++;
        }
        sc.close();
    }
}
