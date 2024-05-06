package Food;

public class Chiken  extends Food implements Meat {
    @Override
    public void eat() {
        System.out.println("Ест " + getName());
    }

    public Chiken(String name) {
        super(name);

    }
}
