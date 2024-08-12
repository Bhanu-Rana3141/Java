import java.util.*;

public class reverseArray {
    
    static void print(int arr[], int n) {
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1; 
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        print(arr, n);
    }
}
