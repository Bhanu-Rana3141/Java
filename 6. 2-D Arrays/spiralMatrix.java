import java.util.*;
public class spiralMatrix {
    
    public static void main(String[] args) {

        int n = 3;
        int m = 3;
        int arr[][] =  {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        int total = n*m;
        int cnt = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        int sR = 0;
        int sC = 0;
        int eR = n-1;
        int eC = m-1;
        while(cnt < total) {

            // starting row
            for(int i = sC; i <= eC && cnt < total; i++) {
                ans.add(arr[sR][i]);
                cnt++;
            }
            sR++;

            // ending col
            for(int i = sR; i <= eR && cnt < total; i++) {
                ans.add(arr[i][eC]);
                cnt++;
            }
            eC--;

            // ending row
            for(int i = eC; i >= sC && cnt < total; i--) {
                ans.add(arr[eR][i]);
                cnt++;
            }
            eR--;

            // starting col
            for(int i = eR; i >= sR && cnt < total; i--) {
                ans.add(arr[i][sC]);
                cnt++;
            }
            sC++;
        }

        for(int ele : ans) {
            System.out.print(ele + " ");
        }

    }
}