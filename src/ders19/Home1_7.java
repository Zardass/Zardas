package ders19;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Home1_7 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        System.out.println(queue);
        queue.remove(2);
        System.out.println(queue);
    }
}
