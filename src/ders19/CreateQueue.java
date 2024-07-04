package ders19;

import java.util.PriorityQueue;
import java.util.Queue;

public class CreateQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1);
        queue.add(3);
        queue.add(2);
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}
