package DZ8;

public class Dog extends Animal implements Eat, Speak, Hunting{
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void name() {

    }

    @Override
    public void age() {

    }

    @Override
    public void weight() {

    }

    @Override

    public void Eat(){
        System.out.println("The dog is eating: " + "veal");
    }

    @Override

    public void Speak(){
        System.out.println("Speak: "+ "GAV-GAV");
    }

    @Override
    public void Hunting() {
        System.out.println("The dog is hunting: " + "Сat");
    }
}
