import java.util.List;
import java.util.Scanner;

public class nthNodeFromLast {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode (int val){
            this.val = val;
        }
    }

    public static ListNode nthNode(ListNode node, int n){
       /* ListNode temp = node; Without slow and fast pointer
        int size = 0;
        while(temp !=null){
            size++;
            temp = temp.next;
        }

        int nthNodeFromLastPosition = (size - n +1);
        temp = node;

        for (int i =0; i< nthNodeFromLastPosition-1; i++){
            temp = temp.next;
        }
        return temp;*/

        ListNode slow = node;
        ListNode fast = node;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;


    }

    public static ListNode deleteNthFromEnd(ListNode head, int n){
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        if(fast==null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp !=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        ListNode a = new ListNode(100);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(12);
        ListNode f = new ListNode(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);

        int n = scn.nextInt();
        ListNode temp = nthNode(a,n);
        System.out.print(temp.val);

        System.out.println();

        ListNode delete = deleteNthFromEnd(a,n);
        display(delete);
    }
}
