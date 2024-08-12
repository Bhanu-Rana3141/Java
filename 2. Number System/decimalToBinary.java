import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int temp = n;

        int binary = 0;
        int power = 1;

        while(n > 0) {
            int parity = n % 2;
            binary += parity * power;
            power *= 10;
            n = n/2;
        }

        System.out.println("decimal : " + temp + " binary: " + binary );
    }
}
