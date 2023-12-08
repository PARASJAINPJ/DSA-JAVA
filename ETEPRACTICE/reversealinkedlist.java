// Adding Nodes at the Beginning of a Linked List.
// Suppose you are developing an application that requires the implementation of a dynamic 
// data structure to store and manage a list of items. You decide to use a singly linked list to 
// achieve this. You have been given a Java program that allows the user to input values and 
// inserts them at the beginning of the linked list.
// Input Format
// The user is first prompted to enter the number of nodes they want to insert at the beginning 
// of the linked list, Input should be an integer representing the number of nodes.
// For each space separated node, the user is prompted to enter the value (integer) of the node.
// Output Format
// After inserting all the nodes at the beginning, the program will display the contents of the 
// linked list, Separated by space.
// Sample input1
// 5
// 1 2 3 4 5 
// Sample output1
// 5 4 3 2 1
// Sample input2
// 7
// 78 35 78 16 94 36 91
// Sample output2
// 91 36 94 16 78 35 78

package ETEPRACTICE;
import java.util.*;
import java.util.Scanner;

public class reversealinkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void displayList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of nodes to insert

        reversealinkedlist reverseLinkedList = new reversealinkedlist();
        LinkedList list = reverseLinkedList.new LinkedList();

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insertAtBeginning(data);
        }

        list.displayList();
    }
}
