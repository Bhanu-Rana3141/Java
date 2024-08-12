import java.util.*;
public class checkPrime {
    
    static boolean isPrime(int n) {

        if(n == 0 || n == 1) return false;
        for(int i = 2; i<n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(isPrime(n)) {
            System.out.println(n + " is prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
