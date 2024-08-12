import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        
        int a = 0;
        int b = 1000;
        
        for(int i = a; i<=b; i++) {
            int temp = i;
            int sum = 0;
            while(temp > 0) {
                int ld = temp % 10;
                sum += ld * ld * ld;
                temp /= 10;
            }

            if(sum == i) {
                System.out.println(i);
            }
        }
    }    
}
