package Homework._kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Exercise_4_mz_1 {

    public static void addNames(String[] listOfString){
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Basia");
        listOfNames.add("Bartosz");
        listOfNames.add("Marek");
        listOfNames.add("Kasia");
        listOfNames.add("Michał");
        for (String name: listOfNames){
            System.out.println(name);
        }
        for (int i = (listOfNames.size()-1) ; i>=0 ; i--){
            System.out.println(listOfNames.get(i));
        }
    }


    public static void main(String[] args) {
        String[] names = {""};
        addNames(names);
    }
}
