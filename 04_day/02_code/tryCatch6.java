public class tryCatch6 {
    public static void main(String[] args) {

        int a = 12;
        int[] arr = new int[5];
        int result;

        // exceptions are for handling the checks where the error occurs
        try {
            result = a / 4;
            System.out.println(result);
            System.out.println(arr[6]);
        } catch (ArithmeticException e) { // this exception will only checks any arithmetic problems
            System.out.println("Something problem: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {  // this exception will only checks any array problems
            System.out.println(e);
        } catch(Exception e){ // or we can use the `Exception` this word for all the checkings
            System.out.println(e);
        } finally{
            System.out.println("Exiting...");
        }

    }
}
