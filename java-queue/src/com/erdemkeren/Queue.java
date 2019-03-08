package com.erdemkeren;

import java.util.LinkedList;

public class Queue {
    private LinkedList queue = new LinkedList();

    public boolean isEmpty() { return queue.isEmpty(); }

    public int size()
    {
        return queue.size();
    }

    public void enqueue(int val) { queue.addLast(val); }

    public int dequeue() {
        return (int) queue.pop();
    }

    public int peek() {
        return (int) queue.get(0);
    }
}
