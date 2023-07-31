import java.util.Scanner;

public class challengearmstrongnumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            i++;
        }
        double num=0;
        temp=n;
        while(temp!=0){
           int  rem=temp%10;
           temp=temp/10;
           num=num + Math.pow(rem,i);

        }
        if(num==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
