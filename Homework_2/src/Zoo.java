import Animals.*;
import Food.*;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Fish som = new Fish();
        Elephant elephant = new Elephant();
        Duck duck = new Duck();
        Bear bear = new Bear();
        Crocodile crocodile = new Crocodile();
        Woker ivan = new Woker();

        Food beef = new Beef("мясо говядины");
        Food chiken = new Chiken("мясо курицы.");
        Food pork = new Pork("мясо свиньи.");
        Food hay = new Hay("сено.");
        Food freshGrass = new FreshGrass("свежую траву.");
        Food foliage = new Foliage("листву.");

        Pond pond = new Pond();

        System.out.println("Животные отдыхают в зоопарке.\nМедведь:");
        bear.run();
        bear.swim();
        bear.voice();

        System.out.println("\nКрокодил:");
        crocodile.run();
        crocodile.swim();
        crocodile.voice();

        System.out.println("\nЛев:");
        lion.run();
        lion.swim();
        lion.voice();

        System.out.println("\nУтка:");
        duck.fly();
        duck.swim();
        duck.voice();

        System.out.println("\nСом:");
        som.swim();

        System.out.println("\nСлон:");
        elephant.run();
        elephant.swim();
        elephant.voice();

        System.out.println("\nПришел работник Иван и начал всех животных кормить и тренировать команду голос.Сначала медведя:");
        ivan.getVoice(bear);
        ivan.feed(bear, beef);

        System.out.println("\nПотом крокодила:");
        ivan.getVoice(crocodile);
        ivan.feed(crocodile, hay);

        System.out.println("\nПотом льва:");
        ivan.getVoice(lion);
        ivan.feed(lion, pork);

        System.out.println("\nПотом утку:");
        ivan.getVoice(duck);
        ivan.feed(duck, freshGrass);

        System.out.println("\nПотом сома:");
        ivan.feed(som, chiken);

        System.out.println("\nПотом слона:");
        ivan.getVoice(elephant);
        ivan.feed(elephant, foliage);

        System.out.println("\nТем временем в пруду:");
        pond.animalsSwimPond();


    }
}

