import java.util.*;
public class printLikeWave {

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

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int col = 0; col<m; col++) {
            if(col % 2 == 0) {
                for(int row = 0; row<n; row++) {
                    ans.add(arr[row][col]);
                }
            }
            else {
                for(int row = n-1; row>=0; row--) {
                    ans.add(arr[row][col]);
                }
            }
        }

        for(int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
