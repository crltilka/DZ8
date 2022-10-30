package DZ8;

public class Lion extends Animal implements  Eat, Speak, Hunting{
    public Lion(String name, int age, double weight) {
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
        System.out.println("The lion is eating: " + "Meat");
    }

    public void Speak(){
        System.out.println("Speak: " + "Rrr" );
    }

    @Override
    public void Hunting() {
        System.out.println("A lion hunts: " + "zebra");
    }
}
