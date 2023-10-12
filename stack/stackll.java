//stack implementation using linked list
package stack;
//import java.util.Stack;

public class stackll {
     static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
     static class Stack{
        static node head=null;

        public static boolean isempty(){
            return head==null;
        }
        //push
        public static void push(int data){
            node newnode =new node(data);
            if(isempty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

        }
        //pop
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peeek
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
