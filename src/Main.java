import DZ8.*;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Tom", 3 , 2.4);
        Dog dog = new Dog("Jack", 6 , 8.5);
        Dove dove = new Dove("Phoenix", 1, 1.2);
        Crucian crucian = new Crucian("Simba", 4, 5.6);
        Lion lion = new Lion("King", 8, 145.2);

        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Weight: "+ cat.getWeight());
        cat.Eat();
        cat.Speak();
        cat.Hunting();

        System.out.println(" ");

        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Weight: " + dog.getWeight());
        dog.Eat();
        dog.Speak();
        dog.Hunting();

        System.out.println(" ");

        System.out.println("Name: " + dove.getName());
        System.out.println("Age: " + dove.getAge());
        System.out.println("Weight: " + dog.getWeight());
        dove.Eat();
        dove.Speak();
        dove.Fly();

        System.out.println(" ");

        System.out.println("Name: " + crucian.getName());
        System.out.println("Age: " + crucian.getAge());
        System.out.println("Weight: " + crucian.getWeight());
        crucian.Eat();
        crucian.Swim();

        System.out.println(" ");

        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Weight: " + lion.getWeight());
        lion.Eat();
        lion.Speak();
        lion.Hunting();
    }
}