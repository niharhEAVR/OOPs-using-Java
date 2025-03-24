public class array2 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5}; // this syntex is known for c,c++
        int[] arr2 = {10,9,8,7,6}; // this syntex is for modern java
        int[] arr3 = new int[5]; // this is also for java, and initial values are 0

        System.err.println("First array:");
        for (int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println("\nSecond array:");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.err.println("\nThird array:");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}