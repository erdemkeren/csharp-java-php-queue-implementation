package com.erdemkeren;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(4);

        // If size is not set to a variable before entering to loop
        // because queue.size method is dynamic, for won't run
        // as expected since it will return 3 before the loop,
        // and then return 2 for the first loop, and return 1
        // for the second iteration which will cause an exit
        // before the queue is empty.
        int size = queue.size();
        System.out.println("Queue size:" + size + "\nDequeueing:");
        for(int i = 0; i < size; i++) {
            System.out.println("Item " + i + ":" + queue.dequeue());
            System.out.println("Is queue empty:" + (queue.isEmpty() ? "Yes" : "No"));
        }
    }
}
