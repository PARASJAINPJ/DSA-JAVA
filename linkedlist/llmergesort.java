package linkedlist;

public class llmergesort {
    public static class node{
        int data;
        node next;
         public node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static node head;
    private node getmid(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//mid node
       
    }
    private node merge(node head1,node head2){
        node mergedll=new node(-1);
        node temp=mergedll;
        while(head1!=null && head2!=null){
            if(head1.data <=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedll.next;

    }
    public void addfirst(int data){
        //step 1 =create a new node
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        //step 2 newnode next =head
        newnode.next=head;//link
        //step-3 head=newnode
        head=newnode;
    } 
    public node mergesort(node head){
         if(head==null || head.next ==null){
            return head;
        }
        //find  mid
        node mid=getmid(head);
        //left & right ms
        // node lefthead=head;
        node righthead=mid.next;
        mid.next=null;
        node newleft=mergesort(head);
        node newright=mergesort(righthead);

        //merge
        return merge(newleft,newright);

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
    public static void main(String[] args) {
        llmergesort ll=new llmergesort();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(9);
        ll.addfirst(4);
        ll.addfirst(5);

        ll.print();
        ll.head=ll.mergesort(ll.head); 
        ll.print();
    }
    
    
    
}
