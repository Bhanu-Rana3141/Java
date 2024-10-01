import java.util.*;
public class checkValidPalindrome {

    public static boolean isValid(char ch) {
        
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }

    public static char toLowerCase(char ch) {

        if(ch >= 'A' && ch <= 'Z') {
            return (char)(ch - 'A' + 'a');
        }
        return ch;
    }

    public static boolean isPalindrome(StringBuilder sb) {

        int start = 0;
        int end = sb.length() - 1;

        while(start <= end) {
            if(sb.charAt(start) != sb.charAt(end)) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(isValid(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        for(int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, toLowerCase(sb.charAt(i)));
        }

        if(isPalindrome(sb)) {
            System.out.println(sb + " is palindrome");
        }
        else {
            System.out.println(sb + " not palindrome");
        }
    }
}
