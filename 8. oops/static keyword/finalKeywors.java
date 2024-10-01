// final class - can't be inherited
// final method - can't be overridden

final class Bike {
    void run() {
        System.out.println("running the bike");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("running safely");
    }
}

public class finalKeywors {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
        Bike bike = new Bike();
        bike.run();
    }
}
