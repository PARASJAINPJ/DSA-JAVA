package ETEPRACTICE;

import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        
    
  Scanner scn=new Scanner(System.in);
  StringBuilder sb=new StringBuilder();
  String s=scn.nextLine();
  sb.append(s.charAt(0));
  for(int i=1;i<s.length();i++){
    if(s.charAt(i)!=s.charAt(i-1)){
        sb.append(s.charAt(i));
    }
  } 
  System.out.print(sb.toString());   
}
}
