public class LL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next=null;

        }
    }

    public static void traverse(Node head){
        Node temp = head;
        if(temp.next == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(10);
        Node b =new Node(20);   
        Node c =new Node(30);
        Node d =new Node(40);
        Node e =new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;

        traverse(a);
        System.out.println( " ");
        traverse(c);
    }   
    
}