public class throw7 {
    public static void main(String[] args) {

        double a = 500;
        int[] arr = new int[5];
        double result;

        try {
            result = a/15;
            System.out.println(arr[0]);
            System.out.println(result);
            throw new ArithmeticException("Babam Babam!!"); // this is how you can throw any kind of errors but the exception name
        } catch(Exception e){ 
            System.out.println(e);
        } finally{
            System.out.println("Exiting...");
        }

    }
}
