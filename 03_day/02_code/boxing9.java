public class boxing9 {
    public static void main(String[] args) {
       int a = 69;
       Integer num = new Integer(a); // this is called boxing
       Integer num2 = a; // this is called auto-boxing


       int b = num.intValue(); // this is called unboxing

       int b2 = num2; // this is called auto-unboxing

       System.out.println(num); 
       System.out.println(num2);
       System.out.println(b);
       System.out.println(b2);

       String bhokto = "13";
       int c = Integer.parseInt(bhokto); // this is called wrapper class
       System.out.println(c);

       // Explore more wrapper class of different datatypes (exp: Integer.  or Double. )
    }
}
