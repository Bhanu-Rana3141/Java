import java.util.*;
public class swapFirstAndLastCharacter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        System.out.println("sb : " + sb);
        
        char temp = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(sb.length()-1));
        sb.setCharAt(sb.length()-1, temp);

        System.out.println("after swap: " + sb);
    }
}
