package Animals;

import Food.*;

public class Duck extends Herbivore implements Fly, Voice, Swim {

    @Override
    public void fly() {
        System.out.println("Утка полетела в теплые края.");
    }

    @Override
    public String voice() {
        System.out.println("Утка говорит: Кря-кря.");
        return "Кря-кря.";
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает по реке.");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof FreshGrass) {
            System.out.println("Утка ест свежую траву.");
        } else if (food instanceof Hay) {
            System.out.println("Утка ест сено.");
        } else if (food instanceof Foliage) {
            System.out.println("Утка ест листву деревьев.");
        } else {
            System.out.println("Утка не хищное животное!");
        }
    }

}





