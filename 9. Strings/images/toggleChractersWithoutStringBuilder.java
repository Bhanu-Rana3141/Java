import java.util.*;

public class toggleChractersWithoutStringBuilder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String ans = "";
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ans += (char)(ch - 'a' + 'A');
            }
            else if(ch >= 'A' && ch <= 'Z') {
                ans += (char)(ch - 'A' + 'a');
            }
        }
        System.out.println(ans);
    }
}
