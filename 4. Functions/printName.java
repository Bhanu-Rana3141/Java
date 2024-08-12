import java.util.Scanner;
public class printName {
    
    static void print(String name) {
        System.err.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        print(name);

    }
}
