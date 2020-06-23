package Homework._kolekcje;

public class Exercise_1_mz_1 {

    public static void multiplicationTab(int[] arrayOfTab) {
        for (int i = 0; i < 10; i++) {
            arrayOfTab[i]=(i+1)*2;
        }
    }

    public static void printTab(int[] arrayOfTab) {
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayOfTab[i]);
        }
    }
    public static void addTab(int[] arrayOfTab) {
        for (int i = 0; i < 10; i++) {
            arrayOfTab[i] = i + 1;
        }
    }

    public static void lengthTab(int[] arrayOfTab) {

        System.out.println(arrayOfTab.length);

    }


    public static void main(String[] args) {
        int[] Tab = new int[10];
        addTab(Tab);
        lengthTab(Tab);
        printTab(Tab);
        multiplicationTab(Tab);
        printTab(Tab);
    }

}
