public class string7 {
    public static void main(String[] args) {

        // string and its different methods
        String name = new String("Harsh");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" Mehta"));

        String name2 = "Nomad";
        System.out.println(name2);
        System.out.println(name2.hashCode());
        System.out.println(name2.charAt(3));
        System.out.println(name2.concat(" Subham"));

        System.out.println("------------");

        System.out.print("Array to string: ");
        String[] random = { "hola", "amigo", "kese", "thik", "ho" };
        System.out.println(String.join(" ", random));

        System.out.print("String to array: ");
        String token = "Bearer <token> fkjh497tfch08y434978ft.f9784f";
        String[] stringArr = token.split(" ");
        System.out.print("[ ");
        for (int i = 0; i < stringArr.length; i++) {
            if (i < stringArr.length - 1)
                System.out.print(stringArr[i] + ", ");
            else
                System.out.print(stringArr[i]);
        }
        System.out.println(" ]");

        System.out.println("------------");

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Rocks!");
        sb.insert(0, "Hey, "); // Adds 'Hey, ' at index 0.
        sb.replace(0, 3, "Blop"); // this will start from 0th position and stops at 2nd position
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Boom Boom!");

        sb2.append(" Babam!");
        sb2.insert(4, "Babam");
        sb2.delete(0, 4);
        sb2.delete(5, 11);
        
        System.out.println(sb2);
        sb.reverse();
        System.out.println(sb);
    }
}