import java.util.*;

public class primeNumbersFromAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        for(int i = a; i<=b; i++) {
            if(i == 0 || i == 1) continue;
            boolean flag = true;
            for(int j = 2; j<=i/2; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) System.out.print(i + " ");
        }
    }    
}
