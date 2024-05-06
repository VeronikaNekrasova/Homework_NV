package Food;

public class FreshGrass extends Food implements Grass{
    @Override
    public void eat() {
        System.out.println("Ест " + getName());
    }

    public FreshGrass(String name) {
        super(name);

                  }
}