package exercises_presentations;

import java.util.Scanner;

public class zadanie_4_sda {

    public static void main(String[] args) {
        int tab[] = new int[3];
        System.out.println("Podaj pierwszą liczbę!");
        Scanner scannerA = new Scanner(System.in);
        int liczbaA = scannerA.nextInt();
        tab[0]= liczbaA;
        System.out.println("Podaj następną liczbę!");
        Scanner scannerB = new Scanner(System.in);
        int liczbaB = scannerB.nextInt();
        tab[1]= liczbaB;
        System.out.println("Podaj ostatnią liczbę!");
        Scanner scannerC = new Scanner(System.in);
        int liczbaC = scannerC.nextInt();
        tab[2]= liczbaC;
        System.out.println("Twoje liczby w tablicy to: "+tab[0]+", "+tab[1]+", "+tab[2]);
        System.out.println("Czary mary");
        tab[0]= liczbaC;
        tab[2]= liczbaA;
        System.out.println("Twoje nowe liczby w tablicy to: "+tab[0]+", "+tab[1]+", "+tab[2]);




    }
}
//      zadanie z sprawdznia
//    public static void printTable(int[] array) {
//        for (int element : array) {
//            System.out.print("[" + element + "] ");
//        }
//        System.out.println("\n");
//    }
//    public static void switchTable(int[] table) {
//        if (table.length >= 2) {
//            System.out.println("table before: ");
//            printTable(table);
//            int temp = table[0];
//            int lastIndex = table.length - 1;
//            table[0] = table[lastIndex];
//            table[lastIndex] = temp;
//            System.out.println("After: ");
//            printTable(table);
//        } else {
//            System.out.println("Ta tablica jest za mała");
//        }
//    }
//    public static void main(String[] args) {
//        int[] array = {19, 5, 23};
//        switchTable(array);
//    }
//}