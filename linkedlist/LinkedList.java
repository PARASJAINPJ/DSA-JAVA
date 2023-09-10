package linkedlist;
// import java.util.*;


public class LinkedList {
   
    public static class node{
        int data;
        node next;
 
        public node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static node head;
    public static node tail;
    public static int size;

    public void addfirst(int data){
        //step 1 =create a new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        //step 2 newnode next =head
        newnode.next=head;//link
        //step-3 head=newnode
        head=newnode;
    } 
    public void addlast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        //another method of adding last by using head 
        // node currnode=head;
        // while(currnode.next!=null){
        //     currnode=currnode.next;
        // }
        // currnode.next=newnode;
        tail.next=newnode;
        tail=newnode;

    }
    public void addmiddle(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
                temp=temp.next;
                i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public void print(){
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
    public int removefirst(){
        if(size ==0){
           System.out.println("ll in empty");
           return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val; 
    }
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev=size-2
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrsearch(int key){
        node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data ==key){//key found
                return i;
            }
        temp=temp.next;
        i++;
        }
        //key not found
        return -1;
    }
    public int recsearch(int key){
         return helper( head,key);
    }
    public int helper(node head,int key){
        if(head==null){
           return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
          return -1;
        }
        return idx+1;
        
    }
    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;
        while( curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthfromend(int n){
        //calculate size
        int sz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//remove first
            return;
        }

        //sz
        int i=1;
        int itofind=sz-n;
        node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;


    }
    //slow-fast approach
    public node findmid(node head){
        node slow=head;
        node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my mid node
    }
    public boolean checkpalindrome(){
        if(head==null ||head.next==null){
          return true;
        }
        //step1 find mid
        node midnode=findmid(head);
        //step2 reverse 2nd half
        node prev=null;
        node curr=midnode;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; 
        }
        node right=prev;//right half head
        node left=head;
        //step3 check left half and right half
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;    
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        // ll.head = new node(1);
        // ll.head.next = new node(2);
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addmiddle(2,9);
        ll.print();
        System.out.println(ll.size );
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);
        ll.removelast();
        ll.print();
        System.out.println(ll.size );
        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(10));
        System.out.println(ll.recsearch(3));
        ll.reverse();
        ll.print();
        ll.deleteNthfromend(3);
        ll.print();
        System.out.println(ll.checkpalindrome());


        
    }

    
}
