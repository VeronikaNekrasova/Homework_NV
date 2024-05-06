package Food;

public class Pork  extends Food implements Meat {
    @Override
    public void eat() {
        System.out.println("Ест " + getName());
    }

    public Pork(String name) {
        super(name);


    }
}