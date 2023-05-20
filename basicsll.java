//import java.util.*;

public class basicsll{

    public static void displayReverse(Node head){ //Displaying a reverse of LL Recursively
        if(head == null) return;

        displayReverse(head.next);
        System.out.print(head.data+ " ");

    }

    public static void displayR(Node head){ //Displaying a LL Recursively
        if(head == null) return;

        System.out.print(head.data +" ");
        displayR(head.next);
    }

    public static void display(Node head){// DISPLAYING A lINKED lIST
        Node temp = head;
        while(temp != null){ 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static int lengthOfLL(Node head){//Length of LinkedList
        if(head == null) return 0;

        int count = 0;
        Node temp = head;

        while(temp != null){
            count +=1;
            temp = temp.next;
            
        }

        return count;

    }

    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(7);

        a.next = b;
        b.next = c;
        c.next = d;
        
        display(a);
        System.out.println();
        displayR(a);
        System.out.println();
        displayReverse(a);
        System.out.println();
        int length = lengthOfLL(a);
        System.out.print(length);
    }
}