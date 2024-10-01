import java.util.*;
public class capitaliseFirstAlphabet {

    public static void capitalise(StringBuilder sb) {
        
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        int i = 1;
        int j = 1;
        int n = sb.length();

        while(j < n) {
            if(sb.charAt(j) == ' ') {
                j += 1;
                i = j;
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
            j++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        capitalise(sb);

        System.out.println(sb.toString());

    }
}
