package Food;

public class Beef extends Food implements Meat {
    @Override
    public void eat() {
        System.out.println("Ест " + getName());
    }

    public Beef(String name) {
        super(name);

    }
}

