import java.util.*;
public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
                
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); 
        System.out.print("Enter element: ");
        int ele = sc.nextInt();

        for(int i = 0; i<n; i++) {
            if(arr[i] == ele) {
                System.out.println("element found at index : " + i);
                break;
            }
        }


    }
}
