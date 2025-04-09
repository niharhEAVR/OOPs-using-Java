import java.util.Scanner;

public class checkEvenOdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        if (value %2 == 0) {
            System.out.println(value + " is Even");
        } else {
            System.out.println(value + " is Odd");
        }

        sc.close();
    }
}
