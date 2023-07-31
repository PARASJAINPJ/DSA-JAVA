import java.util.Scanner;

public class stringoperations {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str =scn.nextLine();
       // printchars(str);
        printss(str);
    }
    public static void printchars(String a){
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
    }
    public static void printss(String str){
        for(int si=0;si<=str.length()-1;si++){
            for(int ei=si+1;ei<=str.length();ei++){
                String ss=str.substring(si, ei);
                System.out.println(ss);
                
            }
        }
    }
}
