import java.util.Scanner;

public class stringbuilderdemo {
    public static void main(String[] args) {
        // Scanner scn=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("hello");//we can convert string to string builder by replacing string name in place of hello
        System.out.println(sb);
        System.out.println(sb.length());
        //apppend
        sb.append("abc");
        //insert
        sb.insert(2,"def");
        System.out.println(sb);
        sb.insert(2,'g');
        System.out.println(sb);
        sb.insert(sb.length(),'h');
        System.out.println(sb);
        
        //delete
        sb.deleteCharAt(3);
        System.out.println(sb);
        //update
        sb.setCharAt(4, 'd');
        System.out.println(sb);
        //so we can see that we cannot change string  as it is imutable but we can make changes in string builder
        
        
    }
    
}
