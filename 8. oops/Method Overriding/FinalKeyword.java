class Bike {
    final void run() {
        System.out.println("parent class bike running");
    }
}

class Bullet extends Bike {
    // final void run() {
    //     System.out.println("bullet overriding");
    // }
}

class BulletClassic extends Bullet {
    // void run() {
    //     System.out.println("bullet classic overriding");
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // Bullet bullet = new Bullet();
        // bullet.run();
        
        BulletClassic bullet2 = new BulletClassic();
        bullet2.run();
        
    }
}
