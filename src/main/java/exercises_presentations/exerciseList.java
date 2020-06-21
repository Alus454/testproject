package exercises_presentations;

import java.util.*;

public class exerciseList {

    public static void exList(){
        List<String> listOfName = new ArrayList<String>();
        listOfName.add("Barbara");
        listOfName.add("Marek");
        listOfName.add("Bożydar");
        System.out.println("rozmiar listy: "+listOfName.size());
        listOfName.add("Bożydar");
        System.out.println("nowy rozmiar listy: "+ listOfName.size());


    }
    public static void exSet(){
        Set<String> setOfName = new HashSet<String>();
        setOfName.add("Barbara");
        setOfName.add("Marek");
        setOfName.add("Bożydar");
        System.out.println("rozmiar listy: "+ setOfName.size());
        setOfName.add("Bożydar");
        System.out.println("nowy rozmiar listy: "+ setOfName.size());

    }
    public static void exMap(){
        Map<Integer,String> mapOfName = new HashMap<Integer, String>();
        mapOfName.put(1, "Barbara");
        mapOfName.put(2, "Marek");
        mapOfName.put(3, "Bożydar");
        System.out.println("rozmiar listy: "+ mapOfName.size());
        mapOfName.put(3, "Bożydar");
        System.out.println("nowy rozmiar listy: "+ mapOfName.size());

    }

    public static void main(String[] args) {
        System.out.println("lista: ");
        exList();
        System.out.println("set: ");
        exSet();
        System.out.println("mapa: ");
        exMap();
    }
}
