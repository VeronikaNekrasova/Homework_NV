package Animals;

import Food.*;

public class Crocodile extends Carnivorous implements Run, Swim, Voice {

    @Override
    public void swim() {
        System.out.println("Крокодил плавает в реке, чтобы охладиться.");
    }


    @Override
    public void run() {
        System.out.println("Крокодил ползает по вольеру!");
    }

    @Override
    public String voice() {
        System.out.println("Крокодил издает звуки: Фррргрррррр.");
        return "Фррргрррррр";
    }

    public void eat(Food food) {
        String meatMammals = "Крокоди ест мясо зебры ";
        String meatFish = "Крокодил ест мясо рыбы.";
        super.eat(food);
        boolean isEat = food instanceof Meat;
        if (isEat) {
            int eatToday = (int) (Math.random() * 2);
            switch (eatToday) {
                case 0:
                    System.out.println(meatMammals);
                    break;
                case 1:
                    System.out.println(meatFish);
                    break;
            }
        } else {
            System.out.println("Лев не травоядное животное!");
        }

    }
}

