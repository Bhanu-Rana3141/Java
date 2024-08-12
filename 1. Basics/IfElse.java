import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("value : ");
        int value = sc.nextInt();

        if(value % 3 == 0 || value % 5 == 0) {
            System.out.print("value is divisible");
        }
        else {
            System.out.print("Value is not divisible");
        }
    }    
}
