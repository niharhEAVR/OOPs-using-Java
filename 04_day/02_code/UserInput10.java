import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput10 {
    public static void main(String[] args) throws IOException {
        // System.out.print("Enter the number: ");
        // int asciiNum = System.in.read();
        // System.out.println("The ASCII value of entered number is: " + asciiNum);

        /* 1st method of taking input */
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // System.out.print("Enter a number: ");
        // int userInput = Integer.parseInt(br.readLine());
        // System.out.println("The user given input is: " + userInput);
        // br.close();
        
        
        /* 2nd or best or new method of taking input */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput2 = sc.nextInt();
        System.out.println("The user given input is: "+userInput2);
        sc.close();
    }
}