import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int cnt = 0;
        for(int i = 1; i<=n; i++) {
            if(i % 2 != 0) cnt++;
        }
        
        System.out.println("odd : " + cnt);
    }
}
