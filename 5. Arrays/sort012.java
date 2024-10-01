import java.util.*;

public class sort012 {

    static void swap(int arr[], int s, int e) {

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
 
    static void sort(int arr[]) {

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}