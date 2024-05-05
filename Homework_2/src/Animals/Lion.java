package Animals;

import Food.*;

public class Lion extends Carnivorous implements Run, Swim, Voice {

    @Override
    public void swim() {
        System.out.println("Лев плавает в реке, чтобы охладиться.");
    }


    @Override
    public void run() {
        System.out.println("Лев бегает по вольеру!");
    }

    @Override
    public String voice() {
        System.out.println("Лев рычит: РрррррРрррр.");
        return "РрррррРрррр";
    }

    public void eat(Food food) {
        String meatMammals = "Лев ест мясо млекопетающих ";
        String meatFish = "Лев ест мясо рыбы.";
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

