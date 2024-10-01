import java.util.*;
public class union {

    public static ArrayList<Integer> unionArr(int arr1[], int n, int arr2[], int m) {

        TreeSet<Integer> st = new TreeSet<>();

        for(int i = 0; i<n; i++) {
            st.add(arr1[i]);
        }

        for(int i = 0; i<m; i++) {
            st.add(arr2[i]);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele : st) {
            arr.add(ele);
        }

        return arr;
    }
    public static void main(String[] args) {
        
        int n = 10;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
        int m = 7;
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> arr = unionArr(arr1, n, arr2, m);
        for(int i = 0; i<arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
