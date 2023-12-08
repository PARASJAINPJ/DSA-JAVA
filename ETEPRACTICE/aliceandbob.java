package ETEPRACTICE;

import java.util.Scanner;

public class aliceandbob {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int count=0;
        int n=scn.nextInt();
        int []alice =new int[n];
        int []bob=new int[n];
        for(int i=0;i<n;i++){
            alice[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            bob[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            if(alice[i]==bob[i]){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
