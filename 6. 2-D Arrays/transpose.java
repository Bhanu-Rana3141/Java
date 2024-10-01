import java.util.*;
public class transpose {

    static void print(int arr[][], int n, int m) {
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        print(arr, n, m);

        // Transpose
        for(int col = 0; col < m; col++) {
            for(int row = 0; row < n; row++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}
