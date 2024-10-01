import java.util.*;
public class reverseWords {

    public static void reverse(StringBuilder sb, int i, int j) {

        while(i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }   
    }

    public static String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();

        reverse(sb, 0, sb.length()-1);

        int i = 0;
        int j = 0;

        while(j < n) {
            if(sb.charAt(j) == ' ') {
                reverse(sb, i, j-1);
                j += 1;
                i = j;
                continue;
            }
            else if(j == n-1) {
                reverse(sb, i, j);
                break;
            }
            j++;
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
