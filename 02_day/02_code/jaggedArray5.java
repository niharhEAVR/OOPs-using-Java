public class jaggedArray5 {
    public static void main(String[] args) {

        int[][] arr = new int[5][]; // This is called jagged array
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];
        arr[3] = new int[7];
        arr[4] = new int[1];

        // This outer loop here is getting the column length of the array and inner
        // loops is finding the length of each rows
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        System.out.println("Array values:");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}