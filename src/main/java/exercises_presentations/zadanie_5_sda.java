package exercises_presentations;

import java.util.Scanner;

public class zadanie_5_sda {

    public static void main(String[] args) {
        System.out.println("Wielkość tablicy!");
        Scanner scannerMax = new Scanner(System.in);
        int arrayMax = scannerMax.nextInt();
        int tab[] = new int[arrayMax];
        int max=tab[0];
        int min=tab[0];
        for (int i = 0; i < arrayMax;i++) {
            System.out.println("Podaj "+(i+1)+" liczbe w tablicy!");
            Scanner scanner = new Scanner(System.in);
            int array = scanner.nextInt();
            tab[i]=array;
            if (array > max)
                max = array;
            if (array < min)
                min = array;
        }

        System.out.println("Najmniejsza wartość w tablicy to: "+min);
        System.out.println("Największa wartość w tablicy to: "+max);


    }
}
