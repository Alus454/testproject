package exercises_presentations;

import java.util.Scanner;

public class zadanie_9_10_sda {

    public static void main(String[] args) {

        boolean reszta;
        boolean reszta2;
        double liczbaA;
        double liczbaB;
        double wynikMoj;
        double wynikModulo;
        System.out.println("Podaj pierwszą liczbę");
        Scanner scannerA = new Scanner(System.in);
        liczbaA = scannerA.nextInt();
        System.out.println("Podaj drugą liczbę");
        Scanner scannerB = new Scanner(System.in);
        liczbaB = scannerB.nextInt();
        wynikModulo = liczbaA % liczbaB;
        if (wynikModulo == 0)
            reszta= true;
//            wynikMoj = 0;
//        if (wynikMoj == 2)
//            wynikMoj = 0;
        else
            reszta = false;
//            wynikMoj = 1;

        wynikMoj = ((liczbaA / liczbaB) - (int)(liczbaA / liczbaB));

//        System.out.println("dupa" + liczbaA / liczbaB);
//        System.out.println("dupa" + (int) (liczbaA / liczbaB));
//        System.out.println("dupa" + ((liczbaA / liczbaB) - (int) (liczbaA / liczbaB)));
        if (wynikMoj == 0)
            reszta2= true;
//            wynikMoj = 0;
//        if (wynikMoj == 2)
//            wynikMoj = 0;
        else
            reszta2 = false;
//            wynikMoj = 1;
//        System.out.println(wynikMoj);
//        System.out.println(wynikModulo);
//        System.out.println(wynikMoj - wynikModulo);
        System.out.println("Moja metoda mówi że: "+ reszta2);
        System.out.println("Modulo mówi że: "+ reszta);
        if (reszta==reszta2)
            System.out.println("Metoda jest poprawna!");
        else
            System.out.println("Metoda nie jest poprawna");


        ;

//
//        if (wynikMoj == wynikModulo)
//            System.out.println("udało się metoda nowego modulo działa!!");
//        else
//            System.out.println("metoda nowego modulo nie działa!!");


    }

}
