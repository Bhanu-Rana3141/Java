import java.util.*;
public class countPalindromes {

    public static boolean isPalindrome(String s, int i, int j) {

        while(i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 >= 'A' && ch1 <= 'Z') {
                ch1 = (char)(ch1 - 'A' + 'a');
            }

            if(ch2 >= 'A' && ch2 <= 'Z') {
                ch2 = (char)(ch2 - 'A' + 'a');
            }

            if(ch1 != ch2) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
  
    public static int countPalindromes(String s) {
        
        int cnt = 0;
        int i = 0;
        int j = 0;
        int n = s.length();

        while(j < n) {
            if((s.charAt(j) == ' ') || (j == n-1)) {
                if(j == n-1) {
                    if(isPalindrome(s, i, j)) cnt++;
                    break; 
                }
                else {
                    if(isPalindrome(s, i, j-1)) cnt++;
                }
                i = j+1;
                j = i;
                continue;
            }
            j++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        int totalPalindromes = countPalindromes(s);
        System.out.println("palindromes : " + totalPalindromes);

    }
}
