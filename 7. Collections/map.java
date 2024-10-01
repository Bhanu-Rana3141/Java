import java.util.*;
public class map {
    
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);

        // if(!numbers.containsKey("one")) {
        //     numbers.put("one", 4);
        // }

        numbers.putIfAbsent("Two", 10);

        System.out.println(numbers);


        // iterating on map
        System.out.println();
        for(Map.Entry<String, Integer> it : numbers.entrySet()) {
            System.out.print("Entry: " + it + ", key: " + it.getKey() + ", value: " + it.getValue());
            System.out.println();
        }
        System.out.println();

        System.out.println("key set: ");
        for(String key : numbers.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("value set: ");
        for(Integer value : numbers.values()) {
            System.out.print(value + " ");
        }
    }
}
