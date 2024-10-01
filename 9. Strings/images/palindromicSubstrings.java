import java.util.*;

public class palindromicSubstrings {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j<s.length(); j++) {
                if(isPalindrome(s.substring(i, j+1))) {
                    System.out.print(s.substring(i, j+1) + " ");
                    cnt++;
                }
            }
        }
        System.out.println("\n"+ cnt);
    }
}
