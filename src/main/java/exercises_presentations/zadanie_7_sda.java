package exercises_presentations;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie_7_sda {
    public static void main(String[] args) {
        System.out.println("Podaj długość ciągu!");
        Scanner scannerA = new Scanner(System.in);
        int dlugosc = scannerA.nextInt();
        int ciag[] = new int[dlugosc];
        System.out.println("Podaj pierwszą liczbe ciagu");
        Scanner scannerB = new Scanner(System.in);
        int pierwszy = scannerB.nextInt();
        ciag[0]= pierwszy;
        System.out.println("Podaj różnice tego ciągu");
        Scanner scannerC = new Scanner(System.in);
        int roznica = scannerC.nextInt();

        for (int i = 1; i < dlugosc; i++) {
            ciag[i]=ciag[i-1]+roznica;
        }

        System.out.println("Podany ciąg to: "+ Arrays.toString(ciag));
    }
}
