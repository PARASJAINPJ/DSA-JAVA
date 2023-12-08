package ETEPRACTICE;

import java.util.Scanner;

public class costofgroceries {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("eneter the no. of items in a store");
        int n=scn.nextInt();
        int totalcost=0;
        System.out.println("enter the minimum  freshness required");
        int minfresh=scn.nextInt();
        int[] cost=new int[n];
        int []freshness=new int[n];
        System.out.println("enter the cost of "+n+"items");
        for(int i=0;i<n;i++){
           cost[i]=scn.nextInt();
        }
        System.out.println("enter the freshness for items");
        for(int i=0;i<n;i++){
           freshness[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
           if(freshness[i]>=minfresh){
             totalcost+=cost[i];
           }
        }
        System.out.println(totalcost);
    }
    
}
