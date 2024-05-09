import Animals.*;
import Food.*;


public class Woker {
    public void feed(Animals animal, Food food) {
        animal.eat(food);
    }

    public Animals getVoice(Animals animal) {
        System.out.println(animal.voice());
        return animal;
    }
}
