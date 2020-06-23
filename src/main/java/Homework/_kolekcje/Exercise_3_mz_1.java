package Homework._kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_3_mz_1 {

    public static void addList(double array) {

        List arrayList = new ArrayList<>();
        for (int i = 0; i < array; i++) {
            System.out.println("podaj "+(i+1)+" liczbę: ");
            Scanner scanner = new Scanner(System.in);
            double zmienna = scanner.nextDouble();
            arrayList.add(zmienna);
        }
        double wynikDodawania = (double) arrayList.get(0) + (double) arrayList.get(arrayList.size()-1);
        System.out.println(wynikDodawania);
        double wynikMnożenia = (double) arrayList.get(0) * (double) arrayList.get(arrayList.size()-1);
        System.out.println(wynikMnożenia);
        double wynikDzielenia = (double) arrayList.get(0) / (double) arrayList.get(arrayList.size()-2);
        System.out.println(wynikDzielenia);
    }

    public static void main(String[] args) {
        addList(10);

    }
}
