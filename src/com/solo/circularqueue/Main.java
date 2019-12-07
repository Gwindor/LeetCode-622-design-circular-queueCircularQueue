package com.solo.circularqueue;

public class Main {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        boolean param_1_1 = circularQueue.enQueue(1);
        boolean param_1_2 = circularQueue.enQueue(2);
        boolean param_1_3 = circularQueue.enQueue(3);
        boolean param_1_4 = circularQueue.enQueue(4);
        int param_2 = circularQueue.Rear();
        boolean param_3 = circularQueue.isFull();
        boolean param_4 = circularQueue.deQueue();
        boolean param_5 = circularQueue.enQueue(4);
        int param_6 = circularQueue.Rear();
    }
}
