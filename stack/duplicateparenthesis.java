package stack;
import java.util.Stack;

public class duplicateparenthesis { 
    public static boolean isduplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(!s.isEmpty() && s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate exists
                }
                else{
                    s.pop();//opening pair
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";//true
        String str2="(a+b)";//false
        String str3="((a+b)+(c+d))";//false
        System.out.println(isduplicate(str));
        System.out.println(isduplicate(str2));
        System.out.println(isduplicate(str3));
    }
    
}
