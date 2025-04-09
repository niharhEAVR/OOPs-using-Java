import java.util.Scanner;
public class ReverseString4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String[] sArr = s.split("");
        String revString = "";
        for (int i = sArr.length-1; i >= 0; i--) {
            revString += sArr[i];
        }

        System.out.println(revString);
        sc.close();
    }
}