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
        if (food instanceof Pork) {
            System.out.println("Крокодил ест свинину.");
        } else if (food instanceof Chiken) {
            System.out.println("Крокодил ест курицу.");
        } else if (food instanceof Beef) {
            System.out.println("Крокодил ест говядину.");
        } else {
            System.out.println("Крокодил не травоядное животное!");


        }

    }
}



