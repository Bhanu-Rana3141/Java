import java.util.*;
public class rearrangePositiveNegative {

    public static void main(String[] args) {
        
        int arr[] = {1,2,-4,-5};
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                neg.add(arr[i]);
            }
            else {
                pos.add(arr[i]);
            }
        }

        for(int i = 0; i < arr.length/2; i++) {
            System.out.print(pos.get(i) + " ");
            System.out.print(neg.get(i) + " ");
        }   
    }
}
