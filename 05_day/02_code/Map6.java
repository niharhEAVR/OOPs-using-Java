import java.util.HashMap;
import java.util.Map;

public class Map6 {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        
        students.put("cooldude", 69);
        students.put("random", 19);
        students.put("nonsex", 59);
        students.put("random", 91);
        
        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());
        System.out.println();

        for (String key : students.keySet()) {
            System.out.println(key+" : "+students.get(key));
        }


    }
}
