public class conditional_operator8 {
    public static void main(String[] args) {
        int x = 8;
        if (x == 9) {
            System.out.println("hello");
        } else if (x > 8) {
            System.out.println("hi");
        } else if (x >= 3 && x <= 7)
            System.out.println("no");
        else if (x % 2 == 0)
            System.out.println("even");
        else
            System.out.println("no man");

        // ternary operator:
        int y = 10;
        boolean result = y == 10 ? true : false;
        System.out.println(result);


        
        // switch statement:
        String slug = "sunday";
        switch (slug) {
            case "sunday", "monday":
                System.out.println("wake up 8am");
                break;
            default:
                System.out.println("wake up 6am");
                break;
        }

        switch (slug) {
            case "sunday" -> System.out.println("sunday");
            // in this new syntax of switch we dont need (break;)
            case "wednesday" -> System.out.println("wednesday");
            default -> System.out.println("sleep");
        }
        
        String Value = "";
        Value = switch(slug){
            case "sunday" -> "hello cooldude";
            default -> "omg";
        };
        // this code will store the case returned value
        System.out.println(Value);

        String Value2 = "";
        Value2 = switch(slug){
            case "monday" : yield "hello cooldude";
            default : yield "omg";
        };
        // this code will store the case returned value
        System.out.println(Value2);
    }
}
