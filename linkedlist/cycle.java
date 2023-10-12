package linkedlist;

public class cycle {
    public static class node{
        int data;
        node next;
 
        public node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static node head;
       public static boolean iscycle(){//floys cycle finding algorithm
        node slow=head;
        node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast =fast.next.next;//+2
            if(slow==fast){
                return true;//cycle exists
            }
        }
            return false;//cycle doesnot exists
        
       }
       public static void removecycle(){
        //detect cycle
         node slow=head;
         node fast =head;
         boolean cycle=false;
         while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
         }
         if(cycle==false){
            return;
         }
        //find meeting point
        slow=head;
        node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;

        }
        //remove cycle ->last.next=null
        prev.next=null;
       }
       public static void main(String[] args) {
        head=new node(1);
        node temp=new node( 2);
        head.next=temp;
        head.next.next=new node(3);
        head.next.next.next=temp;
        //1->2->3->1
        System.out.println(iscycle()); 
        removecycle();
        System.out.println(iscycle());   
       }
}
