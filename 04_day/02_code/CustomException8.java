class CooldudeException extends Exception {
    public CooldudeException(String s) {
        super(s);
    }
}

public class CustomException8 {
    public static void main(String[] args) {

        double a = 500;
        double result;

        try {
            result = a / 15;
            System.out.println(result);
            throw new CooldudeException("It's my wish");
        } catch (CooldudeException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Exiting...");
        }

    }
}
