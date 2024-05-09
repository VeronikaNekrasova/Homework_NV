package Animals;

import Food.*;

public class Elephant extends Herbivore implements Run, Swim, Voice {
    @Override
    public void swim() {
        System.out.println("Слон плавает в реке, чтобы охладиться.");
    }


    @Override
    public void run() {
        System.out.println("Слон быстро передвигается по вольеру!");
    }

    @Override
    public String voice() {
        System.out.println("Слон низкочастотные звуки: ВвввввЫЫЫввв.");
        return "ВвввввЫЫЫввв";
    }

    @Override
    public void eat(Food food) {
        if (food instanceof FreshGrass) {
            System.out.println("Слон ест свежую траву.");
        } else if (food instanceof Hay) {
            System.out.println("Слон ест сено.");
        } else if (food instanceof Foliage) {
            System.out.println("Слон ест листву деревьев.");
        } else {
            System.out.println("Слон не хищное животное!");
        }
    }
}

