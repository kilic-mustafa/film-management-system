package backend.dataStructures;

import backend.model.Film;

public class Queue {
    private Film[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new Film[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Film value) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public Film dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Film value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public Film peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }

    public void printQueue(int n) {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        for (int j = 0; j < size; j++) {
            System.out.println(j + 1 + ". " + queue[i].getName() + " - " + queue[i].getViewerCount() + " screenings.");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}