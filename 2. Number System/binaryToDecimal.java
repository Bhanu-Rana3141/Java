import java.util.*;

public class binaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int temp = n;

        int decimal = 0;
        int power = 1;

        while(n > 0) {
            int unitDigit = n % 10;
            decimal += unitDigit * power;
            power *= 2;
            n /= 10;
        }

        System.out.println("binary : " + temp + " , decimal : " + decimal);
    }
}