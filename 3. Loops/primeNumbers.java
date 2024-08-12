import java.util.*;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n == 0 || n == 1) {
            System.out.println(n + " is Neither prime nor composite");
        }
        else if(n == 2) {
            System.out.println(n + " is prime");
        }
        else {
            boolean isPrime = true;
            for(int i = 2; i<n; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(n + " is prime number");
            }
            else {
                System.out.println(n + " not a prime number");
            }
        }
    }
}
