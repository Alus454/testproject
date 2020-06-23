package Homework._kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Exercise_2_mz_1 {

    public static void addList(){
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size()-1));

    }

    public static void main(String[] args) {
        addList();
    }
}
