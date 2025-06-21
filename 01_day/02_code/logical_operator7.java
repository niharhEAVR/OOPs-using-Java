public class logical_operator7 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int x = 10;
        int y = 10;

        System.out.println("Logical AND:");
        System.out.println("true & true   → " + (a & true));    // true
        System.out.println("true & false  → " + (a & b));       // false
        System.out.println("false & false → " + (b & b));       // false

        System.out.println("\nLogical OR:");
        System.out.println("true | true   → " + (a | true));    // true
        System.out.println("true | false  → " + (a | b));       // true
        System.out.println("false | false → " + (b | b));       // false

        System.out.println("\nLogical NOT:");
        System.out.println("!true   → " + (!a));                 // false
        System.out.println("!false  → " + (!b));                 // true

        System.out.println("\nShort-circuit AND:");
        System.out.println("true && true   → " + (a && true));   // true
        System.out.println("true && false  → " + (a && b));      // false
        System.out.println("false && true  → " + (b && a));      // false

        System.out.println("\nShort-circuit AND with side-effect:");
        boolean result = (x < 5) && (++y > 10); //  but here the y++ won't do its opetration
        System.out.println("Result: " + result);   // false
        System.out.println("y after short-circuit AND: " + y);  // Still 10

        System.out.println("\nShort-circuit OR:");
        System.out.println("true || false   → " + (a || b));      // true
        System.out.println("false || true   → " + (b || a));      // true
        System.out.println("false || false  → " + (b || false));  // false

        System.out.println("\nShort-circuit OR with side-effect:");
        result = (x < 5) || (++y > 10); 
        System.out.println("Result: " + result);   // true
        System.out.println("y after short-circuit OR: " + y);  // 11
    }
}
