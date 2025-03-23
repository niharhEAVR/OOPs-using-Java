public class loops9 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            count +=i;
        }
        System.out.println(count);

        String[] name = {"c","o","o","l","d","u","d","e"};
        for (String i : name) {
            System.out.print(i);
        }
        System.out.println();

        char c = 'c';
        do {
            System.out.println("random");
        } while (c!='c');


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
