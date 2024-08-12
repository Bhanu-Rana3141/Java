import java.util.*;
public class implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element : ");
        int ele = sc.nextInt();

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                if(arr[i][j] == ele) {
                    System.out.print("( " + i + " , " + j + " )");
                    break;
                }
            }
        }
    }
}
