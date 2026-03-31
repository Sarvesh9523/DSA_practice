abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse is walking on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.walk();
    }
}
