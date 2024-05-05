package Animals;

import Food.*;

public class Bear extends Carnivorous implements Run, Swim,Voice {

    @Override
    public void swim() {
        System.out.println("Медведь плавает в реке и ищет рыбу");
    }


    @Override
    public void run() {
        System.out.println("Медведь бегает по вольеру!");
    }

    @Override
    public String voice () {
        System.out.println("Медведь ревет: Бэээббррр.");
      return "Бэээббррр";
    }

    public void eat(Food food) {
        String meatMammals = "Медведь ест мясо млекопетающих ";
        String meatFish = "Медведь ест мясо рыбы.";
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
            System.out.println("Медведь не травоядное животное!");
        }

        }
    }
