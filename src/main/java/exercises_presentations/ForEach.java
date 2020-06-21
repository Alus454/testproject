package exercises_presentations;

public class ForEach {

    public static void ex1(String[] tableOfNames) {
        for (String name : tableOfNames) {
            System.out.println("Hello " + name);
        }
    }

    public static String ex2(String[] arrayOfProducts) {
        String list = "";
        for (String product : arrayOfProducts) {
            list += product + ", ";
        }
        return list;
    }

    public static void main(String[] args) {
        String[] names = {"Agata", "Julia", "Miłosz"};
        String[] products = {"szynka", "masło", "pomidor"};
        ex1(names);
        String result = ex2(products);
        System.out.println(result);
    }
}