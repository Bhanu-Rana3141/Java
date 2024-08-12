import java.util.Scanner;

public class maximumOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println("a is greater : " + a + " , b: " + b + " ,c: " + c);
        }
        else if(b >= c && b >= a) {
            System.out.println("b is greater : " + b + " , a: " + a + " ,c: " + c);
        }
        else {
            System.out.println("c is greater : " + c + " , a: " + a + " ,b: " + b);
        }

    }    
}
