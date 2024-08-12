import java.util.*;

public class factorial {
    
    static int recursiveApproach(int n) {
        if(n == 0) return 1;
        return n * recursiveApproach(n-1);
    }

    static int calculateFactorial(int n) {
        int fact = 1;
        for(int i = 1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.println("factorial of " + n + " : " + calculateFactorial(n));
        System.out.println("factorial of " + n + " : " + recursiveApproach(n));
    }
}
