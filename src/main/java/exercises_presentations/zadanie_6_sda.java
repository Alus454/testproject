package exercises_presentations;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie_6_sda {

    public static void main(String[] args) {
        int ujemne=0;
        System.out.println("Wielkość tablicy!");
        Scanner scannerMax = new Scanner(System.in);
        int arrayMax = scannerMax.nextInt();
        int tab[] = new int[arrayMax];
        int minusArray = 0;
        for (int i = 0; i < arrayMax; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe w tablicy!");
            Scanner scanner = new Scanner(System.in);
            int array = scanner.nextInt();
            tab[i] = array;
            if (array < 0)
                minusArray++;
        }
        int tabMinus[] = new int[minusArray];
        for (int z = 0; z <= minusArray; z++) {
            if (tab[z]<0){
                tabMinus[ujemne] = tab[z];
//                System.out.println(tabMinus[ujemne]);
                        ujemne++;
            }

        }

        System.out.println("Nowa tablica wygląta tak: "+Arrays.toString(tabMinus));
        System.out.println("Wielkość tej tablicy tablicy to: " + minusArray);


    }
}
