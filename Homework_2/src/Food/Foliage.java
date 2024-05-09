package Food;

public class Foliage extends Food implements Grass {
    @Override
    public void eat() {
        System.out.println("Ест " + getName());
    }
    public Foliage(String name) {
        super(name);


    }
}

