import java.util.*;

public class removeDuplicates {
    
    public static HashSet<Integer> remove(int arr[]) {

        HashSet<Integer> st = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }

        return st;
    }

    public static void print(HashSet<Integer> st) {

        for(int it : st) {
            System.out.print(it + " ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> st = remove(arr);
        print(st);
    }
}
