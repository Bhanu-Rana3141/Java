import java.util.*;
public class mergeStrings {
    
    public static void main(String[] args) {
        
    String s1 = "abc";
    String s2 = "xyzfh";

    int n = Math.min(s1.length(), s2.length());
    StringBuilder ans = new StringBuilder();

    int i = 0;
    while(i < n) {
        ans.append(s1.charAt(i));
        ans.append(s2.charAt(i));
        i++;
    }

    while(i < s1.length()) {
        ans.append(s1.charAt(i));
        i++;
    }

    while(i < s2.length()) {
        ans.append(s2.charAt(i));
        i++;
    }

    System.out.println(ans);
    }
}