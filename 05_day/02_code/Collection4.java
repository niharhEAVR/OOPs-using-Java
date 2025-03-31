import java.util.List;
import java.util.ArrayList;

public class Collection4 {
    public static void main(String[] args) {

        
        List<Integer> nums = new ArrayList<Integer>(); 
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(4);
        
        System.out.println(nums);
        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(2));
        
    }
}
