import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b=1;
        int count=0;
        while(count<=n){
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
            count++;
        }
         




    }
    
}
