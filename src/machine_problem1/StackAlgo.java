/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package machine_problem1;
import machine_problem1.Stacks;

/**
 *
 * @author Jim Aerol
 */
public class StackAlgo {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor
    public StackAlgo(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Method to push elements onto the stack
    public int pushData(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
           System.out.println("Stack overflow");
           return 1;
        }
        
        return 2;
    }

    // Method to pop elements from the stack
    public int popData() {
        if (top >= 0) {
            int poppedValue = stackArray[top];
            top--;
            return poppedValue;
        } else {
            System.out.println("Stack underflow");
            return -1; // Return some default value for underflow
        }
    }

    // Method to check if the stack is empty
    public boolean isEmptyData() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFullData() {
        return (top == maxSize - 1);
    }

    // Method to peek at the top element of the stack without removing it
    public int peekData() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Return some default value for empty stack
        }
    }
    
    // Method to display elements of the stack
    public String displayStack() {
        if (isEmptyData()) {
            return "";
        } else {
            String stackElements = "";
            for (int i = top; i >= 0; i--) {
                stackElements += stackArray[i] + " ";
            }
            return stackElements;
        }
    }
    
    public int changeElementData(int index, int newValue) {
        if (index >= 0 && index <= top) {
            stackArray[index] = newValue;
        } else {
            System.out.println("Index out of bounds or stack is empty");
            return 2;
        }
        return 1;
    }
}
