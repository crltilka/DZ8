package DZ8;

public class Crucian extends Animal implements Swim, Eat{
    public Crucian(String name, int age, double weight) {
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
        System.out.println("Crucian carp eats: " + "Vegetation");
    }

    @Override

    public void Swim(){
        System.out.println("crucian carp swims in: " + "lakes");
    }

}
