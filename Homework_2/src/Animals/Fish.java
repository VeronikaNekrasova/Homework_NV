package Animals;

import Food.*;

public class Fish extends Herbivore implements Swim {

    @Override
    public void swim() {
        System.out.println("Сом плавает в реке.");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof FreshGrass) {
            System.out.println("Сом ест свежую траву.");
        } else if (food instanceof Hay) {
            System.out.println("Сом ест сено.");
        } else if (food instanceof Foliage) {
            System.out.println("Сом ест листву деревьев.");
        } else {
            System.out.println("Сом не хищное животное!");
        }
    }

}



