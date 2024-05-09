package Animals;

import Food.*;

public class Bear extends Carnivorous implements Run, Swim, Voice {

    @Override
    public void swim() {
        System.out.println("Медведь плавает в реке и ищет рыбу");
    }


    @Override
    public void run() {
        System.out.println("Медведь бегает по вольеру!");
    }

    @Override
    public String voice() {
        System.out.println("Медведь ревет: Бэээббррр.");
        return "Бэээббррр";
    }

    public void eat(Food food) {
        if (food instanceof Pork) {
           System.out.println("Медведь ест свинину.");
        } else if (food instanceof Chiken) {
            System.out.println("Медведь ест курицу.");
        } else if (food instanceof Beef) {
            System.out.println("Медведь ест говядину.");
        } else {
            System.out.println("Медведь не травоядное животное!");


        }
    }
}
