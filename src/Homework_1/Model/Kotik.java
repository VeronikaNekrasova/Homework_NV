package Homework_1.Model;

import java.util.Random;

public class Kotik {
        private String name;
        private int weight;
        private String meow;
        private int hungryIndicator;
        private static int catCount;

public Kotik(String name, int weight, String meow) {
            this.name = name;
            this.weight = weight;
            this.hungryIndicator = 0;
            this.meow=meow;
            catCount++;
        }

public Kotik() {
            this.hungryIndicator =4 ;
            catCount++;
        }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
            return name;
        }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
            return weight;
        }
    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getMeow() {
        return meow;}

            public static int getCatCount() {
            return catCount;
        }

        public void play() {
            if (hungryIndicator <= 0) {
                System.out.println("Котик голоден!Покорми его, прежде чем играть!");
            } else {
                System.out.println("Котик сыт, давай играть!");
                hungryIndicator--;
            }
        }

        public void sleep() {
            if (hungryIndicator <= 0) {
                System.out.println("Котик голоден!Покорми его, прежде чем отправлять спать!");
            } else {
                System.out.println("Котик устал, пойдет поспит...");
                hungryIndicator--;
            }
        }

        public void chaseMouse() {
            if (hungryIndicator <= 0) {
                System.out.println("Котик голоден!Покорми его, прежде чем играть с мышкой!");
            } else {
                System.out.println("Котик сыт, ура, пошли играть с мышкой!");
                hungryIndicator--;
            }
        }

        public void eat(int hungry) {
            hungryIndicator += hungry;
            if (hungryIndicator > 5) {
                hungryIndicator = 5;}
            System.out.println("Котик ест.");
        }

        public void eat(int hungry, String food) {
            hungryIndicator += hungry;
            if (hungryIndicator > 5) {
                hungryIndicator = 5;}
            System.out.println("Котик проголодался, он поел " + food + "!");
        }

        public void eat() {
            eat(3, "рыбу");
        }

    public void needScratch() {
        if (hungryIndicator <= 0) {
            System.out.println("Котик голоден!Покорми меня, прежде чем гладить!");
        } else {
            System.out.println("Котик сыт, его надо погладить");
            hungryIndicator--;
        }
    }
        public void liveAnotherDay() {
            Random random = new Random();
            for (int i = 1; i <= 24; i++) {
                int catToDo = random.nextInt(4) + 1;
                switch (catToDo) {
                    case 1:
                        play();
                        break;
                    case 2:
                        sleep();
                        break;
                    case 3:
                        chaseMouse();
                        break;
                    case 4:
                        needScratch();
                        break;
                }
                if (hungryIndicator <= 0) {
                    eat();
                    hungryIndicator = Math.min(hungryIndicator + 3, 5);
                               }
                System.out.println("В " + i + " час(а) котик: " + (hungryIndicator > 0 ? "сыт и весело проводит время" : "голоден и просит есть"));


            }

        }
    }


