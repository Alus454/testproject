package exercises_presentations;

import java.util.Scanner;

public class zadanie_1_sda {


    public static void main(String[] args) {
        System.out.println("Podaj liczbę!");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int liczba2 = liczba;
        for (int i = 1; i <= 5; i++) {
            System.out.println("5 x " + liczba2 + " = " + 5 * liczba2);
            liczba2++;
        }
    }
}
