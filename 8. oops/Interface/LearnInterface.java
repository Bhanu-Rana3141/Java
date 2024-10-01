public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();
        System.out.println(Animal.LEGS);
    }
}

interface Animal {
    int LEGS = 4; // public static final - object is not created
    void eats();
    void drinks();

    default void walk() {
        System.out.println("Animal is walking");
    }
}

interface Pet {
    void sings();
    void drinks();
}

class Monkey implements Animal, Pet {

    public void eats() {
        System.out.println("Monkey is eating");
    }

    public void sings() {
        System.out.println("Pet is singing");
    }

    public void drinks() {
        System.out.println("Monkey is drinking");
    }
}
