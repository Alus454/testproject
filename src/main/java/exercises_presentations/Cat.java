package exercises_presentations;

public class Cat implements Animal {

    private String sound;

    public Cat(){
        this.sound = "Miau Miau";
    }

    public String makeSound() {
        return this.sound;
    }
}