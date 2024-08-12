import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

    static void print(ArrayList<Integer> list) {
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        print(list);

        list.add(1, 10);
        print(list);

        System.out.println(list.get(2));
        list.remove(0);
        print(list);

        Collections.sort(list);
        print(list);
        
    }    
}
