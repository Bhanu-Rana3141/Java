import java.util.*;
public class multiply2Numbers {

    static int calculateProduct(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("product: " + calculateProduct(a,b));
    }
}
