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
        String herbivoreFood = "Утка ест овощи и фрукты.";
        String grass = "Утка ест зерно";
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
            System.out.println("Утка не хищное животное.");
        }

    }


}


