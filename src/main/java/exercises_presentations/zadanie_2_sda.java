package exercises_presentations;

import java.util.Scanner;

public class zadanie_2_sda {

    public static void isPrimeNumber (int liczba) {
        if (liczba < 2) ;
        boolean isPrime = true;
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) isPrime = false;
        }
        System.out.println("Czy liczba "+ liczba+ " jest liczbą pierwszą? "+ isPrime);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        isPrimeNumber(liczba);

    }
}
