package exercises_presentations;

public class Dog implements Animal {

    private String sound;

    public Dog(){
        this.sound = "Hau Hau";
    }

    public String makeSound() {
        return this.sound;
    }
}