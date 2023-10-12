package linkedlist;

public class doublylinkedlist {
    public class node{
        int data;
        node next;
        node prev;
    
    public node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public static node head;
public static node tail;
public static int  size;

//add
public void addfirst(int data){
    node newnode=new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
}
public void addlast(int data){
    node newnode=new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prev=tail;
    newnode.next=null;
    tail=newnode;

}

//remove
public int removefirst(){
    if(head==null){
        System.out.println("dll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;

    }
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
}

public int removelast(){
    if(head==null){
        System.out.println("dll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=tail.data;
        head=tail=null;
        size--;
        return val;

    }
    int val=head.data;
    tail=tail.prev;
    tail.next=null;
    size--;
    
    return val;
}

public void print(){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data + "<->");
        temp=temp.next;
    }
    System.out.println("null");
}
public void reverse(){
    node curr =head;
    node prev=null;
    node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
    head=prev;
}
public static void main(String[] args) {
    doublylinkedlist dll=new doublylinkedlist();
    dll.addfirst(3);
    dll.addfirst(2);
    dll.addfirst(1);

    dll.print();
    System.out.println(dll.size);
    dll.removefirst();
    dll.print();
    System.out.println(dll.size );
    dll.addlast(4);
    dll.print();
    // dll.removelast();
    dll.print();
    dll.reverse();
    dll.print();
}

    
}
