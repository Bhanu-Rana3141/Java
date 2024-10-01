import java.util.*;
public class hashset {
    public static void main(String[] args) {
        
        // TC - O(1) - added using hashset
        // Set<Integer> st = new HashSet<>(); // elements are added in random order

        // Set<Integer> st = new LinkedHashSet<>(); //  elements are added in same order

        // TC - O(log n) - implemented using binary search tree
        Set<Integer> st = new TreeSet<>(); // elements - unique, sorted order  
        st.add(1);
        st.add(20);
        st.add(15);
        st.add(23);

        System.out.println(st);
        st.remove(20);
        System.out.println(st);

        System.out.println(st.contains(15));

        for(int num : st) {
            System.out.print(num + " ");
        }
    }   
}
