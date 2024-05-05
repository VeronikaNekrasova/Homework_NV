import Animals.Crocodile;
import Animals.Fish;
import Animals.Swim;
import Animals.Duck;

public class Pond {
    Swim[] pond = new Swim[3];

    public Pond() {
        pond[0] = new Duck();
        pond[1] = new Fish();
        pond[2] = new Crocodile();
    }

    public void animalsSwimPond() {
        for (Swim animal : pond) {
            animal.swim();
        }


    }
}