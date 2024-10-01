import java.util.*;
public class implementation {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println("list : " + list);
        
        System.out.print("For loop: ");
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.print("ForEach loop: ");
        for(int it : list) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
