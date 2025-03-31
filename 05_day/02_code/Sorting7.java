import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting7 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        
        list.add(87);
        list.add(52);
        list.add(116);
        list.add(94);
        
        Collections.sort(list, (a, b) -> (a % 10) - (b % 10));
        System.out.println(list);


    }
}
