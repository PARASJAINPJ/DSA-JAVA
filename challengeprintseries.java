import java.util.Scanner;

public class challengeprintseries {
    public static void main (String[]args){

       Scanner scn=new Scanner(System.in);
       int N1=scn.nextInt();
       int N2=scn.nextInt();
       int count=1;
       int n=1;
       while(n<=n+1){
        int term =3*n+2;
        if(term%N2!=0 && count<=N1){
            System.out.println(term);
            count++;
        }
        n++;

       }

             


        }
        

       }
//solved challenge by self passed all test cases of CB
//solution given by editorial is as follows
/*public static void print(int n1,int n2){

     int n=1;int count=1;
    while(count<=n1){

        int ans=3*n+2;
        if(ans%n2!=0){
            System.out.println(ans);
            count++;

        }                
        n++;
      }
} */
//QUESTION IS AS FOLLOWS
/*
 Take the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Input Format
Constraints
0 < N1 < 100 0 < N2 < 100

Output Format
Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
 */
       

       

    

    

