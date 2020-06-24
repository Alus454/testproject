package Homework_OPP;

public class Exercise_OOP_1 {

    public static void introduce(String name, String surname) {
        Person person = new Person(name, surname);
        System.out.println(person.name + " " + person.surname);

    }

    public static void person_address(String name, String surname, int age, String street, String city,
                                      String country, int flatNo, int homeNo) {
        Person person = new Person(name, surname, age, street, city, country, flatNo, homeNo);
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.city);
        System.out.println(person.country);
        System.out.println(person.street);
        System.out.println(person.flatNo);
        System.out.println(person.homeNo);

    }

    public static void person(String name, String surname, int age) {
        Person person = new Person(name, surname, age);
        System.out.println(person.name + " " + person.surname);

    }

    public static void address(String street, String city, String country, int flatNo, int homeNo) {
        Address addres = new Address(street, city, country, flatNo, homeNo);
        System.out.println(addres.city + " " + addres.country);

    }

    public static void main(String[] args) {
        introduce("Bartosz", "Rewers");
        person_address("Bartosz", "Rewers", 30, "Głogowska", "Września",
                "Polska", 2, 1);
        person("Bartosz", "Rewers", 30);
        address("Głogowska", "Września", "Polska", 2, 1);
    }
}
