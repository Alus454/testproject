package Homework_OPP;

public class Exercise_OOP {

    public static void introduce(String name,String surname, int age){
        Person person = new Person(name, surname, age);
        System.out.println(person.name+" "+person.surname);

    }public static void introduce2(String name,String surname, int age,String street, String city,
                                   String country, int flatNo, int homeNo){
        Person person = new Person(name, surname, age, street, city, country, flatNo, homeNo);
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.city);
        System.out.println(person.country);
        System.out.println(person.street);
        System.out.println(person.flatNo);
        System.out.println(person.homeNo);

    }
    public static void main(String[] args) {
        introduce("Bartosz", "Rewers", 30);
        introduce2("Bartosz", "Rewers", 30, "Głogowska", "Września",
                "Polska", 2, 1);
    }
}
