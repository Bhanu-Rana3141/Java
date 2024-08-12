import java.util.Scanner;

public class printString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.println(name);
        System.out.println(name.charAt(4));
    }

}
