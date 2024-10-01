import java.util.*;

public class findMaxMin {

    static int calculateMax(int arr[], int n) {

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int calculateMin(int arr[], int n) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = calculateMax(arr, n);
        int min = calculateMin(arr, n);

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
