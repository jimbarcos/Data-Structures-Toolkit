/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package machine_problem1;


/**
 *
 * @author Jim Aerol
 */
public class Linked_ListAlgo {
    NodeData head;

    public Linked_ListAlgo() {
        this.head = null;
    }

    public void insertData(int data) {
        NodeData newNode = new NodeData(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeData current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String displayData() {
        String result = "";
        NodeData current = head;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        return result;
    }

    public SearchResult searchData(int data) {
        int position = 0;
        NodeData current = head;
        int count = 0;
        // Count the number of elements in the list
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head; // Reset current to the beginning of the list

        // Loop through the search operation based on the count
        while (position < count) {
            if (current.data == data) {
                return new SearchResult(true, position); // Found
            }
            current = current.next;
            position++;
        }
        return new SearchResult(false, -1); // Not found
    }

    public int deleteData(int data) {
        if (head == null) {
            return 1; // Empty list
        }
        if (head.data == data) {
            head = head.next; // Update head if the first node matches
            return 1;
        }
        NodeData current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Delete the node
                return 1;
            }
            current = current.next;
        }
        return 5;
    }
    
    public int sizeData() {
        int count = 0;
        NodeData current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
}

