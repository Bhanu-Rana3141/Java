import java.util.*;
public class stringCompression {
    
    public static void print(char chars[]) {

        for(char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    } 

    public static int compress(char chars[]) {

        int i = 0;
        int n = chars.length;
        int ansIndex = 0;

        while(i < n) {
            int j = i+1;
            while(j < n && chars[i] == chars[j]) {
                j++;
            }
            int count = j-i;

            chars[ansIndex++] = chars[i];

            if(count > 1) {
                String cnt = Integer.toString(count);
                for(char ch : cnt.toCharArray()) {
                    chars[ansIndex++] = ch;
                }
            }
            i = j;
        }
        return ansIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        // sc.nextLine();
        
        // char chars[] = new char[n];
        // for(int i = 0; i<n; i++) {
        //     chars[i] = sc.next().charAt(0);
        // }

        String str = sc.next();
        char[] chars = str.toCharArray();

        print(chars);
        int ans = compress(chars);
        print(chars);
        System.out.println(ans);
    }

    
}
