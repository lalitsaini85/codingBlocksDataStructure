package Heap;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 25-04-2022
 * Time: 13:09
 * File Name : MinHeapClient.java
 */
public class MinHeapClient {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.add(2);
        minHeap.add(3);
        minHeap.add(5);
        minHeap.add(6);
        minHeap.add(1);
        minHeap.add(7);
        minHeap.add(8);
        minHeap.add(10);
        minHeap.add(-2);
        minHeap.add(21);
        minHeap.add(23);
        minHeap.display();
        System.out.println(minHeap.getMin());
        System.out.println(minHeap.remove());
        minHeap.display();

    }
}
