package Homework_1;

import Homework_1.Model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Том", 4, "Мяу");
        Kotik kotik2 = new Kotik();
        kotik2.setName("Джери");
        kotik2.setWeight(4);
        kotik2.setMeow("Мяяу");

        kotik1.liveAnotherDay();
        System.out.println("Первого котика зовут " + kotik1.getName()+". Он весит: "+kotik1.getWeight()+" килограмма.");

        System.out.println("Мяукают ли котики одинакого? " + kotik1.getMeow().equals(kotik2.getMeow()));

        System.out.println("Всего котиков создано: " + Kotik.getCatCount());
    }
}


