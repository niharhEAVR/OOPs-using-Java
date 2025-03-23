public class literals4 {
    public static void main(String[] args) {
        int binaryNum = 0b101; // binary to decimal
        int hexaNum = 0x7E; // hexa to decimal
        int longNum = 1_00_00_000;
        double bigNum = 7e2;

        int x = 100;
        x++;
        x--;

        System.out.println(binaryNum);
        System.out.println(hexaNum);
        System.out.println(longNum);
        System.out.println(bigNum);
        System.out.println(x);
    }
}
