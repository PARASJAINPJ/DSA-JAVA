package stringpractice;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=scn.nextInt();
        }
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<arr.length;i++){
           sb.insert(arr[i],"*");
        }
        System.out.println(sb);
    }
        
    
}
