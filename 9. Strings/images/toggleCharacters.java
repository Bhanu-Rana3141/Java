import java.util.*;

public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i = 0; i<sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 'a' + 'A');
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            }
            sb.setCharAt(i, ch);
        }
        System.out.println(sb);
    }
}