package Animals;

import Food.*;

public class Fish extends Herbivore implements Swim {

    @Override
    public void swim() {
        System.out.println("Сом плавает в реке.");
    }

    public void eat(Food food) {
        String herbivoreFood = "Сом ест мелких ракообразных ";
        String grass = "Сом ест мальков.";
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
            System.out.println("Сом не хищная рыба.");
        }

    }


}
