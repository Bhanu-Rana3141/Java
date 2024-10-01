import java.util.*;
public class gcd {

    public static String gcdOfStrings(String s1, String s2) {

        if(s1.equals(s2)) {
            return s1;
        }
        
        if(s2.length() > s1.length()) {
            return gcdOfStrings(s2, s1);
        }
    
        if(s1.startsWith(s2)) {
            return gcdOfStrings(s1.substring(s2.length()), s2);
        }
        
        return " ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s1: ");
        String s1 = sc.next();
        System.out.print("Enter s2: ");
        String s2 = sc.next();

        String gcd = gcdOfStrings(s1, s2);
        System.out.println("gcd: " + gcd);
    }
}
