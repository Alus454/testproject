package exercises_presentations;

import java.util.ArrayList;
import java.util.List;

public class zadania_11_sda {

    public static void main(String[] args) {
        Cow krowa = new Cow();
        Cat kot = new Cat();
        Dog pies = new Dog();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(krowa);
        listOfAnimals.add(kot);
        listOfAnimals.add(pies);
        for (Animal zwierze : listOfAnimals) {
            System.out.println(zwierze.makeSound());
        }
    }
}
