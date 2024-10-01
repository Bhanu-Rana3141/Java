import java.util.*;
public class oppositeCase {

    public static String opposite(String s) {

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, (char)(ch-'a'+'A'));
            }
            else {
                sb.setCharAt(i, (char)(ch-'A'+'a'));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();

        String ans = opposite(s);
        System.out.println(ans);

    }
}
