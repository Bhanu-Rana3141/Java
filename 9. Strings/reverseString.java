import java.util.*;
public class reverseString {

    public static void reverse(StringBuilder sb) {
        
        int i = 0;
        int j = sb.length()-1;

        while(i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();


        StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        reverse(sb);

        System.out.println(sb);
    }
}

