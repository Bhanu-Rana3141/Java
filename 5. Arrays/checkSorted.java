import java.util.*;

public class checkSorted {

    static boolean checkSorted(int[] arr, int n) {
        boolean isSorted = true;
        for(int i = 1; i<n; i++) {
            if(arr[i-1] > arr[i]) {
                isSorted = false;
            }
        }
        return isSorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        if(checkSorted(arr, n)) {
            System.out.println("sorted array");
        }
        else {
            System.out.println("not sorted");
        }        
    }
}
