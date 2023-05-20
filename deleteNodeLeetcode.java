import  java.util.*;
public class deleteNodeLeetcode {

    public static void delete(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void display(ListNode node){
        ListNode temp = node;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }


    public static class ListNode{
        int val;
        ListNode next;
        ListNode (int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(40);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(70);

        a.next = b;
        b.next = c;
        c.next = d;

        display(a);
        delete(b);
        System.out.println();
        display(a);
    }

}
