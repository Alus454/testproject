package exercises_presentations;

public class Cow implements Animal {

    private String sound;

    public Cow(){
        this.sound = "Muu Muu";
    }

    public String makeSound() {
        return this.sound;
    }
}
