package exercises_presentations;

import javax.swing.*;
import java.util.Scanner;

public class zadanie_8_sda {

    public static void main(String[] args) {
        System.out.println("Wielkość tablicy!");
        Scanner scannerMax = new Scanner(System.in);
        int arrayCiag = scannerMax.nextInt();
        int tab[] = new int[arrayCiag];
        boolean ciag = true;
        int roznica;
        int roznica2;
        for (int i = 0; i < arrayCiag; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe w tablicy!");
            Scanner scanner = new Scanner(System.in);
            int array = scanner.nextInt();
            tab[i] = array;
            roznica = tab[1] - tab[0];
            if (i == 0) {
//                System.out.println("dupa");
            } else {
                roznica2 = tab[i] - tab[i - 1];
                if (roznica2 != roznica) {
                    ciag = false;
                }


            }

        }
        System.out.println("Podany ciąg jest ciągiem arytmetycznym? " + ciag);
    }
}



