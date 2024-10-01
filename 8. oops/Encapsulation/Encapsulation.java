package Encapsulation;

class Encap {
    private String name;
    private int age;
    private int id;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Encap en = new Encap();
        en.setName("James");
        en.setAge(20);
        en.setId(1234);

        System.out.println("name : " + en.getName() + ", age: " + en.getAge() + ", id: " + en.getId());
    }
}