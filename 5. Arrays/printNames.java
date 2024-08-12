import java.util.*;
public class printNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        
        for(int i = 0; i<names.length; i++) {
            names[i] = sc.next();
        }

        for(int i = 0; i<size; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
