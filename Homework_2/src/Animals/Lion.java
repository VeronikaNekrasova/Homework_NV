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

    @Override
    public void eat(Food food) {
        if (food instanceof Pork) {
            System.out.println("Лев ест свинину.");
        } else if (food instanceof Chiken) {
            System.out.println("Лев ест курицу.");
        } else if (food instanceof Beef) {
            System.out.println("Лев ест говядину.");
        } else {
            System.out.println("Лев не травоядное животное!");
        }
    }
}


