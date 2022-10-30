package DZ8;

public class Cat extends Animal implements Eat,Speak, Hunting{
    public Cat(String name, int age, double weight) {
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
        System.out.println("The cat is eating: " + "fish");
    }

    @Override
    public void Speak(){
        System.out.println("The cat is talking: " + "mayy");
    }

    @Override
    public void Hunting() {
        System.out.println("The cat is hunting: " + "Mouse");
    }


}
