import java.util.Scanner;
public class stringpalindrome {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        boolean ans=true;
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
               ans=false;
               break;
            }
        }
           
        if (ans) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
    
}
