import java.util.*;

public class  main {
    public static void main(String[] args) {
        Human bhanu = new Human(21, "Bhanu", 10000000, false);
        Human rana = new Human(21, "Rana", 20000000, true);

        System.out.println(bhanu.name);
        System.out.println(bhanu.age);
    }   
}
