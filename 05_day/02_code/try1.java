import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        // { // 1st example
        //     int num;
        //     Scanner sc = new Scanner(System.in);
        //     try {
        //         System.out.print("Enter the number: ");
        //         num = sc.nextInt();
        //     } finally { // you have to mention close in finally block
        //         sc.close();
        //     }
        //     System.out.println("The number is: " + num);
        // }

        { // 2nd example
            int num;
            try (Scanner sc = new Scanner(System.in);) { // in here you dont need any finally block and its automatically closed
                System.out.print("Enter the number: ");
                num = sc.nextInt();
            }
            System.out.println("The number is: " + num);
        }
    }
}