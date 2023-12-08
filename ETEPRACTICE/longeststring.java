package ETEPRACTICE;
import java.util.Scanner;

public class longeststring {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int max=Integer.MIN_VALUE;
        int count=1;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)==' '){
            max=Math.max(max, count);
            count=1;
           
          }
          else{
            count++;
          }
        }
        System.out.println(max);
    }
    
}
