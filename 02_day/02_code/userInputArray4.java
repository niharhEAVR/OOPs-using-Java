import java.util.Scanner;
public class userInputArray4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        System.out.println("Enter the values of the array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) { // for 2d array this si how you can find the length of the row
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The values of array: ");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}