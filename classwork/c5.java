//frequemcy of a character in string
package classwork;

import java.util.Scanner;

public class c5{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
            
           char ch= str.charAt(i);
           int idx=ch-97;
           arr[idx]=arr[idx]+1;
        } 
        for(int i=0;i<arr.length;i++){
            char ch=(char)(i+97);
            System.out.println(ch +"->"+arr[i]);
        }
    }
}