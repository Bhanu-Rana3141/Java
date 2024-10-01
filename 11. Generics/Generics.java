import java.util.*;

class Dog<P1, P2> {

    P1 id;
    P2 age;

    Dog(P1 id, P2 age) {
        this.id = id;
        this.age = age;
    }

    P1 getId() {
        return id;
    }

    void setId(P1 id) {
        this.id = id;
    }
}

public class Generics {

    public static void main(String[] args) {
        
        Dog<String, Integer> d1 = new Dog<>("dog 1", 5);
        Dog<String, Integer> d2 = new Dog<>("dog 2", 10);
        Dog<String, Integer> d3 = new Dog<>("dog 3", 15);

        System.out.println(d1.id + " , " + d1.age);
        System.out.println(d2.id + " , " + d2.age);
        System.out.println(d3.id + " , " + d3.age);

        d1.setId("doggggg 1");
        System.out.println("get func: " + d1.getId());
        System.out.println(d1.id + " , " + d1.age);

    }
}
