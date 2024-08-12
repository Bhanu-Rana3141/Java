import java.util.*;
public class printTable {

    static void print(int n) {
        for(int i = 1; i<=10; i++) {
            // if(i == 10) {
            //     System.out.print(n*i);
            //     continue;
            // }
            System.out.println(n * i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        print(n);

    }
}