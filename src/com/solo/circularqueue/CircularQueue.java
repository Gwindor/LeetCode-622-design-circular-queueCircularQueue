package com.solo.circularqueue;

public class CircularQueue {
    private int[] array;
    private int size;
    private int tailIndex = -1;
    private int headIndex = -1;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.¬
     */
    public CircularQueue(int k) {
        array = new int[k];
        size = k;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            tailIndex = 0;
            headIndex = 0;
            array[tailIndex] = value;
            return true;
        }
        tailIndex = (tailIndex + 1) % size;
        array[tailIndex] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (tailIndex == headIndex) {
            headIndex = -1;
            tailIndex = -1;
            return true;
        }
        headIndex = (headIndex + 1) % size;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return array[headIndex];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return array[tailIndex];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        if ((tailIndex == headIndex) && (tailIndex == -1)) {
            return true;
        }
        return false;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        if (isEmpty()) {
            return false;
        }
        if ((tailIndex + 1) % size == headIndex) {
            return true;
        }
        return false;
    }
}
