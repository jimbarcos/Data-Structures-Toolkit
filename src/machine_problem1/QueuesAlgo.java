/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package machine_problem1;

/**
 *
 * @author Jim Aerol
 */
public class QueuesAlgo {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueuesAlgo(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public boolean isEmptyData() {
        return (nItems == 0);
    }

    public boolean isFullData() {
        return (nItems == maxSize);
    }

    public int sizeData() {
        return nItems;
    }

    public int enqueueData(int value) {
        if (isFullData()) {
            System.out.println("Queue is full, cannot enqueue " + value);
            return 3;
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            nItems++;
            return 2;
        }
    }

    public int dequeueData() {
        if (isEmptyData()) {
            System.out.println("Queue is empty, cannot dequeue");
            return -1; 
        } else {
            int removedItem = queueArray[front];
            front = (front + 1) % maxSize;
            nItems--;
            return removedItem;
        }
    }

    public int peekData() {
        if (isEmptyData()) {
            System.out.println("Queue is empty, cannot peek");
            return -1; 
        } else {
            return queueArray[front];
        }
    }

    public int checkFrontData() {
        if (isEmptyData()) {
            System.out.println("Queue is empty, cannot check front");
            return -1; 
        } else {
            return queueArray[front];
        }
    }

    public int checkRearData() {
        if (isEmptyData()) {
            System.out.println("Queue is empty, cannot check rear");
            return -1; 
        } else {
            return queueArray[rear];
        }
    }
    
    public String displayData() {
        String result = "";
        int count = 0;
        int index = front;
        while (count < nItems) {
            result += queueArray[index] + " ";
            index = (index + 1) % maxSize;
            count++;
        }
        return result;
    }
}

