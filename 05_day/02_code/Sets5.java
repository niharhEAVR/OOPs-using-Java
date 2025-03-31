import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets5 {
    public static void main(String[] args) {

        
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(9);
        nums.add(3);
        nums.add(5);
        nums.add(8);
        // set sorts the array and no duplication
        System.out.println(nums);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());
        // hasNext() checks that values iterator does have an next values or not
        // next() gives new values
    }
}
