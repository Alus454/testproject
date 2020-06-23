package Homework._kolekcje;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Exercise_6_mz_1 {

    public static void addQueue(int maxQueue){
        Queue queue = new PriorityQueue();
        Random random = new Random();
        for (int i = 0;i< maxQueue;i++){
            queue.add((random.nextInt(100)+1));

        }
        System.out.println(queue);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxQueue = scanner.nextInt();
        addQueue(maxQueue);
    }

}