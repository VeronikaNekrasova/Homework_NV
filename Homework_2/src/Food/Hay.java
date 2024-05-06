package Food;

public class Hay extends Food implements Grass{

    @Override
    public void eat() {
        System.out.println("Ест " + getName());
    }

    public Hay(String name) {
        super(name);


    }
}
