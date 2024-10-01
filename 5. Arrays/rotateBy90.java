public class rotateBy90 {
    
    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void reverse(int arr[]) {
        
        int n = arr.length;
        int s = 0;
        int e = n-1;

        while(s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {

        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int n = arr.length;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<i; j++) {
                swap(arr, i, j);
            }
        }

        for(int i = 0; i<n; i++) {
            reverse(arr[i]);
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
