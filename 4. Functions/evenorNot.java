import java.util.*;
public class evenorNot {
    
    static boolean isEven(int n) {

        if(n % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isEven(n)) {
            System.out.println(n + " is even");
        }
        else {
            System.out.println("Not even");
        }
    }
}
