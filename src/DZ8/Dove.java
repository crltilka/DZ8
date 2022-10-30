package DZ8;

public class Dove extends Animal implements Fly, Eat, Speak{
    public Dove(String name, int age, double weight) {
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
        System.out.println("The pigeon is eating: " + "grain");
    }

    public void Speak(){
        System.out.println("The pigeon is talking: " + "chik-cherik");
    }

    @Override

    public void Fly(){
        System.out.println("Dove flies in: " + "to the sky");
    }
}
