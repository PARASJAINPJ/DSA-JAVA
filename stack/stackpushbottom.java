//push new at bottom rather than top using recursion
package stack;
import java.util.*;


public class stackpushbottom {
    public static void pushbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        else{
        int top=s.pop();
        pushbottom(s, data);
        s.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushbottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
