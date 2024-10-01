class Calculate {

    static int cube(int x) {
        return x*x*x;
    }
}

public class staticMethod {
    public static void main(String[] args) {
        
        int cube = Calculate.cube(5);
        System.out.println(cube);
        
    }
}
