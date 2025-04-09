import java.util.Scanner;
public class Factorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        int result = 1;
        if (value >= 0) {
            if (value == 0) {
                System.out.println("Factorial of "+value+" is: "+result);
            }else{
                for (int i = value; i > 0; i--) {
                    result *= i;
                }
                System.out.println("Factorial of "+value+" is: "+result);
            }
        } else {
            System.out.println("Enter Positive Number!!");
        }
        sc.close();
    }
}
