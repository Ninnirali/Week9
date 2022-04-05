package homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */
public class Program9 {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("baby", 1);
        people.put("toddler", 3);
        people.put("child", 10);
        people.put("teen", 13);
        people.put("adult", 21);

        for (Map.Entry<String, Integer> element:people.entrySet()) {
            System.out.println(element);
        }
    }
}
