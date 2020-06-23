package Homework._kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_5_mz_1 {

    public static void addName(String[] arrayName) {


        List<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            String addName = scanner.next();
//        Scanner scanner2 = new Scanner(System.in);
//        String addName2 = scanner2.next();
//        Scanner scanner3 = new Scanner(System.in);
//        String addName3 = scanner3.next();
//        Scanner scanner4 = new Scanner(System.in);
//        String addName4 = scanner4.next();
//        Scanner scanner5 = new Scanner(System.in);
//        String addName5 = scanner5.next();
            arrayList.add(addName);
//        arrayList.add(addName2);
//        arrayList.add(addName3);
//        arrayList.add(addName4);
//        arrayList.add(addName5);
        }
        int licznik = 0;
        while (licznik < 5) {
            System.out.print("{ " + arrayList.get(licznik) + " } ");
            licznik++;
        }

    }

    public static void main(String[] args) {
        String[] name = {""};
        addName(name);
    }

}
