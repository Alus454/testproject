package exercises_presentations;

import java.util.Scanner;

public class zadanie_3_sda {

    public static void main(String[] args) {

        int wynik = 0;
        System.out.println("Podaj pierwszą liczbę!");
        Scanner scannerA = new Scanner(System.in);
        int liczbaX = scannerA.nextInt();
        System.out.println("Podaj następną liczbę!");
        Scanner scannerB = new Scanner(System.in);
        int liczbaY = scannerB.nextInt();
        if (liczbaX < liczbaY) {
            for (int i = liczbaX; i <= liczbaY; i++) {
                wynik += i;
            }
        } else {
            for (int i = liczbaY; i <= liczbaX; i++) {
                wynik += i;
            }

        }
        System.out.println(wynik);


    }
}
