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

    public void eat(Food food) {
        String herbivoreFood = "Слон ест фрукты.";
        String grass = "Слон ест листья";
        super.eat(food);
        boolean isEat = food instanceof Grass;
        if (isEat) {
            int eatToday = (int) (Math.random() * 2);
            switch (eatToday) {
                case 0:
                    System.out.println(herbivoreFood);
                    break;
                case 1:
                    System.out.println(grass);
                    break;
            }
        } else {
            System.out.println("Слон не хищное животное.");
        }

    }
}
