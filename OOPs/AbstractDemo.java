/*
 Abstraction allow developer to hide the unneccesary data from user 
 It is something like you make a rule in Abstraction class that every child class of the Abtraction Parent class should have the methode that define in parent class 
 If one of the child class that extends Animal abstracted class don't have the walk() methode then it will throw error as shown in this example .
 */

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

class Elephant extends Animal{
    void speak(){
        System.out.println("Elephant is Speaking");
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
