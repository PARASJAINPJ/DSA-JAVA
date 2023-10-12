package linkedlist;

public class zigzagll {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static void zigzag(){
        //find mid
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        node mid=slow;

        //revrse 2nd half
        node curr=mid.next;
        mid.next=null;
        node prev=null;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev; 
            prev=curr;
            curr=next;
        }

        node left=head;
        node right=prev;
        node nextl,nextr;

        //alt merge -zigzag merge
        while(left!=null && right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;
            
            left=nextl;
            right=nextr;
        }
    }
    public static void addlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return ;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public static void print(){
        node temp=head;
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->  ");
            temp=temp.next; 
        }
        System.out.println("null");
    }
    public static node tail;
    public static void main(String[] args) {
        zigzagll zll=new zigzagll();
        zigzagll.addlast(1);
        zigzagll.addlast(2);
        zigzagll.addlast(3);
        zigzagll.addlast(4);
        zigzagll.addlast(5);
        zigzagll.print();
        zigzagll.zigzag();
        zigzagll.print();
        
    }
    
}
