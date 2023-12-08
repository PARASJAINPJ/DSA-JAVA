package ETEPRACTICE;
import java.util.*;
import java.math.*;
public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int l=0;
        while (n!=0){
            n=n/10;
            l++;
        }
        int n1=n;
        int rem,res=0;
        while(n1!=0){
            rem=n%10;
            res+=Math.pow(rem,l);
            n1=n/10;
        }
       if(res==n){
            System.out.println("armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}

    

