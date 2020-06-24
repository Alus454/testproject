package Homework_OPP;

public class Person extends Address {
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age, String street, String city, String country, int flatNo, int homeNo) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.street = street;
        this.city = city;
        this.country = country;
        this.flatNo = flatNo;
        this.homeNo = homeNo;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;


    }

    public Person(String surname, String name) {
        this.name = name;
        this.surname = surname;

    }
}
