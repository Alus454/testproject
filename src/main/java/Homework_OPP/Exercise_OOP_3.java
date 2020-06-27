package Homework_OPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise_OOP_3 {

    public static void Square(int sideA, int sideB) {
        Square kwadrat = new Square(sideA, sideB);
//        System.out.println(kwadrat.countArea());
        return;

    }

    public static void Circle(int sideA, int sideB) {
        Circle kolo = new Circle(sideA, sideB);
//        System.out.println(kolo.countArea());


    }

    public static void Rectangle(int sideA, int sideB) {
        Rectangle prostokat = new Rectangle(sideA, sideB);
//        System.out.println(prostokat.countArea());


    }

    public static Figure kwadrat(int ile) {
        for (int i = 0; i < ile; i++) {
            Random random = new Random();
            int randomA = random.nextInt(10);
            int randomB = randomA;
            Square(randomA, randomB);

        }

        return null;
    }

    public static void kolo(int ile) {
        for (int i = 0; i < ile; i++) {
            Random random = new Random();
            int randomA = random.nextInt(10);
            int randomB = randomA;
            Circle(randomA, randomB);

        }

    }

    public static void prostokat(int ile) {
        for (int i = 0; i < ile; i++) {
            Random random = new Random();
            Random random2 = new Random();
            int randomA = random.nextInt(10);
            int randomB = random2.nextInt(10);
            Rectangle(randomA, randomB);

        }

    }


    public static void pole(int ileKwadrat, int ileKolo, int ileProstokat) {
        List<Figure> list = new ArrayList();
        kwadrat(ileKwadrat);
        list.add(kwadrat2(ileKwadrat));
        kolo(ileKolo);
//        list.add(ileKolo);
        prostokat(ileProstokat);
//        list.add(ileProstokat);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    private static Figure kwadrat2(int ileKwadrat) {

        return kwadrat(ileKwadrat);
    }


    public static void main(String[] args) {
        System.out.println("Podaj liczbę kwadratów: ");
        Scanner scanner = new Scanner(System.in);
        int ilekwadrat = scanner.nextInt();
        System.out.println("Podaj liczbę kół: ");
        Scanner scanner2 = new Scanner(System.in);
        int ileKolo = scanner2.nextInt();
        System.out.println("Podaj liczbę prostokatów: ");
        Scanner scanner3 = new Scanner(System.in);
        int ileProstokat = scanner3.nextInt();
        pole(ilekwadrat, ileKolo, ileProstokat);
    }
}
