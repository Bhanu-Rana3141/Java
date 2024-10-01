import java.util.Scanner;

public class checkPalindrome {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
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
        String str = sc.next();
        
        if(isPalindrome(str)) {
            System.out.println(str + " is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
